package typings
package karmaLib.karmaMod.karmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends js.Object {
  def run(): scala.Unit = js.native
  def run(options: ConfigFile): scala.Unit = js.native
  def run(options: ConfigFile, callback: ServerCallback): scala.Unit = js.native
  def run(options: ConfigOptions): scala.Unit = js.native
  def run(options: ConfigOptions, callback: ServerCallback): scala.Unit = js.native
}

