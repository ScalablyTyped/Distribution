package typings.makeupExpander

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-expander", JSImport.Namespace)
  @js.native
  class ^ protected () extends Expander {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, selectedOptions: Options) = this()
  }
  
  @js.native
  trait Expander extends StObject {
    
    def collapse(): Unit = js.native
    
    var collapseOnClickOut: Boolean = js.native
    
    var collapseOnFocusOut: Boolean = js.native
    
    var collapseOnMouseOut: Boolean = js.native
    
    def expand(isKeyboard: Boolean): Unit = js.native
    
    var expandOnClick: Boolean = js.native
    
    var expandOnFocus: Boolean = js.native
    
    var expandOnHover: Boolean = js.native
    
    def isExpanded(): Boolean = js.native
    
    def toggle(): Unit = js.native
  }
  object Expander {
    
    @scala.inline
    def apply(
      collapse: () => Unit,
      collapseOnClickOut: Boolean,
      collapseOnFocusOut: Boolean,
      collapseOnMouseOut: Boolean,
      expand: Boolean => Unit,
      expandOnClick: Boolean,
      expandOnFocus: Boolean,
      expandOnHover: Boolean,
      isExpanded: () => Boolean,
      toggle: () => Unit
    ): Expander = {
      val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction0(collapse), collapseOnClickOut = collapseOnClickOut.asInstanceOf[js.Any], collapseOnFocusOut = collapseOnFocusOut.asInstanceOf[js.Any], collapseOnMouseOut = collapseOnMouseOut.asInstanceOf[js.Any], expand = js.Any.fromFunction1(expand), expandOnClick = expandOnClick.asInstanceOf[js.Any], expandOnFocus = expandOnFocus.asInstanceOf[js.Any], expandOnHover = expandOnHover.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Expander]
    }
    
    @scala.inline
    implicit class ExpanderMutableBuilder[Self <: Expander] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCollapseOnClickOut(value: Boolean): Self = StObject.set(x, "collapseOnClickOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnFocusOut(value: Boolean): Self = StObject.set(x, "collapseOnFocusOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnMouseOut(value: Boolean): Self = StObject.set(x, "collapseOnMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpand(value: Boolean => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandOnClick(value: Boolean): Self = StObject.set(x, "expandOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnFocus(value: Boolean): Self = StObject.set(x, "expandOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnHover(value: Boolean): Self = StObject.set(x, "expandOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var autoCollapse: js.UndefOr[Boolean] = js.native
    
    var collapseOnClickOut: js.UndefOr[Boolean] = js.native
    
    var collapseOnFocusOut: js.UndefOr[Boolean] = js.native
    
    var collapseOnMouseOut: js.UndefOr[Boolean] = js.native
    
    var contentSelector: js.UndefOr[String] = js.native
    
    var expandOnClick: js.UndefOr[Boolean] = js.native
    
    var expandOnFocus: js.UndefOr[Boolean] = js.native
    
    var expandOnHover: js.UndefOr[Boolean] = js.native
    
    var expandedClass: js.UndefOr[String] = js.native
    
    var focusManagement: js.UndefOr[String | Null] = js.native
    
    var hostSelector: js.UndefOr[String] = js.native
    
    var simulateSpacebarClick: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
      
      @scala.inline
      def setCollapseOnClickOut(value: Boolean): Self = StObject.set(x, "collapseOnClickOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnClickOutUndefined: Self = StObject.set(x, "collapseOnClickOut", js.undefined)
      
      @scala.inline
      def setCollapseOnFocusOut(value: Boolean): Self = StObject.set(x, "collapseOnFocusOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnFocusOutUndefined: Self = StObject.set(x, "collapseOnFocusOut", js.undefined)
      
      @scala.inline
      def setCollapseOnMouseOut(value: Boolean): Self = StObject.set(x, "collapseOnMouseOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseOnMouseOutUndefined: Self = StObject.set(x, "collapseOnMouseOut", js.undefined)
      
      @scala.inline
      def setContentSelector(value: String): Self = StObject.set(x, "contentSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentSelectorUndefined: Self = StObject.set(x, "contentSelector", js.undefined)
      
      @scala.inline
      def setExpandOnClick(value: Boolean): Self = StObject.set(x, "expandOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnClickUndefined: Self = StObject.set(x, "expandOnClick", js.undefined)
      
      @scala.inline
      def setExpandOnFocus(value: Boolean): Self = StObject.set(x, "expandOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnFocusUndefined: Self = StObject.set(x, "expandOnFocus", js.undefined)
      
      @scala.inline
      def setExpandOnHover(value: Boolean): Self = StObject.set(x, "expandOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandOnHoverUndefined: Self = StObject.set(x, "expandOnHover", js.undefined)
      
      @scala.inline
      def setExpandedClass(value: String): Self = StObject.set(x, "expandedClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedClassUndefined: Self = StObject.set(x, "expandedClass", js.undefined)
      
      @scala.inline
      def setFocusManagement(value: String): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusManagementNull: Self = StObject.set(x, "focusManagement", null)
      
      @scala.inline
      def setFocusManagementUndefined: Self = StObject.set(x, "focusManagement", js.undefined)
      
      @scala.inline
      def setHostSelector(value: String): Self = StObject.set(x, "hostSelector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostSelectorUndefined: Self = StObject.set(x, "hostSelector", js.undefined)
      
      @scala.inline
      def setSimulateSpacebarClick(value: Boolean): Self = StObject.set(x, "simulateSpacebarClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimulateSpacebarClickUndefined: Self = StObject.set(x, "simulateSpacebarClick", js.undefined)
    }
  }
}
