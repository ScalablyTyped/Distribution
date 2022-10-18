package typings.ioTs

import typings.fpTs.libEqMod.Eq
import typings.ioTs.libSchemableMod.Schemable1
import typings.ioTs.libSchemableMod.WithRefine1
import typings.ioTs.libSchemableMod.WithUnknownContainers1
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEqMod {
  
  @JSImport("io-ts/lib/Eq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Eq", "Schemable")
  @js.native
  val Schemable: Schemable1[typings.fpTs.libEqMod.URI] = js.native
  
  @JSImport("io-ts/lib/Eq", "UnknownArray")
  @js.native
  val UnknownArray: Eq[js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/Eq", "UnknownRecord")
  @js.native
  val UnknownRecord: Eq[Record[String, Any]] = js.native
  
  @JSImport("io-ts/lib/Eq", "WithRefine")
  @js.native
  val WithRefine: WithRefine1[typings.fpTs.libEqMod.URI] = js.native
  
  @JSImport("io-ts/lib/Eq", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers1[typings.fpTs.libEqMod.URI] = js.native
  
  inline def array[A](eq: Eq[A]): Eq[js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(eq.asInstanceOf[js.Any]).asInstanceOf[Eq[js.Array[A]]]
  
  @JSImport("io-ts/lib/Eq", "boolean")
  @js.native
  val boolean: Eq[Boolean] = js.native
  
  inline def intersect[B](right: Eq[B]): js.Function1[/* left */ Eq[Any], Eq[Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Eq[Any], Eq[Any & B]]]
  
  inline def `lazy`[A](f: js.Function0[Eq[A]]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def nullable[A](or: Eq[A]): Eq[Null | A] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Eq[Null | A]]
  
  @JSImport("io-ts/lib/Eq", "number")
  @js.native
  val number: Eq[Double] = js.native
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Eq[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any
    ]
  ]]
  
  inline def readonly[A](eq: Eq[A]): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(eq.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def record[A](codomain: Eq[A]): Eq[Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Eq[Record[String, A]]]
  
  @JSImport("io-ts/lib/Eq", "string")
  @js.native
  val string: Eq[String] = js.native
  
  inline def struct[A](
    eqs: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: A[K]} */ js.Any
  ]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: fp-ts.fp-ts/lib/Eq.Eq<any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Eq[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: fp-ts.fp-ts/lib/Eq.Eq<any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Eq[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Eq<A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Eq[A]]
  
  inline def `type`[A](
    eqs: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: fp-ts.fp-ts/lib/Eq.Eq<A[K]>} */ js.Any
  ): Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(eqs.asInstanceOf[js.Any]).asInstanceOf[Eq[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends fp-ts.fp-ts/lib/Eq.Eq<infer A> ? A : never
    }}}
    */
  @js.native
  trait TypeOf[E] extends StObject
  
  type URI = typings.fpTs.libEqMod.URI
}
