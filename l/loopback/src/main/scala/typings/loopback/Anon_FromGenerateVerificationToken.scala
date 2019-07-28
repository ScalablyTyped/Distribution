package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromGenerateVerificationToken extends js.Object {
  var from: String
  var redirect: String
  var subject: String
  var template: String
  var text: String
  var to: String
  var `type`: String
  def generateVerificationToken(): Unit
}

object Anon_FromGenerateVerificationToken {
  @scala.inline
  def apply(
    from: String,
    generateVerificationToken: () => Unit,
    redirect: String,
    subject: String,
    template: String,
    text: String,
    to: String,
    `type`: String
  ): Anon_FromGenerateVerificationToken = {
    val __obj = js.Dynamic.literal(from = from, generateVerificationToken = js.Any.fromFunction0(generateVerificationToken), redirect = redirect, subject = subject, template = template, text = text, to = to)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FromGenerateVerificationToken]
  }
}

