package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributesnaturallanguage extends js.Object {
  var `attributes-charset`: CharacterSet
  var `attributes-natural-language`: String
  var `detailed-status-message`: js.UndefOr[String] = js.undefined
  var `status-message`: js.UndefOr[String] = js.undefined
}

object Attributesnaturallanguage {
  @scala.inline
  def apply(
    `attributes-charset`: CharacterSet,
    `attributes-natural-language`: String,
    `detailed-status-message`: String = null,
    `status-message`: String = null
  ): Attributesnaturallanguage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes-charset")(`attributes-charset`.asInstanceOf[js.Any])
    __obj.updateDynamic("attributes-natural-language")(`attributes-natural-language`.asInstanceOf[js.Any])
    if (`detailed-status-message` != null) __obj.updateDynamic("detailed-status-message")(`detailed-status-message`.asInstanceOf[js.Any])
    if (`status-message` != null) __obj.updateDynamic("status-message")(`status-message`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributesnaturallanguage]
  }
}

