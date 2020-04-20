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
  def apply(DefaultSkip: Double, Skip: Double, isSet: () => Boolean, reset: () => Unit): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip.asInstanceOf[js.Any], Skip = Skip.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[SkipSettings]
  }
}

