package typings.materialLinearProgress

import org.scalablytyped.runtime.Instantiable1
import typings.std.DOMRectReadOnly
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCResizeObserver
    extends StObject
       with Instantiable1[/* callback */ MDCResizeObserverCallback, MDCResizeObserver] {
    
    def disconnect(): Unit = js.native
    
    def observe(target: Element): Unit = js.native
  }
  
  type MDCResizeObserverCallback = js.Function2[
    /* entries */ js.Array[MDCResizeObserverEntry], 
    /* observer */ MDCResizeObserver, 
    Unit
  ]
  
  trait MDCResizeObserverEntry extends StObject {
    
    var contentRect: DOMRectReadOnly
  }
  object MDCResizeObserverEntry {
    
    inline def apply(contentRect: DOMRectReadOnly): MDCResizeObserverEntry = {
      val __obj = js.Dynamic.literal(contentRect = contentRect.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCResizeObserverEntry]
    }
    
    extension [Self <: MDCResizeObserverEntry](x: Self) {
      
      inline def setContentRect(value: DOMRectReadOnly): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithMDCResizeObserver extends StObject {
    
    var ResizeObserver: MDCResizeObserver
  }
  object WithMDCResizeObserver {
    
    inline def apply(ResizeObserver: MDCResizeObserver): WithMDCResizeObserver = {
      val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithMDCResizeObserver]
    }
    
    extension [Self <: WithMDCResizeObserver](x: Self) {
      
      inline def setResizeObserver(value: MDCResizeObserver): Self = StObject.set(x, "ResizeObserver", value.asInstanceOf[js.Any])
    }
  }
}
