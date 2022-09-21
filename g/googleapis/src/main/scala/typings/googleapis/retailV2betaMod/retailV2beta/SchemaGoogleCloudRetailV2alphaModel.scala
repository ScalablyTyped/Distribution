package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaModel extends StObject {
  
  /**
    * Output only. Timestamp the Recommendation Model was created at.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of data requirements for this model: `DATA_OK` and `DATA_ERROR`. Recommendation model cannot be trained if the data is in `DATA_ERROR` state. Recommendation model can have `DATA_ERROR` state even if serving state is `ACTIVE`: models were trained successfully before, but cannot be refreshed because model no longer has sufficient data for training.
    */
  var dataState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The display name of the model. Should be human readable, used to display Recommendation Models in the Retail Cloud Console Dashboard. UTF-8 encoded string with limit of 1024 characters.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If `RECOMMENDATIONS_FILTERING_ENABLED`, recommendation filtering by attributes is enabled for the model.
    */
  var filteringOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the latest successful tune finished.
    */
  var lastTuneTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The fully qualified resource name of the model. Format: `projects/{project_number\}/locations/{location_id\}/catalogs/{catalog_id\}/models/{model_id\}` catalog_id has char limit of 50. recommendation_model_id has char limit of 40.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The optimization objective e.g. `cvr`. Currently supported values: `ctr`, `cvr`, `revenue-per-order`. If not specified, we choose default based on model type. Default depends on type of recommendation: `recommended-for-you` =\> `ctr` `others-you-may-like` =\> `ctr` `frequently-bought-together` =\> `revenue_per_order`
    */
  var optimizationObjective: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The page optimization config.
    */
  var pageOptimizationConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig] = js.undefined
  
  /**
    * Optional. The state of periodic tuning. The period we use is 3 months - to do a one-off tune earlier use the `TuneModel` method. Default value is `PERIODIC_TUNING_ENABLED`.
    */
  var periodicTuningState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The list of valid serving configs associated with the PageOptimizationConfig.
    */
  var servingConfigLists: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaModelServingConfigList]] = js.undefined
  
  /**
    * Output only. The serving state of the model: `ACTIVE`, `NOT_ACTIVE`.
    */
  var servingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The training state that the model is in (e.g. `TRAINING` or `PAUSED`). Since part of the cost of running the service is frequency of training - this can be used to determine when to train model in order to control cost. If not specified: the default value for `CreateModel` method is `TRAINING`. The default value for `UpdateModel` method is to keep the state the same as before.
    */
  var trainingState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The tune operation associated with the model. Can be used to determine if there is an ongoing tune for this recommendation. Empty field implies no tune is goig on.
    */
  var tuningOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of model e.g. `home-page`. Currently supported values: `recommended-for-you`, `others-you-may-like`, `frequently-bought-together`, `page-optimization`, `similar-items`, `buy-it-again`, and `recently-viewed`(readonly value).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp the Recommendation Model was last updated. E.g. if a Recommendation Model was paused - this would be the time the pause was initiated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaModel {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaModel]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaModel](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDataState(value: String): Self = StObject.set(x, "dataState", value.asInstanceOf[js.Any])
    
    inline def setDataStateNull: Self = StObject.set(x, "dataState", null)
    
    inline def setDataStateUndefined: Self = StObject.set(x, "dataState", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilteringOption(value: String): Self = StObject.set(x, "filteringOption", value.asInstanceOf[js.Any])
    
    inline def setFilteringOptionNull: Self = StObject.set(x, "filteringOption", null)
    
    inline def setFilteringOptionUndefined: Self = StObject.set(x, "filteringOption", js.undefined)
    
    inline def setLastTuneTime(value: String): Self = StObject.set(x, "lastTuneTime", value.asInstanceOf[js.Any])
    
    inline def setLastTuneTimeNull: Self = StObject.set(x, "lastTuneTime", null)
    
    inline def setLastTuneTimeUndefined: Self = StObject.set(x, "lastTuneTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizationObjective(value: String): Self = StObject.set(x, "optimizationObjective", value.asInstanceOf[js.Any])
    
    inline def setOptimizationObjectiveNull: Self = StObject.set(x, "optimizationObjective", null)
    
    inline def setOptimizationObjectiveUndefined: Self = StObject.set(x, "optimizationObjective", js.undefined)
    
    inline def setPageOptimizationConfig(value: SchemaGoogleCloudRetailV2alphaModelPageOptimizationConfig): Self = StObject.set(x, "pageOptimizationConfig", value.asInstanceOf[js.Any])
    
    inline def setPageOptimizationConfigUndefined: Self = StObject.set(x, "pageOptimizationConfig", js.undefined)
    
    inline def setPeriodicTuningState(value: String): Self = StObject.set(x, "periodicTuningState", value.asInstanceOf[js.Any])
    
    inline def setPeriodicTuningStateNull: Self = StObject.set(x, "periodicTuningState", null)
    
    inline def setPeriodicTuningStateUndefined: Self = StObject.set(x, "periodicTuningState", js.undefined)
    
    inline def setServingConfigLists(value: js.Array[SchemaGoogleCloudRetailV2alphaModelServingConfigList]): Self = StObject.set(x, "servingConfigLists", value.asInstanceOf[js.Any])
    
    inline def setServingConfigListsUndefined: Self = StObject.set(x, "servingConfigLists", js.undefined)
    
    inline def setServingConfigListsVarargs(value: SchemaGoogleCloudRetailV2alphaModelServingConfigList*): Self = StObject.set(x, "servingConfigLists", js.Array(value*))
    
    inline def setServingState(value: String): Self = StObject.set(x, "servingState", value.asInstanceOf[js.Any])
    
    inline def setServingStateNull: Self = StObject.set(x, "servingState", null)
    
    inline def setServingStateUndefined: Self = StObject.set(x, "servingState", js.undefined)
    
    inline def setTrainingState(value: String): Self = StObject.set(x, "trainingState", value.asInstanceOf[js.Any])
    
    inline def setTrainingStateNull: Self = StObject.set(x, "trainingState", null)
    
    inline def setTrainingStateUndefined: Self = StObject.set(x, "trainingState", js.undefined)
    
    inline def setTuningOperation(value: String): Self = StObject.set(x, "tuningOperation", value.asInstanceOf[js.Any])
    
    inline def setTuningOperationNull: Self = StObject.set(x, "tuningOperation", null)
    
    inline def setTuningOperationUndefined: Self = StObject.set(x, "tuningOperation", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
