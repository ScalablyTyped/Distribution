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

