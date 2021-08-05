package typings.ioTs

import typings.ioTs.schemableMod.Schemable
import typings.ioTs.schemableMod.Schemable1
import typings.ioTs.schemableMod.Schemable2C
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemaMod {
  
  @JSImport("io-ts/lib/Schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interpreter[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ js.Any */](S: Schemable1[S]): js.Function1[
    /* schema */ Schema[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpreter")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* schema */ Schema[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<S, A> */ js.Any
  ]]
  inline def interpreter[S /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ js.Any */](S: Schemable2C[S, js.Any]): js.Function1[
    /* schema */ Schema[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, unknown, A> */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpreter")(S.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* schema */ Schema[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<S, unknown, A> */ js.Any
  ]]
  
  inline def make[A](schema: Schema[A]): Schema[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(schema.asInstanceOf[js.Any]).asInstanceOf[Schema[A]]
  
  type Schema[A] = js.Function1[
    /* S */ Schemable[js.Any], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<S, A> */ js.Any
  ]
  
  type TypeOf[S] = js.Any
}
