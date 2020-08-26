package typings.htmlToText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsAttributeValue extends js.Object {
  var isAttributeValue: Boolean = js.native
  var strict: Boolean = js.native
}

object IsAttributeValue {
  @scala.inline
  def apply(isAttributeValue: Boolean, strict: Boolean): IsAttributeValue = {
    val __obj = js.Dynamic.literal(isAttributeValue = isAttributeValue.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAttributeValue]
  }
  @scala.inline
  implicit class IsAttributeValueOps[Self <: IsAttributeValue] (val x: Self) extends AnyVal {
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
    def setIsAttributeValue(value: Boolean): Self = this.set("isAttributeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
  
}

