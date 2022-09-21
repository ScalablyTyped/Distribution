package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDataPoint extends StObject {
  
  /**
    * DO NOT USE THIS FIELD. It is ignored, and not stored.
    */
  var computationTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data type defining the format of the values in this data point.
    */
  var dataTypeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The end time of the interval represented by this data point, in nanoseconds since epoch.
    */
  var endTimeNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates the last time this data point was modified. Useful only in contexts where we are listing the data changes, rather than representing the current state of the data.
    */
  var modifiedTimeMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the data point is contained in a dataset for a derived data source, this field will be populated with the data source stream ID that created the data point originally. WARNING: do not rely on this field for anything other than debugging. The value of this field, if it is set at all, is an implementation detail and is not guaranteed to remain consistent.
    */
  var originDataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The raw timestamp from the original SensorEvent.
    */
  var rawTimestampNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start time of the interval represented by this data point, in nanoseconds since epoch.
    */
  var startTimeNanos: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Values of each data type field for the data point. It is expected that each value corresponding to a data type field will occur in the same order that the field is listed with in the data type specified in a data source. Only one of integer and floating point fields will be populated, depending on the format enum value within data source's type field.
    */
  var value: js.UndefOr[js.Array[SchemaValue]] = js.undefined
}
object SchemaDataPoint {
  
  inline def apply(): SchemaDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDataPoint]
  }
  
  extension [Self <: SchemaDataPoint](x: Self) {
    
    inline def setComputationTimeMillis(value: String): Self = StObject.set(x, "computationTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setComputationTimeMillisNull: Self = StObject.set(x, "computationTimeMillis", null)
    
    inline def setComputationTimeMillisUndefined: Self = StObject.set(x, "computationTimeMillis", js.undefined)
    
    inline def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNameNull: Self = StObject.set(x, "dataTypeName", null)
    
    inline def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
    
    inline def setEndTimeNanos(value: String): Self = StObject.set(x, "endTimeNanos", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNanosNull: Self = StObject.set(x, "endTimeNanos", null)
    
    inline def setEndTimeNanosUndefined: Self = StObject.set(x, "endTimeNanos", js.undefined)
    
    inline def setModifiedTimeMillis(value: String): Self = StObject.set(x, "modifiedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setModifiedTimeMillisNull: Self = StObject.set(x, "modifiedTimeMillis", null)
    
    inline def setModifiedTimeMillisUndefined: Self = StObject.set(x, "modifiedTimeMillis", js.undefined)
    
    inline def setOriginDataSourceId(value: String): Self = StObject.set(x, "originDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setOriginDataSourceIdNull: Self = StObject.set(x, "originDataSourceId", null)
    
    inline def setOriginDataSourceIdUndefined: Self = StObject.set(x, "originDataSourceId", js.undefined)
    
    inline def setRawTimestampNanos(value: String): Self = StObject.set(x, "rawTimestampNanos", value.asInstanceOf[js.Any])
    
    inline def setRawTimestampNanosNull: Self = StObject.set(x, "rawTimestampNanos", null)
    
    inline def setRawTimestampNanosUndefined: Self = StObject.set(x, "rawTimestampNanos", js.undefined)
    
    inline def setStartTimeNanos(value: String): Self = StObject.set(x, "startTimeNanos", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNanosNull: Self = StObject.set(x, "startTimeNanos", null)
    
    inline def setStartTimeNanosUndefined: Self = StObject.set(x, "startTimeNanos", js.undefined)
    
    inline def setValue(value: js.Array[SchemaValue]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: SchemaValue*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
