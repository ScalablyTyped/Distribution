package typings.gridstack

import typings.gridstack.gridstackDdMod._DDKey
import typings.gridstack.gridstackDdMod._DDOpts
import typings.gridstack.mod.GridStackEvent
import typings.gridstack.typesMod._ColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridstackStrings {
  
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @scala.inline
  def dragstop: dragstop = "dragstop".asInstanceOf[dragstop]
  
  @scala.inline
  def dropped: dropped = "dropped".asInstanceOf[dropped]
  
  @scala.inline
  def enable: enable = "enable".asInstanceOf[enable]
  
  @scala.inline
  def minHeight: minHeight = "minHeight".asInstanceOf[minHeight]
  
  @scala.inline
  def minWidth: minWidth = "minWidth".asInstanceOf[minWidth]
  
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @scala.inline
  def moveScale: moveScale = "moveScale".asInstanceOf[moveScale]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @scala.inline
  def resizestart: resizestart = "resizestart".asInstanceOf[resizestart]
  
  @scala.inline
  def resizestop: resizestop = "resizestop".asInstanceOf[resizestop]
  
  @scala.inline
  def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait added extends GridStackEvent
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait change extends GridStackEvent
  
  @js.native
  sealed trait destroy extends _DDOpts
  
  @js.native
  sealed trait disable
    extends GridStackEvent
       with _DDOpts
  
  @js.native
  sealed trait dragstart extends GridStackEvent
  
  @js.native
  sealed trait dragstop extends GridStackEvent
  
  @js.native
  sealed trait dropped extends GridStackEvent
  
  @js.native
  sealed trait enable
    extends GridStackEvent
       with _DDOpts
  
  @js.native
  sealed trait minHeight extends _DDKey
  
  @js.native
  sealed trait minWidth extends _DDKey
  
  @js.native
  sealed trait move extends _ColumnOptions
  
  @js.native
  sealed trait moveScale extends _ColumnOptions
  
  @js.native
  sealed trait none extends _ColumnOptions
  
  @js.native
  sealed trait option extends _DDOpts
  
  @js.native
  sealed trait removed extends GridStackEvent
  
  @js.native
  sealed trait resizestart extends GridStackEvent
  
  @js.native
  sealed trait resizestop extends GridStackEvent
  
  @js.native
  sealed trait scale extends _ColumnOptions
}
