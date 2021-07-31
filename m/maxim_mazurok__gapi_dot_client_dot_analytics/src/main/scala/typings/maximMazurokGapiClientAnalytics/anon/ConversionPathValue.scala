package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversionPathValue extends StObject {
  
  /** A conversion path dimension value, containing a list of interactions with their attributes. */
  var conversionPathValue: js.UndefOr[js.Array[InteractionType]] = js.undefined
  
  /** A primitive dimension value. A primitive metric value. */
  var primitiveValue: js.UndefOr[String] = js.undefined
}
object ConversionPathValue {
  
  @scala.inline
  def apply(): ConversionPathValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversionPathValue]
  }
  
  @scala.inline
  implicit class ConversionPathValueMutableBuilder[Self <: ConversionPathValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionPathValue(value: js.Array[InteractionType]): Self = StObject.set(x, "conversionPathValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionPathValueUndefined: Self = StObject.set(x, "conversionPathValue", js.undefined)
    
    @scala.inline
    def setConversionPathValueVarargs(value: InteractionType*): Self = StObject.set(x, "conversionPathValue", js.Array(value :_*))
    
    @scala.inline
    def setPrimitiveValue(value: String): Self = StObject.set(x, "primitiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveValueUndefined: Self = StObject.set(x, "primitiveValue", js.undefined)
  }
}
