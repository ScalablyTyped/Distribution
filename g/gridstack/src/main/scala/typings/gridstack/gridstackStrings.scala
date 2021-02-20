package typings.gridstack

import typings.gridstack.gridstackDdMod._DDKey
import typings.gridstack.gridstackDdMod._DDOpts
import typings.gridstack.mod.GridStackEvent
import typings.gridstack.typesMod._ColumnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridstackStrings {
  
  @js.native
  sealed trait added extends GridStackEvent
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait change extends GridStackEvent
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait destroy extends _DDOpts
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait disable
    extends GridStackEvent
       with _DDOpts
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait dragstart extends GridStackEvent
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @js.native
  sealed trait dragstop extends GridStackEvent
  @scala.inline
  def dragstop: dragstop = "dragstop".asInstanceOf[dragstop]
  
  @js.native
  sealed trait dropped extends GridStackEvent
  @scala.inline
  def dropped: dropped = "dropped".asInstanceOf[dropped]
  
  @js.native
  sealed trait enable
    extends GridStackEvent
       with _DDOpts
  @scala.inline
  def enable: enable = "enable".asInstanceOf[enable]
  
  @js.native
  sealed trait minHeight extends _DDKey
  @scala.inline
  def minHeight: minHeight = "minHeight".asInstanceOf[minHeight]
  
  @js.native
  sealed trait minWidth extends _DDKey
  @scala.inline
  def minWidth: minWidth = "minWidth".asInstanceOf[minWidth]
  
  @js.native
  sealed trait move extends _ColumnOptions
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait moveScale extends _ColumnOptions
  @scala.inline
  def moveScale: moveScale = "moveScale".asInstanceOf[moveScale]
  
  @js.native
  sealed trait none extends _ColumnOptions
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait option extends _DDOpts
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  
  @js.native
  sealed trait removed extends GridStackEvent
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait resizestart extends GridStackEvent
  @scala.inline
  def resizestart: resizestart = "resizestart".asInstanceOf[resizestart]
  
  @js.native
  sealed trait resizestop extends GridStackEvent
  @scala.inline
  def resizestop: resizestop = "resizestop".asInstanceOf[resizestop]
  
  @js.native
  sealed trait scale extends _ColumnOptions
  @scala.inline
  def scale: scale = "scale".asInstanceOf[scale]
}
