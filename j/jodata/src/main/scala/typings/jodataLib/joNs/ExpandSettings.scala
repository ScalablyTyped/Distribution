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
    isSet: () => scala.Boolean,
    reset: () => scala.Unit,
    toString: () => java.lang.String
  ): ExpandSettings = {
    val __obj = js.Dynamic.literal(DefaultExpand = DefaultExpand, Expand = Expand, isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ExpandSettings]
  }
}

