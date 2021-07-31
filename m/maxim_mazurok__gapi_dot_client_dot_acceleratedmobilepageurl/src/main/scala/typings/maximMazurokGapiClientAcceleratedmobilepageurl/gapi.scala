package typings.maximMazurokGapiClientAcceleratedmobilepageurl

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Accesstoken
import typings.maximMazurokGapiClientAcceleratedmobilepageurl.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object acceleratedmobilepageurl {
      
      trait AmpUrl extends StObject {
        
        /** The AMP URL pointing to the publisher's web server. */
        var ampUrl: js.UndefOr[String] = js.undefined
        
        /** The [AMP Cache URL](/amp/cache/overview#amp-cache-url-format) pointing to the cached document in the Google AMP Cache. */
        var cdnAmpUrl: js.UndefOr[String] = js.undefined
        
        /** The original non-AMP URL. */
        var originalUrl: js.UndefOr[String] = js.undefined
      }
      object AmpUrl {
        
        @scala.inline
        def apply(): AmpUrl = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AmpUrl]
        }
        
        @scala.inline
        implicit class AmpUrlMutableBuilder[Self <: AmpUrl] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAmpUrl(value: String): Self = StObject.set(x, "ampUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAmpUrlUndefined: Self = StObject.set(x, "ampUrl", js.undefined)
          
          @scala.inline
          def setCdnAmpUrl(value: String): Self = StObject.set(x, "cdnAmpUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCdnAmpUrlUndefined: Self = StObject.set(x, "cdnAmpUrl", js.undefined)
          
          @scala.inline
          def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
        }
      }
      
      trait AmpUrlError extends StObject {
        
        /** The error code of an API call. */
        var errorCode: js.UndefOr[String] = js.undefined
        
        /** An optional descriptive error message. */
        var errorMessage: js.UndefOr[String] = js.undefined
        
        /** The original non-AMP URL. */
        var originalUrl: js.UndefOr[String] = js.undefined
      }
      object AmpUrlError {
        
        @scala.inline
        def apply(): AmpUrlError = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[AmpUrlError]
        }
        
        @scala.inline
        implicit class AmpUrlErrorMutableBuilder[Self <: AmpUrlError] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
          
          @scala.inline
          def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
          
          @scala.inline
          def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginalUrlUndefined: Self = StObject.set(x, "originalUrl", js.undefined)
        }
      }
      
      @js.native
      trait AmpUrlsResource extends StObject {
        
        /** Returns AMP URL(s) and equivalent [AMP Cache URL(s)](/amp/cache/overview#amp-cache-url-format). */
        def batchGet(request: Accesstoken): Request[BatchGetAmpUrlsResponse] = js.native
        def batchGet(request: Alt, body: BatchGetAmpUrlsRequest): Request[BatchGetAmpUrlsResponse] = js.native
      }
      
      trait BatchGetAmpUrlsRequest extends StObject {
        
        /** The lookup_strategy being requested. */
        var lookupStrategy: js.UndefOr[String] = js.undefined
        
        /** List of URLs to look up for the paired AMP URLs. The URLs are case-sensitive. Up to 50 URLs per lookup (see [Usage Limits](/amp/cache/reference/limits)). */
        var urls: js.UndefOr[js.Array[String]] = js.undefined
      }
      object BatchGetAmpUrlsRequest {
        
        @scala.inline
        def apply(): BatchGetAmpUrlsRequest = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[BatchGetAmpUrlsRequest]
        }
        
        @scala.inline
        implicit class BatchGetAmpUrlsRequestMutableBuilder[Self <: BatchGetAmpUrlsRequest] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setLookupStrategy(value: String): Self = StObject.set(x, "lookupStrategy", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setLookupStrategyUndefined: Self = StObject.set(x, "lookupStrategy", js.undefined)
          
          @scala.inline
          def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
          
          @scala.inline
          def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
        }
      }
      
      trait BatchGetAmpUrlsResponse extends StObject {
        
        /**
          * For each URL in BatchAmpUrlsRequest, the URL response. The response might not be in the same order as URLs in the batch request. If BatchAmpUrlsRequest contains duplicate URLs,
          * AmpUrl is generated only once.
          */
        var ampUrls: js.UndefOr[js.Array[AmpUrl]] = js.undefined
        
        /** The errors for requested URLs that have no AMP URL. */
        var urlErrors: js.UndefOr[js.Array[AmpUrlError]] = js.undefined
      }
      object BatchGetAmpUrlsResponse {
        
        @scala.inline
        def apply(): BatchGetAmpUrlsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[BatchGetAmpUrlsResponse]
        }
        
        @scala.inline
        implicit class BatchGetAmpUrlsResponseMutableBuilder[Self <: BatchGetAmpUrlsResponse] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAmpUrls(value: js.Array[AmpUrl]): Self = StObject.set(x, "ampUrls", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAmpUrlsUndefined: Self = StObject.set(x, "ampUrls", js.undefined)
          
          @scala.inline
          def setAmpUrlsVarargs(value: AmpUrl*): Self = StObject.set(x, "ampUrls", js.Array(value :_*))
          
          @scala.inline
          def setUrlErrors(value: js.Array[AmpUrlError]): Self = StObject.set(x, "urlErrors", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUrlErrorsUndefined: Self = StObject.set(x, "urlErrors", js.undefined)
          
          @scala.inline
          def setUrlErrorsVarargs(value: AmpUrlError*): Self = StObject.set(x, "urlErrors", js.Array(value :_*))
        }
      }
    }
  }
}
