package typings.intlMessageformat.mod

import typings.intlMessageformat.mod.TYPE.plural
import typings.std.Intl.PluralRuleType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluralElement
  extends BaseElement[plural]
     with _MessageFormatElement {
  var offset: Double = js.native
  var options: Record[ValidPluralRule, PluralOrSelectOption] = js.native
  var pluralType: js.UndefOr[PluralRuleType] = js.native
}

object PluralElement {
  @scala.inline
  def apply(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
  @scala.inline
  implicit class PluralElementOps[Self <: PluralElement] (val x: Self) extends AnyVal {
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
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: Record[ValidPluralRule, PluralOrSelectOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPluralType(value: PluralRuleType): Self = this.set("pluralType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePluralType: Self = this.set("pluralType", js.undefined)
  }
  
}

