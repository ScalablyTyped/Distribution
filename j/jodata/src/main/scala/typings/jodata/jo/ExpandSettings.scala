package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandSettings extends ISettings {
  var DefaultExpand: String
  var Expand: String
}

object ExpandSettings {
  @scala.inline
  def apply(DefaultExpand: String, Expand: String, isSet: () => Boolean, reset: () => Unit): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand.asInstanceOf[js.Any], Expand = Expand.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ExpandSettings]
  }
}

