package typings.jointjs.mod.dia

import typings.jointjs.mod.dia.ToolView.Options
import typings.jointjs.mod.mvc.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.ToolView")
@js.native
class ToolView_ ()
  extends View[js.UndefOr[scala.Nothing]] {
  def this(opt: Options) = this()
  
  def blur(): Unit = js.native
  
  def configure(): this.type = js.native
  def configure(opt: Options): this.type = js.native
  
  def focus(): Unit = js.native
  
  /* protected */ def guard(evt: Event): Boolean = js.native
  
  def hide(): Unit = js.native
  
  def isVisible(): Boolean = js.native
  
  var name: String | Null = js.native
  
  var paper: Paper = js.native
  
  var parentView: ToolsView = js.native
  
  var relatedView: CellView = js.native
  
  def show(): Unit = js.native
  
  def update(): Unit = js.native
}
