package typings.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTriggersSupported extends js.Object {
  var `preset-name`: js.UndefOr[String] = js.undefined
}

object JobTriggersSupported {
  @scala.inline
  def apply(`preset-name`: String = null): JobTriggersSupported = {
    val __obj = js.Dynamic.literal()
    if (`preset-name` != null) __obj.updateDynamic("preset-name")(`preset-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobTriggersSupported]
  }
}

