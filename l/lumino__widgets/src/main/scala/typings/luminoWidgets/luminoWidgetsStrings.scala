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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoWidgetsStrings {
  
  @js.native
  sealed trait bottom
    extends StObject
       with TabPlacement
       with VerticalAlignment
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-to-top`
    extends StObject
       with Direction
  inline def `bottom-to-top`: `bottom-to-top` = "bottom-to-top".asInstanceOf[`bottom-to-top`]
  
  @js.native
  sealed trait center
    extends StObject
       with Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
       with HorizontalAlignment
       with VerticalAlignment
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait command
    extends StObject
       with ItemType
  inline def command: command = "command".asInstanceOf[command]
  
  @js.native
  sealed trait decrement extends StObject
  inline def decrement: decrement = "decrement".asInstanceOf[decrement]
  
  @js.native
  sealed trait end
    extends StObject
       with Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Orientation
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
       with typings.luminoWidgets.tabbarMod.TabBar.Orientation
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait increment extends StObject
  inline def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait justify
    extends StObject
       with Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  inline def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait left
    extends StObject
       with HorizontalAlignment
       with TabPlacement
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-to-right`
    extends StObject
       with Direction
  inline def `left-to-right`: `left-to-right` = "left-to-right".asInstanceOf[`left-to-right`]
  
  @js.native
  sealed trait `multiple-document`
    extends StObject
       with Mode
  inline def `multiple-document`: `multiple-document` = "multiple-document".asInstanceOf[`multiple-document`]
  
  @js.native
  sealed trait next extends StObject
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait none
    extends StObject
       with InsertBehavior
       with RemoveBehavior
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait previous extends StObject
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait right
    extends StObject
       with HorizontalAlignment
       with TabPlacement
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-to-left`
    extends StObject
       with Direction
  inline def `right-to-left`: `right-to-left` = "right-to-left".asInstanceOf[`right-to-left`]
  
  @js.native
  sealed trait `select-previous-tab`
    extends StObject
       with RemoveBehavior
  inline def `select-previous-tab`: `select-previous-tab` = "select-previous-tab".asInstanceOf[`select-previous-tab`]
  
  @js.native
  sealed trait `select-tab`
    extends StObject
       with InsertBehavior
  inline def `select-tab`: `select-tab` = "select-tab".asInstanceOf[`select-tab`]
  
  @js.native
  sealed trait `select-tab-after`
    extends StObject
       with RemoveBehavior
  inline def `select-tab-after`: `select-tab-after` = "select-tab-after".asInstanceOf[`select-tab-after`]
  
  @js.native
  sealed trait `select-tab-before`
    extends StObject
       with RemoveBehavior
  inline def `select-tab-before`: `select-tab-before` = "select-tab-before".asInstanceOf[`select-tab-before`]
  
  @js.native
  sealed trait `select-tab-if-needed`
    extends StObject
       with InsertBehavior
  inline def `select-tab-if-needed`: `select-tab-if-needed` = "select-tab-if-needed".asInstanceOf[`select-tab-if-needed`]
  
  @js.native
  sealed trait separator
    extends StObject
       with ItemType
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait `set-min-size`
    extends StObject
       with FitPolicy
  inline def `set-min-size`: `set-min-size` = "set-min-size".asInstanceOf[`set-min-size`]
  
  @js.native
  sealed trait `set-no-constraint`
    extends StObject
       with FitPolicy
  inline def `set-no-constraint`: `set-no-constraint` = "set-no-constraint".asInstanceOf[`set-no-constraint`]
  
  @js.native
  sealed trait `single-document`
    extends StObject
       with Mode
  inline def `single-document`: `single-document` = "single-document".asInstanceOf[`single-document`]
  
  @js.native
  sealed trait `split-area` extends StObject
  inline def `split-area`: `split-area` = "split-area".asInstanceOf[`split-area`]
  
  @js.native
  sealed trait `split-bottom`
    extends StObject
       with InsertMode
  inline def `split-bottom`: `split-bottom` = "split-bottom".asInstanceOf[`split-bottom`]
  
  @js.native
  sealed trait `split-left`
    extends StObject
       with InsertMode
  inline def `split-left`: `split-left` = "split-left".asInstanceOf[`split-left`]
  
  @js.native
  sealed trait `split-right`
    extends StObject
       with InsertMode
  inline def `split-right`: `split-right` = "split-right".asInstanceOf[`split-right`]
  
  @js.native
  sealed trait `split-top`
    extends StObject
       with InsertMode
  inline def `split-top`: `split-top` = "split-top".asInstanceOf[`split-top`]
  
  @js.native
  sealed trait start
    extends StObject
       with Alignment
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Alignment
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait submenu
    extends StObject
       with ItemType
  inline def submenu: submenu = "submenu".asInstanceOf[submenu]
  
  @js.native
  sealed trait `tab-after`
    extends StObject
       with InsertMode
  inline def `tab-after`: `tab-after` = "tab-after".asInstanceOf[`tab-after`]
  
  @js.native
  sealed trait `tab-area` extends StObject
  inline def `tab-area`: `tab-area` = "tab-area".asInstanceOf[`tab-area`]
  
  @js.native
  sealed trait `tab-before`
    extends StObject
       with InsertMode
  inline def `tab-before`: `tab-before` = "tab-before".asInstanceOf[`tab-before`]
  
  @js.native
  sealed trait top
    extends StObject
       with TabPlacement
       with VerticalAlignment
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-to-bottom`
    extends StObject
       with Direction
  inline def `top-to-bottom`: `top-to-bottom` = "top-to-bottom".asInstanceOf[`top-to-bottom`]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Orientation
       with typings.luminoWidgets.splitlayoutMod.SplitLayout.Orientation
       with typings.luminoWidgets.tabbarMod.TabBar.Orientation
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
