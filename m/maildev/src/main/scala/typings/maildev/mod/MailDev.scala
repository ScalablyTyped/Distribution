package typings.maildev.mod

import typings.node.fsMod.ReadStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def deleteAllEmail(): Unit = js.native
  def deleteAllEmail(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * Deletes a given email by identifier.
    *
    * @public
    * @param {string}    id        The email identifier.
    * @param {Function}  callback  The error callback.
    */
  def deleteEmail(id: String): Unit = js.native
  def deleteEmail(id: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * Stops the SMTP server.
    *
    * @public
    * @param {Function} callback The error callback.
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * Returns array of all e-mail.
    * @public
    */
  def getAllEmail(done: js.Function2[/* error */ Error, /* emails */ js.Array[js.Object], Unit]): Unit = js.native
  
  /**
    * Accepts e-mail identifier, returns email object.
    *
    * @public
    * @param {string}    id        The e-mail identifier.
    * @param {Function}  callback  The error callback.
    */
  def getEmail(id: String): Unit = js.native
  def getEmail(id: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * Returns a readable stream of the raw e-mail.
    *
    * @public
    * @param {string} id The e-mail identifier.
    */
  def getRawEmail(id: String): Unit = js.native
  def getRawEmail(id: String, callback: js.Function2[/* error */ Error, /* readStream */ ReadStream, Unit]): Unit = js.native
  
  /**
    * Starts the SMTP server.
    *
    * @public
    * @param {Function} callback The error callback.
    */
  def listen(): Unit = js.native
  def listen(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * Event called when a new e-mail is received. Callback receives single mail object.
    *
    * @public
    * @param {string}    eventName The event name.
    * @param {Function}  email     The email.
    */
  def on(eventName: String, callback: js.Function1[/* email */ js.Object, Unit]): Unit = js.native
  
  /**
    * Relay the e-mail.
    *
    * @param {string} idOrMailObject The identifier or mail object.
    * @param {Function} done The callback.
    */
  def relayMail(idOrMailObject: String, done: js.Function1[/* error */ Error, Unit]): Unit = js.native
}
