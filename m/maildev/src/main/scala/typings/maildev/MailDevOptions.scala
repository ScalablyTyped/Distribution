package typings.maildev

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for {@link MailDev} options.
  */
trait MailDevOptions extends StObject {
  
  /**
    * Do not start web UI
    *
    * @type {boolean}
    */
  var disableWeb: js.UndefOr[Boolean] = js.undefined
  
  /**
    * IP Address to bind SMTP service to', '0.0.0.0'
    *
    * @type {string}
    */
  var ip: js.UndefOr[String] = js.undefined
  
  /**
    * Open the Web GUI after startup
    *
    * @type {boolean}
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SMTP host for outgoing emails
    *
    * @type {string}
    */
  var outgoingHost: js.UndefOr[String] = js.undefined
  
  /**
    * SMTP password for outgoing emails
    *
    * @type {string}
    */
  var outgoingPass: js.UndefOr[String] = js.undefined
  
  /**
    * SMTP port for outgoing emails.
    *
    * @type {number}
    */
  var outgoingPort: js.UndefOr[Double] = js.undefined
  
  /**
    * Use SMTP SSL for outgoing emails
    *
    * @type {boolean}
    */
  var outgoingSecure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SMTP user for outgoing emails
    *
    * @type {string}
    */
  var outgoingUser: js.UndefOr[String] = js.undefined
  
  /**
    * Do not output console.log messages
    *
    * @type {boolean}
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SMTP port to catch emails.
    *
    * @type {number}
    */
  var smtp: js.UndefOr[Double] = js.undefined
  
  /**
    * Port to use for web UI
    *
    * @type {number}
    */
  var web: js.UndefOr[Double] = js.undefined
  
  /**
    * IP Address to bind HTTP service to
    *
    * @type {string}
    */
  var webIp: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP password for GUI
    *
    * @type {string}
    */
  var webPass: js.UndefOr[String] = js.undefined
  
  /**
    * HTTP user for GUI
    *
    * @type {string}
    */
  var webUser: js.UndefOr[String] = js.undefined
}
object MailDevOptions {
  
  inline def apply(): MailDevOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailDevOptions]
  }
  
  extension [Self <: MailDevOptions](x: Self) {
    
    inline def setDisableWeb(value: Boolean): Self = StObject.set(x, "disableWeb", value.asInstanceOf[js.Any])
    
    inline def setDisableWebUndefined: Self = StObject.set(x, "disableWeb", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOutgoingHost(value: String): Self = StObject.set(x, "outgoingHost", value.asInstanceOf[js.Any])
    
    inline def setOutgoingHostUndefined: Self = StObject.set(x, "outgoingHost", js.undefined)
    
    inline def setOutgoingPass(value: String): Self = StObject.set(x, "outgoingPass", value.asInstanceOf[js.Any])
    
    inline def setOutgoingPassUndefined: Self = StObject.set(x, "outgoingPass", js.undefined)
    
    inline def setOutgoingPort(value: Double): Self = StObject.set(x, "outgoingPort", value.asInstanceOf[js.Any])
    
    inline def setOutgoingPortUndefined: Self = StObject.set(x, "outgoingPort", js.undefined)
    
    inline def setOutgoingSecure(value: Boolean): Self = StObject.set(x, "outgoingSecure", value.asInstanceOf[js.Any])
    
    inline def setOutgoingSecureUndefined: Self = StObject.set(x, "outgoingSecure", js.undefined)
    
    inline def setOutgoingUser(value: String): Self = StObject.set(x, "outgoingUser", value.asInstanceOf[js.Any])
    
    inline def setOutgoingUserUndefined: Self = StObject.set(x, "outgoingUser", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setSmtp(value: Double): Self = StObject.set(x, "smtp", value.asInstanceOf[js.Any])
    
    inline def setSmtpUndefined: Self = StObject.set(x, "smtp", js.undefined)
    
    inline def setWeb(value: Double): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebIp(value: String): Self = StObject.set(x, "webIp", value.asInstanceOf[js.Any])
    
    inline def setWebIpUndefined: Self = StObject.set(x, "webIp", js.undefined)
    
    inline def setWebPass(value: String): Self = StObject.set(x, "webPass", value.asInstanceOf[js.Any])
    
    inline def setWebPassUndefined: Self = StObject.set(x, "webPass", js.undefined)
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    
    inline def setWebUser(value: String): Self = StObject.set(x, "webUser", value.asInstanceOf[js.Any])
    
    inline def setWebUserUndefined: Self = StObject.set(x, "webUser", js.undefined)
  }
}
