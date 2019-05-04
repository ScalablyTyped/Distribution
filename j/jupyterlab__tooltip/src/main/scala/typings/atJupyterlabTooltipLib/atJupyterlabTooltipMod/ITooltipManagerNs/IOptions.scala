package typings
package atJupyterlabTooltipLib.atJupyterlabTooltipMod.ITooltipManagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface for tooltip-compatible objects.
  */
trait IOptions extends js.Object {
  /**
    * The referent anchor the tooltip follows.
    */
  val anchor: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
  /**
    * The referent editor for the tooltip.
    */
  val editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any
  /**
    * The kernel the tooltip communicates with to populate itself.
    */
  val kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection
  /**
    * The renderer the tooltip uses to render API responses.
    */
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(
    anchor: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget,
    editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any,
    kernel: atJupyterlabServicesLib.libKernelKernelMod.KernelNs.IKernelConnection,
    rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry
  ): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor, editor = editor, kernel = kernel, rendermime = rendermime)
  
    __obj.asInstanceOf[IOptions]
  }
}

