package typings.karma.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runner extends js.Object {
  def run(): Unit = js.native
  def run(options: ConfigFile): Unit = js.native
  def run(options: ConfigFile, callback: ServerCallback): Unit = js.native
  def run(options: ConfigOptions): Unit = js.native
  def run(options: ConfigOptions, callback: ServerCallback): Unit = js.native
}

