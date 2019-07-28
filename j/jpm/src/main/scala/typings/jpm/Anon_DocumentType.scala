package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentType extends js.Object {
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

object Anon_DocumentType {
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
  ): Anon_DocumentType = {
    val __obj = js.Dynamic.literal(documentType = documentType, documentURL = documentURL, isEditable = isEditable, targetName = targetName)
    if (linkURL != null) __obj.updateDynamic("linkURL")(linkURL)
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText)
    if (srcURL != null) __obj.updateDynamic("srcURL")(srcURL)
    if (targetID != null) __obj.updateDynamic("targetID")(targetID)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_DocumentType]
  }
}

