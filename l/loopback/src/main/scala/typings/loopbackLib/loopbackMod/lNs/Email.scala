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

