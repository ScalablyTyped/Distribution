package typings.gridstack

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.ViewContainerRef
import typings.gridstack.distTypesMod.GridItemHTMLElement
import typings.gridstack.distTypesMod.GridStackNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNgGridstackItemDotcomponentMod {
  
  @JSImport("gridstack/dist/ng/gridstack-item.component", "GridstackItemComponent")
  @js.native
  open class GridstackItemComponent protected ()
    extends StObject
       with OnDestroy {
    def this(elementRef: ElementRef[GridItemHTMLElement]) = this()
    
    /* private */ var _options: Any = js.native
    
    /** clears the initial options now that we've built */
    def clearOptions(): Unit = js.native
    
    /** container to append items dynamically */
    var container: js.UndefOr[ViewContainerRef] = js.native
    
    /** return the native element that contains grid specific fields as well */
    def el: GridItemCompHTMLElement = js.native
    
    /* private */ val elementRef: Any = js.native
    
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    
    /** return the latest grid options (from GS once built, otherwise initial values) */
    def options: GridStackNode = js.native
    /** list of options for creating/updating this item */
    def options_=(`val`: GridStackNode): Unit = js.native
  }
  
  @js.native
  trait GridItemCompHTMLElement
    extends StObject
       with GridItemHTMLElement {
    
    var _gridItemComp: js.UndefOr[GridstackItemComponent] = js.native
  }
}
