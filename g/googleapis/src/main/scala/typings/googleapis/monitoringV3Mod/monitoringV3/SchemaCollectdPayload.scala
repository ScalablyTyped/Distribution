package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectdPayload extends StObject {
  
  /**
    * The end time of the interval.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The measurement metadata. Example: "process_id" -\> 12345
    */
  var metadata: js.UndefOr[StringDictionary[SchemaTypedValue] | Null] = js.undefined
  
  /**
    * The name of the plugin. Example: "disk".
    */
  var plugin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The instance name of the plugin Example: "hdcl".
    */
  var pluginInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of the interval.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The measurement type. Example: "memory".
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The measurement type instance. Example: "used".
    */
  var typeInstance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The measured values during this time interval. Each value must have a different data_source_name.
    */
  var values: js.UndefOr[js.Array[SchemaCollectdValue]] = js.undefined
}
object SchemaCollectdPayload {
  
  inline def apply(): SchemaCollectdPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdPayload]
  }
  
  extension [Self <: SchemaCollectdPayload](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMetadata(value: StringDictionary[SchemaTypedValue]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginInstance(value: String): Self = StObject.set(x, "pluginInstance", value.asInstanceOf[js.Any])
    
    inline def setPluginInstanceNull: Self = StObject.set(x, "pluginInstance", null)
    
    inline def setPluginInstanceUndefined: Self = StObject.set(x, "pluginInstance", js.undefined)
    
    inline def setPluginNull: Self = StObject.set(x, "plugin", null)
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeInstance(value: String): Self = StObject.set(x, "typeInstance", value.asInstanceOf[js.Any])
    
    inline def setTypeInstanceNull: Self = StObject.set(x, "typeInstance", null)
    
    inline def setTypeInstanceUndefined: Self = StObject.set(x, "typeInstance", js.undefined)
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValues(value: js.Array[SchemaCollectdValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaCollectdValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
