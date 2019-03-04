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
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): SkipSettings = {
    val __obj = js.Dynamic.literal(DefaultSkip = DefaultSkip, Skip = Skip, isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[SkipSettings]
  }
}

