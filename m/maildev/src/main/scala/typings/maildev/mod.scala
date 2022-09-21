package typings.maildev

import typings.node.fsMod.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Interface for {@link MailDev}.
    */
  /* was `typeof MailDev` */
  @JSImport("maildev", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MailDev {
    /**
      * Constructor.
      *
      * @param options The options.
      */
    def this(options: MailDevOptions) = this()
  }
  
  /**
    * Interface for {@link MailDev}.
    */
  @js.native
  trait MailDev extends StObject {
    
    /**
      * Deletes all email and their attachments.
      *
      * @param callback The error callback.
      */
    def deleteAllEmail(): Unit = js.native
    def deleteAllEmail(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Deletes a given email by identifier.
      *
      * @param  id        The email identifier.
      * @param  callback  The error callback.
      */
    def deleteEmail(id: String): Unit = js.native
    def deleteEmail(id: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Stops the SMTP server.
      *
      * @param callback The error callback.
      */
    def end(): Unit = js.native
    def end(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Returns array of all e-mail.
      */
    def getAllEmail(done: js.Function2[/* error */ js.Error, /* emails */ js.Array[js.Object], Unit]): Unit = js.native
    
    /**
      * Accepts e-mail identifier, returns email object.
      *
      * @param  id        The e-mail identifier.
      * @param  callback  The error callback.
      */
    def getEmail(id: String): Unit = js.native
    def getEmail(id: String, callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Returns a readable stream of the raw e-mail.
      *
      * @param id The e-mail identifier.
      */
    def getRawEmail(id: String): Unit = js.native
    def getRawEmail(id: String, callback: js.Function2[/* error */ js.Error, /* readStream */ ReadStream, Unit]): Unit = js.native
    
    /**
      * Starts the SMTP server.
      *
      * @param callback The error callback.
      */
    def listen(): Unit = js.native
    def listen(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * Event called when a new e-mail is received. Callback receives single mail object.
      *
      * @param  eventName The event name.
      * @param  email     The email.
      */
    def on(eventName: String, callback: js.Function1[/* email */ js.Object, Unit]): Unit = js.native
    
    /**
      * Relay the e-mail.
      *
      * @param idOrMailObject The identifier or mail object.
      * @param done The callback.
      */
    def relayMail(idOrMailObject: String, done: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  /**
    * Interface for {@link MailDev}.
    */
  /* was `typeof MailDev` */
  type out = MailDev
}
