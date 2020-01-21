package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.hoverboxMod.HoverBox.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "HoverBox")
@js.native
object HoverBox extends js.Object {
  /**
    * Set the visible dimensions of a hovering box anchored to an editor cursor.
    *
    * @param options - The hover box geometry calculation options.
    */
  def setGeometry(options: IOptions): Unit = js.native
}

