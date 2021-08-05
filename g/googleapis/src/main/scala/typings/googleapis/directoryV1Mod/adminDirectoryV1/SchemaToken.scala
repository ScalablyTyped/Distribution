package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for token resource in Directory API.
  */
trait SchemaToken extends StObject {
  
  /**
    * Whether the application is registered with Google. The value is true if
    * the application has an anonymous Client ID.
    */
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Client ID of the application the token is issued to.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The displayable name of the application the token is issued to.
    */
  var displayText: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the API resource. This is always admin#directory#token.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the token is issued to an installed application. The value is
    * true if the application is installed to a desktop or mobile device.
    */
  var nativeApp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of authorization scopes the application is granted.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The unique ID of the user that issued the token.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object SchemaToken {
  
  inline def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  
  extension [Self <: SchemaToken](x: Self) {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNativeApp(value: Boolean): Self = StObject.set(x, "nativeApp", value.asInstanceOf[js.Any])
    
    inline def setNativeAppUndefined: Self = StObject.set(x, "nativeApp", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
