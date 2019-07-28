package typings.gzipDashJs.gzipDashJsMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gzip-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val DEFAULT_LEVEL: Double = js.native
  def unzip(data: js.Array[Double]): js.Array[Double] = js.native
  def unzip(data: Buffer): js.Array[Double] = js.native
  def unzip(data: Uint8Array): js.Array[Double] = js.native
  def zip(data: String): js.Array[Double] = js.native
  def zip(data: String, opts: ZipOptions): js.Array[Double] = js.native
}

