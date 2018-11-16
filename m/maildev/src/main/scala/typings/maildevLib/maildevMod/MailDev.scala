package typings
package maildevLib.maildevMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for {@link MailDev}.
     */
@js.native
trait MailDev extends js.Object {
  /**
           * Deletes all email and their attachments.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def deleteAllEmail(): scala.Unit = js.native
  /**
           * Deletes all email and their attachments.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def deleteAllEmail(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
           * Deletes a given email by identifier.
           *
           * @public
           * @param {string}    id        The email identifier.
           * @param {Function}  callback  The error callback.
           */
  def deleteEmail(id: java.lang.String): scala.Unit = js.native
  /**
           * Deletes a given email by identifier.
           *
           * @public
           * @param {string}    id        The email identifier.
           * @param {Function}  callback  The error callback.
           */
  def deleteEmail(id: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
           * Stops the SMTP server.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def end(): scala.Unit = js.native
  /**
           * Stops the SMTP server.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def end(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
           * Returns array of all e-mail.
  
           * @public
           */
  def getAllEmail(done: js.Function2[/* error */ nodeLib.Error, /* emails */ js.Array[js.Object], scala.Unit]): scala.Unit = js.native
  /**
           * Accepts e-mail identifier, returns email object.
           *
           * @public
           * @param {string}    id        The e-mail identifier.
           * @param {Function}  callback  The error callback.
           */
  def getEmail(id: java.lang.String): scala.Unit = js.native
  /**
           * Accepts e-mail identifier, returns email object.
           *
           * @public
           * @param {string}    id        The e-mail identifier.
           * @param {Function}  callback  The error callback.
           */
  def getEmail(id: java.lang.String, callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
           * Returns a readable stream of the raw e-mail.
           *
           * @public
           * @param {string} id The e-mail identifier.
           */
  def getRawEmail(id: java.lang.String): scala.Unit = js.native
  /**
           * Returns a readable stream of the raw e-mail.
           *
           * @public
           * @param {string} id The e-mail identifier.
           */
  def getRawEmail(
    id: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* readStream */ nodeLib.fsMod.ReadStream, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Starts the SMTP server.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def listen(): scala.Unit = js.native
  /**
           * Starts the SMTP server.
           *
           * @public
           * @param {Function} callback The error callback.
           */
  def listen(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
           * Event called when a new e-mail is received. Callback receives single mail object.
           *
           * @public
           * @param {string}    eventName The event name.
           * @param {Function}  email     The email.
           */
  def on(eventName: java.lang.String, callback: js.Function1[/* email */ js.Object, scala.Unit]): scala.Unit = js.native
  /**
           * Relay the e-mail.
           *
           * @param {string} idOrMailObject The identifier or mail object.
           * @param {Function} done The callback.
           */
  def relayMail(idOrMailObject: java.lang.String, done: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

