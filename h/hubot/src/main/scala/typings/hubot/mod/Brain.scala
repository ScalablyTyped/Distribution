package typings.hubot.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hubot", "Brain")
@js.native
class Brain[A /* <: Adapter */] protected () extends EventEmitter {
  def this(robot: Robot[A]) = this()
  
  def close(): Unit = js.native
  
  def get(key: String): js.Any = js.native
  
  def mergeData(data: js.Object): Unit = js.native
  
  def remove(key: String): this.type = js.native
  
  def resetSaveInterval(seconds: Double): Unit = js.native
  
  def save(): Unit = js.native
  
  def set(key: String, value: js.Any): this.type = js.native
  
  def setAutoSave(enabled: Boolean): Unit = js.native
  
  def userForId(id: String): User = js.native
  def userForId(id: String, options: js.Object): User = js.native
  
  def userForName(name: String): User | Null = js.native
  
  def users(): js.Array[User] = js.native
  
  def usersForFuzzyName(fuzzyName: String): js.Array[User] = js.native
  
  def usersForRawFuzzyName(fuzzyName: String): js.Array[User] = js.native
}
