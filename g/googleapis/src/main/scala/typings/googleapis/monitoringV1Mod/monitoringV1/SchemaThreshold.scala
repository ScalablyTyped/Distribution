package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaThreshold extends StObject {
  
  /**
    * The state color for this threshold. Color is not allowed in a XyChart.
    */
  var color: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The direction for the current threshold. Direction is not allowed in a XyChart.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A label for the threshold.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target axis to use for plotting the threshold. Target axis is not allowed in a Scorecard.
    */
  var targetAxis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the threshold. The value should be defined in the native scale of the metric.
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object SchemaThreshold {
  
  inline def apply(): SchemaThreshold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreshold]
  }
  
  extension [Self <: SchemaThreshold](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTargetAxis(value: String): Self = StObject.set(x, "targetAxis", value.asInstanceOf[js.Any])
    
    inline def setTargetAxisNull: Self = StObject.set(x, "targetAxis", null)
    
    inline def setTargetAxisUndefined: Self = StObject.set(x, "targetAxis", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
