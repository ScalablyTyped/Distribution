package typings.logrocket

import typings.logrocket.mod.LR.IRequest
import typings.logrocket.mod.LR.IResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BaseHref extends StObject {
    
    var baseHref: js.UndefOr[String] = js.undefined
    
    var inputSanitizer: js.UndefOr[Boolean | String] = js.undefined
    
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    var textSanitizer: js.UndefOr[Boolean | String] = js.undefined
  }
  object BaseHref {
    
    inline def apply(): BaseHref = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHref]
    }
    
    extension [Self <: BaseHref](x: Self) {
      
      inline def setBaseHref(value: String): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setBaseHrefUndefined: Self = StObject.set(x, "baseHref", js.undefined)
      
      inline def setInputSanitizer(value: Boolean | String): Self = StObject.set(x, "inputSanitizer", value.asInstanceOf[js.Any])
      
      inline def setInputSanitizerUndefined: Self = StObject.set(x, "inputSanitizer", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setTextSanitizer(value: Boolean | String): Self = StObject.set(x, "textSanitizer", value.asInstanceOf[js.Any])
      
      inline def setTextSanitizerUndefined: Self = StObject.set(x, "textSanitizer", js.undefined)
    }
  }
  
  trait Debug extends StObject {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var info: js.UndefOr[Boolean] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var warn: js.UndefOr[Boolean] = js.undefined
  }
  object Debug {
    
    inline def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    extension [Self <: Debug](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait IsEnabled extends StObject {
    
    var isEnabled: js.UndefOr[Boolean | Debug] = js.undefined
    
    var shouldAggregateConsoleErrors: js.UndefOr[Boolean] = js.undefined
  }
  object IsEnabled {
    
    inline def apply(): IsEnabled = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsEnabled]
    }
    
    extension [Self <: IsEnabled](x: Self) {
      
      inline def setIsEnabled(value: Boolean | Debug): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setShouldAggregateConsoleErrors(value: Boolean): Self = StObject.set(x, "shouldAggregateConsoleErrors", value.asInstanceOf[js.Any])
      
      inline def setShouldAggregateConsoleErrorsUndefined: Self = StObject.set(x, "shouldAggregateConsoleErrors", js.undefined)
    }
  }
  
  trait RequestSanitizer extends StObject {
    
    var isEnabled: js.UndefOr[Boolean] = js.undefined
    
    var requestSanitizer: js.UndefOr[js.Function1[/* request */ IRequest, Null | IRequest]] = js.undefined
    
    var responseSanitizer: js.UndefOr[js.Function1[/* response */ IResponse, Null | IResponse]] = js.undefined
  }
  object RequestSanitizer {
    
    inline def apply(): RequestSanitizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestSanitizer]
    }
    
    extension [Self <: RequestSanitizer](x: Self) {
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setRequestSanitizer(value: /* request */ IRequest => Null | IRequest): Self = StObject.set(x, "requestSanitizer", js.Any.fromFunction1(value))
      
      inline def setRequestSanitizerUndefined: Self = StObject.set(x, "requestSanitizer", js.undefined)
      
      inline def setResponseSanitizer(value: /* response */ IResponse => Null | IResponse): Self = StObject.set(x, "responseSanitizer", js.Any.fromFunction1(value))
      
      inline def setResponseSanitizerUndefined: Self = StObject.set(x, "responseSanitizer", js.undefined)
    }
  }
  
  trait UrlSanitizer extends StObject {
    
    var urlSanitizer: js.UndefOr[js.Function1[/* url */ String, Null | String]] = js.undefined
  }
  object UrlSanitizer {
    
    inline def apply(): UrlSanitizer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlSanitizer]
    }
    
    extension [Self <: UrlSanitizer](x: Self) {
      
      inline def setUrlSanitizer(value: /* url */ String => Null | String): Self = StObject.set(x, "urlSanitizer", js.Any.fromFunction1(value))
      
      inline def setUrlSanitizerUndefined: Self = StObject.set(x, "urlSanitizer", js.undefined)
    }
  }
}
