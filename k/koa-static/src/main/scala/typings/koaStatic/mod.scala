package typings.koaStatic

import typings.koa.mod.DefaultContext
import typings.koa.mod.Middleware
import typings.koaSend.mod.SendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-static", JSImport.Namespace)
  @js.native
  def apply(root: String): Middleware[js.Object, DefaultContext] = js.native
  @JSImport("koa-static", JSImport.Namespace)
  @js.native
  def apply(root: String, opts: Options): Middleware[js.Object, DefaultContext] = js.native
  
  @js.native
  trait Options extends SendOptions {
    
    /** If true, serves after return next(), allowing any downstream middleware to respond first. */
    var defer: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    }
  }
}
