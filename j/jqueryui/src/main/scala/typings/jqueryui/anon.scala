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
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attribute extends StObject {
    
    var attribute: js.UndefOr[String] = js.native
  }
  object Attribute {
    
    @scala.inline
    def apply(): Attribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attribute]
    }
    
    @scala.inline
    implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
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
    def apply(methodName: collapseAll, event: js.UndefOr[scala.Nothing], all: Boolean): Unit = js.native
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
    def apply(optionLiteral: String, optionName: String): js.Any = js.native
    def apply(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
    def apply(optionLiteral: String, options: MenuOptions): js.Any = js.native
    def apply(options: MenuOptions): JQuery = js.native
    
    var active: Boolean = js.native
  }
  
  @js.native
  trait Expression extends StObject {
    
    var attribute: js.UndefOr[String] = js.native
    
    var expression: js.UndefOr[RegExp] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object Expression {
    
    @scala.inline
    def apply(): Expression = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
      
      @scala.inline
      def setExpression(value: RegExp): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait Left extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Selected extends StObject {
    
    var selected: js.UndefOr[Element] = js.native
  }
  object Selected {
    
    @scala.inline
    def apply(): Selected = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selected]
    }
    
    @scala.inline
    implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Element): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  @js.native
  trait Selecting extends StObject {
    
    var selecting: js.UndefOr[Element] = js.native
  }
  object Selecting {
    
    @scala.inline
    def apply(): Selecting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selecting]
    }
    
    @scala.inline
    implicit class SelectingMutableBuilder[Self <: Selecting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelecting(value: Element): Self = StObject.set(x, "selecting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectingUndefined: Self = StObject.set(x, "selecting", js.undefined)
    }
  }
  
  @js.native
  trait Unselected extends StObject {
    
    var unselected: Element = js.native
  }
  object Unselected {
    
    @scala.inline
    def apply(unselected: Element): Unselected = {
      val __obj = js.Dynamic.literal(unselected = unselected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unselected]
    }
    
    @scala.inline
    implicit class UnselectedMutableBuilder[Self <: Unselected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnselected(value: Element): Self = StObject.set(x, "unselected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Unselecting extends StObject {
    
    var unselecting: Element = js.native
  }
  object Unselecting {
    
    @scala.inline
    def apply(unselecting: Element): Unselecting = {
      val __obj = js.Dynamic.literal(unselecting = unselecting.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unselecting]
    }
    
    @scala.inline
    implicit class UnselectingMutableBuilder[Self <: Unselecting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnselecting(value: Element): Self = StObject.set(x, "unselecting", value.asInstanceOf[js.Any])
    }
  }
}
