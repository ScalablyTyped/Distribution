package typings.ioTs

import typings.fpTs.libFunctionMod.Refinement
import typings.ioTs.libSchemableMod.Literal
import typings.ioTs.libSchemableMod.Schemable1
import typings.ioTs.libSchemableMod.WithRefine1
import typings.ioTs.libSchemableMod.WithUnion1
import typings.ioTs.libSchemableMod.WithUnknownContainers1
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGuardMod {
  
  @JSImport("io-ts/lib/Guard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/Guard", "Schemable")
  @js.native
  val Schemable: Schemable1[typings.ioTs.libGuardMod.URI] = js.native
  
  @JSImport("io-ts/lib/Guard", "URI")
  @js.native
  val URI: /* "io-ts/Guard" */ String = js.native
  type URI = /* "io-ts/Guard" */ String
  
  @JSImport("io-ts/lib/Guard", "UnknownArray")
  @js.native
  val UnknownArray: Guard[Any, js.Array[Any]] = js.native
  
  @JSImport("io-ts/lib/Guard", "UnknownRecord")
  @js.native
  val UnknownRecord: Guard[Any, Record[String, Any]] = js.native
  
  @JSImport("io-ts/lib/Guard", "WithRefine")
  @js.native
  val WithRefine: WithRefine1[typings.ioTs.libGuardMod.URI] = js.native
  
  @JSImport("io-ts/lib/Guard", "WithUnion")
  @js.native
  val WithUnion: WithUnion1[typings.ioTs.libGuardMod.URI] = js.native
  
  @JSImport("io-ts/lib/Guard", "WithUnknownContainers")
  @js.native
  val WithUnknownContainers: WithUnknownContainers1[typings.ioTs.libGuardMod.URI] = js.native
  
  inline def alt[I, A /* <: I */](that: js.Function0[Guard[I, A]]): js.Function1[/* me */ Guard[I, A], Guard[I, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("alt")(that.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* me */ Guard[I, A], Guard[I, A]]]
  
  inline def array[A](item: Guard[Any, A]): Guard[Any, js.Array[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(item.asInstanceOf[js.Any]).asInstanceOf[Guard[Any, js.Array[A]]]
  
  @JSImport("io-ts/lib/Guard", "boolean")
  @js.native
  val boolean: Guard[Any, Boolean] = js.native
  
  inline def compose[I, A /* <: I */, B /* <: A */](to: Guard[A, B]): js.Function1[/* from */ Guard[I, A], Guard[I, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(to.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Guard[I, A], Guard[I, B]]]
  
  inline def id[A](): Guard[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[Guard[A, A]]
  
  inline def intersect[B](right: Guard[Any, B]): js.Function1[/* left */ Guard[Any, Any], Guard[Any, Any & B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(right.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* left */ Guard[Any, Any], Guard[Any, Any & B]]]
  
  inline def `lazy`[A](f: js.Function0[Guard[Any, A]]): Guard[Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(f.asInstanceOf[js.Any]).asInstanceOf[Guard[Any, A]]
  
  inline def literal[A /* <: Array[L] */, L /* <: Literal */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param values because its type A is not an array type */ values: A
  ): Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(values.asInstanceOf[js.Any]).asInstanceOf[Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def nullable[I, A /* <: I */](or: Guard[I, A]): Guard[I | Null, A | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("nullable")(or.asInstanceOf[js.Any]).asInstanceOf[Guard[I | Null, A | Null]]
  
  @JSImport("io-ts/lib/Guard", "number")
  @js.native
  val number: Guard[Any, Double] = js.native
  
  inline def partial[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<unknown, A[K]>} */ js.Any
  ): Guard[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("partial")(properties.asInstanceOf[js.Any]).asInstanceOf[Guard[
    Any, 
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
    ]
  ]]
  
  inline def readonly[I, A /* <: I */](guard: Guard[I, A]): Guard[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(guard.asInstanceOf[js.Any]).asInstanceOf[Guard[I, A]]
  
  inline def record[A](codomain: Guard[Any, A]): Guard[Any, Record[String, A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("record")(codomain.asInstanceOf[js.Any]).asInstanceOf[Guard[Any, Record[String, A]]]
  
  inline def refine[I, A /* <: I */, B /* <: A */](refinement: Refinement[A, B]): js.Function1[/* from */ Guard[I, A], Guard[I, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("refine")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* from */ Guard[I, A], Guard[I, B]]]
  
  @JSImport("io-ts/lib/Guard", "string")
  @js.native
  val string: Guard[Any, String] = js.native
  
  inline def struct[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<unknown, A[K]>} */ js.Any
  ): Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("struct")(properties.asInstanceOf[js.Any]).asInstanceOf[Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def sum[T /* <: String */](tag: T): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/Guard.Guard<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Guard[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(tag.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof any ]: io-ts.io-ts/lib/Guard.Guard<unknown, any[K] & std.Record<T, K>>} */ /* members */ js.Any, 
    Guard[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ]
  ]]
  
  inline def tuple[A /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param components because its type {[ K in keyof A ]: Guard<unknown, A[K]>} is not an array type */ components: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<unknown, A[K]>} */ js.Any
  ): Guard[Any, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(components.asInstanceOf[js.Any]).asInstanceOf[Guard[Any, A]]
  
  inline def `type`[A](
    properties: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<unknown, A[K]>} */ js.Any
  ): Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(properties.asInstanceOf[js.Any]).asInstanceOf[Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K_1 in keyof A ]: A[K_1]} */ js.Any
  ]]
  
  inline def union[A /* <: Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param members because its type {[ K in keyof A ]: Guard<unknown, A[K]>} is not an array type */ members: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof A ]: io-ts.io-ts/lib/Guard.Guard<unknown, A[K]>} */ js.Any
  ): Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(members.asInstanceOf[js.Any]).asInstanceOf[Guard[
    Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A[number] */ js.Any
  ]]
  
  inline def zero[I, A /* <: I */](): Guard[I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[Guard[I, A]]
  
  trait Guard[I, A /* <: I */] extends StObject {
    
    def is(i: I): /* is A */ Boolean
  }
  object Guard {
    
    inline def apply[I, A /* <: I */](is: I => /* is A */ Boolean): Guard[I, A] = {
      val __obj = js.Dynamic.literal(is = js.Any.fromFunction1(is))
      __obj.asInstanceOf[Guard[I, A]]
    }
    
    extension [Self <: Guard[?, ?], I, A /* <: I */](x: Self & (Guard[I, A])) {
      
      inline def setIs(value: I => /* is A */ Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    G extends io-ts.io-ts/lib/Guard.Guard<infer I, any> ? I : never
    }}}
    */
  @js.native
  trait InputOf[G] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    G extends io-ts.io-ts/lib/Guard.Guard<any, infer A> ? A : never
    }}}
    */
  @js.native
  trait TypeOf[G] extends StObject
  
  /* augmented module */
  object fpTsLibHKTAugmentingMod {
    
    @js.native
    trait URItoKind[A] extends StObject
  }
}
