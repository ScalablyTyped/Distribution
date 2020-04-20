package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The dimension of an element.
  */
trait IDimension extends js.Object {
  /**
    * The height of an element in pixels.
    */
  val height: Double
  /**
    * The width of an element in pixels.
    */
  val width: Double
}

object IDimension {
  @scala.inline
  def apply(height: Double, width: Double): IDimension = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimension]
  }
}

