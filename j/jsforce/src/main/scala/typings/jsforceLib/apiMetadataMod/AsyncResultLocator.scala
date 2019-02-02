package typings
package jsforceLib.apiMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/metadata", "AsyncResultLocator")
@js.native
class AsyncResultLocator[T] ()
  extends nodeLib.eventsMod.EventEmitter
     with stdLib.PromiseLike[T] {
  def check(): js.Promise[T] = js.native
  def check(callback: jsforceLib.connectionMod.Callback[T]): js.Promise[T] = js.native
  def complete(): js.Promise[T] = js.native
  def complete(callback: jsforceLib.connectionMod.Callback[T]): js.Promise[T] = js.native
  def `finally`(): js.Promise[T] = js.native
  def `finally`(onfinally: js.Function0[scala.Unit]): js.Promise[T] = js.native
  def poll(interval: scala.Double, timeout: scala.Double): scala.Unit = js.native
}

