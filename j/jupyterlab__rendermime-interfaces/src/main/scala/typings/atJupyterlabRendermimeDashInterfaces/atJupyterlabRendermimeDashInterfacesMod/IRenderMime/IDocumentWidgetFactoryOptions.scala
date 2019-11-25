package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a document widget factory.
  *
  * This interface is intended to be used by mime renderer extensions
  * to define a document opener that uses its renderer factory.
  */
trait IDocumentWidgetFactoryOptions extends js.Object {
  /**
    * The file types for which the factory should be the default.
    */
  val defaultFor: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing)
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[String]
  /**
    * The name of the document model type.
    */
  val modelName: js.UndefOr[String] = js.undefined
  /**
    * The name of the widget to display in dialogs.
    */
  val name: String
  /**
    * The primary file type of the widget.
    */
  val primaryFileType: String
  /**
    * A function returning a list of toolbar items to add to the toolbar.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ IRenderer, js.Array[IToolbarItem]]] = js.undefined
}

object IDocumentWidgetFactoryOptions {
  @scala.inline
  def apply(
    fileTypes: js.Array[String],
    name: String,
    primaryFileType: String,
    defaultFor: js.Array[String] = null,
    defaultRendered: js.Array[String] = null,
    modelName: String = null,
    toolbarFactory: /* widget */ IRenderer => js.Array[IToolbarItem] = null
  ): IDocumentWidgetFactoryOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor.asInstanceOf[js.Any])
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IDocumentWidgetFactoryOptions]
  }
}

