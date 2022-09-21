package typings.ltijs

import typings.ltijs.idTokenMod.IdToken
import typings.ltijs.platformMod.PlatformContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cert extends StObject {
    
    var cert: String
    
    var key: String
  }
  object Cert {
    
    inline def apply(cert: String, key: String): Cert = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cert]
    }
    
    extension [Self <: Cert](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context extends StObject {
    
    var context: js.UndefOr[PlatformContext] = js.undefined
    
    var token: js.UndefOr[IdToken] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: PlatformContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setToken(value: IdToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: String
    
    var iv: String
  }
  object Data {
    
    inline def apply(data: String, iv: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    }
  }
  
  trait Documenttarget extends StObject {
    
    var document_target: String
    
    var locale: String
    
    var return_url: String
  }
  object Documenttarget {
    
    inline def apply(document_target: String, locale: String, return_url: String): Documenttarget = {
      val __obj = js.Dynamic.literal(document_target = document_target.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], return_url = return_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Documenttarget]
    }
    
    extension [Self <: Documenttarget](x: Self) {
      
      inline def setDocument_target(value: String): Self = StObject.set(x, "document_target", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: String
    
    var label: String
    
    var title: String
  }
  object Id {
    
    inline def apply(id: String, label: String, title: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeepAlive extends StObject {
    
    var keepAlive: js.UndefOr[Boolean] = js.undefined
    
    var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
    
    var pass: String
    
    var useNewUrlParser: js.UndefOr[Boolean] = js.undefined
    
    var user: String
  }
  object KeepAlive {
    
    inline def apply(pass: String, user: String): KeepAlive = {
      val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeepAlive]
    }
    
    extension [Self <: KeepAlive](x: Self) {
      
      inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
      
      inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
      
      inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setUseNewUrlParser(value: Boolean): Self = StObject.set(x, "useNewUrlParser", value.asInstanceOf[js.Any])
      
      inline def setUseNewUrlParserUndefined: Self = StObject.set(x, "useNewUrlParser", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var id: String
    
    var label: String
    
    var title: String
    
    // eslint-disable-next-line @typescript-eslint/no-explicit-any
    var `type`: js.Array[Any]
  }
  object Label {
    
    inline def apply(id: String, label: String, title: String, `type`: js.Array[Any]): Label = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait LineItem extends StObject {
    
    var lineItem: String
    
    var lineItems: String
    
    var scope: js.Array[String]
  }
  object LineItem {
    
    inline def apply(lineItem: String, lineItems: String, scope: js.Array[String]): LineItem = {
      val __obj = js.Dynamic.literal(lineItem = lineItem.asInstanceOf[js.Any], lineItems = lineItems.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineItem]
    }
    
    extension [Self <: LineItem](x: Self) {
      
      inline def setLineItem(value: String): Self = StObject.set(x, "lineItem", value.asInstanceOf[js.Any])
      
      inline def setLineItems(value: String): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var route: String
  }
  object Method {
    
    inline def apply(method: String, route: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait SameSite extends StObject {
    
    var sameSite: js.UndefOr[String] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object SameSite {
    
    inline def apply(): SameSite = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SameSite]
    }
    
    extension [Self <: SameSite](x: Self) {
      
      inline def setSameSite(value: String): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait Title extends StObject {
    
    var id: String
    
    var title: String
  }
  object Title {
    
    inline def apply(id: String, title: String): Title = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
