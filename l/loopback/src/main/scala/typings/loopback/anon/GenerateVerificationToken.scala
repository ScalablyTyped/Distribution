package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateVerificationToken extends js.Object {
  var from: String
  var redirect: String
  var subject: String
  var template: String
  var text: String
  var to: String
  var `type`: String
  def generateVerificationToken(): Unit
}

object GenerateVerificationToken {
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
  ): GenerateVerificationToken = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], generateVerificationToken = js.Any.fromFunction0(generateVerificationToken), redirect = redirect.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateVerificationToken]
  }
}

