package typings
package maildevLib

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
  var disableWeb: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * IP Address to bind SMTP service to', '0.0.0.0'
       *
       * @type {string}
       */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Open the Web GUI after startup
       *
       * @type {boolean}
       */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * SMTP host for outgoing emails
       *
       * @type {string}
       */
  var outgoingHost: js.UndefOr[java.lang.String] = js.undefined
  /**
       * SMTP password for outgoing emails
       *
       * @type {string}
       */
  var outgoingPass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * SMTP port for outgoing emails.
       *
       * @type {number}
       */
  var outgoingPort: js.UndefOr[scala.Double] = js.undefined
  /**
       * Use SMTP SSL for outgoing emails
       *
       * @type {boolean}
       */
  var outgoingSecure: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * SMTP user for outgoing emails
       *
       * @type {string}
       */
  var outgoingUser: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Do not output console.log messages
       *
       * @type {boolean}
       */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * SMTP port to catch emails.
       *
       * @type {number}
       */
  var smtp: js.UndefOr[scala.Double] = js.undefined
  /**
       * Port to use for web UI
       *
       * @type {number}
       */
  var web: js.UndefOr[scala.Double] = js.undefined
  /**
       * IP Address to bind HTTP service to
       *
       * @type {string}
       */
  var webIp: js.UndefOr[java.lang.String] = js.undefined
  /**
       * HTTP password for GUI
       *
       * @type {string}
       */
  var webPass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * HTTP user for GUI
       *
       * @type {string}
       */
  var webUser: js.UndefOr[java.lang.String] = js.undefined
}

