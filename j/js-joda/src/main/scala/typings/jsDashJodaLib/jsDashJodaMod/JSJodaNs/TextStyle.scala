package typings
package jsDashJodaLib.jsDashJodaMod.JSJodaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends js.Object {
  def asNormal(): TextStyle
  def asStandalone(): TextStyle
  def isStandalone(): scala.Boolean
}

object TextStyle {
  @scala.inline
  def apply(asNormal: () => TextStyle, asStandalone: () => TextStyle, isStandalone: () => scala.Boolean): TextStyle = {
    val __obj = js.Dynamic.literal(asNormal = js.Any.fromFunction0(asNormal), asStandalone = js.Any.fromFunction0(asStandalone), isStandalone = js.Any.fromFunction0(isStandalone))
  
    __obj.asInstanceOf[TextStyle]
  }
}

