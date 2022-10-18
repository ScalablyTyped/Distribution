package typings.ioTs

import typings.ioTs.libSchemableMod.Schemable
import typings.ioTs.libSchemableMod.Schemable1
import typings.ioTs.libSchemableMod.Schemable2C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchemaMod {
  
  @JSImport("io-ts/lib/Schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpreter[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](S: Schemable1[S]): js.Function1[
    /* schema */ Schema[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpreter")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* schema */ Schema[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ Any
  ]]
  inline def interpreter[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](S: Schemable2C[S, Any]): js.Function1[
    /* schema */ Schema[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, unknown, A> */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpreter")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* schema */ Schema[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, unknown, A> */ Any
  ]]
  
  inline def make[A](schema: Schema[A]): Schema[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(schema.asInstanceOf[js.Any]).asInstanceOf[Schema[A]]
  
  type Schema[A] = js.Function1[
    /* S */ Schemable[Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    S extends io-ts.io-ts/lib/Schema.Schema<infer A> ? A : never
    }}}
    */
  @js.native
  trait TypeOf[S] extends StObject
}
