package typings.keymaster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagName extends js.Object {
  var tagName: js.UndefOr[String] = js.undefined
}

object TagName {
  @scala.inline
  def apply(tagName: String = null): TagName = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagName]
  }
}

