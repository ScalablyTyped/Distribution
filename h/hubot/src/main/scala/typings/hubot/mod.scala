package typings.hubot

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Express
import typings.expressServeStaticCore.mod.Application
import typings.hubot.anon.Listener
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeNetMod.Socket
import typings.node.timersMod.global.NodeJS.Timeout
import typings.scopedHttpClient.mod.Options
import typings.scopedHttpClient.mod.ScopedClient
import typings.std.Error
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hubot", "Adapter")
  @js.native
  open class Adapter protected () extends EventEmitter {
    def this(robot: Robot[Adapter]) = this()
    
    def close(): Unit = js.native
    
    def emote(envelope: Envelope, strings: String*): Unit = js.native
    
    def http(url: String): ScopedClient = js.native
    
    def play(envelope: Envelope, strings: String*): Unit = js.native
    
    def receive(message: Message): Unit = js.native
    
    def reply(envelope: Envelope, strings: String*): Unit = js.native
    
    def run(): Unit = js.native
    
    def send(envelope: Envelope, strings: String*): Unit = js.native
    
    def topic(envelope: Envelope, strings: String*): Unit = js.native
    
    def userForId(id: String): User = js.native
    def userForId(id: String, options: js.Object): User = js.native
    
    def userForName(name: String): User | Null = js.native
    
    def users(): js.Array[User] = js.native
    
    def usersForFuzzyName(fuzzyName: String): js.Array[User] = js.native
    
    def usersForRawFuzzyName(fuzzyName: String): js.Array[User] = js.native
  }
  
  @JSImport("hubot", "Brain")
  @js.native
  open class Brain[A /* <: Adapter */] protected () extends EventEmitter {
    def this(robot: Robot[A]) = this()
    
    def close(): Unit = js.native
    
    def get(key: String): Any = js.native
    
    def mergeData(data: js.Object): Unit = js.native
    
    def remove(key: String): this.type = js.native
    
    def resetSaveInterval(seconds: Double): Unit = js.native
    
    def save(): Unit = js.native
    
    def set(key: String, value: Any): this.type = js.native
    
    def setAutoSave(enabled: Boolean): Unit = js.native
    
    def userForId(id: String): User = js.native
    def userForId(id: String, options: js.Object): User = js.native
    
    def userForName(name: String): User | Null = js.native
    
    def users(): js.Array[User] = js.native
    
    def usersForFuzzyName(fuzzyName: String): js.Array[User] = js.native
    
    def usersForRawFuzzyName(fuzzyName: String): js.Array[User] = js.native
  }
  
  @JSImport("hubot", "CatchAllMessage")
  @js.native
  open class CatchAllMessage protected () extends Message {
    def this(message: Message) = this()
    
    var message: Message = js.native
  }
  
  @JSImport("hubot", "DataStore")
  @js.native
  open class DataStore protected () extends StObject {
    def this(robot: Robot[Adapter]) = this()
    
    def get(key: String): js.Promise[Any] = js.native
    
    def getObject(key: String, objectKey: String): js.Promise[Any] = js.native
    
    def set(key: String, value: Any): js.Promise[Unit] = js.native
    
    def setArray(key: String, value: Any): js.Promise[Unit] = js.native
    
    def setObject(key: String, objectKey: String, value: Any): js.Promise[Unit] = js.native
  }
  
  @JSImport("hubot", "DataStoreUnavailable")
  @js.native
  open class DataStoreUnavailable ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("hubot", "EnterMessage")
  @js.native
  open class EnterMessage protected () extends Message {
    def this(user: User) = this()
    def this(user: User, done: Boolean) = this()
    
    @JSName("text")
    var text_EnterMessage: Null = js.native
  }
  
  @JSImport("hubot", "LeaveMessage")
  @js.native
  open class LeaveMessage protected () extends Message {
    def this(user: User) = this()
    def this(user: User, done: Boolean) = this()
    
    @JSName("text")
    var text_LeaveMessage: Null = js.native
  }
  
  @JSImport("hubot", "Message")
  @js.native
  open class Message protected () extends StObject {
    def this(user: User) = this()
    def this(user: User, done: Boolean) = this()
    
    def finish(): Unit = js.native
    
    var id: String = js.native
    
    var room: String = js.native
    
    var text: String | Null = js.native
    
    var user: User = js.native
  }
  
  @JSImport("hubot", "Middleware")
  @js.native
  open class Middleware[T /* <: Adapter */] protected () extends StObject {
    def this(robot: Robot[T]) = this()
    
    def execute(context: MiddlewareContext[T], next: NextFunction, done: DoneFunction): Unit = js.native
    
    def register(middleware: MiddlewareHandler[T]): Unit = js.native
    
    var stack: js.Array[MiddlewareHandler[T]] = js.native
  }
  
  @JSImport("hubot", "Response")
  @js.native
  open class Response[A /* <: Adapter */, M /* <: Message */] protected () extends StObject {
    def this(robot: Robot[A], message: Message, `match`: RegExpMatchArray) = this()
    
    def emote(strings: String*): Unit = js.native
    
    var envelope: Envelope = js.native
    
    def finish(): Unit = js.native
    
    def http(url: String): ScopedClient = js.native
    def http(url: String, options: Options): ScopedClient = js.native
    
    def locked(strings: String*): Unit = js.native
    
    var `match`: RegExpMatchArray = js.native
    
    var message: Message = js.native
    
    def play(strings: String*): Unit = js.native
    
    def random[T](items: js.Array[T]): T = js.native
    
    def reply(strings: String*): Unit = js.native
    
    def send(strings: String*): Unit = js.native
    
    def topic(strings: String*): Unit = js.native
  }
  
  @JSImport("hubot", "Robot")
  @js.native
  open class Robot[A /* <: Adapter */] protected () extends StObject {
    def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
    def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
    
    val adapter: A = js.native
    
    val adapterName: String = js.native
    
    val adapterPath: String = js.native
    
    val alias: String = js.native
    
    val brain: Brain[A] = js.native
    
    def catchAll(callback: ListenerCallback[A, CatchAllMessage]): Unit = js.native
    def catchAll(options: js.Object, callback: ListenerCallback[A, CatchAllMessage]): Unit = js.native
    
    val commands: js.Array[Any] = js.native
    
    val datastore: Null | DataStore = js.native
    
    def emit(event: String, args: Any*): Unit = js.native
    def emit(event: js.Symbol, args: Any*): Unit = js.native
    
    def enter(callback: ListenerCallback[A, EnterMessage]): Unit = js.native
    def enter(options: js.Object, callback: ListenerCallback[A, EnterMessage]): Unit = js.native
    
    def error(cb: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    val errorHandlers: js.Array[Any] = js.native
    
    val events: EventEmitter = js.native
    
    val globalHttpOptions: Options = js.native
    
    def hear(regex: js.RegExp, callback: ListenerCallback[A, TextMessage]): Unit = js.native
    def hear(regex: js.RegExp, options: js.Object, callback: ListenerCallback[A, TextMessage]): Unit = js.native
    
    def helpCommands(): js.Array[String] = js.native
    
    def http(url: String): ScopedClient = js.native
    def http(url: String, options: Options): ScopedClient = js.native
    
    def leave(callback: ListenerCallback[A, LeaveMessage]): Unit = js.native
    def leave(options: js.Object, callback: ListenerCallback[A, LeaveMessage]): Unit = js.native
    
    def listen(matcher: js.Function1[/* message */ Message, Boolean], callback: ListenerCallback[A, Message]): Unit = js.native
    def listen(
      matcher: js.Function1[/* message */ Message, Boolean],
      options: js.Object,
      callback: ListenerCallback[A, Message]
    ): Unit = js.native
    
    def listenerMiddleware(middleware: MiddlewareHandler[A]): Unit = js.native
    
    def loadExternalScripts(packages: js.Array[String]): Unit = js.native
    
    def loadFile(directory: String, fileName: String): Unit = js.native
    
    def loadHubotScripts(path: String, scripts: js.Array[String]): Unit = js.native
    
    def logger(messages: Any*): Unit = js.native
    @JSName("logger")
    val logger_Original: Log = js.native
    
    def messageRoom(room: String, strings: String*): Unit = js.native
    
    val middleware: Listener[A] = js.native
    
    val name: String = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    def onUncaughtException(err: js.Error): Unit = js.native
    
    val pingIntervalId: Null | Timeout = js.native
    
    def receive(message: Message): Unit = js.native
    def receive(message: Message, cb: js.Function0[Unit]): Unit = js.native
    
    def receiveMiddleware(middleware: MiddlewareHandler[A]): Unit = js.native
    
    def reply(envelope: Envelope, strings: String*): Unit = js.native
    
    def respond(regex: js.RegExp, callback: ListenerCallback[A, TextMessage]): Unit = js.native
    def respond(regex: js.RegExp, options: js.Object, callback: ListenerCallback[A, TextMessage]): Unit = js.native
    
    def respondPattern(regex: js.RegExp): js.RegExp = js.native
    
    def responseMiddleware(middleware: MiddlewareHandler[A]): Unit = js.native
    
    def router(): Application = js.native
    @JSName("router")
    val router_Original: Express = js.native
    
    def run(): Unit = js.native
    
    def send(envelope: Envelope, strings: String*): Unit = js.native
    
    val server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.native
    
    def shutdown(): Unit = js.native
    
    def topic(callback: ListenerCallback[A, TopicMessage]): Unit = js.native
    def topic(options: js.Object, callback: ListenerCallback[A, TopicMessage]): Unit = js.native
    
    val version: String = js.native
  }
  
  @JSImport("hubot", "TextMessage")
  @js.native
  open class TextMessage protected () extends Message {
    def this(user: User, text: String, id: String) = this()
    
    def `match`(regex: js.RegExp): RegExpMatchArray = js.native
    
    @JSName("text")
    var text_TextMessage: String = js.native
  }
  
  @JSImport("hubot", "TopicMessage")
  @js.native
  open class TopicMessage protected () extends TextMessage {
    def this(user: User, text: String, id: String) = this()
  }
  
  @JSImport("hubot", "User")
  @js.native
  open class User protected ()
    extends StObject
       with /* key */ StringDictionary[Any] {
    def this(id: String) = this()
    def this(id: String, options: js.Object) = this()
    
    def get(key: String): Any = js.native
    
    var id: String = js.native
    
    var name: String = js.native
    
    def set(key: String, value: Any): this.type = js.native
  }
  
  type DoneFunction = js.Function0[Unit]
  
  trait Envelope extends StObject {
    
    var message: Message
    
    var room: String
    
    var user: User
  }
  object Envelope {
    
    inline def apply(message: Message, room: String, user: User): Envelope = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Envelope]
    }
    
    extension [Self <: Envelope](x: Self) {
      
      inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  type ListenerCallback[A /* <: Adapter */, M /* <: Message */] = js.Function1[/* response */ Response[A, M], Unit]
  
  @js.native
  trait Log extends StObject {
    
    def apply(messages: Any*): Unit = js.native
    
    def debug(messages: Any*): Unit = js.native
    @JSName("debug")
    var debug_Original: LogLevel = js.native
    
    def error(messages: Any*): Unit = js.native
    @JSName("error")
    var error_Original: LogLevel = js.native
    
    def get(namespace: String): Log = js.native
    
    def info(messages: Any*): Unit = js.native
    @JSName("info")
    var info_Original: LogLevel = js.native
    
    def notice(messages: Any*): Unit = js.native
    @JSName("notice")
    var notice_Original: LogLevel = js.native
    
    def warning(messages: Any*): Unit = js.native
    @JSName("warning")
    var warning_Original: LogLevel = js.native
  }
  
  @js.native
  trait LogLevel extends StObject {
    
    def apply(messages: Any*): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
  }
  
  trait MiddlewareContext[T /* <: Adapter */]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var response: js.UndefOr[Response[T, Message]] = js.undefined
  }
  object MiddlewareContext {
    
    inline def apply[T /* <: Adapter */](): MiddlewareContext[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MiddlewareContext[T]]
    }
    
    extension [Self <: MiddlewareContext[?], T /* <: Adapter */](x: Self & MiddlewareContext[T]) {
      
      inline def setResponse(value: Response[T, Message]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  type MiddlewareHandler[T /* <: Adapter */] = js.Function3[
    /* context */ MiddlewareContext[T], 
    /* next */ NextFunction, 
    /* done */ DoneFunction, 
    Unit
  ]
  
  type NextFunction = js.Function1[/* done */ DoneFunction, Unit]
}
