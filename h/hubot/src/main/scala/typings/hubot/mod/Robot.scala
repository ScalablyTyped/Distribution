package typings.hubot.mod

import typings.express.mod.Express
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.hubot.anon.Listener
import typings.node.NodeJS.Timeout
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.qs.mod.ParsedQs
import typings.scopedHttpClient.mod.Options
import typings.scopedHttpClient.mod.ScopedClient
import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Robot")
@js.native
class Robot[A /* <: Adapter */] protected () extends js.Object {
  def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
  def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
  val adapter: A = js.native
  val adapterName: String = js.native
  val adapterPath: String = js.native
  val alias: String = js.native
  val brain: Brain[A] = js.native
  val commands: js.Array[js.Any] = js.native
  val datastore: Null | DataStore = js.native
  val errorHandlers: js.Array[js.Any] = js.native
  val events: EventEmitter = js.native
  val globalHttpOptions: Options = js.native
  @JSName("logger")
  val logger_Original: Log = js.native
  val middleware: Listener[A] = js.native
  val name: String = js.native
  val pingIntervalId: Null | Timeout = js.native
  @JSName("router")
  val router_Original: Express = js.native
  val server: js.UndefOr[Server] = js.native
  val version: String = js.native
  def catchAll(callback: ListenerCallback[A, CatchAllMessage]): Unit = js.native
  def catchAll(options: js.Object, callback: ListenerCallback[A, CatchAllMessage]): Unit = js.native
  def emit(event: String, args: js.Any*): Unit = js.native
  def emit(event: js.Symbol, args: js.Any*): Unit = js.native
  def enter(callback: ListenerCallback[A, EnterMessage]): Unit = js.native
  def enter(options: js.Object, callback: ListenerCallback[A, EnterMessage]): Unit = js.native
  def error(cb: js.Function1[/* error */ Error, Unit]): Unit = js.native
  def hear(regex: RegExp, callback: ListenerCallback[A, TextMessage]): Unit = js.native
  def hear(regex: RegExp, options: js.Object, callback: ListenerCallback[A, TextMessage]): Unit = js.native
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
  def logger(messages: js.Any*): Unit = js.native
  def messageRoom(room: String, strings: String*): Unit = js.native
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def onUncaughtException(err: Error): Unit = js.native
  def receive(message: Message): Unit = js.native
  def receive(message: Message, cb: js.Function0[Unit]): Unit = js.native
  def receiveMiddleware(middleware: MiddlewareHandler[A]): Unit = js.native
  def reply(envelope: Envelope, strings: String*): Unit = js.native
  def respond(regex: RegExp, callback: ListenerCallback[A, TextMessage]): Unit = js.native
  def respond(regex: RegExp, options: js.Object, callback: ListenerCallback[A, TextMessage]): Unit = js.native
  def respondPattern(regex: RegExp): RegExp = js.native
  def responseMiddleware(middleware: MiddlewareHandler[A]): Unit = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def router(
    req: Request[ParamsDictionary, _, _, ParsedQs],
    res: typings.expressServeStaticCore.mod.Response[_]
  ): js.Any = js.native
  def router(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
  def router(req: IncomingMessage, res: typings.expressServeStaticCore.mod.Response[_]): js.Any = js.native
  def router(req: IncomingMessage, res: ServerResponse): js.Any = js.native
  def run(): Unit = js.native
  def send(envelope: Envelope, strings: String*): Unit = js.native
  def shutdown(): Unit = js.native
  def topic(callback: ListenerCallback[A, TopicMessage]): Unit = js.native
  def topic(options: js.Object, callback: ListenerCallback[A, TopicMessage]): Unit = js.native
}

