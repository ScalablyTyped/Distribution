package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Messages extends js.Object {
  def send(data: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.BatchData): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse] = js.native
  def send(
    data: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.BatchData,
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse, 
      scala.Unit
    ]
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse] = js.native
  def send(data: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendData): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse] = js.native
  def send(
    data: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendData,
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse, 
      scala.Unit
    ]
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs.SendResponse] = js.native
}

