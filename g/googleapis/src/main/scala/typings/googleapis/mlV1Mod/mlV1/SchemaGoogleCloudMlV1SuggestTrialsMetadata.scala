package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1SuggestTrialsMetadata extends StObject {
  
  /**
    * The identifier of the client that is requesting the suggestion.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time operation was submitted.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the study that the trial belongs to.
    */
  var study: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of suggestions requested.
    */
  var suggestionCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1SuggestTrialsMetadata {
  
  inline def apply(): SchemaGoogleCloudMlV1SuggestTrialsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1SuggestTrialsMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1SuggestTrialsMetadata](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setStudy(value: String): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    inline def setStudyNull: Self = StObject.set(x, "study", null)
    
    inline def setStudyUndefined: Self = StObject.set(x, "study", js.undefined)
    
    inline def setSuggestionCount(value: Double): Self = StObject.set(x, "suggestionCount", value.asInstanceOf[js.Any])
    
    inline def setSuggestionCountNull: Self = StObject.set(x, "suggestionCount", null)
    
    inline def setSuggestionCountUndefined: Self = StObject.set(x, "suggestionCount", js.undefined)
  }
}
