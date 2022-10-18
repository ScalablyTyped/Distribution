package typings.gridstack

import typings.gridstack.distEs5DdElementMod.DDElementHost
import typings.gridstack.distEs5TypesMod.DDDragInOpt
import typings.gridstack.distEs5TypesMod.GridItemHTMLElement
import typings.gridstack.distEs5TypesMod.GridStackElement
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5DdGridstackMod {
  
  @JSImport("gridstack/dist/es5/dd-gridstack", "DDGridStack")
  @js.native
  open class DDGridStack () extends StObject {
    
    def dragIn(el: GridStackElement, opts: DDDragInOpt): DDGridStack = js.native
    
    def draggable(el: GridItemHTMLElement, opts: DDOpts): DDGridStack = js.native
    def draggable(el: GridItemHTMLElement, opts: DDOpts, key: Unit, value: DDValue): DDGridStack = js.native
    def draggable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): DDGridStack = js.native
    def draggable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey, value: DDValue): DDGridStack = js.native
    
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: Unit, value: DDValue): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: DDKey): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDDropOpt, key: DDKey, value: DDValue): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts, key: Unit, value: DDValue): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): DDGridStack = js.native
    def droppable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey, value: DDValue): DDGridStack = js.native
    
    /** true if element is draggable */
    def isDraggable(el: DDElementHost): Boolean = js.native
    
    /** true if element is droppable */
    def isDroppable(el: DDElementHost): Boolean = js.native
    
    /** true if element is draggable */
    def isResizable(el: DDElementHost): Boolean = js.native
    
    def off(el: GridItemHTMLElement, name: String): DDGridStack = js.native
    
    def on(el: GridItemHTMLElement, name: String, callback: DDCallback): DDGridStack = js.native
    
    def resizable(el: GridItemHTMLElement, opts: DDOpts): DDGridStack = js.native
    def resizable(el: GridItemHTMLElement, opts: DDOpts, key: Unit, value: DDValue): DDGridStack = js.native
    def resizable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey): DDGridStack = js.native
    def resizable(el: GridItemHTMLElement, opts: DDOpts, key: DDKey, value: DDValue): DDGridStack = js.native
  }
  /* static members */
  object DDGridStack {
    
    @JSImport("gridstack/dist/es5/dd-gridstack", "DDGridStack")
    @js.native
    val ^ : js.Any = js.native
    
    /** get the global (but static to this code) DD implementation */
    inline def get(): DDGridStack = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[DDGridStack]
  }
  
  type DDCallback = js.Function3[
    /* event */ Event, 
    /* arg2 */ GridItemHTMLElement, 
    /* helper */ js.UndefOr[GridItemHTMLElement], 
    Unit
  ]
  
  trait DDDropOpt extends StObject {
    
    /** function or class type that this grid will accept as dropped items (see GridStackOptions.acceptWidgets) */
    var accept: js.UndefOr[js.Function1[/* el */ GridItemHTMLElement, Boolean]] = js.undefined
  }
  object DDDropOpt {
    
    inline def apply(): DDDropOpt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DDDropOpt]
    }
    
    extension [Self <: DDDropOpt](x: Self) {
      
      inline def setAccept(value: /* el */ GridItemHTMLElement => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.minWidth
    - typings.gridstack.gridstackStrings.minHeight
    - typings.gridstack.gridstackStrings.maxWidth
    - typings.gridstack.gridstackStrings.maxHeight
  */
  trait DDKey extends StObject
  object DDKey {
    
    inline def maxHeight: typings.gridstack.gridstackStrings.maxHeight = "maxHeight".asInstanceOf[typings.gridstack.gridstackStrings.maxHeight]
    
    inline def maxWidth: typings.gridstack.gridstackStrings.maxWidth = "maxWidth".asInstanceOf[typings.gridstack.gridstackStrings.maxWidth]
    
    inline def minHeight: typings.gridstack.gridstackStrings.minHeight = "minHeight".asInstanceOf[typings.gridstack.gridstackStrings.minHeight]
    
    inline def minWidth: typings.gridstack.gridstackStrings.minWidth = "minWidth".asInstanceOf[typings.gridstack.gridstackStrings.minWidth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gridstack.gridstackStrings.enable
    - typings.gridstack.gridstackStrings.disable
    - typings.gridstack.gridstackStrings.destroy
    - typings.gridstack.gridstackStrings.option
    - java.lang.String
    - scala.Any
  */
  type DDOpts = _DDOpts | String | Any
  
  type DDValue = Double | String
  
  trait _DDOpts extends StObject
}
