package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a widget factory.
  */
trait IWidgetFactoryOptions[T /* <: Widget */] extends js.Object {
  /**
    * Whether the widgets can start a kernel when opened.
    */
  val canStartKernel: js.UndefOr[Boolean] = js.undefined
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing).
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[String]
  /**
    * The registered name of the model type used to create the widgets.
    */
  val modelName: js.UndefOr[String] = js.undefined
  /**
    * The name of the widget to display in dialogs.
    */
  val name: String
  /**
    * Whether the widgets prefer having a kernel started.
    */
  val preferKernel: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the widget factory is read only.
    */
  val readOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  val shutdownOnClose: js.UndefOr[Boolean] = js.undefined
  /**
    * A function producing toolbar widgets, overriding the default toolbar widgets.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ T, js.Array[IToolbarItem]]] = js.undefined
}

object IWidgetFactoryOptions {
  @scala.inline
  def apply[T /* <: Widget */](
    fileTypes: js.Array[String],
    name: String,
    canStartKernel: js.UndefOr[Boolean] = js.undefined,
    defaultFor: js.Array[String] = null,
    defaultRendered: js.Array[String] = null,
    modelName: String = null,
    preferKernel: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined,
    toolbarFactory: /* widget */ T => js.Array[IToolbarItem] = null
  ): IWidgetFactoryOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor.asInstanceOf[js.Any])
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IWidgetFactoryOptions[T]]
  }
}

