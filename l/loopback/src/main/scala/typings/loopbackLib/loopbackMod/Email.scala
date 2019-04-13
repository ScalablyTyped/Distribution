package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Email model.  Extends LoopBack base [Model](#model-new-model).
  * @property {string} to Email addressee.  Required.
  * @property {string} from Email sender address.  Required.
  * @property {string} subject Email subject string.  Required.
  * @property {string} text Text body of email.
  * @property {string} html HTML body of email
  * @class Email
  * @inherits {Model}
  */
@JSImport("loopback", "Email")
@js.native
class Email () extends Model {
  /** Email sender address.  Required. */
  var from: java.lang.String = js.native
  /** HTML body of email. */
  var html: java.lang.String = js.native
  /** Email subject string.  Required. */
  var subject: java.lang.String = js.native
  /** Text body of email. */
  var text: java.lang.String = js.native
  /** Email addressee.  Required. */
  var to: java.lang.String = js.native
  /**
    * A shortcut for Email.send(this).
    */
  def send(): scala.Unit = js.native
}

/* static members */
@JSImport("loopback", "Email")
@js.native
object Email extends js.Object {
  /**
    * Send an email with the given `options`
    * Example Options
    * ```js
    * {
    *   from: "Fred Foo <foo@blurdybloop.com>", // sender address
    *   to: "bar@blurdybloop.com, baz@blurdybloop.com", // list of receivers
    *   subject: "Hello", // Subject line
    *   text: "Hello world", // plaintext body
    *   html: "<b>Hello world</b>" // html body
    * }
    * ``
    * See github.com/andris9/Nodemailer for other supported options
    *
    * @options {any} options See below
    * @prop {string} from Senders's email address
    * @prop {string} to List of one or more recipient email addresses (comma-delimited)
    * @prop {string} subject Subject line
    * @prop {string} text Body text
    * @prop {string} html Body HTML (optional)
    * @param {() => void} callback Called after the e-mail is sent or the sending faile
    */
  def send(callback: js.Function0[scala.Unit], options: loopbackLib.Anon_From): scala.Unit = js.native
}

