package typings.loopback.mod

import typings.loopback.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class Email protected () extends Model {
  def this(data: Any) = this()
  
  /** Email sender address.  Required. */
  var from: String = js.native
  
  /** HTML body of email. */
  var html: String = js.native
  
  /**
    * A shortcut for Email.send(this).
    */
  def send(): Unit = js.native
  
  /** Email subject string.  Required. */
  var subject: String = js.native
  
  /** Text body of email. */
  var text: String = js.native
  
  /** Email addressee.  Required. */
  var to: String = js.native
}
object Email {
  
  @JSImport("loopback", "Email")
  @js.native
  val ^ : js.Any = js.native
  
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
  /* static member */
  inline def send(callback: js.Function0[Unit], options: From): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
