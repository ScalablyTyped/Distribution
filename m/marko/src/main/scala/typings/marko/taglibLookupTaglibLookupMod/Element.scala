package typings.marko.taglibLookupTaglibLookupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var tagName: String = js.native
}

object Element {
  @scala.inline
  def apply(tagName: String): Element = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
  }
  
}

