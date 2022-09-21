package typings.ioTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.functionMod.Refinement
import typings.ioTs.schemableMod.Literal
import typings.ioTs.schemableMod.Schemable1
import typings.ioTs.schemableMod.WithRefine1
import typings.ioTs.schemableMod.WithUnion1
import typings.ioTs.schemableMod.WithUnknownContainers1
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("io-ts/lib/Type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Type", "Schemable")
  @js.native
  val Schemable: Schemable1[typings.ioTs.typeMod.URI] = js.native
  
  @JSImport("io-ts/lib/Type", "URI")
  @js.native
  val URI: /* "io-ts/Type" */ String = js.native
  type URI = /* "io-ts/Type" */ String
  
  @JSImport("io-ts/lib/Type", "UnknownArray")
  @js.native
  val UnknownArray: Type_[js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/Type", "UnknownRecord")
  @js.native
  val UnknownRecord: Type_[Record[String, Any]] = js.native
  
  @JSImport("io-ts/lib/Type", "WithRefine")
  @js.native
  val WithRefine: WithRefine1[typings.ioTs.typeMod.URI] = js.native
  
  @JSImport("io-ts/lib/Type", "WithUnion")
  @js.native
  val WithUnion: WithUnion1[typings.ioTs.typeMod.URI] = js.native
  
  @JSImport("io-ts/lib/Type", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers1[typings.ioTs.typeMod.URI] = js.native
  
  inline def array[A](item: Type_[A]): Type_[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Type_[js.Array[A]]]
  
  @JSImport("io-ts/lib/Type", "boolean")
  @js.native
  val boolean: Type_[Boolean] = js.native
  
  inline def intersect[B](right: Type_[B]): js.Function1[/* left */ Type_[Any], Type_[Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Type_[Any], Type_[Any & B]]]
  
  inline def `lazy`[A](id: String, f: js.Function0[Type_[A]]): Type_[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(id.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Type_[A]]
  
  inline def literal[A /* <: Array[L] */, L /* <: Literal */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Type_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Type_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def nullable[A](or: Type_[A]): Type_[A | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Type_[A | Null]]
  
  @JSImport("io-ts/lib/Type", "number")
  @js.native
  val number: Type_[Double] = js.native
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Type.Type<A[K]>}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
  ): Type_[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Type_[
    Partial[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.partial & TopLevel[A]
    ]
  ]]
  
  inline def readonly[A](`type`: Type_[A]): Type_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type_[A]]
  
  inline def record[A](codomain: Type_[A]): Type_[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Type_[Record[String, A]]]
  
  inline def refine[A, B /* <: A */](refinement: Refinement[A, B], id: String): js.Function1[/* from */ Type_[A], Type_[B]] = (^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* from */ Type_[A], Type_[B]]]
  
  @JSImport("io-ts/lib/Type", "string")
  @js.native
  val string: Type_[String] = js.native
  
  inline def struct[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Type.Type<A[K]>}
    */ typings.ioTs.ioTsStrings.struct & TopLevel[A]
  ): Type_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.struct & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[Type_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.struct & TopLevel[A]
  ]]
  
  inline def sum[T /* <: String */](_tag: T): js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/Type.Type<any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[Any], 
    Type_[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(_tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: io-ts.io-ts/lib/Type.Type<any[K] & std.Record<T, K>>}
    */ /* members */ typings.ioTs.ioTsStrings.sum & TopLevel[Any], 
    Type_[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Type<A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Type.Type<A[K]>}
    */ typings.ioTs.ioTsStrings.tuple & TopLevel[A]
  ): Type_[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Type_[A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Type.Type<A[K]>}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ): Type_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Type_[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K_1 in keyof A ]: A[K_1]}
    */ typings.ioTs.ioTsStrings.`type` & TopLevel[A]
  ]]
  
  inline def union[A /* <: Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Type<A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: io-ts.io-ts/lib/Type.Type<A[K]>}
    */ typings.ioTs.ioTsStrings.union & TopLevel[A]
  ): Type_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(members.asInstanceOf[js.Any]).asInstanceOf[Type_[
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  type Type_[A] = typings.ioTs.mod.Type_[A, Any, Any]
  
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind3[R, E, A] extends StObject
  }
}
