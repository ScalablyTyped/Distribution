package typings.hapiHapi

import typings.hapiBoom.mod.Boom
import typings.hapiHapi.hapiHapiStrings.delete_
import typings.hapiHapi.hapiHapiStrings.get_
import typings.hapiHapi.hapiHapiStrings.head_
import typings.hapiHapi.hapiHapiStrings.options_
import typings.hapiHapi.hapiHapiStrings.patch_
import typings.hapiHapi.hapiHapiStrings.post_
import typings.hapiHapi.hapiHapiStrings.put_
import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.Auth
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.hapiShot.mod.ResponseObject
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesUtilsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.HEAD
    - typings.hapiHapi.hapiHapiStrings.head_
    - typings.hapiHapi.hapiHapiStrings.GET
    - typings.hapiHapi.hapiHapiStrings.POST
    - typings.hapiHapi.hapiHapiStrings.PUT
    - typings.hapiHapi.hapiHapiStrings.PATCH
    - typings.hapiHapi.hapiHapiStrings.DELETE
    - typings.hapiHapi.hapiHapiStrings.OPTIONS
    - typings.hapiHapi.hapiHapiStrings.get_
    - typings.hapiHapi.hapiHapiStrings.post_
    - typings.hapiHapi.hapiHapiStrings.put_
    - typings.hapiHapi.hapiHapiStrings.patch_
    - typings.hapiHapi.hapiHapiStrings.delete_
    - typings.hapiHapi.hapiHapiStrings.options_
  */
  trait HTTP_METHODS extends StObject
  object HTTP_METHODS {
    
    inline def DELETE: typings.hapiHapi.hapiHapiStrings.DELETE = "DELETE".asInstanceOf[typings.hapiHapi.hapiHapiStrings.DELETE]
    
    inline def GET: typings.hapiHapi.hapiHapiStrings.GET = "GET".asInstanceOf[typings.hapiHapi.hapiHapiStrings.GET]
    
    inline def HEAD: typings.hapiHapi.hapiHapiStrings.HEAD = "HEAD".asInstanceOf[typings.hapiHapi.hapiHapiStrings.HEAD]
    
    inline def OPTIONS: typings.hapiHapi.hapiHapiStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.hapiHapi.hapiHapiStrings.OPTIONS]
    
    inline def PATCH: typings.hapiHapi.hapiHapiStrings.PATCH = "PATCH".asInstanceOf[typings.hapiHapi.hapiHapiStrings.PATCH]
    
    inline def POST: typings.hapiHapi.hapiHapiStrings.POST = "POST".asInstanceOf[typings.hapiHapi.hapiHapiStrings.POST]
    
    inline def PUT: typings.hapiHapi.hapiHapiStrings.PUT = "PUT".asInstanceOf[typings.hapiHapi.hapiHapiStrings.PUT]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: head_ = "head".asInstanceOf[head_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.GET
    - typings.hapiHapi.hapiHapiStrings.POST
    - typings.hapiHapi.hapiHapiStrings.PUT
    - typings.hapiHapi.hapiHapiStrings.PATCH
    - typings.hapiHapi.hapiHapiStrings.DELETE
    - typings.hapiHapi.hapiHapiStrings.OPTIONS
    - typings.hapiHapi.hapiHapiStrings.get_
    - typings.hapiHapi.hapiHapiStrings.post_
    - typings.hapiHapi.hapiHapiStrings.put_
    - typings.hapiHapi.hapiHapiStrings.patch_
    - typings.hapiHapi.hapiHapiStrings.delete_
    - typings.hapiHapi.hapiHapiStrings.options_
  */
  trait HTTP_METHODS_PARTIAL extends StObject
  object HTTP_METHODS_PARTIAL {
    
    inline def DELETE: typings.hapiHapi.hapiHapiStrings.DELETE = "DELETE".asInstanceOf[typings.hapiHapi.hapiHapiStrings.DELETE]
    
    inline def GET: typings.hapiHapi.hapiHapiStrings.GET = "GET".asInstanceOf[typings.hapiHapi.hapiHapiStrings.GET]
    
    inline def OPTIONS: typings.hapiHapi.hapiHapiStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.hapiHapi.hapiHapiStrings.OPTIONS]
    
    inline def PATCH: typings.hapiHapi.hapiHapiStrings.PATCH = "PATCH".asInstanceOf[typings.hapiHapi.hapiHapiStrings.PATCH]
    
    inline def POST: typings.hapiHapi.hapiHapiStrings.POST = "POST".asInstanceOf[typings.hapiHapi.hapiHapiStrings.POST]
    
    inline def PUT: typings.hapiHapi.hapiHapiStrings.PUT = "PUT".asInstanceOf[typings.hapiHapi.hapiHapiStrings.PUT]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.get_
    - typings.hapiHapi.hapiHapiStrings.post_
    - typings.hapiHapi.hapiHapiStrings.put_
    - typings.hapiHapi.hapiHapiStrings.patch_
    - typings.hapiHapi.hapiHapiStrings.delete_
    - typings.hapiHapi.hapiHapiStrings.options_
  */
  trait HTTP_METHODS_PARTIAL_LOWERCASE extends StObject
  object HTTP_METHODS_PARTIAL_LOWERCASE {
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
  }
  
  object Json {
    
    /**
      * For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsjson)
      */
    trait StringifyArguments extends StObject {
      
      /* calls Hoek.jsonEscape() after conversion to JSON string. Defaults to false. */
      var escape: js.UndefOr[Boolean] = js.undefined
      
      /** the replacer function or array. Defaults to no action. */
      var replacer: js.UndefOr[StringifyReplacer] = js.undefined
      
      /** number of spaces to indent nested object keys. Defaults to no indentation. */
      var space: js.UndefOr[StringifySpace] = js.undefined
      
      /* string suffix added after conversion to JSON string. Defaults to no suffix. */
      var suffix: js.UndefOr[String] = js.undefined
    }
    object StringifyArguments {
      
      inline def apply(): StringifyArguments = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[StringifyArguments]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StringifyArguments] (val x: Self) extends AnyVal {
        
        inline def setEscape(value: Boolean): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
        
        inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
        
        inline def setReplacer(value: StringifyReplacer): Self = StObject.set(x, "replacer", value.asInstanceOf[js.Any])
        
        inline def setReplacerFunction2(value: (/* key */ String, /* value */ Any) => Any): Self = StObject.set(x, "replacer", js.Any.fromFunction2(value))
        
        inline def setReplacerUndefined: Self = StObject.set(x, "replacer", js.undefined)
        
        inline def setReplacerVarargs(value: (String | Double)*): Self = StObject.set(x, "replacer", js.Array(value*))
        
        inline def setSpace(value: StringifySpace): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
        
        inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
        
        inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
        
        inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      }
    }
    
    /**
      * @see {@link https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/JSON/stringify#The_replacer_parameter}
      */
    type StringifyReplacer = js.UndefOr[
        (js.Function2[/* key */ String, /* value */ Any, Any]) | (js.Array[String | Double])
      ]
    
    /**
      * Any value greater than 10 is truncated.
      */
    type StringifySpace = Double | String
  }
  
  object Lifecycle {
    
    /**
      * Various configuration options allows defining how errors are handled. For example, when invalid payload is received or malformed cookie, instead of returning an error, the framework can be
      * configured to perform another action. When supported the failAction option supports the following values:
      * * 'error' - return the error object as the response.
      * * 'log' - report the error but continue processing the request.
      * * 'ignore' - take no action and continue processing the request.
      * * a lifecycle method with the signature async function(request, h, err) where:
      * * * request - the request object.
      * * * h - the response toolkit.
      * * * err - the error object.
      * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-failaction-configuration)
      */
    /* Rewritten from type alias, can be one of: 
      - typings.hapiHapi.hapiHapiStrings.error
      - typings.hapiHapi.hapiHapiStrings.log
      - typings.hapiHapi.hapiHapiStrings.ignore
      - typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method[
    typings.hapiHapi.libTypesRequestMod.ReqRefDefaults, 
    typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue[typings.hapiHapi.libTypesRequestMod.ReqRefDefaults]]
    */
    type FailAction = _FailAction | (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]])
    
    /**
      * Lifecycle methods are the interface between the framework and the application. Many of the request lifecycle steps:
      * extensions, authentication, handlers, pre-handler methods, and failAction function values are lifecycle methods
      * provided by the developer and executed by the framework.
      * Each lifecycle method is a function with the signature await function(request, h, [err]) where:
      * * request - the request object.
      * * h - the response toolkit the handler must call to set a response and return control back to the framework.
      * * err - an error object available only when the method is used as a failAction value.
      */
    type Method[Refs /* <: ReqRef */, R /* <: ReturnValue[Any] */] = js.ThisFunction3[
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['Bind'] */ /* this */ js.Any, 
        /* request */ Request[Refs], 
        /* h */ ResponseToolkit[Refs], 
        /* err */ js.UndefOr[js.Error], 
        R
      ]
    
    /**
      * Each lifecycle method must return a value or a promise that resolves into a value. If a lifecycle method returns
      * without a value or resolves to an undefined value, an Internal Server Error (500) error response is sent.
      * The return value must be one of:
      * - Plain value: null, string, number, boolean
      * - Buffer object
      * - Error object: plain Error OR a Boom object.
      * - Stream object
      * - any object or array
      * - a toolkit signal:
      * - a toolkit method response:
      * - a promise object that resolve to any of the above values
      * For more info please [See docs](https://github.com/hapijs/hapi/blob/master/API.md#lifecycle-methods)
      */
    type ReturnValue[Refs /* <: ReqRef */] = ReturnValueTypes[Refs] | js.Promise[ReturnValueTypes[Refs]]
    
    type ReturnValueTypes[Refs /* <: ReqRef */] = Null | String | Double | Boolean | Buffer | js.Error | Boom[Any] | Stream | js.Object | js.Array[js.Object] | js.Symbol | (Auth[
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthUser'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthApp'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthCredentialsExtra'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: @hapi/hapi.@hapi/hapi/lib/types/request.MergeRefs<Refs>['AuthArtifactsExtra'] */ js.Any
      ]) | ResponseObject
    
    trait _FailAction extends StObject
  }
  
  type PeekListener = js.Function2[/* chunk */ String, /* encoding */ String, Unit]
}
