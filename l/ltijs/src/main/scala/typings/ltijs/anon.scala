package typings.ltijs

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.platformMod.PlatformContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Cert extends StObject {
    
    var cert: String = js.native
    
    var key: String = js.native
  }
  object Cert {
    
    @scala.inline
    def apply(cert: String, key: String): Cert = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cert]
    }
    
    @scala.inline
    implicit class CertMutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var context: js.UndefOr[PlatformContext] = js.native
    
    var token: js.UndefOr[IdToken] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: PlatformContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setToken(value: IdToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: String = js.native
    
    var iv: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String, iv: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Documenttarget extends StObject {
    
    var document_target: String = js.native
    
    var locale: String = js.native
    
    var return_url: String = js.native
  }
  object Documenttarget {
    
    @scala.inline
    def apply(document_target: String, locale: String, return_url: String): Documenttarget = {
      val __obj = js.Dynamic.literal(document_target = document_target.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Documenttarget]
    }
    
    @scala.inline
    implicit class DocumenttargetMutableBuilder[Self <: Documenttarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocument_target(value: String): Self = StObject.set(x, "document_target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: String = js.native
    
    var label: String = js.native
    
    var title: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: String, label: String, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KeepAlive extends StObject {
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.native
    
    var pass: String = js.native
    
    var useNewUrlParser: js.UndefOr[Boolean] = js.native
    
    var user: String = js.native
  }
  object KeepAlive {
    
    @scala.inline
    def apply(pass: String, user: String): KeepAlive = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeepAlive]
    }
    
    @scala.inline
    implicit class KeepAliveMutableBuilder[Self <: KeepAlive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Label extends StObject {
    
    var id: String = js.native
    
    var label: String = js.native
    
    var title: String = js.native
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    var `type`: js.Array[_] = js.native
  }
  object Label {
    
    @scala.inline
    def apply(id: String, label: String, title: String, `type`: js.Array[_]): Label = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Array[_]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: js.Any*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LineItem extends StObject {
    
    var lineItem: String = js.native
    
    var lineItems: String = js.native
    
    var scope: js.Array[String] = js.native
  }
  object LineItem {
    
    @scala.inline
    def apply(lineItem: String, lineItems: String, scope: js.Array[String]): LineItem = {
      val __obj = js.Dynamic.literal(lineItem = lineItem.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineItem]
    }
    
    @scala.inline
    implicit class LineItemMutableBuilder[Self <: LineItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineItem(value: String): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Method extends StObject {
    
    var method: String = js.native
    
    var route: String = js.native
  }
  object Method {
    
    @scala.inline
    def apply(method: String, route: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SameSite extends StObject {
    
    var sameSite: js.UndefOr[String] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
  }
  object SameSite {
    
    @scala.inline
    def apply(): SameSite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SameSite]
    }
    
    @scala.inline
    implicit class SameSiteMutableBuilder[Self <: SameSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait Title extends StObject {
    
    var id: String = js.native
    
    var title: String = js.native
  }
  object Title {
    
    @scala.inline
    def apply(id: String, title: String): Title = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
