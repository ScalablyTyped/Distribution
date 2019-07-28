package typings.maildev

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link MailDev} options.
  */
trait MailDevOptions extends js.Object {
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
  @scala.inline
  def apply(
    disableWeb: js.UndefOr[Boolean] = js.undefined,
    ip: String = null,
    open: js.UndefOr[Boolean] = js.undefined,
    outgoingHost: String = null,
    outgoingPass: String = null,
    outgoingPort: Int | Double = null,
    outgoingSecure: js.UndefOr[Boolean] = js.undefined,
    outgoingUser: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    smtp: Int | Double = null,
    web: Int | Double = null,
    webIp: String = null,
    webPass: String = null,
    webUser: String = null
  ): MailDevOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableWeb)) __obj.updateDynamic("disableWeb")(disableWeb)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (outgoingHost != null) __obj.updateDynamic("outgoingHost")(outgoingHost)
    if (outgoingPass != null) __obj.updateDynamic("outgoingPass")(outgoingPass)
    if (outgoingPort != null) __obj.updateDynamic("outgoingPort")(outgoingPort.asInstanceOf[js.Any])
    if (!js.isUndefined(outgoingSecure)) __obj.updateDynamic("outgoingSecure")(outgoingSecure)
    if (outgoingUser != null) __obj.updateDynamic("outgoingUser")(outgoingUser)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (smtp != null) __obj.updateDynamic("smtp")(smtp.asInstanceOf[js.Any])
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    if (webIp != null) __obj.updateDynamic("webIp")(webIp)
    if (webPass != null) __obj.updateDynamic("webPass")(webPass)
    if (webUser != null) __obj.updateDynamic("webUser")(webUser)
    __obj.asInstanceOf[MailDevOptions]
  }
}

