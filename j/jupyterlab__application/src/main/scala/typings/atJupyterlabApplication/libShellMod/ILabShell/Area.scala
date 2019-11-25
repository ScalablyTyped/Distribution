package typings.atJupyterlabApplication.libShellMod.ILabShell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The areas of the application shell where widgets can reside.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.main
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.header
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.top
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.left
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.right
  - typings.atJupyterlabApplication.atJupyterlabApplicationStrings.bottom
*/
trait Area extends js.Object

object Area {
  @scala.inline
  def bottom: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.bottom = this.cast("bottom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def header: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.header = this.cast("header")
  @scala.inline
  def left: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.left = this.cast("left")
  @scala.inline
  def main: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.main = this.cast("main")
  @scala.inline
  def right: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.right = this.cast("right")
  @scala.inline
  def top: typings.atJupyterlabApplication.atJupyterlabApplicationStrings.top = this.cast("top")
}

