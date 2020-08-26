package typings.jointjs.mod.dia

import typings.jointjs.mod.dia.ToolsView.Options
import typings.jointjs.mod.mvc.View
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia.ToolsView")
@js.native
class ToolsView_ ()
  extends View[js.UndefOr[scala.Nothing]] {
  def this(opt: Options) = this()
  @JSName("options")
  var options_ToolsView_ : Options = js.native
  def blurTool(tool: ToolView): this.type = js.native
  def configure(): this.type = js.native
  def configure(opt: Options): this.type = js.native
  def focusTool(tool: ToolView): this.type = js.native
  def getName(): String | Null = js.native
  def hide(): this.type = js.native
  def mount(): this.type = js.native
  def show(): this.type = js.native
  /* protected */ def simulateRelatedView(el: SVGElement): Unit = js.native
}

