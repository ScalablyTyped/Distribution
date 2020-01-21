package typings.jupyterlabApplication.shellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The areas of the application shell where widgets can reside.
  */
/* Rewritten from type alias, can be one of: 
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.main
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.header
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.top
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.left
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.right
  - typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom
*/
trait Area extends js.Object

object Area {
  @scala.inline
  def bottom: typings.jupyterlabApplication.jupyterlabApplicationStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typings.jupyterlabApplication.jupyterlabApplicationStrings.header = this.cast("header")
  @scala.inline
  def left: typings.jupyterlabApplication.jupyterlabApplicationStrings.left = this.cast("left")
  @scala.inline
  def main: typings.jupyterlabApplication.jupyterlabApplicationStrings.main = this.cast("main")
  @scala.inline
  def right: typings.jupyterlabApplication.jupyterlabApplicationStrings.right = this.cast("right")
  @scala.inline
  def top: typings.jupyterlabApplication.jupyterlabApplicationStrings.top = this.cast("top")
}

