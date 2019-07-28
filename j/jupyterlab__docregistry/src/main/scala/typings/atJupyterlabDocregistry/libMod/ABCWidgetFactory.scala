package typings.atJupyterlabDocregistry.libMod

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions
import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
  extends typings.atJupyterlabDocregistry.libDefaultMod.ABCWidgetFactory[T, U] {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: IWidgetFactoryOptions[T]) = this()
}

