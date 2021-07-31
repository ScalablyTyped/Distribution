package typings.graphqlPlaygroundMiddlewareExpress

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.MiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("graphql-playground-middleware-express", JSImport.Default)
  @js.native
  val default: Register = js.native
  
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* res */ Response_[js.Any], 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
  
  type _To = Register
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Register = default
}
