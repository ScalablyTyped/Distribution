package typings.hubot

import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Hubot {
    
    @JSGlobal("Hubot.Adapter")
    @js.native
    class Adapter protected ()
      extends typings.hubot.mod.Adapter {
      def this(robot: typings.hubot.mod.Robot[typings.hubot.mod.Adapter]) = this()
    }
    
    @JSGlobal("Hubot.Brain")
    @js.native
    class Brain[A /* <: typings.hubot.mod.Adapter */] protected ()
      extends typings.hubot.mod.Brain[A] {
      def this(robot: typings.hubot.mod.Robot[A]) = this()
    }
    
    @JSGlobal("Hubot.CatchAllMessage")
    @js.native
    class CatchAllMessage protected ()
      extends typings.hubot.mod.CatchAllMessage {
      def this(message: typings.hubot.mod.Message) = this()
    }
    
    @JSGlobal("Hubot.DataStore")
    @js.native
    class DataStore protected ()
      extends typings.hubot.mod.DataStore {
      def this(robot: typings.hubot.mod.Robot[typings.hubot.mod.Adapter]) = this()
    }
    
    @JSGlobal("Hubot.DataStoreUnavailable")
    @js.native
    class DataStoreUnavailable ()
      extends typings.hubot.mod.DataStoreUnavailable
    
    @JSGlobal("Hubot.EnterMessage")
    @js.native
    class EnterMessage protected ()
      extends typings.hubot.mod.EnterMessage {
      def this(user: typings.hubot.mod.User) = this()
      def this(user: typings.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.LeaveMessage")
    @js.native
    class LeaveMessage protected ()
      extends typings.hubot.mod.LeaveMessage {
      def this(user: typings.hubot.mod.User) = this()
      def this(user: typings.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.Message")
    @js.native
    class Message protected ()
      extends typings.hubot.mod.Message {
      def this(user: typings.hubot.mod.User) = this()
      def this(user: typings.hubot.mod.User, done: Boolean) = this()
    }
    
    @JSGlobal("Hubot.Middleware")
    @js.native
    class Middleware[T /* <: typings.hubot.mod.Adapter */] protected ()
      extends typings.hubot.mod.Middleware[T] {
      def this(robot: typings.hubot.mod.Robot[T]) = this()
    }
    
    @JSGlobal("Hubot.Response")
    @js.native
    class Response[A /* <: typings.hubot.mod.Adapter */, M /* <: typings.hubot.mod.Message */] protected ()
      extends typings.hubot.mod.Response[A, M] {
      def this(robot: typings.hubot.mod.Robot[A], message: typings.hubot.mod.Message, `match`: RegExpMatchArray) = this()
    }
    
    @JSGlobal("Hubot.Robot")
    @js.native
    class Robot[A /* <: typings.hubot.mod.Adapter */] protected ()
      extends typings.hubot.mod.Robot[A] {
      def this(adapterPath: String, adapter: String, httpd: Boolean, name: String) = this()
      def this(adapterPath: String, adapter: String, httpd: Boolean, name: String, alias: String) = this()
    }
    
    @JSGlobal("Hubot.TextMessage")
    @js.native
    class TextMessage protected ()
      extends typings.hubot.mod.TextMessage {
      def this(user: typings.hubot.mod.User, text: String, id: String) = this()
    }
    
    @JSGlobal("Hubot.TopicMessage")
    @js.native
    class TopicMessage protected ()
      extends typings.hubot.mod.TopicMessage {
      def this(user: typings.hubot.mod.User, text: String, id: String) = this()
    }
    
    @JSGlobal("Hubot.User")
    @js.native
    class User protected ()
      extends typings.hubot.mod.User {
      def this(id: String) = this()
      def this(id: String, options: js.Object) = this()
    }
  }
}
