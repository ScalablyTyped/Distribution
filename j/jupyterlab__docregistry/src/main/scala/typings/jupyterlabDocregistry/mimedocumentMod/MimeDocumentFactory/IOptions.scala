package typings.jupyterlabDocregistry.mimedocumentMod.MimeDocumentFactory

import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.json
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.string
import typings.jupyterlabDocregistry.mimedocumentMod.MimeDocument
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
trait IOptions[T /* <: MimeDocument */] extends IWidgetFactoryOptions[T] {
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[string | json] = js.undefined
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: js.UndefOr[IFileType] = js.undefined
  /**
    * The render timeout.
    */
  var renderTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: MimeDocument */](
    fileTypes: js.Array[String],
    name: String,
    rendermime: IRenderMimeRegistry,
    canStartKernel: js.UndefOr[Boolean] = js.undefined,
    dataType: string | json = null,
    defaultFor: js.Array[String] = null,
    defaultRendered: js.Array[String] = null,
    modelName: String = null,
    preferKernel: js.UndefOr[Boolean] = js.undefined,
    primaryFileType: IFileType = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderTimeout: Int | Double = null,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined,
    toolbarFactory: T => js.Array[IToolbarItem] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor.asInstanceOf[js.Any])
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel.asInstanceOf[js.Any])
    if (primaryFileType != null) __obj.updateDynamic("primaryFileType")(primaryFileType.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderTimeout != null) __obj.updateDynamic("renderTimeout")(renderTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IOptions[T]]
  }
}

