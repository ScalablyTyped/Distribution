package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atJupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a widget factory.
  */
@js.native
trait IWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */]
  extends IDisposable
     with IWidgetFactoryOptions[Widget] {
  /**
    * A signal emitted when a new widget is created.
    */
  var widgetCreated: ISignal[IWidgetFactory[T, U], T] = js.native
  /**
    * Create a new widget given a context.
    *
    * @param source - A widget to clone
    *
    * #### Notes
    * It should emit the [widgetCreated] signal with the new widget.
    */
  def createNew(context: IContext[U]): T = js.native
  def createNew(context: IContext[U], source: T): T = js.native
}

