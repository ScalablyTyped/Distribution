package typings.imgDiffJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait IncludeAA extends StObject {
    
    /** {default:false} */
    var includeAA: js.UndefOr[Boolean] = js.native
    
    /** {default: 0.1} */
    var threshold: js.UndefOr[Double] = js.native
  }
  object IncludeAA {
    
    @scala.inline
    def apply(): IncludeAA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IncludeAA]
    }
    
    @scala.inline
    implicit class IncludeAAMutableBuilder[Self <: IncludeAA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeAA(value: Boolean): Self = StObject.set(x, "includeAA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAAUndefined: Self = StObject.set(x, "includeAA", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
