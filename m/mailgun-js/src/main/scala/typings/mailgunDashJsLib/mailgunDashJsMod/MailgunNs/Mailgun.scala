package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailgun extends js.Object {
  var Attachment: ScalablyTyped.runtime.Instantiable1[/* params */ AttachmentParams, Attachment] = js.native
  def lists(list: java.lang.String): Lists = js.native
  def messages(): Messages = js.native
  def parse(addressList: js.Array[java.lang.String]): stdLib.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ParseResponse] = js.native
  def parse(
    addressList: js.Array[java.lang.String],
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse, 
      scala.Unit
    ]
  ): stdLib.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ParseResponse] = js.native
  def validate(address: java.lang.String): stdLib.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    callback: js.Function2[
      /* error */ Error, 
      /* body */ mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse, 
      scala.Unit
    ]
  ): stdLib.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validateWebhook(bodyTimestamp: scala.Double, bodyToken: java.lang.String, bodySignature: java.lang.String): scala.Boolean = js.native
}

