package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Request")
@js.native
class Request[T] protected ()
  extends stdLib.PromiseLike[T] {
  def this(chatter: Chatter, params: RequestParams) = this()
  def batchParams(): BatchRequestParams = js.native
  def `finally`(): js.Promise[T] = js.native
  def `finally`(onfinally: js.Function0[scala.Unit]): js.Promise[T] = js.native
  def promise(): js.Promise[T] = js.native
  def stream(): nodeLib.streamMod.Stream = js.native
  def thenCall(): jsforceLib.queryMod.Query[T] = js.native
  def thenCall(callback: js.Function2[/* err */ stdLib.Error, /* records */ T, scala.Unit]): jsforceLib.queryMod.Query[T] = js.native
}

