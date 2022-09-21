package typings.intlifyShared

import typings.intlifyShared.intlifySharedStrings.Asterisk
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@intlify/shared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def assign[T_1, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def assign[T_2, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def createEmitter[Events /* <: Record[EventType, Any] */](): Emittable[Events] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmitter")().asInstanceOf[Emittable[Events]]
  
  inline def escapeHtml(rawText: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(rawText.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(
    message: String,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(message.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def friendlyJSONstringify(json: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("friendlyJSONstringify")(json.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateCodeFrame(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateCodeFrame(source: String, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(source.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateFormatCacheKey(locale: String, key: String, source: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateFormatCacheKey")(locale.asInstanceOf[js.Any], key.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getGlobalThis(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalThis")().asInstanceOf[Any]
  
  inline def hasOwn(obj: js.Array[Any], key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwn(obj: js.Object, key: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwn")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@intlify/shared", "inBrowser")
  @js.native
  val inBrowser: Boolean = js.native
  
  inline def isArray(arg: Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  inline def isBoolean(`val`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(`val`: Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isEmptyObject(`val`: Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isFunction(`val`: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNumber(`val`: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(`val`: Any): /* is std.Record<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<any, any> */ Boolean]
  
  inline def isPlainObject(`val`: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isPromise[T](`val`: Any): /* is std.Promise<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.Promise<T> */ Boolean]
  
  inline def isRegExp(`val`: Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(`val`: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSymbol(`val`: Any): /* is symbol */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSymbol")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is symbol */ Boolean]
  
  inline def makeSymbol(name: String): js.Symbol | String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbol")(name.asInstanceOf[js.Any]).asInstanceOf[js.Symbol | String]
  
  @JSImport("@intlify/shared", "mark")
  @js.native
  def mark: js.Function1[/* tag */ String, js.UndefOr[Unit]] = js.native
  inline def mark_=(x: js.Function1[/* tag */ String, js.UndefOr[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mark")(x.asInstanceOf[js.Any])
  
  @JSImport("@intlify/shared", "measure")
  @js.native
  def measure: js.Function3[/* name */ String, /* startTag */ String, /* endTag */ String, js.UndefOr[Unit]] = js.native
  inline def measure_=(x: js.Function3[/* name */ String, /* startTag */ String, /* endTag */ String, js.UndefOr[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("measure")(x.asInstanceOf[js.Any])
  
  inline def objectToString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("objectToString")().asInstanceOf[String]
  
  inline def toDisplayString(`val`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toDisplayString")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toTypeString(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toTypeString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def warn(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def warn(msg: String, err: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("warn")(msg.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Emittable[Events /* <: Record[EventType, Any] */] extends StObject {
    
    /**
      * Invoke all handlers with the event type
      *
      * @remarks
      * Note Manually firing "*" handlers should be not supported
      *
      * @param event - An {@link EventType}
      * @param payload - An event payload, optional
      */
    def emit[Key /* <: /* keyof Events */ String */](event: Key): Unit = js.native
    def emit[Key /* <: /* keyof Events */ String */](
      event: Key,
      payload: /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
    ): Unit = js.native
    
    /**
      * A map of event names of registered event handlers
      */
    var events: EventHandlerMap[Events] = js.native
    
    /**
      * Unregister an event handler for the event type
      *
      * @param event - An {@link EventType}
      * @param handler - An {@link EventHandler}, or a {@link WildcardEventHandler} if you are specified "*"
      */
    def off[Key /* <: /* keyof Events */ String */](
      event: Key,
      handler: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
        ]
    ): Unit = js.native
    def off[Key /* <: /* keyof Events */ String */](event: Key, handler: WildcardEventHandler[Events]): Unit = js.native
    def off[Key /* <: /* keyof Events */ String */](
      event: Asterisk,
      handler: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
        ]
    ): Unit = js.native
    def off[Key /* <: /* keyof Events */ String */](event: Asterisk, handler: WildcardEventHandler[Events]): Unit = js.native
    
    /**
      * Register an event handler with the event type
      *
      * @param event - An {@link EventType}
      * @param handler - An {@link EventHandler}, or a {@link WildcardEventHandler} if you are specified "*"
      */
    def on[Key /* <: /* keyof Events */ String */](
      event: Key,
      handler: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
        ]
    ): Unit = js.native
    def on[Key /* <: /* keyof Events */ String */](event: Key, handler: WildcardEventHandler[Events]): Unit = js.native
    def on[Key /* <: /* keyof Events */ String */](
      event: Asterisk,
      handler: EventHandler[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
        ]
    ): Unit = js.native
    def on[Key /* <: /* keyof Events */ String */](event: Asterisk, handler: WildcardEventHandler[Events]): Unit = js.native
  }
  
  type EventHandler[T] = js.Function1[/* payload */ js.UndefOr[T], Unit]
  
  type EventHandlerList[T] = js.Array[EventHandler[T]]
  
  type EventHandlerMap[Events /* <: Record[EventType, Any] */] = Map[
    (/* keyof Events */ String) | Asterisk, 
    (EventHandlerList[
      /* import warning: importer.ImportType#apply Failed type conversion: Events[keyof Events] */ js.Any
    ]) | WildcardEventHandlerList[Events]
  ]
  
  type EventType = String | js.Symbol
  
  type WildcardEventHandler[T] = js.Function2[
    /* keyof T */ /* event */ String, 
    /* payload */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    Unit
  ]
  
  type WildcardEventHandlerList[T] = js.Array[WildcardEventHandler[T]]
}
