package typings.matrixAppserviceBridge.mod

import typings.matrixAppserviceBridge.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-appservice-bridge", "Request")
@js.native
class Request protected () extends js.Object {
  def this(opts: AnonData) = this()
  var data: Event = js.native
  var id: String = js.native
  var startTs: Double = js.native
  def getData(): Event = js.native
  def getDuration(): Double = js.native
  def getId(): String = js.native
  def getPromise(): js.Promise[Unit] = js.native
  def outcomeFrom(future: js.Promise[_]): Unit = js.native
  def reject(msg: js.Any): Unit = js.native
  def resolve(msg: js.Any): Unit = js.native
}

