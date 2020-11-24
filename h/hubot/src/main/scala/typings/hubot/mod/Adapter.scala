package typings.hubot.mod

import typings.node.eventsMod.EventEmitter
import typings.scopedHttpClient.mod.ScopedClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hubot", "Adapter")
@js.native
class Adapter protected () extends EventEmitter {
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
