package typings.linguiMacro.selectMod

import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.i18nMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectProps extends /* selectForm */ StringDictionary[String | MessageDescriptor] {
  var other: String | MessageDescriptor = js.native
  var value: String = js.native
}

object SelectProps {
  @scala.inline
  def apply(other: String | MessageDescriptor, value: String): SelectProps = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
  @scala.inline
  implicit class SelectPropsOps[Self <: SelectProps] (val x: Self) extends AnyVal {
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
    def setOther(value: String | MessageDescriptor): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

