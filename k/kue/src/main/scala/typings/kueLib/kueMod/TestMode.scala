package typings
package kueLib.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMode extends js.Object {
  var jobs: js.Array[Job] = js.native
  def clear(): scala.Unit = js.native
  def enter(): scala.Unit = js.native
  def enter(process: scala.Boolean): scala.Unit = js.native
  def exit(): scala.Unit = js.native
}

