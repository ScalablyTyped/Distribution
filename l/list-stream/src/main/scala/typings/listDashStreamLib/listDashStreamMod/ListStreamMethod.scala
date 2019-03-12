package typings
package listDashStreamLib.listDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamMethod extends js.Object {
  def apply(): ListStream = js.native
  def apply(callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[_], scala.Unit]): ListStream = js.native
  def apply(options: nodeLib.streamMod.internalNs.DuplexOptions): ListStream = js.native
  def apply(
    options: nodeLib.streamMod.internalNs.DuplexOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* data */ js.Array[_], scala.Unit]
  ): ListStream = js.native
}

