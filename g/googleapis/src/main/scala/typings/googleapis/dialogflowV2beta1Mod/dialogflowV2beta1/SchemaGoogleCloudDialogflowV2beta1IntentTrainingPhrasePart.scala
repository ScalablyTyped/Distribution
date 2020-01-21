package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a part of a training phrase.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart extends js.Object {
  /**
    * Optional. The parameter name for the value extracted from the annotated
    * part of the example. This field is required for annotated parts of the
    * training phrase.
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * Optional. The entity type name prefixed with `@`. This field is required
    * for annotated parts of the training phrase.
    */
  var entityType: js.UndefOr[String] = js.native
  /**
    * Required. The text for this part.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates whether the text was manually annotated. This field
    * is set to true when the Dialogflow Console is used to manually annotate
    * the part. When creating an annotated part with the API, you must set this
    * to true.
    */
  var userDefined: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart {
  @scala.inline
  def apply(
    alias: String = null,
    entityType: String = null,
    text: String = null,
    userDefined: js.UndefOr[Boolean] = js.undefined
  ): SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(userDefined)) __obj.updateDynamic("userDefined")(userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentTrainingPhrasePart]
  }
}

