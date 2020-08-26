package typings.intlMessageformatParser.mod

import typings.intlMessageformatParser.mod.TYPE.select
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectElement
  extends BaseElement[select]
     with _MessageFormatElement {
  var options: Record[String, PluralOrSelectOption] = js.native
}

object SelectElement {
  @scala.inline
  def apply(options: Record[String, PluralOrSelectOption], `type`: select, value: String): SelectElement = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectElement]
  }
  @scala.inline
  implicit class SelectElementOps[Self <: SelectElement] (val x: Self) extends AnyVal {
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
    def setOptions(value: Record[String, PluralOrSelectOption]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

