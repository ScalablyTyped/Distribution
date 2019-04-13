package typings
package gulpDashNodemonLib.gulpDashNodemonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter
  extends nodeLib.NodeJSNs.EventEmitter {
  def addListener(event: java.lang.String, listener: js.Function): this.type = js.native
  def addListener(event: java.lang.String, tasks: js.Array[java.lang.String]): this.type = js.native
  def on(event: java.lang.String, listener: js.Function): this.type = js.native
  def on(event: java.lang.String, tasks: js.Array[java.lang.String]): this.type = js.native
  def once(event: java.lang.String, listener: js.Function): this.type = js.native
  def once(event: java.lang.String, tasks: js.Array[java.lang.String]): this.type = js.native
}

