package typings.jupyterlabStatusbar.tokensMod.IStatusBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
  - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.middle
*/
trait Alignment extends js.Object

object Alignment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def left: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left = this.cast("left")
  @scala.inline
  def middle: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.middle = this.cast("middle")
  @scala.inline
  def right: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right = this.cast("right")
}

