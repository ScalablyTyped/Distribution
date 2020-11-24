package typings.graygelf.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graygelf.anon.A
import typings.graygelf.anon.Dictkey
import typings.graygelf.graygelfNumbers.`0`
import typings.graygelf.graygelfNumbers.`1`
import typings.graygelf.graygelfNumbers.`2`
import typings.graygelf.graygelfNumbers.`3`
import typings.graygelf.graygelfNumbers.`4`
import typings.graygelf.graygelfNumbers.`5`
import typings.graygelf.graygelfNumbers.`6`
import typings.graygelf.graygelfNumbers.`7`
import typings.graygelf.graygelfStrings.deflate
import typings.graygelf.graygelfStrings.error
import typings.graygelf.graygelfStrings.gzip
import typings.graygelf.graygelfStrings.message
import typings.node.dgramMod.Socket
import typings.std.Error
import typings.std.Uint8Array
import typings.through.mod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: (short_message : string | std.Error, args : ...string): graygelf.graygelf.GelfMessage} & {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: {a (short_message : string | std.Error, full_message : string | undefined, customFields : graygelf.graygelf.GelfMessage | undefined): graygelf.graygelf.GelfMessage}} & {raw (fields : graygelf.graygelf.GelfMessage): graygelf.graygelf.GelfMessage, stream (name : string): through.through.ThroughStream, write (msg : string | std.Uint8Array): void, _prepGelf (level : 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7, short : string, long : string | undefined, fields : {[key: string] : string} | undefined): graygelf.graygelf.GelfMessage, _send (gelfMessage : graygelf.graygelf.GelfMessage): void,   on :graygelf.graygelf.EventListener,   once :graygelf.graygelf.EventListener,   fields :{  facility :string | undefined, [key: string] : string | undefined},   graylogHost :string,   graylogPort :string,   compressType :'deflate' | 'gzip',   chunkSize :number,   alwaysCompress :boolean,   _udp :node.dgram.Socket | undefined} */
@js.native
trait Instance extends js.Object {
  
  /**
    * Build a Gelf Message
    */
  @JSName("_prepGelf")
  def _prepGelf_0(level: `0`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_0(level: `0`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_0(level: `0`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_0(level: `0`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_1(level: `1`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_1(level: `1`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_1(level: `1`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_1(level: `1`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_2(level: `2`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_2(level: `2`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_2(level: `2`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_2(level: `2`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_3(level: `3`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_3(level: `3`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_3(level: `3`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_3(level: `3`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_4(level: `4`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_4(level: `4`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_4(level: `4`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_4(level: `4`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_5(level: `5`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_5(level: `5`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_5(level: `5`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_5(level: `5`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_6(level: `6`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_6(level: `6`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_6(level: `6`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_6(level: `6`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_7(level: `7`, short: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_7(level: `7`, short: String, long: js.UndefOr[scala.Nothing], fields: StringDictionary[String]): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_7(level: `7`, short: String, long: String): GelfMessage = js.native
  @JSName("_prepGelf")
  def _prepGelf_7(level: `7`, short: String, long: String, fields: StringDictionary[String]): GelfMessage = js.native
  
  /**
    * send a gelf message
    */
  def _send(gelfMessage: GelfMessage): Unit = js.native
  
  /**
    * udp socket (not setted if mock is true)
    */
  var _udp: js.UndefOr[Socket] = js.native
  
  def alert(short_message: String, args: String*): GelfMessage = js.native
  def alert(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("alert")
  var alert_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  /**
    * Should always compress
    *
    * @default false
    */
  var alwaysCompress: Boolean = js.native
  
  /**
    * Chunk size
    *
    * @default 1240
    */
  var chunkSize: Double = js.native
  
  /**
    * Compress type
    *
    * @default "deflate"
    */
  var compressType: deflate | gzip = js.native
  
  def crit(short_message: String, args: String*): GelfMessage = js.native
  def crit(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("crit")
  var crit_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def debug(short_message: String, args: String*): GelfMessage = js.native
  def debug(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("debug")
  var debug_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def emerg(short_message: String, args: String*): GelfMessage = js.native
  def emerg(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("emerg")
  var emerg_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def err(short_message: String, args: String*): GelfMessage = js.native
  def err(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("err")
  var err_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def error(short_message: String, args: String*): GelfMessage = js.native
  def error(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("error")
  var error_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  /**
    * Setup global custom fields to be passed with every message
    */
  var fields: Dictkey = js.native
  
  /**
    * Endpoint setted
    *
    * @default "localhost"
    */
  var graylogHost: String = js.native
  
  /**
    * Port setted
    *
    * @default "12201"
    */
  var graylogPort: String = js.native
  
  def info(short_message: String, args: String*): GelfMessage = js.native
  def info(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("info")
  var info_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def notice(short_message: String, args: String*): GelfMessage = js.native
  def notice(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("notice")
  var notice_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  @JSName("on")
  var on_Original: EventListener = js.native
  /**
    * Set a listener to error event
    *
    * @param event listen error event
    * @param cb callback function that receives error messsage
    */
  @JSName("on")
  def on_error(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
  /**
    * Set a listener to message event
    *
    * @param event listen message event
    * @param cb callback function that receives message
    */
  @JSName("on")
  def on_message(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
  
  @JSName("once")
  var once_Original: EventListener = js.native
  /**
    * Set a listener to error event
    *
    * @param event listen error event
    * @param cb callback function that receives error messsage
    */
  @JSName("once")
  def once_error(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
  /**
    * Set a listener to message event
    *
    * @param event listen message event
    * @param cb callback function that receives message
    */
  @JSName("once")
  def once_message(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
  
  def panic(short_message: String, args: String*): GelfMessage = js.native
  def panic(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("panic")
  var panic_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  /**
    * Send a complete custom GELF message.
    *
    * Version, host, and timestamp will be supplied if missing.
    * @returns May some custom fields return started by '_', like graygelfMessage._facility
    */
  def raw(fields: GelfMessage): GelfMessage = js.native
  
  /**
    * I don't really know
    */
  def stream(name: String): ThroughStream = js.native
  
  def warn(short_message: String, args: String*): GelfMessage = js.native
  def warn(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("warn")
  var warn_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  def warning(short_message: String, args: String*): GelfMessage = js.native
  def warning(short_message: Error, args: String*): GelfMessage = js.native
  @JSName("warning")
  var warning_Original: (js.Function2[/* short_message */ String | Error, /* repeated */ String, GelfMessage]) with A = js.native
  
  /**
    * send udp message
    */
  def write(msg: String): Unit = js.native
  def write(msg: Uint8Array): Unit = js.native
}
