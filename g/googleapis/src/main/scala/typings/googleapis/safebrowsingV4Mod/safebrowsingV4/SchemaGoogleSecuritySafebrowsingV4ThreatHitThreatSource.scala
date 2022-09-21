package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource extends StObject {
  
  /**
    * Referrer of the resource. Only set if the referrer is available.
    */
  var referrer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The remote IP of the resource in ASCII format. Either IPv4 or IPv6.
    */
  var remoteIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of source reported.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the resource.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ThreatHitThreatSource](x: Self) {
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerNull: Self = StObject.set(x, "referrer", null)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setRemoteIp(value: String): Self = StObject.set(x, "remoteIp", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpNull: Self = StObject.set(x, "remoteIp", null)
    
    inline def setRemoteIpUndefined: Self = StObject.set(x, "remoteIp", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
