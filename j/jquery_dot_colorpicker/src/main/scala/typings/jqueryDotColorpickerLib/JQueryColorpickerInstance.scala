package typings
package jqueryDotColorpickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryColorpickerInstance extends js.Object {
  def close(): scala.Unit
  def destroy(): scala.Unit
  def open(): scala.Unit
  def setColor(color: js.Any): scala.Unit
}

object JQueryColorpickerInstance {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    open: js.Function0[scala.Unit],
    setColor: js.Function1[js.Any, scala.Unit]
  ): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = close, destroy = destroy, open = open, setColor = setColor)
  
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
}

