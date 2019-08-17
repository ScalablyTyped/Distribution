package typings.atJupyterlabTooltip.libTokensMod.ITooltipManagerNs

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IEditor
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.IKernelConnection
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
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
  val anchor: Widget
  /**
    * The referent editor for the tooltip.
    */
  val editor: IEditor
  /**
    * The kernel the tooltip communicates with to populate itself.
    */
  val kernel: IKernelConnection
  /**
    * The renderer the tooltip uses to render API responses.
    */
  val rendermime: IRenderMimeRegistry
}

object IOptions {
  @scala.inline
  def apply(anchor: Widget, editor: IEditor, kernel: IKernelConnection, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(anchor = anchor, editor = editor, kernel = kernel, rendermime = rendermime)
  
    __obj.asInstanceOf[IOptions]
  }
}

