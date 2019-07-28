package typings.jodata.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandSettings extends ISettings {
  var DefaultExpand: String
  var Expand: String
}

object ExpandSettings {
  @scala.inline
  def apply(
    DefaultExpand: String,
    Expand: String,
    isSet: () => Boolean,
    reset: () => Unit,
    toString: () => String
  ): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand, Expand = Expand, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ExpandSettings]
  }
}

