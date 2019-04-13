package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  def send(data: mailgunDashJsLib.mailgunDashJsMod.messagesNs.BatchData): js.Promise[mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse] = js.native
  def send(
    data: mailgunDashJsLib.mailgunDashJsMod.messagesNs.BatchData,
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse, 
      scala.Unit
    ]
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse] = js.native
  def send(data: mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendData): js.Promise[mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse] = js.native
  def send(
    data: mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendData,
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse, 
      scala.Unit
    ]
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.messagesNs.SendResponse] = js.native
}

