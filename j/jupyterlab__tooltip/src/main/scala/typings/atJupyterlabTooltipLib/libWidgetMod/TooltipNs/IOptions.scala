package typings
package atJupyterlabTooltipLib.libWidgetMod.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instantiation options for a tooltip widget.
  */
trait IOptions extends js.Object {
  /**
    * The anchor widget that the tooltip widget tracks.
    */
  var anchor: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
  /**
    * The data that populates the tooltip widget.
    */
  var bundle: atPhosphorCoreutilsLib.libJsonMod.JSONObject
  /**
    * The editor referent of the tooltip model.
    */
  var editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any
  /**
    * The rendermime instance used by the tooltip model.
    */
  var rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    anchor: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    bundle: atPhosphorCoreutilsLib.libJsonMod.JSONObject,
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor, bundle = bundle, editor = editor, rendermime = rendermime)
  
    __obj.asInstanceOf[IOptions]
  }
}

