package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipSettings extends ISettings {
  var DefaultSkip: Double
  var Skip: Double
}

object SkipSettings {
  @scala.inline
  def apply(DefaultSkip: Double, Skip: Double, isSet: () => Boolean, reset: () => Unit, toString: () => String): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip, Skip = Skip, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SkipSettings]
  }
}

