package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.collapseMod.Collapse.IOptions
import typings.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "Collapse")
@js.native
class Collapse[T /* <: Widget */] protected ()
  extends typings.jupyterlabApputils.collapseMod.Collapse[T] {
  def this(options: IOptions[T]) = this()
}

