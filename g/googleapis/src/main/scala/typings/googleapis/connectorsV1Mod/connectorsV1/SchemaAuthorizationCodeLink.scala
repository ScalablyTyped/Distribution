package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuthorizationCodeLink extends StObject {
  
  /**
    * The client ID assigned to the GCP Connectors OAuth app for the connector data source.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to enable PKCE for the auth code flow.
    */
  var enablePkce: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The scopes for which the user will authorize GCP Connectors on the connector data source.
    */
  var scopes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The base URI the user must click to trigger the authorization code login flow.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuthorizationCodeLink {
  
  inline def apply(): SchemaAuthorizationCodeLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthorizationCodeLink]
  }
  
  extension [Self <: SchemaAuthorizationCodeLink](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setEnablePkce(value: Boolean): Self = StObject.set(x, "enablePkce", value.asInstanceOf[js.Any])
    
    inline def setEnablePkceNull: Self = StObject.set(x, "enablePkce", null)
    
    inline def setEnablePkceUndefined: Self = StObject.set(x, "enablePkce", js.undefined)
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesNull: Self = StObject.set(x, "scopes", null)
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
