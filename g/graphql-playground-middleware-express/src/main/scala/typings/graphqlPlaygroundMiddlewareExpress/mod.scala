package typings.graphqlPlaygroundMiddlewareExpress

import org.scalablytyped.runtime.Shortcut
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.graphqlPlaygroundHtml.renderPlaygroundPageMod.MiddlewareOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("graphql-playground-middleware-express", JSImport.Default)
  @js.native
  val default: Register = js.native
  
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
  
  type _To = Register
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Register = default
}
