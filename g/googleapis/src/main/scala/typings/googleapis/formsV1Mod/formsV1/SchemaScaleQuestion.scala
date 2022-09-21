package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScaleQuestion extends StObject {
  
  /**
    * Required. The highest possible value for the scale.
    */
  var high: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The label to display describing the highest point on the scale.
    */
  var highLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The lowest possible value for the scale.
    */
  var low: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The label to display describing the lowest point on the scale.
    */
  var lowLabel: js.UndefOr[String | Null] = js.undefined
}
object SchemaScaleQuestion {
  
  inline def apply(): SchemaScaleQuestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScaleQuestion]
  }
  
  extension [Self <: SchemaScaleQuestion](x: Self) {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighLabel(value: String): Self = StObject.set(x, "highLabel", value.asInstanceOf[js.Any])
    
    inline def setHighLabelNull: Self = StObject.set(x, "highLabel", null)
    
    inline def setHighLabelUndefined: Self = StObject.set(x, "highLabel", js.undefined)
    
    inline def setHighNull: Self = StObject.set(x, "high", null)
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowLabel(value: String): Self = StObject.set(x, "lowLabel", value.asInstanceOf[js.Any])
    
    inline def setLowLabelNull: Self = StObject.set(x, "lowLabel", null)
    
    inline def setLowLabelUndefined: Self = StObject.set(x, "lowLabel", js.undefined)
    
    inline def setLowNull: Self = StObject.set(x, "low", null)
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
  }
}
