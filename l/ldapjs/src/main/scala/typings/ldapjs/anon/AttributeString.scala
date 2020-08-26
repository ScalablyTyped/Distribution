package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeString extends js.Object {
  var attribute: String = js.native
}

object AttributeString {
  @scala.inline
  def apply(attribute: String): AttributeString = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeString]
  }
  @scala.inline
  implicit class AttributeStringOps[Self <: AttributeString] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
  }
  
}

