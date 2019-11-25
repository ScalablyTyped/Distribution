package typings.atJupyterlabMarkdownviewer.libWidgetMod.MarkdownViewerFactory

import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IToolbarItem
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
trait IOptions extends IWidgetFactoryOptions[Widget] {
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: IFileType
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    fileTypes: js.Array[String],
    name: String,
    primaryFileType: IFileType,
    rendermime: IRenderMimeRegistry,
    canStartKernel: js.UndefOr[Boolean] = js.undefined,
    defaultFor: js.Array[String] = null,
    defaultRendered: js.Array[String] = null,
    modelName: String = null,
    preferKernel: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined,
    toolbarFactory: Widget => js.Array[IToolbarItem] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryFileType = primaryFileType.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor.asInstanceOf[js.Any])
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IOptions]
  }
}

