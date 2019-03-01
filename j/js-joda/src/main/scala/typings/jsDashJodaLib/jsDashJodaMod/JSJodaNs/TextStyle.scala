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
  def apply(
    asNormal: js.Function0[TextStyle],
    asStandalone: js.Function0[TextStyle],
    isStandalone: js.Function0[scala.Boolean]
  ): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asNormal")(asNormal)
    __obj.updateDynamic("asStandalone")(asStandalone)
    __obj.updateDynamic("isStandalone")(isStandalone)
    __obj.asInstanceOf[TextStyle]
  }
}

