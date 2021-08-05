package typings.hibp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ApiKey extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var includeUnverified: js.UndefOr[Boolean] = js.undefined
    
    var truncate: js.UndefOr[Boolean] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object ApiKey {
    
    inline def apply(): ApiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKey]
    }
    
    extension [Self <: ApiKey](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setIncludeUnverified(value: Boolean): Self = StObject.set(x, "includeUnverified", value.asInstanceOf[js.Any])
      
      inline def setIncludeUnverifiedUndefined: Self = StObject.set(x, "includeUnverified", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object BaseUrl {
    
    inline def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    extension [Self <: BaseUrl](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait Domain extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Domain {
    
    inline def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait Truncate extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var truncate: js.UndefOr[Boolean] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object Truncate {
    
    inline def apply(): Truncate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Truncate]
    }
    
    extension [Self <: Truncate](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  trait UserAgent extends StObject {
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
  }
  object UserAgent {
    
    inline def apply(): UserAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgent]
    }
    
    extension [Self <: UserAgent](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
