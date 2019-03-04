package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandSettings extends ISettings {
  var DefaultExpand: java.lang.String
  var Expand: java.lang.String
}

object ExpandSettings {
  @scala.inline
  def apply(
    DefaultExpand: java.lang.String,
    Expand: java.lang.String,
    isSet: js.Function0[scala.Boolean],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand, Expand = Expand, isSet = isSet, reset = reset, toString = toString)
  
    __obj.asInstanceOf[ExpandSettings]
  }
}

