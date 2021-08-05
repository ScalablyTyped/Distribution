package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /** Output only. The time when this model was created, in millisecs since the epoch. */
  var creationTime: js.UndefOr[String] = js.undefined
  
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
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The time when this model was last modified, in millisecs since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The geographic location where the model resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Required. Unique identifier for this model. */
  var modelReference: js.UndefOr[ModelReference] = js.undefined
  
  /** Output only. Type of the model resource. */
  var modelType: js.UndefOr[String] = js.undefined
  
  /** Output only. Information for all training runs in increasing order of start_time. */
  var trainingRuns: js.UndefOr[js.Array[TrainingRun]] = js.undefined
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  extension [Self <: Model](x: Self) {
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
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
    
    inline def setFeatureColumnsVarargs(value: StandardSqlField*): Self = StObject.set(x, "featureColumns", js.Array(value :_*))
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    inline def setLabelColumns(value: js.Array[StandardSqlField]): Self = StObject.set(x, "labelColumns", value.asInstanceOf[js.Any])
    
    inline def setLabelColumnsUndefined: Self = StObject.set(x, "labelColumns", js.undefined)
    
    inline def setLabelColumnsVarargs(value: StandardSqlField*): Self = StObject.set(x, "labelColumns", js.Array(value :_*))
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model & TopLevel[js.Any]
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
    
    inline def setTrainingRuns(value: js.Array[TrainingRun]): Self = StObject.set(x, "trainingRuns", value.asInstanceOf[js.Any])
    
    inline def setTrainingRunsUndefined: Self = StObject.set(x, "trainingRuns", js.undefined)
    
    inline def setTrainingRunsVarargs(value: TrainingRun*): Self = StObject.set(x, "trainingRuns", js.Array(value :_*))
  }
}
