package typings.jqueryui

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.MenuOptions
import typings.jqueryui.jqueryuiStrings.blur
import typings.jqueryui.jqueryuiStrings.collapse
import typings.jqueryui.jqueryuiStrings.collapseAll
import typings.jqueryui.jqueryuiStrings.destroy
import typings.jqueryui.jqueryuiStrings.disable
import typings.jqueryui.jqueryuiStrings.enable
import typings.jqueryui.jqueryuiStrings.focus
import typings.jqueryui.jqueryuiStrings.isFirstItem
import typings.jqueryui.jqueryuiStrings.isLastItem
import typings.jqueryui.jqueryuiStrings.next
import typings.jqueryui.jqueryuiStrings.nextPage
import typings.jqueryui.jqueryuiStrings.previous
import typings.jqueryui.jqueryuiStrings.previousPage
import typings.jqueryui.jqueryuiStrings.refresh
import typings.jqueryui.jqueryuiStrings.select
import typings.jqueryui.jqueryuiStrings.widget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attribute extends StObject {
    
    var attribute: js.UndefOr[String] = js.undefined
  }
  object Attribute {
    
    inline def apply(): Attribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attribute]
    }
    
    extension [Self <: Attribute](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): JQuery = js.native
    def apply(methodName: String): JQuery = js.native
    def apply(methodName: String, event: JQueryEventObject, item: JQuery): Unit = js.native
    def apply(methodName: blur): Unit = js.native
    def apply(methodName: collapse): Unit = js.native
    def apply(methodName: collapseAll): Unit = js.native
    def apply(methodName: collapseAll, event: Unit, all: Boolean): Unit = js.native
    def apply(methodName: collapseAll, event: JQueryEventObject): Unit = js.native
    def apply(methodName: collapseAll, event: JQueryEventObject, all: Boolean): Unit = js.native
    def apply(methodName: collapse, event: JQueryEventObject): Unit = js.native
    def apply(methodName: destroy): Unit = js.native
    def apply(methodName: disable): Unit = js.native
    def apply(methodName: enable): Unit = js.native
    def apply(methodName: focus, event: JQueryEventObject, item: JQuery): Unit = js.native
    def apply(methodName: isFirstItem): Boolean = js.native
    def apply(methodName: isLastItem): Boolean = js.native
    def apply(methodName: next): Unit = js.native
    def apply(methodName: nextPage): Unit = js.native
    def apply(methodName: nextPage, event: JQueryEventObject): Unit = js.native
    def apply(methodName: next, event: JQueryEventObject): Unit = js.native
    def apply(methodName: previous): Unit = js.native
    def apply(methodName: previousPage): Unit = js.native
    def apply(methodName: previousPage, event: JQueryEventObject): Unit = js.native
    def apply(methodName: previous, event: JQueryEventObject): Unit = js.native
    def apply(methodName: refresh): Unit = js.native
    def apply(methodName: select): Unit = js.native
    def apply(methodName: select, event: JQueryEventObject): Unit = js.native
    def apply(methodName: widget): JQuery = js.native
    def apply(optionLiteral: String, optionName: String): Any = js.native
    def apply(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
    def apply(optionLiteral: String, options: MenuOptions): Any = js.native
    def apply(options: MenuOptions): JQuery = js.native
    
    var active: Boolean = js.native
  }
  
  trait Expression extends StObject {
    
    var attribute: js.UndefOr[String] = js.undefined
    
    var expression: js.UndefOr[js.RegExp] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Expression {
    
    inline def apply(): Expression = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expression]
    }
    
    extension [Self <: Expression](x: Self) {
      
      inline def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      inline def setExpression(value: js.RegExp): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Selected extends StObject {
    
    var selected: js.UndefOr[Element] = js.undefined
  }
  object Selected {
    
    inline def apply(): Selected = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selected]
    }
    
    extension [Self <: Selected](x: Self) {
      
      inline def setSelected(value: Element): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait Selecting extends StObject {
    
    var selecting: js.UndefOr[Element] = js.undefined
  }
  object Selecting {
    
    inline def apply(): Selecting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selecting]
    }
    
    extension [Self <: Selecting](x: Self) {
      
      inline def setSelecting(value: Element): Self = StObject.set(x, "selecting", value.asInstanceOf[js.Any])
      
      inline def setSelectingUndefined: Self = StObject.set(x, "selecting", js.undefined)
    }
  }
  
  trait Unselected extends StObject {
    
    var unselected: Element
  }
  object Unselected {
    
    inline def apply(unselected: Element): Unselected = {
      val __obj = js.Dynamic.literal(unselected = unselected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unselected]
    }
    
    extension [Self <: Unselected](x: Self) {
      
      inline def setUnselected(value: Element): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unselecting extends StObject {
    
    var unselecting: Element
  }
  object Unselecting {
    
    inline def apply(unselecting: Element): Unselecting = {
      val __obj = js.Dynamic.literal(unselecting = unselecting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unselecting]
    }
    
    extension [Self <: Unselecting](x: Self) {
      
      inline def setUnselecting(value: Element): Self = StObject.set(x, "unselecting", value.asInstanceOf[js.Any])
    }
  }
}
