package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ClientInfo extends StObject {
  
  /**
    * A client ID that (hopefully) uniquely identifies the client implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ClientInfo {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ClientInfo]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ClientInfo](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
