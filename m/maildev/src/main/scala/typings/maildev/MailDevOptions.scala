package typings.maildev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for {@link MailDev} options.
  */
@js.native
trait MailDevOptions extends js.Object {
  
  /**
    * Do not start web UI
    *
    * @type {boolean}
    */
  var disableWeb: js.UndefOr[Boolean] = js.native
  
  /**
    * IP Address to bind SMTP service to', '0.0.0.0'
    *
    * @type {string}
    */
  var ip: js.UndefOr[String] = js.native
  
  /**
    * Open the Web GUI after startup
    *
    * @type {boolean}
    */
  var open: js.UndefOr[Boolean] = js.native
  
  /**
    * SMTP host for outgoing emails
    *
    * @type {string}
    */
  var outgoingHost: js.UndefOr[String] = js.native
  
  /**
    * SMTP password for outgoing emails
    *
    * @type {string}
    */
  var outgoingPass: js.UndefOr[String] = js.native
  
  /**
    * SMTP port for outgoing emails.
    *
    * @type {number}
    */
  var outgoingPort: js.UndefOr[Double] = js.native
  
  /**
    * Use SMTP SSL for outgoing emails
    *
    * @type {boolean}
    */
  var outgoingSecure: js.UndefOr[Boolean] = js.native
  
  /**
    * SMTP user for outgoing emails
    *
    * @type {string}
    */
  var outgoingUser: js.UndefOr[String] = js.native
  
  /**
    * Do not output console.log messages
    *
    * @type {boolean}
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * SMTP port to catch emails.
    *
    * @type {number}
    */
  var smtp: js.UndefOr[Double] = js.native
  
  /**
    * Port to use for web UI
    *
    * @type {number}
    */
  var web: js.UndefOr[Double] = js.native
  
  /**
    * IP Address to bind HTTP service to
    *
    * @type {string}
    */
  var webIp: js.UndefOr[String] = js.native
  
  /**
    * HTTP password for GUI
    *
    * @type {string}
    */
  var webPass: js.UndefOr[String] = js.native
  
  /**
    * HTTP user for GUI
    *
    * @type {string}
    */
  var webUser: js.UndefOr[String] = js.native
}
object MailDevOptions {
  
  @scala.inline
  def apply(): MailDevOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailDevOptions]
  }
  
  @scala.inline
  implicit class MailDevOptionsOps[Self <: MailDevOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableWeb(value: Boolean): Self = this.set("disableWeb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableWeb: Self = this.set("disableWeb", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOutgoingHost(value: String): Self = this.set("outgoingHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingHost: Self = this.set("outgoingHost", js.undefined)
    
    @scala.inline
    def setOutgoingPass(value: String): Self = this.set("outgoingPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingPass: Self = this.set("outgoingPass", js.undefined)
    
    @scala.inline
    def setOutgoingPort(value: Double): Self = this.set("outgoingPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingPort: Self = this.set("outgoingPort", js.undefined)
    
    @scala.inline
    def setOutgoingSecure(value: Boolean): Self = this.set("outgoingSecure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingSecure: Self = this.set("outgoingSecure", js.undefined)
    
    @scala.inline
    def setOutgoingUser(value: String): Self = this.set("outgoingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutgoingUser: Self = this.set("outgoingUser", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setSmtp(value: Double): Self = this.set("smtp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmtp: Self = this.set("smtp", js.undefined)
    
    @scala.inline
    def setWeb(value: Double): Self = this.set("web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeb: Self = this.set("web", js.undefined)
    
    @scala.inline
    def setWebIp(value: String): Self = this.set("webIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebIp: Self = this.set("webIp", js.undefined)
    
    @scala.inline
    def setWebPass(value: String): Self = this.set("webPass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPass: Self = this.set("webPass", js.undefined)
    
    @scala.inline
    def setWebUser(value: String): Self = this.set("webUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebUser: Self = this.set("webUser", js.undefined)
  }
}
