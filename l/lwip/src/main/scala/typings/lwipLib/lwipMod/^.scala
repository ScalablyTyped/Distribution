package typings
package lwipLib.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lwip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(width: scala.Double, height: scala.Double, callback: ImageCallback): scala.Unit = js.native
  def create(width: scala.Double, height: scala.Double, color: Color, callback: ImageCallback): scala.Unit = js.native
  def open(source: java.lang.String, callback: ImageCallback): scala.Unit = js.native
  def open(source: java.lang.String, `type`: java.lang.String, callback: ImageCallback): scala.Unit = js.native
  def open(source: nodeLib.Buffer, `type`: java.lang.String, callback: ImageCallback): js.Any = js.native
  def open(source: nodeLib.Buffer, `type`: lwipLib.Anon_Height, callback: ImageCallback): js.Any = js.native
}

