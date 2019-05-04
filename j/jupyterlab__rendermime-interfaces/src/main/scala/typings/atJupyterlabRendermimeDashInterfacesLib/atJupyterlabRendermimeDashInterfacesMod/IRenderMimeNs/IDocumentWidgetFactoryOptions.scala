package typings
package atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs

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
  val defaultFor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The file types for which the factory should be the default for rendering,
    * if that is different than the default factory (which may be for editing)
    * If undefined, then it will fall back on the default file type.
    */
  val defaultRendered: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The file types the widget can view.
    */
  val fileTypes: js.Array[java.lang.String]
  /**
    * The name of the document model type.
    */
  val modelName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the widget to display in dialogs.
    */
  val name: java.lang.String
  /**
    * The primary file type of the widget.
    */
  val primaryFileType: java.lang.String
  /**
    * A function returning a list of toolbar items to add to the toolbar.
    */
  val toolbarFactory: js.UndefOr[js.Function1[/* widget */ IRenderer, js.Array[IToolbarItem]]] = js.undefined
}

object IDocumentWidgetFactoryOptions {
  @scala.inline
  def apply(
    fileTypes: js.Array[java.lang.String],
    name: java.lang.String,
    primaryFileType: java.lang.String,
    defaultFor: js.Array[java.lang.String] = null,
    defaultRendered: js.Array[java.lang.String] = null,
    modelName: java.lang.String = null,
    toolbarFactory: /* widget */ IRenderer => js.Array[IToolbarItem] = null
  ): IDocumentWidgetFactoryOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes, name = name, primaryFileType = primaryFileType)
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor)
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered)
    if (modelName != null) __obj.updateDynamic("modelName")(modelName)
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IDocumentWidgetFactoryOptions]
  }
}

