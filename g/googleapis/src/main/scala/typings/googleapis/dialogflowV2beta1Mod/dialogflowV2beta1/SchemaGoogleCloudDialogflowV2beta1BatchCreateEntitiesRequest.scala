package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for EntityTypes.BatchCreateEntities.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchCreateEntitiesRequest extends js.Object {
  /**
    * Required. The entities to create.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.native
  /**
    * Optional. The language of entity synonyms defined in `entities`. If not
    * specified, the agent&#39;s default language is used. [Many
    * languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * are supported. Note: languages must be enabled in the agent before they
    * can be used.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchCreateEntitiesRequest {
  @scala.inline
  def apply(
    entities: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity] = null,
    languageCode: String = null
  ): SchemaGoogleCloudDialogflowV2beta1BatchCreateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchCreateEntitiesRequest]
  }
}

