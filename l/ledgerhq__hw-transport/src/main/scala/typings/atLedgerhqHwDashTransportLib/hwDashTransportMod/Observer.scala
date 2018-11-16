package typings
package atLedgerhqHwDashTransportLib.hwDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observer[Ev] extends js.Object {
  def complete(): js.Any
  def error(e: js.Any): js.Any
  def next(event: Ev): js.Any
}

