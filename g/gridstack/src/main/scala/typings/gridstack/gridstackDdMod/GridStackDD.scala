package typings.gridstack.gridstackDdMod

import typings.gridstack.anon.TypeofGridStackDD
import typings.gridstack.mod.GridStack
import typings.gridstack.mod.GridStackElement
import typings.gridstack.typesMod.DDDragInOpt
import typings.gridstack.typesMod.GridItemHTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gridstack/dist/gridstack-dd", "GridStackDD")
@js.native
class GridStackDD protected () extends js.Object {
  def this(grid: GridStack) = this()
  
  def dragIn(el: GridStackElement, opts: DDDragInOpt): GridStackDD = js.native
  
  def draggable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
  def draggable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
  def draggable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
  
  def droppable(el: GridItemHTMLElement, opts: DDDropOpt): GridStackDD = js.native
  def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
  def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: DDKey): GridStackDD = js.native
  def droppable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
  def droppable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
  def droppable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
  
  var grid: GridStack = js.native
  
  def isDraggable(el: GridStackElement): Boolean = js.native
  
  def isDroppable(el: GridItemHTMLElement): Boolean = js.native
  
  def off(el: GridItemHTMLElement, eventName: String): GridStackDD = js.native
  
  def on(el: GridItemHTMLElement, eventName: String, callback: DDCallback): GridStackDD = js.native
  
  /** removes any drag&drop present (called during destroy) */
  def remove(el: GridItemHTMLElement): GridStackDD = js.native
  
  def resizable(el: GridItemHTMLElement, opts: DDOpts): GridStackDD = js.native
  def resizable(el: GridItemHTMLElement, opts: DDOpts, key: js.UndefOr[DDKey], value: DDValue): GridStackDD = js.native
  def resizable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): GridStackDD = js.native
}
/* static members */
@JSImport("gridstack/dist/gridstack-dd", "GridStackDD")
@js.native
object GridStackDD extends js.Object {
  
  /** get the current registered plugin to use */
  def get(): TypeofGridStackDD = js.native
  
  /** call this method to register your plugin instead of the default no-op one */
  def registerPlugin(pluginClass: TypeofGridStackDD): Unit = js.native
  
  var registeredPlugins: TypeofGridStackDD = js.native
}
