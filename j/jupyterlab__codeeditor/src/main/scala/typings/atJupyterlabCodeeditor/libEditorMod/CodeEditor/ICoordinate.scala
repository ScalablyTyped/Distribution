package typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface describing editor state coordinates.
  */
trait ICoordinate
  extends JSONObject
     with ClientRect

object ICoordinate {
  @scala.inline
  def apply(bottom: Double, height: Double, left: Double, right: Double, top: Double, width: Double): ICoordinate = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width)
  
    __obj.asInstanceOf[ICoordinate]
  }
}

