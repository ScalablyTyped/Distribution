package typings.hubot.hubotMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Brain")
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

