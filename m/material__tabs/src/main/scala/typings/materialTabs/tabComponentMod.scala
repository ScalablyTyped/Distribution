package typings.materialTabs

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.tabFoundationMod.MDCTabFoundation
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabComponentMod {
  
  @JSImport("@material/tabs/tab/component", "MDCTab")
  @js.native
  class MDCTab protected () extends MDCComponent[MDCTabFoundation] {
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabFoundation, args: js.Any*) = this()
    
    val computedLeft: Double = js.native
    
    val computedWidth: Double = js.native
    
    var isActive: Boolean = js.native
    
    def measureSelf(): Unit = js.native
    
    var preventDefaultOnClick: Boolean = js.native
    
    var root_ : HTMLElement = js.native
  }
  /* static members */
  object MDCTab {
    
    @JSImport("@material/tabs/tab/component", "MDCTab")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def attachTo(root: Element): MDCTab = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTab]
  }
  
  type MDCTabFactory = js.Function2[/* el */ Element, /* foundation */ js.UndefOr[MDCTabFoundation], MDCTab]
  
  @js.native
  trait MDCTabSelectedEvent
    extends StObject
       with Event {
    
    val detail: MDCTabSelectedEventDetail = js.native
  }
  
  trait MDCTabSelectedEventDetail extends StObject {
    
    var tab: MDCTab
  }
  object MDCTabSelectedEventDetail {
    
    @scala.inline
    def apply(tab: MDCTab): MDCTabSelectedEventDetail = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCTabSelectedEventDetail]
    }
    
    @scala.inline
    implicit class MDCTabSelectedEventDetailMutableBuilder[Self <: MDCTabSelectedEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTab(value: MDCTab): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    }
  }
}
