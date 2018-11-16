package typings
package jdenticonLib.jdenticonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jdenticon", "jdenticon")
@js.native
object jdenticonNs extends js.Object {
  var config: jdenticonLib.jdenticonMod.JdenticonConfig = js.native
  val version: java.lang.String = js.native
  def drawIcon(ctx: stdLib.CanvasRenderingContext2D, hash: java.lang.String, size: scala.Double): scala.Unit = js.native
  def toSvg(hash: java.lang.String, size: scala.Double): java.lang.String = js.native
  def toSvg(hash: java.lang.String, size: scala.Double, padding: scala.Double): java.lang.String = js.native
  def update(el: java.lang.String): scala.Unit = js.native
  def update(el: java.lang.String, hash: java.lang.String): scala.Unit = js.native
  def update(el: java.lang.String, hash: java.lang.String, padding: scala.Double): scala.Unit = js.native
  def update(el: stdLib.Element): scala.Unit = js.native
  def update(el: stdLib.Element, hash: java.lang.String): scala.Unit = js.native
  def update(el: stdLib.Element, hash: java.lang.String, padding: scala.Double): scala.Unit = js.native
}

