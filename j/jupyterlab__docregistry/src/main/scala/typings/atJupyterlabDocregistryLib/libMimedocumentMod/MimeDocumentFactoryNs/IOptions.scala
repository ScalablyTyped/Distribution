package typings
package atJupyterlabDocregistryLib.libMimedocumentMod.MimeDocumentFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocumentFactory.
  */
trait IOptions[T /* <: atJupyterlabDocregistryLib.libMimedocumentMod.MimeDocument */]
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions[T] {
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[
    atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.string | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.json
  ] = js.undefined
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType
  /**
    * The render timeout.
    */
  var renderTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rendermime instance.
    */
  var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply[T /* <: atJupyterlabDocregistryLib.libMimedocumentMod.MimeDocument */](
    fileTypes: js.Array[java.lang.String],
    name: java.lang.String,
    primaryFileType: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IFileType,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry,
    canStartKernel: js.UndefOr[scala.Boolean] = js.undefined,
    dataType: atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.string | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.json = null,
    defaultFor: js.Array[java.lang.String] = null,
    defaultRendered: js.Array[java.lang.String] = null,
    modelName: java.lang.String = null,
    preferKernel: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    renderTimeout: scala.Int | scala.Double = null,
    toolbarFactory: T => js.Array[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IToolbarItem] = null
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes, name = name, primaryFileType = primaryFileType, rendermime = rendermime)
    if (!js.isUndefined(canStartKernel)) __obj.updateDynamic("canStartKernel")(canStartKernel)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (defaultFor != null) __obj.updateDynamic("defaultFor")(defaultFor)
    if (defaultRendered != null) __obj.updateDynamic("defaultRendered")(defaultRendered)
    if (modelName != null) __obj.updateDynamic("modelName")(modelName)
    if (!js.isUndefined(preferKernel)) __obj.updateDynamic("preferKernel")(preferKernel)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (renderTimeout != null) __obj.updateDynamic("renderTimeout")(renderTimeout.asInstanceOf[js.Any])
    if (toolbarFactory != null) __obj.updateDynamic("toolbarFactory")(js.Any.fromFunction1(toolbarFactory))
    __obj.asInstanceOf[IOptions[T]]
  }
}

