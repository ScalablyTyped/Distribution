package typings.intlMessageformatParser.srcTypesMod

import typings.intlMessageformatParser.srcTypesMod.TYPE.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagElement extends _MessageFormatElement {
  var children: js.Array[MessageFormatElement] = js.native
  var location: js.UndefOr[Location] = js.native
  var `type`: tag = js.native
  var value: String = js.native
}

object TagElement {
  @scala.inline
  def apply(children: js.Array[MessageFormatElement], `type`: tag, value: String): TagElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagElement]
  }
  @scala.inline
  implicit class TagElementOps[Self <: TagElement] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: MessageFormatElement*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[MessageFormatElement]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: tag): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

