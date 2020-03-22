package typings.jupyterlabApplication.frontendMod.JupyterFrontEnd

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal shell type for Jupyter front-end applications.
  */
@js.native
trait IShell extends Widget {
  /**
    * The focused widget in the application shell.
    *
    * #### Notes
    * Different shell implementations have latitude to decide what "current"
    * or "focused" mean, depending on their user interface characteristics.
    */
  val currentWidget: Widget | Null = js.native
  /**
    * Activates a widget inside the application shell.
    *
    * @param id - The ID of the widget being activated.
    */
  def activateById(id: String): Unit = js.native
  /**
    * Add a widget to the application shell.
    *
    * @param widget - The widget being added.
    *
    * @param area - Optional region in the shell into which the widget should
    * be added.
    *
    * @param options - Optional flags the shell might use when opening the
    * widget, as defined in the `DocumentRegistry`.
    */
  def add(widget: Widget): Unit = js.native
  def add(widget: Widget, area: String): Unit = js.native
  def add(widget: Widget, area: String, options: IOpenOptions): Unit = js.native
  /**
    * Returns an iterator for the widgets inside the application shell.
    *
    * @param area - Optional regions in the shell whose widgets are iterated.
    */
  def widgets(): IIterator[Widget] = js.native
  def widgets(area: String): IIterator[Widget] = js.native
}

