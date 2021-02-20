package typings.lozad

import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.IntersectionObserver
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lozad", JSImport.Namespace)
  @js.native
  def apply(): Observer = js.native
  @JSImport("lozad", JSImport.Namespace)
  @js.native
  def apply(selector: js.UndefOr[Selector], options: Option): Observer = js.native
  @JSImport("lozad", JSImport.Namespace)
  @js.native
  def apply(selector: Selector): Observer = js.native
  
  @js.native
  trait Observer extends StObject {
    
    def observe(): Unit = js.native
    
    var observer: IntersectionObserver = js.native
    
    def triggerLoad(element: Element): Unit = js.native
  }
  object Observer {
    
    @scala.inline
    def apply(observe: () => Unit, observer: IntersectionObserver, triggerLoad: Element => Unit): Observer = {
      val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), observer = observer.asInstanceOf[js.Any], triggerLoad = js.Any.fromFunction1(triggerLoad))
      __obj.asInstanceOf[Observer]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObserve(value: () => Unit): Self = StObject.set(x, "observe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setObserver(value: IntersectionObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerLoad(value: Element => Unit): Self = StObject.set(x, "triggerLoad", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Option extends StObject {
    
    var load: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
    
    var loaded: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
    
    var rootMargin: js.UndefOr[String] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object Option {
    
    @scala.inline
    def apply(): Option = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoad(value: /* element */ Element => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLoaded(value: /* element */ Element => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type Selector = String | Element | HTMLCollectionOf[Element] | NodeListOf[Element]
}
