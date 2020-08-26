package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchDeleteEntities.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest extends js.Object {
  /**
    * Required. The canonical `values` of the entities to delete. Note that
    * these are not fully-qualified names, i.e. they don&#39;t start with
    * `projects/&lt;Project ID&gt;`.
    */
  var entityValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequestOps[Self <: SchemaGoogleCloudDialogflowV2beta1BatchDeleteEntitiesRequest] (val x: Self) extends AnyVal {
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
    def setEntityValuesVarargs(value: String*): Self = this.set("entityValues", js.Array(value :_*))
    @scala.inline
    def setEntityValues(value: js.Array[String]): Self = this.set("entityValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityValues: Self = this.set("entityValues", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
  
}

