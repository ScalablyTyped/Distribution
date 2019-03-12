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
    close: () => scala.Unit,
    destroy: () => scala.Unit,
    open: () => scala.Unit,
    setColor: js.Any => scala.Unit
  ): JQueryColorpickerInstance = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy), open = js.Any.fromFunction0(open), setColor = js.Any.fromFunction1(setColor))
  
    __obj.asInstanceOf[JQueryColorpickerInstance]
  }
}

