package typings.ipfsHttpGateway

import typings.hapiHapi.mod.ReqRefDefaults
import typings.hapiHapi.mod.Request
import typings.hapiHapi.mod.ResponseObject
import typings.hapiHapi.mod.ResponseToolkit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ext extends StObject {
    
    var ext: OnPostHandler
    
    def handler(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Promise[ResponseObject]
    
    var response: Ranges
    
    var validate: Params
  }
  object Ext {
    
    inline def apply(
      ext: OnPostHandler,
      handler: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[ResponseObject],
      response: Ranges,
      validate: Params
    ): Ext = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], handler = js.Any.fromFunction2(handler), response = response.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
      
      inline def setExt(value: OnPostHandler): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Promise[ResponseObject]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
      
      inline def setResponse(value: Ranges): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Params): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    }
  }
  
  trait Method extends StObject {
    
    def method(request: Request[ReqRefDefaults], h: ResponseToolkit[ReqRefDefaults]): js.Symbol
  }
  object Method {
    
    inline def apply(method: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Symbol): Method = {
      val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: (Request[ReqRefDefaults], ResponseToolkit[ReqRefDefaults]) => js.Symbol): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
    }
  }
  
  trait OnPostHandler extends StObject {
    
    var onPostHandler: Method
  }
  object OnPostHandler {
    
    inline def apply(onPostHandler: Method): OnPostHandler = {
      val __obj = js.Dynamic.literal(onPostHandler = onPostHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnPostHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnPostHandler] (val x: Self) extends AnyVal {
      
      inline def setOnPostHandler(value: Method): Self = StObject.set(x, "onPostHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var method: String
    
    var options: Ext
    
    var path: String
  }
  object Options {
    
    inline def apply(method: String, options: Ext, path: String): Options = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Ext): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Joi.ObjectSchema<any> */ Any
  }
  object Params {
    
    inline def apply(
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Joi.ObjectSchema<any> */ Any
    ): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setParams(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Joi.ObjectSchema<any> */ Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ranges extends StObject {
    
    var ranges: Boolean
  }
  object Ranges {
    
    inline def apply(ranges: Boolean): Ranges = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ranges]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ranges] (val x: Self) extends AnyVal {
      
      inline def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    }
  }
}
