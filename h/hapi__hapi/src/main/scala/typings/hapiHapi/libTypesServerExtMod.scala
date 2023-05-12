package typings.hapiHapi

import typings.hapiHapi.hapiHapiStrings.plugin
import typings.hapiHapi.hapiHapiStrings.server
import typings.hapiHapi.libTypesRequestMod.ReqRef
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesResponseMod.ResponseToolkit
import typings.hapiHapi.libTypesServerServerMod.Server_
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.Method
import typings.hapiHapi.libTypesUtilsMod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerExtMod {
  
  trait RouteExtObject[Refs /* <: ReqRef */] extends StObject {
    
    @JSName("method")
    def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs]): ReturnValue[Refs]
    @JSName("method")
    def method_Bind(request: Request[Refs], h: ResponseToolkit[Refs], err: js.Error): ReturnValue[Refs]
    @JSName("method")
    var method_Original: Method[Refs, ReturnValue[Refs]]
    
    var options: js.UndefOr[ServerExtOptions] = js.undefined
  }
  object RouteExtObject {
    
    inline def apply[Refs /* <: ReqRef */](method: Method[Refs, ReturnValue[Refs]]): RouteExtObject[Refs] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteExtObject[Refs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteExtObject[?], Refs /* <: ReqRef */] (val x: Self & RouteExtObject[Refs]) extends AnyVal {
      
      inline def setMethod(value: Method[Refs, ReturnValue[Refs]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.onPreAuth
    - typings.hapiHapi.hapiHapiStrings.onCredentials
    - typings.hapiHapi.hapiHapiStrings.onPostAuth
    - typings.hapiHapi.hapiHapiStrings.onPreHandler
    - typings.hapiHapi.hapiHapiStrings.onPostHandler
    - typings.hapiHapi.hapiHapiStrings.onPreResponse
    - typings.hapiHapi.hapiHapiStrings.onPostResponse
  */
  trait RouteRequestExtType extends StObject
  object RouteRequestExtType {
    
    inline def onCredentials: typings.hapiHapi.hapiHapiStrings.onCredentials = "onCredentials".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onCredentials]
    
    inline def onPostAuth: typings.hapiHapi.hapiHapiStrings.onPostAuth = "onPostAuth".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostAuth]
    
    inline def onPostHandler: typings.hapiHapi.hapiHapiStrings.onPostHandler = "onPostHandler".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostHandler]
    
    inline def onPostResponse: typings.hapiHapi.hapiHapiStrings.onPostResponse = "onPostResponse".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostResponse]
    
    inline def onPreAuth: typings.hapiHapi.hapiHapiStrings.onPreAuth = "onPreAuth".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreAuth]
    
    inline def onPreHandler: typings.hapiHapi.hapiHapiStrings.onPreHandler = "onPreHandler".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreHandler]
    
    inline def onPreResponse: typings.hapiHapi.hapiHapiStrings.onPreResponse = "onPreResponse".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreResponse]
  }
  
  trait ServerExtEventsObject[A] extends StObject {
    
    /**
      * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
      * * server extension points: async function(server) where:
      * * * server - the server object.
      * * * this - the object provided via options.bind or the current active context set with server.bind().
      * * request extension points: a lifecycle method.
      */
    var method: ServerExtPointFunction[A] | js.Array[ServerExtPointFunction[A]]
    
    var options: js.UndefOr[ServerExtOptions] = js.undefined
    
    /**
      * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
      * * 'onPreStart' - called before the connection listeners are started.
      * * 'onPostStart' - called after the connection listeners are started.
      * * 'onPreStop' - called before the connection listeners are stopped.
      */
    var `type`: ServerExtType
  }
  object ServerExtEventsObject {
    
    inline def apply[A](method: ServerExtPointFunction[A] | js.Array[ServerExtPointFunction[A]], `type`: ServerExtType): ServerExtEventsObject[A] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerExtEventsObject[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerExtEventsObject[?], A] (val x: Self & ServerExtEventsObject[A]) extends AnyVal {
      
      inline def setMethod(value: ServerExtPointFunction[A] | js.Array[ServerExtPointFunction[A]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: /* server */ Server_[A] => Unit): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodVarargs(value: ServerExtPointFunction[A]*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: ServerExtType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerExtEventsRequestObject extends StObject {
    
    /**
      * (required) a function or an array of functions to be executed at a specified point during request processing. The required extension function signature is:
      * * server extension points: async function(server) where:
      * * * server - the server object.
      * * * this - the object provided via options.bind or the current active context set with server.bind().
      * * request extension points: a lifecycle method.
      */
    var method: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | (js.Array[Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]])
    
    /**
      * (optional) an object with the following:
      * * before - a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
      * * after - a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
      * * bind - a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
      * * sandbox - if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions,
      * or when adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
      */
    var options: js.UndefOr[ServerExtOptions] = js.undefined
    
    /**
      * (required) the extension point event name. The available extension points include the request extension points as well as the following server extension points:
      * * 'onPreStart' - called before the connection listeners are started.
      * * 'onPostStart' - called after the connection listeners are started.
      * * 'onPreStop' - called before the connection listeners are stopped.
      * * 'onPostStop' - called after the connection listeners are stopped.
      */
    var `type`: ServerRequestExtType
  }
  object ServerExtEventsRequestObject {
    
    inline def apply(
      method: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | (js.Array[Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]]),
      `type`: ServerRequestExtType
    ): ServerExtEventsRequestObject = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerExtEventsRequestObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerExtEventsRequestObject] (val x: Self) extends AnyVal {
      
      inline def setMethod(
        value: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]) | (js.Array[Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]]])
      ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodVarargs(value: (Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]])*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOptions(value: ServerExtOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: ServerRequestExtType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerExtOptions extends StObject {
    
    /**
      * a string or array of strings of plugin names this method must execute after (on the same event). Otherwise, extension methods are executed in the order added.
      */
    var after: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * a string or array of strings of plugin names this method must execute before (on the same event). Otherwise, extension methods are executed in the order added.
      */
    var before: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * a context object passed back to the provided method (via this) when called. Ignored if the method is an arrow function.
      */
    var bind: js.UndefOr[js.Object] = js.undefined
    
    /**
      * if set to 'plugin' when adding a request extension points the extension is only added to routes defined by the current plugin. Not allowed when configuring route-level extensions, or when
      * adding server extensions. Defaults to 'server' which applies to any route added to the server the extension is added to.
      */
    var sandbox: js.UndefOr[server | plugin] = js.undefined
  }
  object ServerExtOptions {
    
    inline def apply(): ServerExtOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerExtOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerExtOptions] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String | js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setBind(value: js.Object): Self = StObject.set(x, "bind", value.asInstanceOf[js.Any])
      
      inline def setBindUndefined: Self = StObject.set(x, "bind", js.undefined)
      
      inline def setSandbox(value: server | plugin): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    }
  }
  
  type ServerExtPointFunction[A] = js.Function1[/* server */ Server_[A], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.onPreStart
    - typings.hapiHapi.hapiHapiStrings.onPostStart
    - typings.hapiHapi.hapiHapiStrings.onPreStop
    - typings.hapiHapi.hapiHapiStrings.onPostStop
  */
  trait ServerExtType extends StObject
  object ServerExtType {
    
    inline def onPostStart: typings.hapiHapi.hapiHapiStrings.onPostStart = "onPostStart".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostStart]
    
    inline def onPostStop: typings.hapiHapi.hapiHapiStrings.onPostStop = "onPostStop".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostStop]
    
    inline def onPreStart: typings.hapiHapi.hapiHapiStrings.onPreStart = "onPreStart".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreStart]
    
    inline def onPreStop: typings.hapiHapi.hapiHapiStrings.onPreStop = "onPreStop".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreStop]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.hapiHapi.hapiHapiStrings.onRequest
    - typings.hapiHapi.hapiHapiStrings.onPreAuth
    - typings.hapiHapi.hapiHapiStrings.onCredentials
    - typings.hapiHapi.hapiHapiStrings.onPostAuth
    - typings.hapiHapi.hapiHapiStrings.onPreHandler
    - typings.hapiHapi.hapiHapiStrings.onPostHandler
    - typings.hapiHapi.hapiHapiStrings.onPreResponse
    - typings.hapiHapi.hapiHapiStrings.onPostResponse
  */
  trait ServerRequestExtType extends StObject
  object ServerRequestExtType {
    
    inline def onCredentials: typings.hapiHapi.hapiHapiStrings.onCredentials = "onCredentials".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onCredentials]
    
    inline def onPostAuth: typings.hapiHapi.hapiHapiStrings.onPostAuth = "onPostAuth".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostAuth]
    
    inline def onPostHandler: typings.hapiHapi.hapiHapiStrings.onPostHandler = "onPostHandler".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostHandler]
    
    inline def onPostResponse: typings.hapiHapi.hapiHapiStrings.onPostResponse = "onPostResponse".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPostResponse]
    
    inline def onPreAuth: typings.hapiHapi.hapiHapiStrings.onPreAuth = "onPreAuth".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreAuth]
    
    inline def onPreHandler: typings.hapiHapi.hapiHapiStrings.onPreHandler = "onPreHandler".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreHandler]
    
    inline def onPreResponse: typings.hapiHapi.hapiHapiStrings.onPreResponse = "onPreResponse".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onPreResponse]
    
    inline def onRequest: typings.hapiHapi.hapiHapiStrings.onRequest = "onRequest".asInstanceOf[typings.hapiHapi.hapiHapiStrings.onRequest]
  }
}
