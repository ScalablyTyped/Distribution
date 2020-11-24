package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Output only. The time when this model was created, in millisecs since the epoch. */
  var creationTime: js.UndefOr[String] = js.native
  
  /** Optional. A user-friendly description of this model. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Custom encryption configuration (e.g., Cloud KMS keys). This shows the encryption configuration of the model data while stored in BigQuery storage. This field can be used with
    * PatchModel to update encryption key for an already encrypted model.
    */
  var encryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  
  /** Output only. A hash of this resource. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Optional. The time when this model expires, in milliseconds since the epoch. If not present, the model will persist indefinitely. Expired models will be deleted and their storage
    * reclaimed. The defaultTableExpirationMs property of the encapsulating dataset can be used to set a default expirationTime on newly created models.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /** Output only. Input feature columns that were used to train this model. */
  var featureColumns: js.UndefOr[js.Array[StandardSqlField]] = js.native
  
  /** Optional. A descriptive name for this model. */
  var friendlyName: js.UndefOr[String] = js.native
  
  /** Output only. Label columns that were used to train this model. The output of the model will have a "predicted_" prefix to these columns. */
  var labelColumns: js.UndefOr[js.Array[StandardSqlField]] = js.native
  
  /**
    * The labels associated with this model. You can use these to organize and group your models. Label keys and values can be no longer than 63 characters, can only contain lowercase
    * letters, numeric characters, underscores and dashes. International characters are allowed. Label values are optional. Label keys must start with a letter and each label in the list
    * must have a different key.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The time when this model was last modified, in millisecs since the epoch. */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /** Output only. The geographic location where the model resides. This value is inherited from the dataset. */
  var location: js.UndefOr[String] = js.native
  
  /** Required. Unique identifier for this model. */
  var modelReference: js.UndefOr[ModelReference] = js.native
  
  /** Output only. Type of the model resource. */
  var modelType: js.UndefOr[String] = js.native
  
  /** Output only. Information for all training runs in increasing order of start_time. */
  var trainingRuns: js.UndefOr[js.Array[TrainingRun]] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEncryptionConfiguration(value: EncryptionConfiguration): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionConfiguration: Self = this.set("encryptionConfiguration", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    
    @scala.inline
    def setFeatureColumnsVarargs(value: StandardSqlField*): Self = this.set("featureColumns", js.Array(value :_*))
    
    @scala.inline
    def setFeatureColumns(value: js.Array[StandardSqlField]): Self = this.set("featureColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureColumns: Self = this.set("featureColumns", js.undefined)
    
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setLabelColumnsVarargs(value: StandardSqlField*): Self = this.set("labelColumns", js.Array(value :_*))
    
    @scala.inline
    def setLabelColumns(value: js.Array[StandardSqlField]): Self = this.set("labelColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColumns: Self = this.set("labelColumns", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientBigquery.maximMazurokGapiClientBigqueryStrings.Model with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setModelReference(value: ModelReference): Self = this.set("modelReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelReference: Self = this.set("modelReference", js.undefined)
    
    @scala.inline
    def setModelType(value: String): Self = this.set("modelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelType: Self = this.set("modelType", js.undefined)
    
    @scala.inline
    def setTrainingRunsVarargs(value: TrainingRun*): Self = this.set("trainingRuns", js.Array(value :_*))
    
    @scala.inline
    def setTrainingRuns(value: js.Array[TrainingRun]): Self = this.set("trainingRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingRuns: Self = this.set("trainingRuns", js.undefined)
  }
}
