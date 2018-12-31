package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIWindow extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Modal): this.type = js.native
  def hide(): scala.Unit = js.native
  /**
    * Moves a window at specified coordinates
    *
    */
  def move(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def resize(): scala.Unit = js.native
  def resizeModal(): scala.Unit = js.native
  /**
    * Changes the horizontal/vertical size of a window
    *
    */
  def setSize(w: scala.Double, h: scala.Double): scala.Unit = js.native
  /**
    * Changes the markup of the title tag in the head area of a window
    *
    */
  def setTitle(html: java.lang.String): scala.Unit = js.native
  /**
    * Shows a window at specified coordinates
    *
    */
  def show(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
    * Changes the markup in the body area of a window
    *
    */
  def update(html: java.lang.String): scala.Unit = js.native
}

