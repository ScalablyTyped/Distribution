package typings.jose

import typings.jose.distTypesTypesMod.FlattenedJWSInput
import typings.jose.distTypesTypesMod.JWSHeaderParameters
import typings.jose.distTypesTypesMod.KeyLike
import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJwksRemoteMod {
  
  @JSImport("jose/dist/types/jwks/remote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRemoteJWKSet[T /* <: KeyLike */](url: URL): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  inline def createRemoteJWKSet[T /* <: KeyLike */](url: URL, options: RemoteJWKSetOptions): js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("createRemoteJWKSet")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* protectedHeader */ js.UndefOr[JWSHeaderParameters], 
    /* token */ js.UndefOr[FlattenedJWSInput], 
    js.Promise[T]
  ]]
  
  trait RemoteJWKSetOptions extends StObject {
    
    /**
      * An instance of {@link https://nodejs.org/api/http.html#class-httpagent http.Agent} or
      * {@link https://nodejs.org/api/https.html#class-httpsagent https.Agent} to pass to the
      * {@link https://nodejs.org/api/http.html#httpgetoptions-callback http.get} or
      * {@link https://nodejs.org/api/https.html#httpsgetoptions-callback https.get} method's options.
      * Use when behind an http(s) proxy. This is a Node.js runtime specific option, it is ignored when
      * used outside of Node.js runtime.
      */
    var agent: js.UndefOr[Any] = js.undefined
    
    /**
      * Maximum time (in milliseconds) between successful HTTP requests. Default is 600000 (10
      * minutes).
      */
    var cacheMaxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Duration (in milliseconds) for which no more HTTP requests will be triggered after a previous
      * successful fetch. Default is 30000 (30 seconds).
      */
    var cooldownDuration: js.UndefOr[Double] = js.undefined
    
    /** Optional headers to be sent with the HTTP request. */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Timeout (in milliseconds) for the HTTP request. When reached the request will be aborted and
      * the verification will fail. Default is 5000 (5 seconds).
      */
    var timeoutDuration: js.UndefOr[Double] = js.undefined
  }
  object RemoteJWKSetOptions {
    
    inline def apply(): RemoteJWKSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteJWKSetOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoteJWKSetOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCacheMaxAge(value: Double): Self = StObject.set(x, "cacheMaxAge", value.asInstanceOf[js.Any])
      
      inline def setCacheMaxAgeUndefined: Self = StObject.set(x, "cacheMaxAge", js.undefined)
      
      inline def setCooldownDuration(value: Double): Self = StObject.set(x, "cooldownDuration", value.asInstanceOf[js.Any])
      
      inline def setCooldownDurationUndefined: Self = StObject.set(x, "cooldownDuration", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setTimeoutDuration(value: Double): Self = StObject.set(x, "timeoutDuration", value.asInstanceOf[js.Any])
      
      inline def setTimeoutDurationUndefined: Self = StObject.set(x, "timeoutDuration", js.undefined)
    }
  }
}
