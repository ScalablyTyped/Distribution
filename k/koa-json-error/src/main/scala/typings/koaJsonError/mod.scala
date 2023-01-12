package typings.koaJsonError

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Error handler for pure Koa 2.0.0+ JSON apps
    */
  inline def apply(): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def apply(options: JSONErrorOptions): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  @JSImport("koa-json-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JSONError
    extends StObject
       with Error {
    
    var status: Double
  }
  object JSONError {
    
    inline def apply(message: String, name: String, status: Double): JSONError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONError] (val x: Self) extends AnyVal {
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONErrorOptions extends StObject {
    
    /**
      * Runs inmediatly after `options.preFormat`. It receives two arguments: the original `err` and the output of     `options.preFormat`. It should `return` a newly formatted error.
      */
    var format: js.UndefOr[js.Function2[/* err */ JSONError, /* obj */ Any, Any]] = js.undefined
    
    /**
      * Runs inmediatly after `options.format`. It receives two arguments: the original `err` and the output of   `options.format`.   It should `return` a newly formatted error.
      */
    var postFormat: js.UndefOr[js.Function2[/* err */ JSONError, /* obj */ Any, Any]] = js.undefined
    
    /**
      * Perform some task before calling `options.format`. Must be a function with the original err as its only argument.
      */
    var preFormat: js.UndefOr[js.Function1[/* err */ JSONError, Any]] = js.undefined
  }
  object JSONErrorOptions {
    
    inline def apply(): JSONErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONErrorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONErrorOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: (/* err */ JSONError, /* obj */ Any) => Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setPostFormat(value: (/* err */ JSONError, /* obj */ Any) => Any): Self = StObject.set(x, "postFormat", js.Any.fromFunction2(value))
      
      inline def setPostFormatUndefined: Self = StObject.set(x, "postFormat", js.undefined)
      
      inline def setPreFormat(value: /* err */ JSONError => Any): Self = StObject.set(x, "preFormat", js.Any.fromFunction1(value))
      
      inline def setPreFormatUndefined: Self = StObject.set(x, "preFormat", js.undefined)
    }
  }
}
