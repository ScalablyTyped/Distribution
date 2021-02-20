package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for token resource in Directory API.
  */
@js.native
trait SchemaToken extends StObject {
  
  /**
    * Whether the application is registered with Google. The value is true if
    * the application has an anonymous Client ID.
    */
  var anonymous: js.UndefOr[Boolean] = js.native
  
  /**
    * The Client ID of the application the token is issued to.
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * The displayable name of the application the token is issued to.
    */
  var displayText: js.UndefOr[String] = js.native
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The type of the API resource. This is always admin#directory#token.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Whether the token is issued to an installed application. The value is
    * true if the application is installed to a desktop or mobile device.
    */
  var nativeApp: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of authorization scopes the application is granted.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The unique ID of the user that issued the token.
    */
  var userKey: js.UndefOr[String] = js.native
}
object SchemaToken {
  
  @scala.inline
  def apply(): SchemaToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToken]
  }
  
  @scala.inline
  implicit class SchemaTokenMutableBuilder[Self <: SchemaToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNativeApp(value: Boolean): Self = StObject.set(x, "nativeApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeAppUndefined: Self = StObject.set(x, "nativeApp", js.undefined)
    
    @scala.inline
    def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    @scala.inline
    def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
