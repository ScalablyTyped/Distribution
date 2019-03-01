package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentType extends js.Object {
  var documentType: java.lang.String
  var documentURL: java.lang.String
  var isEditable: scala.Boolean
  var linkURL: js.UndefOr[java.lang.String] = js.undefined
  var selectionText: js.UndefOr[java.lang.String] = js.undefined
  var srcURL: js.UndefOr[java.lang.String] = js.undefined
  var targetID: js.UndefOr[java.lang.String] = js.undefined
  var targetName: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DocumentType {
  @scala.inline
  def apply(
    documentType: java.lang.String,
    documentURL: java.lang.String,
    isEditable: scala.Boolean,
    targetName: java.lang.String,
    linkURL: java.lang.String = null,
    selectionText: java.lang.String = null,
    srcURL: java.lang.String = null,
    targetID: java.lang.String = null,
    value: java.lang.String = null
  ): Anon_DocumentType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("documentType")(documentType)
    __obj.updateDynamic("documentURL")(documentURL)
    __obj.updateDynamic("isEditable")(isEditable)
    __obj.updateDynamic("targetName")(targetName)
    if (linkURL != null) __obj.updateDynamic("linkURL")(linkURL)
    if (selectionText != null) __obj.updateDynamic("selectionText")(selectionText)
    if (srcURL != null) __obj.updateDynamic("srcURL")(srcURL)
    if (targetID != null) __obj.updateDynamic("targetID")(targetID)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_DocumentType]
  }
}

