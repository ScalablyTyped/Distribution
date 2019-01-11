package typings
package gzipDashJsLib.gzipDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gzip-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LEVEL: scala.Double = js.native
  def unzip(data: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def unzip(data: nodeLib.Buffer): js.Array[scala.Double] = js.native
  def unzip(data: stdLib.Uint8Array): js.Array[scala.Double] = js.native
  def zip(data: java.lang.String): js.Array[scala.Double] = js.native
  def zip(data: java.lang.String, opts: gzipDashJsLib.gzipDashJsMod.ZipOptions): js.Array[scala.Double] = js.native
}

