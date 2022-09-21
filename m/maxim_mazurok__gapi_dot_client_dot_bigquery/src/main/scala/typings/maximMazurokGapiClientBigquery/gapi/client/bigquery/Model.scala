package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /** The best trial_id across all training runs. */
  var bestTrialId: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when this model was created, in millisecs since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The default trial_id to use in TVFs when the trial_id is not passed in. For single-objective [hyperparameter
    * tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the best trial ID. For multi-objective [hyperparameter
    * tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, this is the smallest trial ID among all Pareto optimal trials.
    */
  var defaultTrialId: js.UndefOr[String] = js.undefined
  
  /** Optional. A user-friendly description of this model. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys). This shows the encryption configuration of the model data while stored in BigQuery storage. This field can be used with
    * PatchModel to update encryption key for an already encrypted model.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.undefined
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The time when this model expires, in milliseconds since the epoch. If not present, the model will persist indefinitely. Expired models will be deleted and their storage
    * reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created models.
    */
  var expirationTime: js.UndefOr[String] = js.undefined
  
  /** Output only. Input feature columns that were used to train this model. */
  var featureColumns: js.UndefOr[js.Array[StandardSqlField]] = js.undefined
  
  /** Optional. A descriptive name for this model. */
  var friendlyName: js.UndefOr[String] = js.undefined
  
  /** Output only. All hyperparameter search spaces in this model. */
  var hparamSearchSpaces: js.UndefOr[HparamSearchSpaces] = js.undefined
  
  /** Output only. Trials of a [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) model sorted by trial_id. */
  var hparamTrials: js.UndefOr[js.Array[HparamTuningTrial]] = js.undefined
  
  /** Output only. Label columns that were used to train this model. The output of the model will have a "predicted_" prefix to these columns. */
  var labelColumns: js.UndefOr[js.Array[StandardSqlField]] = js.undefined
  
  /**
    * The labels associated with this model. You can use these to organize and group your models. Label keys and values can be no longer than 63 characters, can only contain lowercase
    * letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list
    * must have a different key.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model & TopLevel[Any]
  ] = js.undefined
  
  /** Output only. The time when this model was last modified, in millisecs since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The geographic location where the model resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Required. Unique identifier for this model. */
  var modelReference: js.UndefOr[ModelReference] = js.undefined
  
  /** Output only. Type of the model resource. */
  var modelType: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. For single-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it only contains the best trial. For
    * multi-objective [hyperparameter tuning](/bigquery-ml/docs/reference/standard-sql/bigqueryml-syntax-hp-tuning-overview) models, it contains all Pareto optimal trials sorted by
    * trial_id.
    */
  var optimalTrialIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Information for all training runs in increasing order of start_time. */
  var trainingRuns: js.UndefOr[js.Array[TrainingRun]] = js.undefined
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setBestTrialId(value: String): Self = StObject.set(x, "bestTrialId", value.asInstanceOf[js.Any])
    
    inline def setBestTrialIdUndefined: Self = StObject.set(x, "bestTrialId", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDefaultTrialId(value: String): Self = StObject.set(x, "defaultTrialId", value.asInstanceOf[js.Any])
    
    inline def setDefaultTrialIdUndefined: Self = StObject.set(x, "defaultTrialId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setExpirationTime(value: String): Self = StObject.set(x, "expirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "expirationTime", js.undefined)
    
    inline def setFeatureColumns(value: js.Array[StandardSqlField]): Self = StObject.set(x, "featureColumns", value.asInstanceOf[js.Any])
    
    inline def setFeatureColumnsUndefined: Self = StObject.set(x, "featureColumns", js.undefined)
    
    inline def setFeatureColumnsVarargs(value: StandardSqlField*): Self = StObject.set(x, "featureColumns", js.Array(value*))
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setHparamSearchSpaces(value: HparamSearchSpaces): Self = StObject.set(x, "hparamSearchSpaces", value.asInstanceOf[js.Any])
    
    inline def setHparamSearchSpacesUndefined: Self = StObject.set(x, "hparamSearchSpaces", js.undefined)
    
    inline def setHparamTrials(value: js.Array[HparamTuningTrial]): Self = StObject.set(x, "hparamTrials", value.asInstanceOf[js.Any])
    
    inline def setHparamTrialsUndefined: Self = StObject.set(x, "hparamTrials", js.undefined)
    
    inline def setHparamTrialsVarargs(value: HparamTuningTrial*): Self = StObject.set(x, "hparamTrials", js.Array(value*))
    
    inline def setLabelColumns(value: js.Array[StandardSqlField]): Self = StObject.set(x, "labelColumns", value.asInstanceOf[js.Any])
    
    inline def setLabelColumnsUndefined: Self = StObject.set(x, "labelColumns", js.undefined)
    
    inline def setLabelColumnsVarargs(value: StandardSqlField*): Self = StObject.set(x, "labelColumns", js.Array(value*))
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setModelReference(value: ModelReference): Self = StObject.set(x, "modelReference", value.asInstanceOf[js.Any])
    
    inline def setModelReferenceUndefined: Self = StObject.set(x, "modelReference", js.undefined)
    
    inline def setModelType(value: String): Self = StObject.set(x, "modelType", value.asInstanceOf[js.Any])
    
    inline def setModelTypeUndefined: Self = StObject.set(x, "modelType", js.undefined)
    
    inline def setOptimalTrialIds(value: js.Array[String]): Self = StObject.set(x, "optimalTrialIds", value.asInstanceOf[js.Any])
    
    inline def setOptimalTrialIdsUndefined: Self = StObject.set(x, "optimalTrialIds", js.undefined)
    
    inline def setOptimalTrialIdsVarargs(value: String*): Self = StObject.set(x, "optimalTrialIds", js.Array(value*))
    
    inline def setTrainingRuns(value: js.Array[TrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    inline def setTrainingRunsVarargs(value: TrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value*))
  }
}
