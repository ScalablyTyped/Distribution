package typings.gzipJs.mod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gzip-js", "unzip")
@js.native
object unzip extends js.Object {
  def apply(data: js.Array[Double]): js.Array[Double] = js.native
  def apply(data: Buffer): js.Array[Double] = js.native
  def apply(data: Uint8Array): js.Array[Double] = js.native
}

