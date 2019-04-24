package typings
package hubotLib.hubotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "Brain")
@js.native
class Brain[A] protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(robot: Robot[A]) = this()
  def close(): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def mergeData(data: js.Any): scala.Unit = js.native
  def remove(key: java.lang.String): this.type = js.native
  def resetSaveInterval(seconds: scala.Double): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): this.type = js.native
  def setAutoSave(enabled: scala.Boolean): scala.Unit = js.native
  def userForFuzzyName(fuzzyName: java.lang.String): User = js.native
  def userForId(id: js.Any): User = js.native
  def userForName(name: java.lang.String): User = js.native
  def userForRawFuzzyName(fuzzyName: java.lang.String): User = js.native
  def users(): js.Array[User] = js.native
}

