package typings.gulpNodemon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends typings.node.NodeJS.EventEmitter {
  def addListener(event: String, listener: js.Function): this.type = js.native
  def addListener(event: String, tasks: js.Array[String]): this.type = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  def on(event: String, tasks: js.Array[String]): this.type = js.native
  def once(event: String, listener: js.Function): this.type = js.native
  def once(event: String, tasks: js.Array[String]): this.type = js.native
}

