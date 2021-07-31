package typings.jimpPluginThreshold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoGreyscale extends StObject {
    
    var autoGreyscale: js.UndefOr[Boolean] = js.undefined
    
    var max: Double
    
    var replace: js.UndefOr[Double] = js.undefined
  }
  object AutoGreyscale {
    
    @scala.inline
    def apply(max: Double): AutoGreyscale = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoGreyscale]
    }
    
    @scala.inline
    implicit class AutoGreyscaleMutableBuilder[Self <: AutoGreyscale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGreyscale(value: Boolean): Self = StObject.set(x, "autoGreyscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGreyscaleUndefined: Self = StObject.set(x, "autoGreyscale", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplace(value: Double): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
}
