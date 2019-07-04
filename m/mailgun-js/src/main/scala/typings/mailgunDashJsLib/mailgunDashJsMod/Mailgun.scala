package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mailgun extends js.Object {
  var Attachment: org.scalablytyped.runtime.Instantiable1[/* params */ AttachmentParams, Attachment] = js.native
  @JSName("delete")
  var delete_Original: MailgunRequest = js.native
  // Generic requests
  @JSName("get")
  var get_Original: MailgunRequest = js.native
  @JSName("post")
  var post_Original: MailgunRequest = js.native
  @JSName("put")
  var put_Original: MailgunRequest = js.native
  def delete(resource: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def delete(
    resource: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  // Generic requests
  def get(resource: java.lang.String, data: js.Any): js.Promise[_] = js.native
  // Generic requests
  def get(
    resource: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def lists(list: java.lang.String): Lists = js.native
  def messages(): Messages = js.native
  def parse(addressList: js.Array[java.lang.String]): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ParseResponse] = js.native
  def parse(
    addressList: js.Array[java.lang.String],
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ParseResponse] = js.native
  def post(resource: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def post(
    resource: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def put(resource: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def put(
    resource: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def validate(address: java.lang.String): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): scala.Unit = js.native
  // tslint:disable-next-line unified-signatures
  def validate(
    address: java.lang.String,
    isPrivate: scala.Boolean,
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validate(
    address: java.lang.String,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPublic
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  def validate(
    address: java.lang.String,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPublic,
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): scala.Unit = js.native
  def validateWebhook(bodyTimestamp: scala.Double, bodyToken: java.lang.String, bodySignature: java.lang.String): scala.Boolean = js.native
  @JSName("validate")
  def validate_false(address: java.lang.String, isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPublic
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  @JSName("validate")
  def validate_false(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`false`,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPublic,
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): scala.Unit = js.native
  @JSName("validate")
  def validate_true(address: java.lang.String, isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPrivate
  ): js.Promise[mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidateResponse] = js.native
  @JSName("validate")
  def validate_true(
    address: java.lang.String,
    isPrivate: mailgunDashJsLib.mailgunDashJsLibNumbers.`true`,
    opts: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationOptionsPrivate,
    callback: mailgunDashJsLib.mailgunDashJsMod.validationNs.ValidationCallback
  ): scala.Unit = js.native
}

