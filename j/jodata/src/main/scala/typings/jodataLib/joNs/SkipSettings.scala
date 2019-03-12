package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkipSettings extends ISettings {
  var DefaultSkip: scala.Double
  var Skip: scala.Double
}

object SkipSettings {
  @scala.inline
  def apply(
    DefaultSkip: scala.Double,
    Skip: scala.Double,
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip, Skip = Skip, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[SkipSettings]
  }
}

