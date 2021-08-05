package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.eqMod.Eq
import typings.ioTs.schemableMod.Schemable1
import typings.ioTs.schemableMod.WithRefine1
import typings.ioTs.schemableMod.WithUnknownContainers1
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eqMod {
  
  @JSImport("io-ts/lib/Eq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Eq", "Schemable")
  @js.native
  val Schemable: Schemable1[typings.fpTs.eqMod.URI] = js.native
  
  @JSImport("io-ts/lib/Eq", "UnknownArray")
  @js.native
  val UnknownArray: Eq[js.Array[js.Any]] = js.native
  
  @JSImport("io-ts/lib/Eq", "UnknownRecord")
  @js.native
  val UnknownRecord: Eq[Record[String, js.Any]] = js.native
  
  @JSImport("io-ts/lib/Eq", "WithRefine")
  @js.native
  val WithRefine: WithRefine1[typings.fpTs.eqMod.URI] = js.native
  
  @JSImport("io-ts/lib/Eq", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers1[typings.fpTs.eqMod.URI] = js.native
  
  inline def array[A](eq: Eq[A]): Eq[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(eq.asInstanceOf[js.Any]).asInstanceOf[Eq[js.Array[A]]]
  
  @JSImport("io-ts/lib/Eq", "boolean")
  @js.native
  val boolean: Eq[Boolean] = js.native
  
  inline def intersect[B](right: Eq[B]): js.Function1[/* left */ Eq[js.Any], Eq[js.Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Eq[js.Any], Eq[js.Any & B]]]
  
  inline def `lazy`[A](f: js.Function0[Eq[A]]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def nullable[A](or: Eq[A]): Eq[Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Eq[Null | A]]
  
  @JSImport("io-ts/lib/Eq", "number")
  @js.native
  val number: Eq[Double] = js.native
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
  ): Eq[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Eq[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ]]
  
  inline def record[A](codomain: Eq[A]): Eq[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Eq[Record[String, A]]]
  
  @JSImport("io-ts/lib/Eq", "string")
  @js.native
  val string: Eq[String] = js.native
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: fp-ts.fp-ts/lib/Eq.Eq<any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    Eq[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: fp-ts.fp-ts/lib/Eq.Eq<any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[js.Any], 
    Eq[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[js.Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Eq<A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[A]
  ): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def `type`[A](
    eqs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ): Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: A[K]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ]]
  
  type TypeOf[E] = js.Any
  
  type URI = typings.fpTs.eqMod.URI
}
