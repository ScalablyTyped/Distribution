package typings
package jsoneditoronlineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_StopPropagation extends js.Object {
  def addEventListener(
    element: stdLib.HTMLElement,
    action: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit],
    useCapture: scala.Boolean
  ): js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit]
  def preventDefault(event: stdLib.Event): scala.Unit
  def removeEventListener(
    element: stdLib.HTMLElement,
    action: java.lang.String,
    listener: js.Function1[/* event */ js.UndefOr[stdLib.Event], scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit
  def stopPropagation(event: stdLib.Event): scala.Unit
}

