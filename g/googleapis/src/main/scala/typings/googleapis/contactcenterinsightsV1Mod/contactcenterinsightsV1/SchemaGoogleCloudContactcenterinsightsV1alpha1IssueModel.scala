package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModel extends StObject {
  
  /**
    * Output only. The time at which this issue model was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The representative name for the issue model.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configs for the input data that used to create the issue model.
    */
  var inputDataConfig: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig] = js.undefined
  
  /**
    * Immutable. The resource name of the issue model. Format: projects/{project\}/locations/{location\}/issueModels/{issue_model\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. State of the model.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The issue model's label statistics on its training data.
    */
  var trainingStats: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats] = js.undefined
  
  /**
    * Output only. The most recent time at which the issue model was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModel {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModel]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModel](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setInputDataConfig(value: SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelInputDataConfig): Self = StObject.set(x, "inputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "inputDataConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTrainingStats(value: SchemaGoogleCloudContactcenterinsightsV1alpha1IssueModelLabelStats): Self = StObject.set(x, "trainingStats", value.asInstanceOf[js.Any])
    
    inline def setTrainingStatsUndefined: Self = StObject.set(x, "trainingStats", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
