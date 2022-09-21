package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse extends StObject {
  
  /**
    * The threat list matches.
    */
  var matches: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatMatch]] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4FindThreatMatchesResponse](x: Self) {
    
    inline def setMatches(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatMatch]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    
    inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
    
    inline def setMatchesVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatMatch*): Self = StObject.set(x, "matches", js.Array(value*))
  }
}
