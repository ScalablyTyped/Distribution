package typings.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectOption extends js.Object {
  var id: String = js.native
  var location: js.UndefOr[Location2] = js.native
  var value: js.Array[MessageFormatElement] = js.native
}

object SelectOption {
  @scala.inline
  def apply(id: String, value: js.Array[MessageFormatElement]): SelectOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOption]
  }
  @scala.inline
  implicit class SelectOptionOps[Self <: SelectOption] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: MessageFormatElement*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[MessageFormatElement]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location2): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

