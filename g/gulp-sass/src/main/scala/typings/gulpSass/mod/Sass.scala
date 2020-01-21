package typings.gulpSass.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sass extends js.Object {
  def apply(): ReadWriteStream = js.native
  def apply(opts: GulpSassOptions): ReadWriteStream = js.native
  def logError(): Unit = js.native
  def logError(error: String): Unit = js.native
  def sync(): ReadWriteStream = js.native
  def sync(options: GulpSassOptions): ReadWriteStream = js.native
}

