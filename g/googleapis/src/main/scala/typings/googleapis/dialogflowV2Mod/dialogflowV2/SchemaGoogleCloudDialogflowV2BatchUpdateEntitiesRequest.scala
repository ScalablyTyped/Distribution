package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchUpdateEntities.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest extends js.Object {
  /**
    * Required. The entities to update or create.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Optional. The mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequestOps[Self <: SchemaGoogleCloudDialogflowV2BatchUpdateEntitiesRequest] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
  
}

