package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "RequestFactory")
@js.native
class RequestFactory () extends js.Object {
  def addDefaultRejectCallback(fn: js.Function2[/* request */ Request, /* reject */ js.Any, _]): Unit = js.native
  def addDefaultResolveCallback(fn: js.Function2[/* request */ Request, /* reject */ js.Any, _]): Unit = js.native
  def addDefaultTimeoutCallback(fn: js.Function1[/* request */ Request, _], durationMs: Double): Unit = js.native
  def newRequest(): Request = js.native
  def newRequest(opts: js.Object): Request = js.native
}

