package typings.jui.mod

import typings.jui.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIWindow extends js.Object {
  
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Bottom): this.type = js.native
  
  def hide(): Unit = js.native
  
  /**
    * Moves a window at specified coordinates
    *
    */
  def move(x: Double, y: Double): Unit = js.native
  
  def resize(): Unit = js.native
  
  def resizeModal(): Unit = js.native
  
  /**
    * Changes the horizontal/vertical size of a window
    *
    */
  def setSize(w: Double, h: Double): Unit = js.native
  
  /**
    * Changes the markup of the title tag in the head area of a window
    *
    */
  def setTitle(html: String): Unit = js.native
  
  /**
    * Shows a window at specified coordinates
    *
    */
  def show(x: Double, y: Double): Unit = js.native
  
  /**
    * Changes the markup in the body area of a window
    *
    */
  def update(html: String): Unit = js.native
}
