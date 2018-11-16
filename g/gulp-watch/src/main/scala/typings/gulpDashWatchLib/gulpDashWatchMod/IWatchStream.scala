package typings
package gulpDashWatchLib.gulpDashWatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWatchStream
  extends nodeLib.NodeJSNs.ReadWriteStream {
  def add(path: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def add(path: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def close(): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def unwatch(path: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def unwatch(path: js.Array[java.lang.String]): nodeLib.NodeJSNs.ReadWriteStream = js.native
}

