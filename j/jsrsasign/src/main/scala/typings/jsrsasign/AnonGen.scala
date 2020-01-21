package typings.jsrsasign

import typings.jsrsasign.jsrsasignStrings.gen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGen extends js.Object {
  var `type`: js.UndefOr[gen] = js.undefined
}

object AnonGen {
  @scala.inline
  def apply(`type`: gen = null): AnonGen = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGen]
  }
}

