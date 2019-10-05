package typings.gulpDashWatch.gulpDashWatchMod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWatchStream extends ReadWriteStream {
  def add(path: String): ReadWriteStream = js.native
  def add(path: js.Array[String]): ReadWriteStream = js.native
  def close(): ReadWriteStream = js.native
  def unwatch(path: String): ReadWriteStream = js.native
  def unwatch(path: js.Array[String]): ReadWriteStream = js.native
}

