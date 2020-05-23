package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Printeruri extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385 */ js.Any
    ]
  ] = js.undefined
  var `requesting-user-name`: String
}

object Printeruri {
  @scala.inline
  def apply(
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    `document-format`: MimeMediaType = null,
    `printer-uri`: String = null,
    `requested-attributes`: js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385 */ js.Any
    ] = null
  ): Printeruri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`document-format` != null) __obj.updateDynamic("document-format")(`document-format`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    if (`requested-attributes` != null) __obj.updateDynamic("requested-attributes")(`requested-attributes`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printeruri]
  }
}

