package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hubot", "DataStore")
@js.native
class DataStore protected () extends js.Object {
  def this(robot: Robot[Adapter]) = this()
  def get(key: String): js.Promise[_] = js.native
  def getObject(key: String, objectKey: String): js.Promise[_] = js.native
  def set(key: String, value: js.Any): js.Promise[Unit] = js.native
  def setArray(key: String, value: js.Any): js.Promise[Unit] = js.native
  def setObject(key: String, objectKey: String, value: js.Any): js.Promise[Unit] = js.native
}

