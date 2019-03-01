package typings
package loopbackLib.loopbackMod.lNs

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
trait Email extends Model {
  /** Email sender address.  Required. */
  var from: java.lang.String
  /** HTML body of email. */
  var html: java.lang.String
  /** Email subject string.  Required. */
  var subject: java.lang.String
  /** Text body of email. */
  var text: java.lang.String
  /** Email addressee.  Required. */
  var to: java.lang.String
  /**
    * A shortcut for Email.send(this).
    */
  def send(): scala.Unit
}

object Email {
  @scala.inline
  def apply(
    afterRemote: js.Function2[
      java.lang.String, 
      js.Function3[
        /* ctx */ Context, 
        /* modelInstanceOrNext */ Email | expressLib.expressMod.eNs.NextFunction, 
        /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
        scala.Unit
      ], 
      scala.Unit
    ],
    afterRemoteError: js.Function2[java.lang.String, expressLib.expressMod.eNs.NextFunction, scala.Unit],
    beforeRemote: js.Function2[
      java.lang.String, 
      js.Function3[
        /* ctx */ Context, 
        /* modelInstanceOrNext */ Email | expressLib.expressMod.eNs.NextFunction, 
        /* next */ js.UndefOr[expressLib.expressMod.eNs.NextFunction], 
        scala.Unit
      ], 
      scala.Unit
    ],
    from: java.lang.String,
    html: java.lang.String,
    send: js.Function0[scala.Unit],
    settings: Settings,
    subject: java.lang.String,
    text: java.lang.String,
    to: java.lang.String
  ): Email = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterRemote")(afterRemote)
    __obj.updateDynamic("afterRemoteError")(afterRemoteError)
    __obj.updateDynamic("beforeRemote")(beforeRemote)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("html")(html)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("settings")(settings)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[Email]
  }
}

