package typings.irc.ircMod

import typings.node.tlsMod.SecureContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOpts extends js.Object {
  /**
    * Should we auto-reconnect to networks?
    * @default true
    */
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  /**
    * Should we auto-rejoin channels?
    * @default false
    */
  var autoRejoin: js.UndefOr[Boolean] = js.undefined
  /**
    * Should we accept expired certificates?
    * @default false
    */
  var certExpired: js.UndefOr[Boolean] = js.undefined
  /**
    * Channel prefix
    * @default '&#'
    */
  var channelPrefixes: js.UndefOr[String] = js.undefined
  /**
    * Channels to join
    * @default []
    */
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Should we output debug messages to STDOUT?
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Encoding to use. See
    * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * Should we queue our messages to ensure we don't get kicked?
    * @default false
    */
  var floodProtection: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay between messages when flood protection is active
    * @default 1000
    */
  var floodProtectionDelay: js.UndefOr[Double] = js.undefined
  /**
    * Local interface to bind to for network connections. See
    * https://nodejs.org/api/net.html#net_socket_localaddress
    */
  var localAddress: js.UndefOr[String] = js.undefined
  /**
    * Characters to split a message at.
    * @default 512
    */
  var messageSplit: js.UndefOr[Double] = js.undefined
  /**
    * IRC username
    * @default ''
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * IRC connection port. See
    * https://nodejs.org/api/net.html#net_socket_remoteport
    * @default 6667
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * IRC "real name"
    * @default 'nodeJS IRC client'
    */
  var realName: js.UndefOr[String] = js.undefined
  /**
    * Should we use SASL authentication?
    * @default false
    */
  var sasl: js.UndefOr[Boolean] = js.undefined
  /**
    * Should SSL be used? Can either be true or crypto credentials.
    * @default false
    */
  var secure: js.UndefOr[Boolean | SecureContext] = js.undefined
  /**
    * Should we accept self-signed certificates?
    * @default false
    */
  var selfSigned: js.UndefOr[Boolean] = js.undefined
  /**
    * Should we output IRC errors?
    * @default false
    */
  var showErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Should we strip mIRC colors from the output messages?
    * @default false
    */
  var stripColors: js.UndefOr[Boolean] = js.undefined
  /**
    * IRC username
    * @default 'nodebot'
    */
  var userName: js.UndefOr[String] = js.undefined
}

object IClientOpts {
  @scala.inline
  def apply(
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    autoRejoin: js.UndefOr[Boolean] = js.undefined,
    certExpired: js.UndefOr[Boolean] = js.undefined,
    channelPrefixes: String = null,
    channels: js.Array[String] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    floodProtection: js.UndefOr[Boolean] = js.undefined,
    floodProtectionDelay: Int | Double = null,
    localAddress: String = null,
    messageSplit: Int | Double = null,
    password: String = null,
    port: Int | Double = null,
    realName: String = null,
    sasl: js.UndefOr[Boolean] = js.undefined,
    secure: Boolean | SecureContext = null,
    selfSigned: js.UndefOr[Boolean] = js.undefined,
    showErrors: js.UndefOr[Boolean] = js.undefined,
    stripColors: js.UndefOr[Boolean] = js.undefined,
    userName: String = null
  ): IClientOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.asInstanceOf[js.Any])
    if (!js.isUndefined(autoRejoin)) __obj.updateDynamic("autoRejoin")(autoRejoin.asInstanceOf[js.Any])
    if (!js.isUndefined(certExpired)) __obj.updateDynamic("certExpired")(certExpired.asInstanceOf[js.Any])
    if (channelPrefixes != null) __obj.updateDynamic("channelPrefixes")(channelPrefixes.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(floodProtection)) __obj.updateDynamic("floodProtection")(floodProtection.asInstanceOf[js.Any])
    if (floodProtectionDelay != null) __obj.updateDynamic("floodProtectionDelay")(floodProtectionDelay.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (messageSplit != null) __obj.updateDynamic("messageSplit")(messageSplit.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (realName != null) __obj.updateDynamic("realName")(realName.asInstanceOf[js.Any])
    if (!js.isUndefined(sasl)) __obj.updateDynamic("sasl")(sasl.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(selfSigned)) __obj.updateDynamic("selfSigned")(selfSigned.asInstanceOf[js.Any])
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(stripColors)) __obj.updateDynamic("stripColors")(stripColors.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientOpts]
  }
}

