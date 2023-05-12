package typings.hapiHapi

import typings.hapiHapi.anon.Artifacts
import typings.hapiHapi.libTypesPluginMod.PluginsStates
import typings.hapiHapi.libTypesRequestMod.ReqRefDefaults
import typings.hapiHapi.libTypesRequestMod.Request
import typings.hapiHapi.libTypesRequestMod.RequestApplicationState
import typings.hapiShot.anon.Req
import typings.hapiShot.mod.PartialURL
import typings.hapiShot.mod.RequestOptions
import typings.hapiShot.mod.ResponseObject
import typings.node.NodeJS.Dict
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesServerInjectMod {
  
  trait ServerInjectOptions
    extends StObject
       with RequestOptions {
    
    /**
      * allows access to routes with config.isInternal set to true. Defaults to false.
      */
    var allowInternals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * sets the initial value of request.app, defaults to {}.
      */
    var app: js.UndefOr[RequestApplicationState] = js.undefined
    
    /**
      * Authentication bypass options.
      */
    var auth: js.UndefOr[Artifacts] = js.undefined
    
    /**
      * sets the initial value of request.plugins, defaults to {}.
      */
    var plugins: js.UndefOr[PluginsStates] = js.undefined
  }
  object ServerInjectOptions {
    
    inline def apply(url: String | PartialURL): ServerInjectOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInjectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerInjectOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowInternals(value: Boolean): Self = StObject.set(x, "allowInternals", value.asInstanceOf[js.Any])
      
      inline def setAllowInternalsUndefined: Self = StObject.set(x, "allowInternals", js.undefined)
      
      inline def setApp(value: RequestApplicationState): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setAuth(value: Artifacts): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setPlugins(value: PluginsStates): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    }
  }
  
  trait ServerInjectResponse[Result]
    extends StObject
       with ResponseObject {
    
    /**
      * the request object.
      */
    var request: Request[ReqRefDefaults]
    
    /**
      * the raw handler response (e.g. when not a stream or a view) before it is serialized for transmission. If not available, the value is set to payload. Useful for inspection and reuse of the
      * internal objects returned (instead of parsing the response string).
      */
    var result: js.UndefOr[Result] = js.undefined
  }
  object ServerInjectResponse {
    
    inline def apply[Result](
      headers: OutgoingHttpHeaders,
      payload: String,
      raw: Req,
      rawPayload: Buffer,
      request: Request[ReqRefDefaults],
      statusCode: Double,
      statusMessage: String,
      trailers: Dict[String]
    ): ServerInjectResponse[Result] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerInjectResponse[Result]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerInjectResponse[?], Result] (val x: Self & ServerInjectResponse[Result]) extends AnyVal {
      
      inline def setRequest(value: Request[ReqRefDefaults]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
