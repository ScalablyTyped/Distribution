package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCounterUpdate extends StObject {
  
  /**
    * Boolean value for And, Or.
    */
  var boolean: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True if this counter is reported as the total cumulative aggregate value accumulated since the worker started working on this WorkItem. By default this is false, indicating that this counter is reported as a delta.
    */
  var cumulative: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Distribution data
    */
  var distribution: js.UndefOr[SchemaDistributionUpdate] = js.undefined
  
  /**
    * Floating point value for Sum, Max, Min.
    */
  var floatingPoint: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * List of floating point numbers, for Set.
    */
  var floatingPointList: js.UndefOr[SchemaFloatingPointList] = js.undefined
  
  /**
    * Floating point mean aggregation value for Mean.
    */
  var floatingPointMean: js.UndefOr[SchemaFloatingPointMean] = js.undefined
  
  /**
    * Integer value for Sum, Max, Min.
    */
  var integer: js.UndefOr[SchemaSplitInt64] = js.undefined
  
  /**
    * Gauge data
    */
  var integerGauge: js.UndefOr[SchemaIntegerGauge] = js.undefined
  
  /**
    * List of integers, for Set.
    */
  var integerList: js.UndefOr[SchemaIntegerList] = js.undefined
  
  /**
    * Integer mean aggregation value for Mean.
    */
  var integerMean: js.UndefOr[SchemaIntegerMean] = js.undefined
  
  /**
    * Value for internally-defined counters used by the Dataflow service.
    */
  var internal: js.UndefOr[Any | Null] = js.undefined
  
  /**
    * Counter name and aggregation type.
    */
  var nameAndKind: js.UndefOr[SchemaNameAndKind] = js.undefined
  
  /**
    * The service-generated short identifier for this counter. The short_id -\> (name, metadata) mapping is constant for the lifetime of a job.
    */
  var shortId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of strings, for Set.
    */
  var stringList: js.UndefOr[SchemaStringList] = js.undefined
  
  /**
    * Counter structured name and metadata.
    */
  var structuredNameAndMetadata: js.UndefOr[SchemaCounterStructuredNameAndMetadata] = js.undefined
}
object SchemaCounterUpdate {
  
  inline def apply(): SchemaCounterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterUpdate]
  }
  
  extension [Self <: SchemaCounterUpdate](x: Self) {
    
    inline def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setBooleanNull: Self = StObject.set(x, "boolean", null)
    
    inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeNull: Self = StObject.set(x, "cumulative", null)
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setDistribution(value: SchemaDistributionUpdate): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setFloatingPoint(value: Double): Self = StObject.set(x, "floatingPoint", value.asInstanceOf[js.Any])
    
    inline def setFloatingPointList(value: SchemaFloatingPointList): Self = StObject.set(x, "floatingPointList", value.asInstanceOf[js.Any])
    
    inline def setFloatingPointListUndefined: Self = StObject.set(x, "floatingPointList", js.undefined)
    
    inline def setFloatingPointMean(value: SchemaFloatingPointMean): Self = StObject.set(x, "floatingPointMean", value.asInstanceOf[js.Any])
    
    inline def setFloatingPointMeanUndefined: Self = StObject.set(x, "floatingPointMean", js.undefined)
    
    inline def setFloatingPointNull: Self = StObject.set(x, "floatingPoint", null)
    
    inline def setFloatingPointUndefined: Self = StObject.set(x, "floatingPoint", js.undefined)
    
    inline def setInteger(value: SchemaSplitInt64): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setIntegerGauge(value: SchemaIntegerGauge): Self = StObject.set(x, "integerGauge", value.asInstanceOf[js.Any])
    
    inline def setIntegerGaugeUndefined: Self = StObject.set(x, "integerGauge", js.undefined)
    
    inline def setIntegerList(value: SchemaIntegerList): Self = StObject.set(x, "integerList", value.asInstanceOf[js.Any])
    
    inline def setIntegerListUndefined: Self = StObject.set(x, "integerList", js.undefined)
    
    inline def setIntegerMean(value: SchemaIntegerMean): Self = StObject.set(x, "integerMean", value.asInstanceOf[js.Any])
    
    inline def setIntegerMeanUndefined: Self = StObject.set(x, "integerMean", js.undefined)
    
    inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    inline def setInternal(value: Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalNull: Self = StObject.set(x, "internal", null)
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setNameAndKind(value: SchemaNameAndKind): Self = StObject.set(x, "nameAndKind", value.asInstanceOf[js.Any])
    
    inline def setNameAndKindUndefined: Self = StObject.set(x, "nameAndKind", js.undefined)
    
    inline def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
    
    inline def setShortIdNull: Self = StObject.set(x, "shortId", null)
    
    inline def setShortIdUndefined: Self = StObject.set(x, "shortId", js.undefined)
    
    inline def setStringList(value: SchemaStringList): Self = StObject.set(x, "stringList", value.asInstanceOf[js.Any])
    
    inline def setStringListUndefined: Self = StObject.set(x, "stringList", js.undefined)
    
    inline def setStructuredNameAndMetadata(value: SchemaCounterStructuredNameAndMetadata): Self = StObject.set(x, "structuredNameAndMetadata", value.asInstanceOf[js.Any])
    
    inline def setStructuredNameAndMetadataUndefined: Self = StObject.set(x, "structuredNameAndMetadata", js.undefined)
  }
}
