package typings.graygelf

import org.scalablytyped.runtime.StringDictionary
import typings.graygelf.anon.A
import typings.graygelf.anon.AlwaysCompress
import typings.graygelf.anon.Dictkey
import typings.graygelf.anon.Facility
import typings.graygelf.graygelfInts.`0`
import typings.graygelf.graygelfInts.`1240`
import typings.graygelf.graygelfInts.`1`
import typings.graygelf.graygelfInts.`2`
import typings.graygelf.graygelfInts.`3`
import typings.graygelf.graygelfInts.`4`
import typings.graygelf.graygelfInts.`5`
import typings.graygelf.graygelfInts.`6`
import typings.graygelf.graygelfInts.`7`
import typings.graygelf.graygelfInts.`8154`
import typings.graygelf.graygelfStrings.deflate
import typings.graygelf.graygelfStrings.error
import typings.graygelf.graygelfStrings.gzip
import typings.graygelf.graygelfStrings.message
import typings.node.dgramMod.Socket
import typings.std.Event
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a graygelf instance
    *
    * @param setup
    */
  inline def apply(): Instance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance]
  inline def apply(setup: setup): Instance = ^.asInstanceOf[js.Dynamic].apply(setup.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typings.graygelf.mod.graygelf {
    def this(setup: typings.graygelf.mod.setup) = this()
  }
  @JSImport("graygelf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Chunk size for local network
    */
  /* static member */
  @JSImport("graygelf", "CHUNK_LAN")
  @js.native
  def CHUNK_LAN: `8154` = js.native
  inline def CHUNK_LAN_=(x: `8154`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHUNK_LAN")(x.asInstanceOf[js.Any])
  
  /**
    * Chunk size for wide network
    */
  /* static member */
  @JSImport("graygelf", "CHUNK_WAN")
  @js.native
  def CHUNK_WAN: `1240` = js.native
  inline def CHUNK_WAN_=(x: `1240`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHUNK_WAN")(x.asInstanceOf[js.Any])
  
  /**
    * GELF log levels
    */
  /* static member */
  object LOG_LEVELS {
    
    @JSImport("graygelf", "LOG_LEVELS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("graygelf", "LOG_LEVELS.alert")
    @js.native
    def alert: `1` = js.native
    inline def alert_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.crit")
    @js.native
    def crit: `2` = js.native
    inline def crit_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crit")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.debug")
    @js.native
    def debug: `7` = js.native
    inline def debug_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.emerg")
    @js.native
    def emerg: `0` = js.native
    inline def emerg_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emerg")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.err")
    @js.native
    def err: `3` = js.native
    inline def err_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("err")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.error")
    @js.native
    def error: `3` = js.native
    inline def error_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.info")
    @js.native
    def info: `6` = js.native
    inline def info_=(x: `6`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.notice")
    @js.native
    def notice: `5` = js.native
    inline def notice_=(x: `5`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notice")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.panic")
    @js.native
    def panic: `0` = js.native
    inline def panic_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("panic")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.warn")
    @js.native
    def warn: `4` = js.native
    inline def warn_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
    
    @JSImport("graygelf", "LOG_LEVELS.warning")
    @js.native
    def warning: `4` = js.native
    inline def warning_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait EventListener extends StObject {
    
    /**
      * Set a listener to error event
      *
      * @param event listen error event
      * @param cb callback function that receives error messsage
      */
    def apply(event: error, cbErr: js.Function1[/* err */ String, Unit]): Unit = js.native
    /**
      * Set a listener to message event
      *
      * @param event listen message event
      * @param cb callback function that receives message
      */
    def apply(event: message, cb: js.Function1[/* message */ GelfMessage, Unit]): Unit = js.native
  }
  
  trait GelfMessage
    extends StObject
       with /**
    * any other personal property
    */
  /* key */ StringDictionary[js.UndefOr[String | Double]] {
    
    /**
      * log full message
      */
    var full_message: js.UndefOr[String | Double] = js.undefined
    
    /**
      * app host
      */
    var host: js.UndefOr[String | Double] = js.undefined
    
    /**
      * GELF level
      *
      *  emerg: 0; panic: 0;
      *  alert: 1;
      *  crit: 2;
      *  error: 3; err: 3;
      *  warn: 4; warning: 4;
      *  notice: 5;
      *  info: 6;
      *  debug: 7.
      */
    var level: js.UndefOr[
        `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typings.graygelf.graygelfStrings.`0` | typings.graygelf.graygelfStrings.`1` | typings.graygelf.graygelfStrings.`2` | typings.graygelf.graygelfStrings.`3` | typings.graygelf.graygelfStrings.`4` | typings.graygelf.graygelfStrings.`5` | typings.graygelf.graygelfStrings.`6` | typings.graygelf.graygelfStrings.`7`
      ] = js.undefined
    
    /**
      * log short message
      */
    var short_message: js.UndefOr[String | Double] = js.undefined
    
    /**
      * log timestamp
      */
    var timestamp: js.UndefOr[String | Double] = js.undefined
    
    /**
      * app version
      */
    var version: js.UndefOr[String | Double] = js.undefined
  }
  object GelfMessage {
    
    inline def apply(): GelfMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GelfMessage]
    }
    
    extension [Self <: GelfMessage](x: Self) {
      
      inline def setFull_message(value: String | Double): Self = StObject.set(x, "full_message", value.asInstanceOf[js.Any])
      
      inline def setFull_messageUndefined: Self = StObject.set(x, "full_message", js.undefined)
      
      inline def setHost(value: String | Double): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLevel(
        value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | typings.graygelf.graygelfStrings.`0` | typings.graygelf.graygelfStrings.`1` | typings.graygelf.graygelfStrings.`2` | typings.graygelf.graygelfStrings.`3` | typings.graygelf.graygelfStrings.`4` | typings.graygelf.graygelfStrings.`5` | typings.graygelf.graygelfStrings.`6` | typings.graygelf.graygelfStrings.`7`
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setShort_message(value: String | Double): Self = StObject.set(x, "short_message", value.asInstanceOf[js.Any])
      
      inline def setShort_messageUndefined: Self = StObject.set(x, "short_message", js.undefined)
      
      inline def setTimestamp(value: String | Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Inlined {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: (short_message : string | std.Error, args : ...string): graygelf.graygelf.GelfMessage} & {[ key in 'emerg' | 'panic' | 'alert' | 'crit' | 'error' | 'err' | 'warn' | 'warning' | 'notice' | 'info' | 'debug' ]: {a (short_message : string | std.Error, full_message : string | undefined, customFields : graygelf.graygelf.GelfMessage | undefined): graygelf.graygelf.GelfMessage}} & {raw (fields : graygelf.graygelf.GelfMessage): graygelf.graygelf.GelfMessage, stream (name : string): through.through.ThroughStream, write (msg : string | std.Uint8Array): void, _prepGelf (level : 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7, short : string, long : string | undefined, fields : {[key: string] : string} | undefined): graygelf.graygelf.GelfMessage, _send (gelfMessage : graygelf.graygelf.GelfMessage): void,   on :std.EventListener,   once :std.EventListener,   fields :{  facility :string | undefined, [key: string] : string | undefined},   graylogHost :string,   graylogPort :string,   compressType :'deflate' | 'gzip',   chunkSize :number,   alwaysCompress :boolean,   _udp :node.dgram.Socket | undefined} */
  @js.native
  trait Instance extends StObject {
    
    /**
      * Build a Gelf Message
      */
    def _prepGelf(level: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`, short: String): GelfMessage = js.native
    def _prepGelf(level: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`, short: String, long: String): GelfMessage = js.native
    def _prepGelf(
      level: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      short: String,
      long: String,
      fields: StringDictionary[String]
    ): GelfMessage = js.native
    def _prepGelf(
      level: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`,
      short: String,
      long: Unit,
      fields: StringDictionary[String]
    ): GelfMessage = js.native
    
    /**
      * send a gelf message
      */
    def _send(gelfMessage: GelfMessage): Unit = js.native
    
    /**
      * udp socket (not setted if mock is true)
      */
    var _udp: js.UndefOr[Socket] = js.native
    
    def alert(short_message: String, args: String*): GelfMessage = js.native
    def alert(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("alert")
    var alert_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
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
    def crit(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("crit")
    var crit_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def debug(short_message: String, args: String*): GelfMessage = js.native
    def debug(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("debug")
    var debug_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def emerg(short_message: String, args: String*): GelfMessage = js.native
    def emerg(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("emerg")
    var emerg_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def err(short_message: String, args: String*): GelfMessage = js.native
    def err(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("err")
    var err_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def error(short_message: String, args: String*): GelfMessage = js.native
    def error(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("error")
    var error_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
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
    def info(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("info")
    var info_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def notice(short_message: String, args: String*): GelfMessage = js.native
    def notice(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("notice")
    var notice_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def on(evt: Event): Unit = js.native
    @JSName("on")
    var on_Original: typings.std.EventListener = js.native
    
    def once(evt: Event): Unit = js.native
    @JSName("once")
    var once_Original: typings.std.EventListener = js.native
    
    def panic(short_message: String, args: String*): GelfMessage = js.native
    def panic(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("panic")
    var panic_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
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
    def warn(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("warn")
    var warn_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    def warning(short_message: String, args: String*): GelfMessage = js.native
    def warning(short_message: js.Error, args: String*): GelfMessage = js.native
    @JSName("warning")
    var warning_Original: (js.Function2[/* short_message */ String | js.Error, /* repeated */ String, GelfMessage]) & A = js.native
    
    /**
      * send udp message
      */
    def write(msg: String): Unit = js.native
    def write(msg: js.typedarray.Uint8Array): Unit = js.native
  }
  
  @js.native
  trait graygelf
    extends StObject
       with Instance {
    
    @JSName("fields")
    var fields_graygelf: Facility = js.native
    
    @JSName("on")
    var on_Original_graygelf: EventListener = js.native
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
    var once_Original_graygelf: EventListener = js.native
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
  }
  
  type setup = String | AlwaysCompress
}
