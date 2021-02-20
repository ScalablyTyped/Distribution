package typings.luminoWidgets

import typings.luminoWidgets.boxlayoutMod.BoxLayout.Alignment
import typings.luminoWidgets.boxlayoutMod.BoxLayout.Direction
import typings.luminoWidgets.docklayoutMod.DockLayout.InsertMode
import typings.luminoWidgets.dockpanelMod.DockPanel.Mode
import typings.luminoWidgets.layoutMod.Layout.FitPolicy
import typings.luminoWidgets.layoutMod.Layout.HorizontalAlignment
import typings.luminoWidgets.layoutMod.Layout.VerticalAlignment
import typings.luminoWidgets.menuMod.Menu.ItemType
import typings.luminoWidgets.scrollbarMod.ScrollBar.Orientation
import typings.luminoWidgets.tabbarMod.TabBar.InsertBehavior
import typings.luminoWidgets.tabbarMod.TabBar.RemoveBehavior
import typings.luminoWidgets.tabpanelMod.TabPanel.TabPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoWidgetsStrings {
  
  @js.native
  sealed trait bottom
    extends TabPlacement
       with VerticalAlignment
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-to-top` extends Direction
  @scala.inline
  def `bottom-to-top`: `bottom-to-top` = "bottom-to-top".asInstanceOf[`bottom-to-top`]
  
  @js.native
  sealed trait center
    extends Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
       with HorizontalAlignment
       with VerticalAlignment
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait command extends ItemType
  @scala.inline
  def command: command = "command".asInstanceOf[command]
  
  @js.native
  sealed trait decrement extends StObject
  @scala.inline
  def decrement: decrement = "decrement".asInstanceOf[decrement]
  
  @js.native
  sealed trait end
    extends Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait horizontal
    extends Orientation
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
       with typings.luminoWidgets.tabbarMod.TabBar.Orientation
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait increment extends StObject
  @scala.inline
  def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait justify
    extends Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait left
    extends HorizontalAlignment
       with TabPlacement
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-to-right` extends Direction
  @scala.inline
  def `left-to-right`: `left-to-right` = "left-to-right".asInstanceOf[`left-to-right`]
  
  @js.native
  sealed trait `multiple-document` extends Mode
  @scala.inline
  def `multiple-document`: `multiple-document` = "multiple-document".asInstanceOf[`multiple-document`]
  
  @js.native
  sealed trait next extends StObject
  @scala.inline
  def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait none
    extends InsertBehavior
       with RemoveBehavior
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait previous extends StObject
  @scala.inline
  def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait right
    extends HorizontalAlignment
       with TabPlacement
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-to-left` extends Direction
  @scala.inline
  def `right-to-left`: `right-to-left` = "right-to-left".asInstanceOf[`right-to-left`]
  
  @js.native
  sealed trait `select-previous-tab` extends RemoveBehavior
  @scala.inline
  def `select-previous-tab`: `select-previous-tab` = "select-previous-tab".asInstanceOf[`select-previous-tab`]
  
  @js.native
  sealed trait `select-tab` extends InsertBehavior
  @scala.inline
  def `select-tab`: `select-tab` = "select-tab".asInstanceOf[`select-tab`]
  
  @js.native
  sealed trait `select-tab-after` extends RemoveBehavior
  @scala.inline
  def `select-tab-after`: `select-tab-after` = "select-tab-after".asInstanceOf[`select-tab-after`]
  
  @js.native
  sealed trait `select-tab-before` extends RemoveBehavior
  @scala.inline
  def `select-tab-before`: `select-tab-before` = "select-tab-before".asInstanceOf[`select-tab-before`]
  
  @js.native
  sealed trait `select-tab-if-needed` extends InsertBehavior
  @scala.inline
  def `select-tab-if-needed`: `select-tab-if-needed` = "select-tab-if-needed".asInstanceOf[`select-tab-if-needed`]
  
  @js.native
  sealed trait separator extends ItemType
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait `set-min-size` extends FitPolicy
  @scala.inline
  def `set-min-size`: `set-min-size` = "set-min-size".asInstanceOf[`set-min-size`]
  
  @js.native
  sealed trait `set-no-constraint` extends FitPolicy
  @scala.inline
  def `set-no-constraint`: `set-no-constraint` = "set-no-constraint".asInstanceOf[`set-no-constraint`]
  
  @js.native
  sealed trait `single-document` extends Mode
  @scala.inline
  def `single-document`: `single-document` = "single-document".asInstanceOf[`single-document`]
  
  @js.native
  sealed trait `split-area` extends StObject
  @scala.inline
  def `split-area`: `split-area` = "split-area".asInstanceOf[`split-area`]
  
  @js.native
  sealed trait `split-bottom` extends InsertMode
  @scala.inline
  def `split-bottom`: `split-bottom` = "split-bottom".asInstanceOf[`split-bottom`]
  
  @js.native
  sealed trait `split-left` extends InsertMode
  @scala.inline
  def `split-left`: `split-left` = "split-left".asInstanceOf[`split-left`]
  
  @js.native
  sealed trait `split-right` extends InsertMode
  @scala.inline
  def `split-right`: `split-right` = "split-right".asInstanceOf[`split-right`]
  
  @js.native
  sealed trait `split-top` extends InsertMode
  @scala.inline
  def `split-top`: `split-top` = "split-top".asInstanceOf[`split-top`]
  
  @js.native
  sealed trait start
    extends Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait submenu extends ItemType
  @scala.inline
  def submenu: submenu = "submenu".asInstanceOf[submenu]
  
  @js.native
  sealed trait `tab-after` extends InsertMode
  @scala.inline
  def `tab-after`: `tab-after` = "tab-after".asInstanceOf[`tab-after`]
  
  @js.native
  sealed trait `tab-area` extends StObject
  @scala.inline
  def `tab-area`: `tab-area` = "tab-area".asInstanceOf[`tab-area`]
  
  @js.native
  sealed trait `tab-before` extends InsertMode
  @scala.inline
  def `tab-before`: `tab-before` = "tab-before".asInstanceOf[`tab-before`]
  
  @js.native
  sealed trait top
    extends TabPlacement
       with VerticalAlignment
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-to-bottom` extends Direction
  @scala.inline
  def `top-to-bottom`: `top-to-bottom` = "top-to-bottom".asInstanceOf[`top-to-bottom`]
  
  @js.native
  sealed trait vertical
    extends Orientation
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
       with typings.luminoWidgets.tabbarMod.TabBar.Orientation
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}
