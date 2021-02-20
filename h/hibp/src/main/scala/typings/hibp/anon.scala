package typings.hibp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiKey extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var includeUnverified: js.UndefOr[Boolean] = js.native
    
    var truncate: js.UndefOr[Boolean] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object ApiKey {
    
    @scala.inline
    def apply(): ApiKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKey]
    }
    
    @scala.inline
    implicit class ApiKeyMutableBuilder[Self <: ApiKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setIncludeUnverified(value: Boolean): Self = StObject.set(x, "includeUnverified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUnverifiedUndefined: Self = StObject.set(x, "includeUnverified", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait BaseUrl extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object BaseUrl {
    
    @scala.inline
    def apply(): BaseUrl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseUrl]
    }
    
    @scala.inline
    implicit class BaseUrlMutableBuilder[Self <: BaseUrl] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait Domain extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object Domain {
    
    @scala.inline
    def apply(): Domain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait Truncate extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var truncate: js.UndefOr[Boolean] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object Truncate {
    
    @scala.inline
    def apply(): Truncate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Truncate]
    }
    
    @scala.inline
    implicit class TruncateMutableBuilder[Self <: Truncate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
  
  @js.native
  trait UserAgent extends StObject {
    
    var apiKey: js.UndefOr[String] = js.native
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var userAgent: js.UndefOr[String] = js.native
  }
  object UserAgent {
    
    @scala.inline
    def apply(): UserAgent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserAgent]
    }
    
    @scala.inline
    implicit class UserAgentMutableBuilder[Self <: UserAgent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
