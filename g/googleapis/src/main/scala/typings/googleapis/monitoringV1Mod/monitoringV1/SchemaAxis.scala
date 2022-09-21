package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAxis extends StObject {
  
  /**
    * The label of the axis.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The axis scale. By default, a linear scale is used.
    */
  var scale: js.UndefOr[String | Null] = js.undefined
}
object SchemaAxis {
  
  inline def apply(): SchemaAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAxis]
  }
  
  extension [Self <: SchemaAxis](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
