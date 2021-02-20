package typings.jqueryLazyload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryLazyLoad {
  
  @js.native
  trait Options extends StObject {
    
    var appear: js.UndefOr[(js.Function2[/* elementsLeft */ Double, /* options */ this.type, Unit]) | Null] = js.native
    
    var container: js.UndefOr[JQuery] = js.native
    
    var data_attribute: js.UndefOr[String] = js.native
    
    var effect: js.UndefOr[String] = js.native
    
    var event: js.UndefOr[String] = js.native
    
    var failure_limit: js.UndefOr[Double] = js.native
    
    var load: js.UndefOr[
        js.Function2[/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[this.type], Unit]
      ] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var skip_invisible: js.UndefOr[Boolean] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
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
      def setAppear(value: (/* elementsLeft */ Double, Options) => Unit): Self = StObject.set(x, "appear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAppearNull: Self = StObject.set(x, "appear", null)
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setContainer(value: JQuery): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setData_attribute(value: String): Self = StObject.set(x, "data_attribute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_attributeUndefined: Self = StObject.set(x, "data_attribute", js.undefined)
      
      @scala.inline
      def setEffect(value: String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setFailure_limit(value: Double): Self = StObject.set(x, "failure_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailure_limitUndefined: Self = StObject.set(x, "failure_limit", js.undefined)
      
      @scala.inline
      def setLoad(value: (/* elementsLeft */ js.UndefOr[Double], /* options */ js.UndefOr[Options]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setSkip_invisible(value: Boolean): Self = StObject.set(x, "skip_invisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_invisibleUndefined: Self = StObject.set(x, "skip_invisible", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
