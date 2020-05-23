package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributescharset extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  var `printer-uri`: js.UndefOr[String] = js.undefined
  var `requesting-user-name`: String
}

object Attributescharset {
  @scala.inline
  def apply(
    `requesting-user-name`: String,
    `attributes-charset`: CharacterSet = null,
    `attributes-natural-language`: String = null,
    `printer-uri`: String = null
  ): Attributescharset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    if (`attributes-charset` != null) __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    if (`attributes-natural-language` != null) __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`printer-uri` != null) __obj.updateDynamic("printer-uri")(`printer-uri`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributescharset]
  }
}

