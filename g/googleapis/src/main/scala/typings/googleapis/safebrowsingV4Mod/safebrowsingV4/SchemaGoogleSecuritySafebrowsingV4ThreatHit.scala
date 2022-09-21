package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatHit extends StObject {
  
  /**
    * Client-reported identification.
    */
  var clientInfo: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ClientInfo] = js.undefined
  
  /**
    * The threat entry responsible for the hit. Full hash should be reported for hash-based hits.
    */
  var entry: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatEntry] = js.undefined
  
  /**
    * The platform type reported.
    */
  var platformType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resources related to the threat hit.
    */
  var resources: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource]] = js.undefined
  
  /**
    * The threat type reported.
    */
  var threatType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the user that encountered the threat.
    */
  var userInfo: js.UndefOr[SchemaGoogleSecuritySafebrowsingV4ThreatHitUserInfo] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatHit {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatHit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatHit]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatHit](x: Self) {
    
    inline def setClientInfo(value: SchemaGoogleSecuritySafebrowsingV4ClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setEntry(value: SchemaGoogleSecuritySafebrowsingV4ThreatEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    inline def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    inline def setPlatformTypeNull: Self = StObject.set(x, "platformType", null)
    
    inline def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    inline def setResources(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    inline def setThreatTypeNull: Self = StObject.set(x, "threatType", null)
    
    inline def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
    
    inline def setUserInfo(value: SchemaGoogleSecuritySafebrowsingV4ThreatHitUserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
