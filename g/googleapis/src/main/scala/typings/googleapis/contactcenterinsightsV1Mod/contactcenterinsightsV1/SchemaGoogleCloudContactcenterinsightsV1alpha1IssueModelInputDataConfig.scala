package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig extends StObject {
  
  /**
    * A filter to reduce the conversations used for training the model to a specific subset.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Medium of conversations used in training data. This field is being deprecated. To specify the medium to be used in training a new issue model, set the `medium` field on `filter`.
    */
  var medium: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Number of conversations used in training. Output only.
    */
  var trainingConversationsCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumNull: Self = StObject.set(x, "medium", null)
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setTrainingConversationsCount(value: String): Self = StObject.set(x, "trainingConversationsCount", value.asInstanceOf[js.Any])
    
    inline def setTrainingConversationsCountNull: Self = StObject.set(x, "trainingConversationsCount", null)
    
    inline def setTrainingConversationsCountUndefined: Self = StObject.set(x, "trainingConversationsCount", js.undefined)
  }
}
