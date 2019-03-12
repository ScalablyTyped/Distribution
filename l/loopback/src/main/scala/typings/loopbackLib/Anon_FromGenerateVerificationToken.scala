package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromGenerateVerificationToken extends js.Object {
  var from: java.lang.String
  var redirect: java.lang.String
  var subject: java.lang.String
  var template: java.lang.String
  var text: java.lang.String
  var to: java.lang.String
  var `type`: java.lang.String
  def generateVerificationToken(): scala.Unit
}

object Anon_FromGenerateVerificationToken {
  @scala.inline
  def apply(
    from: java.lang.String,
    generateVerificationToken: () => scala.Unit,
    redirect: java.lang.String,
    subject: java.lang.String,
    template: java.lang.String,
    text: java.lang.String,
    to: java.lang.String,
    `type`: java.lang.String
  ): Anon_FromGenerateVerificationToken = {
    val __obj = js.Dynamic.literal(from = from, generateVerificationToken = js.Any.fromFunction0(generateVerificationToken), redirect = redirect, subject = subject, template = template, text = text, to = to)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FromGenerateVerificationToken]
  }
}

