package typings.atJupyterlabDocregistry.libMod

import typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidgetNs.IOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "DocumentWidget")
@js.native
class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected ()
  extends typings.atJupyterlabDocregistry.libDefaultMod.DocumentWidget[T, U] {
  def this(options: IOptions[T, U]) = this()
}

