package typings.lozad

import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.IntersectionObserver
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Observer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Observer]
  inline def apply(selector: Unit, options: Options): Observer = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observer]
  inline def apply(selector: Selector): Observer = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Observer]
  inline def apply(selector: Selector, options: Options): Observer = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Observer]
  
  @JSImport("lozad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Observer extends StObject {
    
    def observe(): Unit
    
    var observer: IntersectionObserver
    
    def triggerLoad(element: Element): Unit
  }
  object Observer {
    
    inline def apply(observe: () => Unit, observer: IntersectionObserver, triggerLoad: Element => Unit): Observer = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), observer = observer.asInstanceOf[js.Any], triggerLoad = js.Any.fromFunction1(triggerLoad))
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setObserve(value: () => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction0(value))
      
      inline def setObserver(value: IntersectionObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setTriggerLoad(value: Element => Unit): Self = StObject.set(x, "triggerLoad", js.Any.fromFunction1(value))
    }
  }
  
  // TODO: remove on next major version bump
  // tslint:disable:next-line no-empty-interface
  type Option = Options
  
  trait Options extends StObject {
    
    var enableAutoReload: js.UndefOr[Boolean] = js.undefined
    
    var load: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
    
    var loaded: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
    
    var rootMargin: js.UndefOr[String] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnableAutoReload(value: Boolean): Self = StObject.set(x, "enableAutoReload", value.asInstanceOf[js.Any])
      
      inline def setEnableAutoReloadUndefined: Self = StObject.set(x, "enableAutoReload", js.undefined)
      
      inline def setLoad(value: /* element */ Element => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoaded(value: /* element */ Element => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type Selector = String | Element | HTMLCollectionOf[Element] | NodeListOf[Element]
}
