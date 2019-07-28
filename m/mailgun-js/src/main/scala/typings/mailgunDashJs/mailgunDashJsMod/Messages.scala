package typings.mailgunDashJs.mailgunDashJsMod

import typings.mailgunDashJs.mailgunDashJsMod.messagesNs.BatchData
import typings.mailgunDashJs.mailgunDashJsMod.messagesNs.SendData
import typings.mailgunDashJs.mailgunDashJsMod.messagesNs.SendResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  def send(data: BatchData): js.Promise[SendResponse] = js.native
  def send(data: BatchData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
  def send(data: SendData): js.Promise[SendResponse] = js.native
  def send(data: SendData, callback: js.Function2[/* error */ Error, /* body */ SendResponse, Unit]): js.Promise[SendResponse] = js.native
}

