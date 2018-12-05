package typings
package listDashStreamLib.listDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStream
  extends nodeLib.streamMod.Duplex {
  var length: scala.Double = js.native
  def append(chunk: js.Any): scala.Unit = js.native
  def duplicate(): ListStream = js.native
  def get(index: scala.Double): js.Any = js.native
}

