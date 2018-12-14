package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailgun extends js.Object {
  var Attachment: org.scalablytyped.runtime.Instantiable1[/* params */ AttachmentParams, Attachment] = js.native
  def lists(list: java.lang.String): Lists = js.native
  def messages(): Messages = js.native
  def parse(addressList: js.Array[java.lang.String]): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ParseResponse] = js.native
  def parse(
    addressList: js.Array[java.lang.String],
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ParseResponse] = js.native
  def validate(address: java.lang.String): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validate(address: java.lang.String, isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPublic
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPublic,
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validate(address: java.lang.String, isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPrivate
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPrivate,
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): scala.Unit = js.native
  // tslint:disable-next-line unified-signatures
  def validate(
    address: java.lang.String,
    isPrivate: scala.Boolean,
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validate(
    address: java.lang.String,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPublic
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    opts: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationOptionsPublic,
    callback: mailgunDashJsLib.mailgunDashJsMod.MailgunNs.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validateWebhook(bodyTimestamp: scala.Double, bodyToken: java.lang.String, bodySignature: java.lang.String): scala.Boolean = js.native
}

