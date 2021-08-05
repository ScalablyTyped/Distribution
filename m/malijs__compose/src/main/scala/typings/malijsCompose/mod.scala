package typings.malijsCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](middleware: js.Array[Middleware[T]]): ComposedMiddleware[T] = ^.asInstanceOf[js.Dynamic].apply(middleware.asInstanceOf[js.Any]).asInstanceOf[ComposedMiddleware[T]]
  
  @JSImport("@malijs/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ComposedMiddleware[T] = js.Function2[
    /* context */ T, 
    /* next */ js.UndefOr[js.Function0[js.Promise[js.Any]]], 
    js.Promise[Unit]
  ]
  
  type Middleware[T] = js.Function2[/* context */ T, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
}
