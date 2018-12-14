package typings
package jsforceLib.apiChatterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/chatter", "Request")
@js.native
class Request[T] protected ()
  extends stdLib.Promise[T] {
  def this(chatter: Chatter, params: RequestParams) = this()
  @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
  val toStringTag_Request: jsforceLib.jsforceLibStrings.Promise = js.native
  def batchParams(): BatchRequestParams = js.native
  def promise(): js.Promise[T] = js.native
  def stream(): nodeLib.streamMod.Stream = js.native
  def thenCall(): jsforceLib.queryMod.Query[T] = js.native
  def thenCall(callback: js.Function2[/* err */ nodeLib.Error, /* records */ T, scala.Unit]): jsforceLib.queryMod.Query[T] = js.native
}

