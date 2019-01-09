package typings
package ircLib.ircMod.NodeIRCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends nodeLib.eventsMod.EventEmitter {
  /** Channel listing data. */
  var channellist: js.Array[IChannel] = js.native
  /**
    * Channels joined. Includes channel modes, user list, and topic
    * information. Only updated after the server recognizes the join.
    */
  var chans: org.scalablytyped.runtime.StringDictionary[ircLib.Anon_Created] = js.native
  /**
    * Socket to the server. Rarely, if ever needed. Use Client#send
    * instead.
    */
  var conn: nodeLib.netMod.Socket = js.native
  /** Host mask */
  var hostMask: java.lang.String = js.native
  /** Maximum line length */
  var maxLineLength: scala.Double = js.native
  /** IRC server MOTD */
  var motd: java.lang.String = js.native
  /**
    * The current nick of the client. Updated if the nick changes
    */
  var nick: java.lang.String = js.native
  /** Bot options */
  var opt: IClientOpts = js.native
  /** Features supported by the server */
  var supported: ircLib.Anon_Channel = js.native
  /**
    * Send an action to the specified target
    * @param target - target
    * @param message - message
    */
  def action(target: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Activate flood protection “after the fact”. You can also use
    * floodProtection while instantiating the Client to enable flood
    * protection, and floodProtectionDelay to set the default message
    * interval.
    * @param interval - ms to wait between messages
    */
  def activateFloodProtection(interval: scala.Double): scala.Unit = js.native
  /**
    * Connect to the server. Use when `autoConnect` is false.
    * @param retryCount - times to retry
    * @param callback
    */
  def connect(): scala.Unit = js.native
  def connect(retryCount: ircLib.ircMod.NodeIRCNs.handlersNs.IRaw): scala.Unit = js.native
  def connect(
    retryCount: ircLib.ircMod.NodeIRCNs.handlersNs.IRaw,
    callback: ircLib.ircMod.NodeIRCNs.handlersNs.IRaw
  ): scala.Unit = js.native
  def connect(retryCount: scala.Double): scala.Unit = js.native
  def connect(retryCount: scala.Double, callback: ircLib.ircMod.NodeIRCNs.handlersNs.IRaw): scala.Unit = js.native
  /**
    * Send a CTCP message to the specified target
    * @param target - nick or channel
    * @param type - "privmsg" for PRIVMSG, anything else for NOTICE
    * @param text - CTCP message
    */
  def ctcp(target: java.lang.String, `type`: java.lang.String, text: java.lang.String): scala.Unit = js.native
  /**
    * Disconnect from the IRC server
    * @param message - message to send
    * @param callback
    */
  def disconnect(message: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Join the specified channel
    * @param channel - channel to join
    * @param callback
    */
  def join(channel: java.lang.String): scala.Unit = js.native
  def join(channel: java.lang.String, callback: ircLib.ircMod.NodeIRCNs.handlersNs.IJoinChannel): scala.Unit = js.native
  /**
    * Request a channel listing from the server. The arguments for this
    * are farily server specific, this method passes them as specified.
    *
    * Responses from the server are available via `channellist_start`,
    * `channellist_item`, and `channellist` events.
    *
    * @param args - arguments
    */
  def list(args: java.lang.String*): scala.Unit = js.native
  /**
    * Send a notice to the specified target.
    * @param target - nick or channel
    * @param message - message to send
    */
  def notice(target: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Part the specified channel
    * @param channel - channel to part
    * @param message - optional message to send
    * @param callback
    */
  def part(
    channel: java.lang.String,
    message: java.lang.String,
    callback: ircLib.ircMod.NodeIRCNs.handlersNs.IPartChannel
  ): scala.Unit = js.native
  /**
    * Send a message to the specified target
    * @param target - nick or channel
    * @param message - message to send
    */
  def say(target: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Send a raw message to the server; generally speaking, it’s best
    * not to use this method unless you know what you’re doing.
    * @param command - irc command
    * @param args - command arguments (splat)
    */
  def send(command: java.lang.String, args: java.lang.String*): scala.Unit = js.native
  /**
    * Request a whois for the specified nick
    * @param nick - nickname
    * @param callback
    */
  def whois(nick: java.lang.String, callback: ircLib.ircMod.NodeIRCNs.handlersNs.IWhois): scala.Unit = js.native
}

