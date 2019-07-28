package typings.kue.kueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestMode extends js.Object {
  var jobs: js.Array[Job] = js.native
  def clear(): Unit = js.native
  def enter(): Unit = js.native
  def enter(process: Boolean): Unit = js.native
  def exit(): Unit = js.native
}

