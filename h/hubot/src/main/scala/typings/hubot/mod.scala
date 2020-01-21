package typings.hubot

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.RegExp
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Brain[A] protected () extends EventEmitter {
    def this(robot: Robot[A]) = this()
    def close(): Unit = js.native
    def get(key: String): js.Any = js.native
    def mergeData(data: js.Any): Unit = js.native
    def remove(key: String): this.type = js.native
    def resetSaveInterval(seconds: Double): Unit = js.native
    def save(): Unit = js.native
    def set(key: String, value: js.Any): this.type = js.native
    def setAutoSave(enabled: Boolean): Unit = js.native
    def userForFuzzyName(fuzzyName: String): User = js.native
    def userForId(id: js.Any): User = js.native
    def userForName(name: String): User = js.native
    def userForRawFuzzyName(fuzzyName: String): User = js.native
    def users(): js.Array[User] = js.native
  }
  
  @js.native
  class Message protected () extends js.Object {
    def this(user: User) = this()
    def this(user: User, done: Boolean) = this()
    var id: String = js.native
    var text: String = js.native
    var user: User = js.native
    def finish(): Unit = js.native
  }
  
  @js.native
  class Response[R] protected () extends js.Object {
    def this(robot: R, message: Message, `match`: RegExpMatchArray) = this()
    var `match`: RegExpMatchArray = js.native
    var message: Message = js.native
    def emote(strings: String*): Unit = js.native
    def locked(strings: String*): Unit = js.native
    def play(strings: String*): Unit = js.native
    def random[T](items: js.Array[T]): T = js.native
    def reply(strings: String*): Unit = js.native
    def send(strings: String*): Unit = js.native
    def topic(strings: String*): Unit = js.native
  }
  
  @js.native
  class Robot[A] protected () extends js.Object {
    def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
    def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
    val adapter: A = js.native
    var alias: String = js.native
    var brain: Brain[A] = js.native
    var name: String = js.native
    def catchAll(callback: ListenerCallback[this.type]): Unit = js.native
    def catchAll(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    def enter(callback: ListenerCallback[this.type]): Unit = js.native
    def enter(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
    def hear(regex: RegExp, callback: ListenerCallback[this.type]): Unit = js.native
    def hear(regex: RegExp, options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
    def helpCommands(): js.Array[String] = js.native
    def loadFile(directory: String, fileName: String): Unit = js.native
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def respond(regex: RegExp, callback: ListenerCallback[this.type]): Unit = js.native
    def respond(regex: RegExp, options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
    def topic(callback: ListenerCallback[this.type]): Unit = js.native
    def topic(options: js.Any, callback: ListenerCallback[this.type]): Unit = js.native
  }
  
  @js.native
  class User protected ()
    extends /* property */ StringDictionary[js.Any] {
    def this(id: js.Any) = this()
    def this(id: js.Any, options: js.Any) = this()
    var id: js.Any = js.native
    var name: String = js.native
  }
  
  type ListenerCallback[R] = js.Function1[/* response */ Response[R], Unit]
}

