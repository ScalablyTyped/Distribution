package typings.lwip.lwipMod

import typings.lwip.Anon_Height
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lwip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(width: Double, height: Double, callback: ImageCallback): Unit = js.native
  def create(width: Double, height: Double, color: Color, callback: ImageCallback): Unit = js.native
  def open(source: String, callback: ImageCallback): Unit = js.native
  def open(source: String, `type`: String, callback: ImageCallback): Unit = js.native
  def open(source: Buffer, `type`: String, callback: ImageCallback): js.Any = js.native
  def open(source: Buffer, `type`: Anon_Height, callback: ImageCallback): js.Any = js.native
}

