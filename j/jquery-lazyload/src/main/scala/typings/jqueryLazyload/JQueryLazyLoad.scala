package typings.jqueryLazyload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryLazyLoad {
  
  trait Options extends StObject {
    
    var appear: js.UndefOr[(js.Function2[/* elementsLeft */ Double, /* options */ this.type, Unit]) | Null] = js.undefined
    
    var container: js.UndefOr[JQuery] = js.undefined
    
    var data_attribute: js.UndefOr[String] = js.undefined
    
    var effect: js.UndefOr[String] = js.undefined
    
    var event: js.UndefOr[String] = js.undefined
    
    var failure_limit: js.UndefOr[Double] = js.undefined
    
    var load: js.UndefOr[
        js.Function2[/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[this.type], Unit]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var skip_invisible: js.UndefOr[Boolean] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAppear(value: (/* elementsLeft */ Double, Options) => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction2(value))
      
      inline def setAppearNull: Self = StObject.set(x, "appear", null)
      
      inline def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      inline def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setData_attribute(value: String): Self = StObject.set(x, "data_attribute", value.asInstanceOf[js.Any])
      
      inline def setData_attributeUndefined: Self = StObject.set(x, "data_attribute", js.undefined)
      
      inline def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setFailure_limit(value: Double): Self = StObject.set(x, "failure_limit", value.asInstanceOf[js.Any])
      
      inline def setFailure_limitUndefined: Self = StObject.set(x, "failure_limit", js.undefined)
      
      inline def setLoad(value: (/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[Options]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSkip_invisible(value: Boolean): Self = StObject.set(x, "skip_invisible", value.asInstanceOf[js.Any])
      
      inline def setSkip_invisibleUndefined: Self = StObject.set(x, "skip_invisible", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
