package typings.keymaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TagName extends js.Object {
  var tagName: js.UndefOr[String] = js.undefined
}

object Anon_TagName {
  @scala.inline
  def apply(tagName: String = null): Anon_TagName = {
    val __obj = js.Dynamic.literal()
    if (tagName != null) __obj.updateDynamic("tagName")(tagName)
    __obj.asInstanceOf[Anon_TagName]
  }
}

