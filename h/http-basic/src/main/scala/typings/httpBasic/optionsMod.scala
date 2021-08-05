package typings.httpBasic

import typings.httpBasic.cachedResponseMod.CachedResponse
import typings.httpBasic.headersMod.Headers
import typings.httpBasic.httpBasicStrings.file
import typings.httpBasic.httpBasicStrings.memory
import typings.httpBasic.icacheMod.ICache
import typings.httpResponseObject.mod.^
import typings.node.NodeJS.ErrnoException
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait Options extends StObject {
    
    var agent: js.UndefOr[Agent | Boolean] = js.undefined
    
    var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.undefined
    
    var cache: js.UndefOr[file | memory | ICache] = js.undefined
    
    var canCache: js.UndefOr[js.Function2[/* res */ ^[ReadableStream], /* defaultValue */ Boolean, Boolean]] = js.undefined
    
    var duplex: js.UndefOr[Boolean] = js.undefined
    
    var followRedirects: js.UndefOr[Boolean] = js.undefined
    
    var gzip: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var ignoreFailedInvalidation: js.UndefOr[Boolean] = js.undefined
    
    var isExpired: js.UndefOr[
        js.Function2[/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean, Boolean]
      ] = js.undefined
    
    var isMatch: js.UndefOr[
        js.Function3[
          /* requestHeaders */ Headers, 
          /* cachedResponse */ CachedResponse, 
          /* defaultValue */ Boolean, 
          Boolean
        ]
      ] = js.undefined
    
    var maxRedirects: js.UndefOr[Double] = js.undefined
    
    var maxRetries: js.UndefOr[Double] = js.undefined
    
    var retry: js.UndefOr[
        Boolean | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ ^[ReadableStream] | Unit, 
          /* attemptNumber */ Double, 
          Boolean
        ])
      ] = js.undefined
    
    var retryDelay: js.UndefOr[
        Double | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ ^[ReadableStream] | Unit, 
          /* attemptNumber */ Double, 
          Double
        ])
      ] = js.undefined
    
    var socketTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setAllowRedirectHeaders(value: js.Array[String]): Self = StObject.set(x, "allowRedirectHeaders", value.asInstanceOf[js.Any])
      
      inline def setAllowRedirectHeadersUndefined: Self = StObject.set(x, "allowRedirectHeaders", js.undefined)
      
      inline def setAllowRedirectHeadersVarargs(value: String*): Self = StObject.set(x, "allowRedirectHeaders", js.Array(value :_*))
      
      inline def setCache(value: file | memory | ICache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCanCache(value: (/* res */ ^[ReadableStream], /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "canCache", js.Any.fromFunction2(value))
      
      inline def setCanCacheUndefined: Self = StObject.set(x, "canCache", js.undefined)
      
      inline def setDuplex(value: Boolean): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
      
      inline def setDuplexUndefined: Self = StObject.set(x, "duplex", js.undefined)
      
      inline def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIgnoreFailedInvalidation(value: Boolean): Self = StObject.set(x, "ignoreFailedInvalidation", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFailedInvalidationUndefined: Self = StObject.set(x, "ignoreFailedInvalidation", js.undefined)
      
      inline def setIsExpired(value: (/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction2(value))
      
      inline def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
      
      inline def setIsMatch(
        value: (/* requestHeaders */ Headers, /* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean
      ): Self = StObject.set(x, "isMatch", js.Any.fromFunction3(value))
      
      inline def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
      
      inline def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setRetry(
        value: Boolean | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ ^[ReadableStream] | Unit, 
              /* attemptNumber */ Double, 
              Boolean
            ])
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(
        value: Double | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ ^[ReadableStream] | Unit, 
              /* attemptNumber */ Double, 
              Double
            ])
      ): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ ^[ReadableStream] | Unit, /* attemptNumber */ Double) => Double
      ): Self = StObject.set(x, "retryDelay", js.Any.fromFunction3(value))
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ ^[ReadableStream] | Unit, /* attemptNumber */ Double) => Boolean
      ): Self = StObject.set(x, "retry", js.Any.fromFunction3(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
