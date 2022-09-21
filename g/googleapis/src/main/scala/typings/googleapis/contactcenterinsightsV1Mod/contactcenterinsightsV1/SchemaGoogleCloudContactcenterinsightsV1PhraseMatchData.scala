package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData extends StObject {
  
  /**
    * The human-readable name of the phrase matcher.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier (the resource name) of the phrase matcher.
    */
  var phraseMatcher: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPhraseMatcher(value: String): Self = StObject.set(x, "phraseMatcher", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatcherNull: Self = StObject.set(x, "phraseMatcher", null)
    
    inline def setPhraseMatcherUndefined: Self = StObject.set(x, "phraseMatcher", js.undefined)
  }
}
