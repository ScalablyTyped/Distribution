package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse extends StObject {
  
  /**
    * The full hashes that matched the requested prefixes.
    */
  var matches: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatMatch]] = js.undefined
  
  /**
    * The minimum duration the client must wait before issuing any find hashes request. If this field is not set, clients can issue a request as soon as they want.
    */
  var minimumWaitDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For requested entities that did not match the threat list, how long to cache the response.
    */
  var negativeCacheDuration: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FindFullHashesResponse](x: Self) {
    
    inline def setMatches(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatMatch*): Self = StObject.set(x, "matches", js.Array(value*))
    
    inline def setMinimumWaitDuration(value: String): Self = StObject.set(x, "minimumWaitDuration", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitDurationNull: Self = StObject.set(x, "minimumWaitDuration", null)
    
    inline def setMinimumWaitDurationUndefined: Self = StObject.set(x, "minimumWaitDuration", js.undefined)
    
    inline def setNegativeCacheDuration(value: String): Self = StObject.set(x, "negativeCacheDuration", value.asInstanceOf[js.Any])
    
    inline def setNegativeCacheDurationNull: Self = StObject.set(x, "negativeCacheDuration", null)
    
    inline def setNegativeCacheDurationUndefined: Self = StObject.set(x, "negativeCacheDuration", js.undefined)
  }
}
