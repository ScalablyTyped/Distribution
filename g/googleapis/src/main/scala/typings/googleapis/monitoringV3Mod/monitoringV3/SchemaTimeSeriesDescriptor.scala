package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesDescriptor extends StObject {
  
  /**
    * Descriptors for the labels.
    */
  var labelDescriptors: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.undefined
  
  /**
    * Descriptors for the point data value columns.
    */
  var pointDescriptors: js.UndefOr[js.Array[SchemaValueDescriptor]] = js.undefined
}
object SchemaTimeSeriesDescriptor {
  
  inline def apply(): SchemaTimeSeriesDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesDescriptor]
  }
  
  extension [Self <: SchemaTimeSeriesDescriptor](x: Self) {
    
    inline def setLabelDescriptors(value: js.Array[SchemaLabelDescriptor]): Self = StObject.set(x, "labelDescriptors", value.asInstanceOf[js.Any])
    
    inline def setLabelDescriptorsUndefined: Self = StObject.set(x, "labelDescriptors", js.undefined)
    
    inline def setLabelDescriptorsVarargs(value: SchemaLabelDescriptor*): Self = StObject.set(x, "labelDescriptors", js.Array(value*))
    
    inline def setPointDescriptors(value: js.Array[SchemaValueDescriptor]): Self = StObject.set(x, "pointDescriptors", value.asInstanceOf[js.Any])
    
    inline def setPointDescriptorsUndefined: Self = StObject.set(x, "pointDescriptors", js.undefined)
    
    inline def setPointDescriptorsVarargs(value: SchemaValueDescriptor*): Self = StObject.set(x, "pointDescriptors", js.Array(value*))
  }
}
