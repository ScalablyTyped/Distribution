package typings
package ircLib.ircMod.NodeIRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientOpts extends js.Object {
  /**
    * Should we auto-reconnect to networks?
    * @default true
    */
  var autoConnect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should we auto-rejoin channels?
    * @default false
    */
  var autoRejoin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should we accept expired certificates?
    * @default false
    */
  var certExpired: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Channel prefix
    * @default '&#'
    */
  var channelPrefixes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Channels to join
    * @default []
    */
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Should we output debug messages to STDOUT?
    * @default false
    */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Encoding to use. See
    * https://nodejs.org/api/stream.html#stream_readable_setencoding_encoding
    * @default 'utf-8'
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should we queue our messages to ensure we don't get kicked?
    * @default false
    */
  var floodProtection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delay between messages when flood protection is active
    * @default 1000
    */
  var floodProtectionDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Local interface to bind to for network connections. See
    * https://nodejs.org/api/net.html#net_socket_localaddress
    */
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Characters to split a message at.
    * @default 512
    */
  var messageSplit: js.UndefOr[scala.Double] = js.undefined
  /**
    * IRC username
    * @default ''
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * IRC connection port. See
    * https://nodejs.org/api/net.html#net_socket_remoteport
    * @default 6667
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * IRC "real name"
    * @default 'nodeJS IRC client'
    */
  var realName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Should we use SASL authentication?
    * @default false
    */
  var sasl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should SSL be used? Can either be true or crypto credentials.
    * @default false
    */
  var secure: js.UndefOr[scala.Boolean | nodeLib.tlsMod.SecureContext] = js.undefined
  /**
    * Should we accept self-signed certificates?
    * @default false
    */
  var selfSigned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should we output IRC errors?
    * @default false
    */
  var showErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Should we strip mIRC colors from the output messages?
    * @default false
    */
  var stripColors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * IRC username
    * @default 'nodebot'
    */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object IClientOpts {
  @scala.inline
  def apply(
    autoConnect: js.UndefOr[scala.Boolean] = js.undefined,
    autoRejoin: js.UndefOr[scala.Boolean] = js.undefined,
    certExpired: js.UndefOr[scala.Boolean] = js.undefined,
    channelPrefixes: java.lang.String = null,
    channels: js.Array[java.lang.String] = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    floodProtection: js.UndefOr[scala.Boolean] = js.undefined,
    floodProtectionDelay: scala.Int | scala.Double = null,
    localAddress: java.lang.String = null,
    messageSplit: scala.Int | scala.Double = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    realName: java.lang.String = null,
    sasl: js.UndefOr[scala.Boolean] = js.undefined,
    secure: scala.Boolean | nodeLib.tlsMod.SecureContext = null,
    selfSigned: js.UndefOr[scala.Boolean] = js.undefined,
    showErrors: js.UndefOr[scala.Boolean] = js.undefined,
    stripColors: js.UndefOr[scala.Boolean] = js.undefined,
    userName: java.lang.String = null
  ): IClientOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect)
    if (!js.isUndefined(autoRejoin)) __obj.updateDynamic("autoRejoin")(autoRejoin)
    if (!js.isUndefined(certExpired)) __obj.updateDynamic("certExpired")(certExpired)
    if (channelPrefixes != null) __obj.updateDynamic("channelPrefixes")(channelPrefixes)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (!js.isUndefined(floodProtection)) __obj.updateDynamic("floodProtection")(floodProtection)
    if (floodProtectionDelay != null) __obj.updateDynamic("floodProtectionDelay")(floodProtectionDelay.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (messageSplit != null) __obj.updateDynamic("messageSplit")(messageSplit.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (realName != null) __obj.updateDynamic("realName")(realName)
    if (!js.isUndefined(sasl)) __obj.updateDynamic("sasl")(sasl)
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(selfSigned)) __obj.updateDynamic("selfSigned")(selfSigned)
    if (!js.isUndefined(showErrors)) __obj.updateDynamic("showErrors")(showErrors)
    if (!js.isUndefined(stripColors)) __obj.updateDynamic("stripColors")(stripColors)
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[IClientOpts]
  }
}

