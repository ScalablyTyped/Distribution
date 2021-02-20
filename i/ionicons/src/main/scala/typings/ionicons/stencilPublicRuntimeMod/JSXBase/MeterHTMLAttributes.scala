package typings.ionicons.stencilPublicRuntimeMod.JSXBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeterHTMLAttributes[T] extends HTMLAttributes[T] {
  
  var form: js.UndefOr[String] = js.native
  
  var high: js.UndefOr[Double] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var optimum: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[String | js.Array[String] | Double] = js.native
}
object MeterHTMLAttributes {
  
  @scala.inline
  def apply[T](): MeterHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class MeterHTMLAttributesMutableBuilder[Self <: MeterHTMLAttributes[_], T] (val x: Self with MeterHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
    
    @scala.inline
    def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
