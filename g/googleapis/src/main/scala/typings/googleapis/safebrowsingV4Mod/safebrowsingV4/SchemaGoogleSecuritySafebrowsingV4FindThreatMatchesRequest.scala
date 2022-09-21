package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest extends StObject {
  
  /**
    * The client metadata.
    */
  var client: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /**
    * The lists and entries to be checked for matches.
    */
  var threatInfo: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatInfo] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesRequest](x: Self) {
    
    inline def setClient(value: SchemaGoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setThreatInfo(value: SchemaGoogleSecuritySafebrowsingV4ThreatInfo): Self = StObject.set(x, "threatInfo", value.asInstanceOf[js.Any])
    
    inline def setThreatInfoUndefined: Self = StObject.set(x, "threatInfo", js.undefined)
  }
}
