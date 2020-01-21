package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentType extends js.Object {
  var documentType: String
  var documentURL: String
  var isEditable: Boolean
  var linkURL: js.UndefOr[String] = js.undefined
  var selectionText: js.UndefOr[String] = js.undefined
  var srcURL: js.UndefOr[String] = js.undefined
  var targetID: js.UndefOr[String] = js.undefined
  var targetName: String
  var value: js.UndefOr[String] = js.undefined
}

object AnonDocumentType {
  @scala.inline
  def apply(
    documentType: String,
    documentURL: String,
    isEditable: Boolean,
    targetName: String,
    linkURL: String = null,
    selectionText: String = null,
    srcURL: String = null,
    targetID: String = null,
    value: String = null
  ): AnonDocumentType = {
    val __obj = js.Dynamic.literal(documentType = documentType.asInstanceOf[js.Any], documentURL = documentURL.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any])
    if (linkURL != null) __obj.updateDynamic("linkURL")(linkURL.asInstanceOf[js.Any])
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText.asInstanceOf[js.Any])
    if (srcURL != null) __obj.updateDynamic("srcURL")(srcURL.asInstanceOf[js.Any])
    if (targetID != null) __obj.updateDynamic("targetID")(targetID.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentType]
  }
}

