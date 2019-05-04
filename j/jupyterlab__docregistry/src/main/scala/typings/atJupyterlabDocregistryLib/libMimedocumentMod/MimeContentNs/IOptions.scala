package typings
package atJupyterlabDocregistryLib.libMimedocumentMod.MimeContentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to initialize a MimeDocument.
  */
trait IOptions extends js.Object {
  /**
    * Context
    */
  var context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel]
  /**
    * Preferred data type from the model.
    */
  var dataType: js.UndefOr[
    atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.string | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.json
  ] = js.undefined
  /**
    * The mime type.
    */
  var mimeType: java.lang.String
  /**
    * The render timeout.
    */
  var renderTimeout: scala.Double
  /**
    * The renderer instance.
    */
  var renderer: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer
}

object IOptions {
  @scala.inline
  def apply(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IContext[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel],
    mimeType: java.lang.String,
    renderTimeout: scala.Double,
    renderer: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IRenderer,
    dataType: atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.string | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.json = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(context = context, mimeType = mimeType, renderTimeout = renderTimeout, renderer = renderer)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

