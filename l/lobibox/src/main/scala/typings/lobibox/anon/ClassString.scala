package typings.lobibox.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassString extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
}

object ClassString {
  @scala.inline
  def apply(`class`: String = null): ClassString = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassString]
  }
}

