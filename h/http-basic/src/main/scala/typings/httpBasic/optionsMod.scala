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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait Options extends StObject {
    
    var agent: js.UndefOr[Agent | Boolean] = js.native
    
    var allowRedirectHeaders: js.UndefOr[js.Array[String]] = js.native
    
    var cache: js.UndefOr[file | memory | ICache] = js.native
    
    var canCache: js.UndefOr[js.Function2[/* res */ ^[ReadableStream], /* defaultValue */ Boolean, Boolean]] = js.native
    
    var duplex: js.UndefOr[Boolean] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var gzip: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[Headers] = js.native
    
    var ignoreFailedInvalidation: js.UndefOr[Boolean] = js.native
    
    var isExpired: js.UndefOr[
        js.Function2[/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean, Boolean]
      ] = js.native
    
    var isMatch: js.UndefOr[
        js.Function3[
          /* requestHeaders */ Headers, 
          /* cachedResponse */ CachedResponse, 
          /* defaultValue */ Boolean, 
          Boolean
        ]
      ] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    var retry: js.UndefOr[
        Boolean | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ ^[ReadableStream] | Unit, 
          /* attemptNumber */ Double, 
          Boolean
        ])
      ] = js.native
    
    var retryDelay: js.UndefOr[
        Double | (js.Function3[
          /* err */ ErrnoException | Null, 
          /* res */ ^[ReadableStream] | Unit, 
          /* attemptNumber */ Double, 
          Double
        ])
      ] = js.native
    
    var socketTimeout: js.UndefOr[Double] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
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
      def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeaders(value: js.Array[String]): Self = StObject.set(x, "allowRedirectHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowRedirectHeadersUndefined: Self = StObject.set(x, "allowRedirectHeaders", js.undefined)
      
      @scala.inline
      def setAllowRedirectHeadersVarargs(value: String*): Self = StObject.set(x, "allowRedirectHeaders", js.Array(value :_*))
      
      @scala.inline
      def setCache(value: file | memory | ICache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCanCache(value: (/* res */ ^[ReadableStream], /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "canCache", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanCacheUndefined: Self = StObject.set(x, "canCache", js.undefined)
      
      @scala.inline
      def setDuplex(value: Boolean): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplexUndefined: Self = StObject.set(x, "duplex", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setIgnoreFailedInvalidation(value: Boolean): Self = StObject.set(x, "ignoreFailedInvalidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFailedInvalidationUndefined: Self = StObject.set(x, "ignoreFailedInvalidation", js.undefined)
      
      @scala.inline
      def setIsExpired(value: (/* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean): Self = StObject.set(x, "isExpired", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsExpiredUndefined: Self = StObject.set(x, "isExpired", js.undefined)
      
      @scala.inline
      def setIsMatch(
        value: (/* requestHeaders */ Headers, /* cachedResponse */ CachedResponse, /* defaultValue */ Boolean) => Boolean
      ): Self = StObject.set(x, "isMatch", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setRetry(
        value: Boolean | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ ^[ReadableStream] | Unit, 
              /* attemptNumber */ Double, 
              Boolean
            ])
      ): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(
        value: Double | (js.Function3[
              /* err */ ErrnoException | Null, 
              /* res */ ^[ReadableStream] | Unit, 
              /* attemptNumber */ Double, 
              Double
            ])
      ): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ ^[ReadableStream] | Unit, /* attemptNumber */ Double) => Double
      ): Self = StObject.set(x, "retryDelay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryFunction3(
        value: (/* err */ ErrnoException | Null, /* res */ ^[ReadableStream] | Unit, /* attemptNumber */ Double) => Boolean
      ): Self = StObject.set(x, "retry", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSocketTimeout(value: Double): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
