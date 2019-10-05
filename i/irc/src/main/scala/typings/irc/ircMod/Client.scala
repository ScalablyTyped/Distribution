package typings.irc.ircMod

import org.scalablytyped.runtime.StringDictionary
import typings.irc.Anon_Channel
import typings.irc.Anon_Created
import typings.irc.ircMod.handlers.IJoinChannel
import typings.irc.ircMod.handlers.IPartChannel
import typings.irc.ircMod.handlers.IRaw
import typings.irc.ircMod.handlers.IWhois
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("irc", "Client")
@js.native
class Client protected () extends EventEmitter {
  /**
    * Connect to an IRC server
    * @param server - server hostname
    * @param nick - nickname
    * @param opts
    */
  def this(server: String, nick: String) = this()
  def this(server: String, nick: String, opts: IClientOpts) = this()
  /** Channel listing data. */
  var channellist: js.Array[IChannel] = js.native
  /**
    * Channels joined. Includes channel modes, user list, and topic
    * information. Only updated after the server recognizes the join.
    */
  var chans: StringDictionary[Anon_Created] = js.native
  /**
    * Socket to the server. Rarely, if ever needed. Use Client#send
    * instead.
    */
  var conn: Socket = js.native
  /** Host mask */
  var hostMask: String = js.native
  /** Maximum line length */
  var maxLineLength: Double = js.native
  /** IRC server MOTD */
  var motd: String = js.native
  /**
    * The current nick of the client. Updated if the nick changes
    */
  var nick: String = js.native
  /** Bot options */
  var opt: IClientOpts = js.native
  /** Features supported by the server */
  var supported: Anon_Channel = js.native
  /**
    * Send an action to the specified target
    * @param target - target
    * @param message - message
    */
  def action(target: String, message: String): Unit = js.native
  /**
    * Activate flood protection “after the fact”. You can also use
    * floodProtection while instantiating the Client to enable flood
    * protection, and floodProtectionDelay to set the default message
    * interval.
    * @param interval - ms to wait between messages
    */
  def activateFloodProtection(interval: Double): Unit = js.native
  /**
    * Connect to the server. Use when `autoConnect` is false.
    * @param retryCount - times to retry
    * @param callback
    */
  def connect(): Unit = js.native
  def connect(retryCount: Double): Unit = js.native
  def connect(retryCount: Double, callback: IRaw): Unit = js.native
  def connect(retryCount: IRaw): Unit = js.native
  def connect(retryCount: IRaw, callback: IRaw): Unit = js.native
  /**
    * Send a CTCP message to the specified target
    * @param target - nick or channel
    * @param type - "privmsg" for PRIVMSG, anything else for NOTICE
    * @param text - CTCP message
    */
  def ctcp(target: String, `type`: String, text: String): Unit = js.native
  /**
    * Disconnect from the IRC server
    * @param message - message to send
    * @param callback
    */
  def disconnect(message: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Join the specified channel
    * @param channel - channel to join
    * @param callback
    */
  def join(channel: String): Unit = js.native
  def join(channel: String, callback: IJoinChannel): Unit = js.native
  /**
    * Request a channel listing from the server. The arguments for this
    * are farily server specific, this method passes them as specified.
    *
    * Responses from the server are available via `channellist_start`,
    * `channellist_item`, and `channellist` events.
    *
    * @param args - arguments
    */
  def list(args: String*): Unit = js.native
  /**
    * Send a notice to the specified target.
    * @param target - nick or channel
    * @param message - message to send
    */
  def notice(target: String, message: String): Unit = js.native
  /**
    * Part the specified channel
    * @param channel - channel to part
    * @param message - optional message to send
    * @param callback
    */
  def part(channel: String, message: String, callback: IPartChannel): Unit = js.native
  /**
    * Send a message to the specified target
    * @param target - nick or channel
    * @param message - message to send
    */
  def say(target: String, message: String): Unit = js.native
  /**
    * Send a raw message to the server; generally speaking, it’s best
    * not to use this method unless you know what you’re doing.
    * @param command - irc command
    * @param args - command arguments (splat)
    */
  def send(command: String, args: String*): Unit = js.native
  /**
    * Request a whois for the specified nick
    * @param nick - nickname
    * @param callback
    */
  def whois(nick: String, callback: IWhois): Unit = js.native
}

