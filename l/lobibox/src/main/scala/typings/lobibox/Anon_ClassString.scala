package typings.lobibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassString extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
}

object Anon_ClassString {
  @scala.inline
  def apply(`class`: String = null): Anon_ClassString = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassString]
  }
}

