package typings.koaJsonError

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Error handler for pure Koa 2.0.0+ JSON apps
    */
  @JSImport("koa-json-error", JSImport.Namespace)
  @js.native
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  @JSImport("koa-json-error", JSImport.Namespace)
  @js.native
  def apply(options: JSONErrorOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  @js.native
  trait JSONErrorOptions extends StObject {
    
    /**
      * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
      */
    var format: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.native
    
    /**
      * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
      */
    var postFormat: js.UndefOr[js.Function2[/* err */ Error, /* obj */ js.Any, _]] = js.native
    
    /**
      * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
      */
    var preFormat: js.UndefOr[js.Function1[/* err */ Error, _]] = js.native
  }
  object JSONErrorOptions {
    
    @scala.inline
    def apply(): JSONErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONErrorOptions]
    }
    
    @scala.inline
    implicit class JSONErrorOptionsMutableBuilder[Self <: JSONErrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (/* err */ Error, /* obj */ js.Any) => _): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPostFormat(value: (/* err */ Error, /* obj */ js.Any) => _): Self = StObject.set(x, "postFormat", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPostFormatUndefined: Self = StObject.set(x, "postFormat", js.undefined)
      
      @scala.inline
      def setPreFormat(value: /* err */ Error => _): Self = StObject.set(x, "preFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreFormatUndefined: Self = StObject.set(x, "preFormat", js.undefined)
    }
  }
}
