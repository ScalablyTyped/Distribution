package typings.makeupExpander

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("makeup-expander", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Expander {
    def this(el: HTMLElement) = this()
    def this(el: HTMLElement, selectedOptions: Options) = this()
    
    /* CompleteClass */
    override def collapse(): Unit = js.native
    
    /* CompleteClass */
    var collapseOnClickOut: Boolean = js.native
    
    /* CompleteClass */
    var collapseOnFocusOut: Boolean = js.native
    
    /* CompleteClass */
    var collapseOnMouseOut: Boolean = js.native
    
    /* CompleteClass */
    override def expand(isKeyboard: Boolean): Unit = js.native
    
    /* CompleteClass */
    var expandOnClick: Boolean = js.native
    
    /* CompleteClass */
    var expandOnFocus: Boolean = js.native
    
    /* CompleteClass */
    var expandOnHover: Boolean = js.native
    
    /* CompleteClass */
    override def isExpanded(): Boolean = js.native
    
    /* CompleteClass */
    override def toggle(): Unit = js.native
  }
  
  trait Expander extends StObject {
    
    def collapse(): Unit
    
    var collapseOnClickOut: Boolean
    
    var collapseOnFocusOut: Boolean
    
    var collapseOnMouseOut: Boolean
    
    def expand(isKeyboard: Boolean): Unit
    
    var expandOnClick: Boolean
    
    var expandOnFocus: Boolean
    
    var expandOnHover: Boolean
    
    def isExpanded(): Boolean
    
    def toggle(): Unit
  }
  object Expander {
    
    inline def apply(
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
    
    extension [Self <: Expander](x: Self) {
      
      inline def setCollapse(value: () => Unit): Self = StObject.set(x, "collapse", js.Any.fromFunction0(value))
      
      inline def setCollapseOnClickOut(value: Boolean): Self = StObject.set(x, "collapseOnClickOut", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnFocusOut(value: Boolean): Self = StObject.set(x, "collapseOnFocusOut", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnMouseOut(value: Boolean): Self = StObject.set(x, "collapseOnMouseOut", value.asInstanceOf[js.Any])
      
      inline def setExpand(value: Boolean => Unit): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
      
      inline def setExpandOnClick(value: Boolean): Self = StObject.set(x, "expandOnClick", value.asInstanceOf[js.Any])
      
      inline def setExpandOnFocus(value: Boolean): Self = StObject.set(x, "expandOnFocus", value.asInstanceOf[js.Any])
      
      inline def setExpandOnHover(value: Boolean): Self = StObject.set(x, "expandOnHover", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: () => Boolean): Self = StObject.set(x, "isExpanded", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    var autoCollapse: js.UndefOr[Boolean] = js.undefined
    
    var collapseOnClickOut: js.UndefOr[Boolean] = js.undefined
    
    var collapseOnFocusOut: js.UndefOr[Boolean] = js.undefined
    
    var collapseOnMouseOut: js.UndefOr[Boolean] = js.undefined
    
    var contentSelector: js.UndefOr[String] = js.undefined
    
    var expandOnClick: js.UndefOr[Boolean] = js.undefined
    
    var expandOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var expandOnHover: js.UndefOr[Boolean] = js.undefined
    
    var expandedClass: js.UndefOr[String] = js.undefined
    
    var focusManagement: js.UndefOr[String | Null] = js.undefined
    
    var hostSelector: js.UndefOr[String] = js.undefined
    
    var simulateSpacebarClick: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
      
      inline def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
      
      inline def setCollapseOnClickOut(value: Boolean): Self = StObject.set(x, "collapseOnClickOut", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnClickOutUndefined: Self = StObject.set(x, "collapseOnClickOut", js.undefined)
      
      inline def setCollapseOnFocusOut(value: Boolean): Self = StObject.set(x, "collapseOnFocusOut", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnFocusOutUndefined: Self = StObject.set(x, "collapseOnFocusOut", js.undefined)
      
      inline def setCollapseOnMouseOut(value: Boolean): Self = StObject.set(x, "collapseOnMouseOut", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnMouseOutUndefined: Self = StObject.set(x, "collapseOnMouseOut", js.undefined)
      
      inline def setContentSelector(value: String): Self = StObject.set(x, "contentSelector", value.asInstanceOf[js.Any])
      
      inline def setContentSelectorUndefined: Self = StObject.set(x, "contentSelector", js.undefined)
      
      inline def setExpandOnClick(value: Boolean): Self = StObject.set(x, "expandOnClick", value.asInstanceOf[js.Any])
      
      inline def setExpandOnClickUndefined: Self = StObject.set(x, "expandOnClick", js.undefined)
      
      inline def setExpandOnFocus(value: Boolean): Self = StObject.set(x, "expandOnFocus", value.asInstanceOf[js.Any])
      
      inline def setExpandOnFocusUndefined: Self = StObject.set(x, "expandOnFocus", js.undefined)
      
      inline def setExpandOnHover(value: Boolean): Self = StObject.set(x, "expandOnHover", value.asInstanceOf[js.Any])
      
      inline def setExpandOnHoverUndefined: Self = StObject.set(x, "expandOnHover", js.undefined)
      
      inline def setExpandedClass(value: String): Self = StObject.set(x, "expandedClass", value.asInstanceOf[js.Any])
      
      inline def setExpandedClassUndefined: Self = StObject.set(x, "expandedClass", js.undefined)
      
      inline def setFocusManagement(value: String): Self = StObject.set(x, "focusManagement", value.asInstanceOf[js.Any])
      
      inline def setFocusManagementNull: Self = StObject.set(x, "focusManagement", null)
      
      inline def setFocusManagementUndefined: Self = StObject.set(x, "focusManagement", js.undefined)
      
      inline def setHostSelector(value: String): Self = StObject.set(x, "hostSelector", value.asInstanceOf[js.Any])
      
      inline def setHostSelectorUndefined: Self = StObject.set(x, "hostSelector", js.undefined)
      
      inline def setSimulateSpacebarClick(value: Boolean): Self = StObject.set(x, "simulateSpacebarClick", value.asInstanceOf[js.Any])
      
      inline def setSimulateSpacebarClickUndefined: Self = StObject.set(x, "simulateSpacebarClick", js.undefined)
    }
  }
}
