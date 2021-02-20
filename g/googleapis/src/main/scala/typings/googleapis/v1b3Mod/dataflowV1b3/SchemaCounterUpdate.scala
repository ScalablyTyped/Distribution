package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An update to a Counter sent from a worker.
  */
@js.native
trait SchemaCounterUpdate extends StObject {
  
  /**
    * Boolean value for And, Or.
    */
  var boolean: js.UndefOr[Boolean] = js.native
  
  /**
    * True if this counter is reported as the total cumulative aggregate value
    * accumulated since the worker started working on this WorkItem. By default
    * this is false, indicating that this counter is reported as a delta.
    */
  var cumulative: js.UndefOr[Boolean] = js.native
  
  /**
    * Distribution data
    */
  var distribution: js.UndefOr[SchemaDistributionUpdate] = js.native
  
  /**
    * Floating point value for Sum, Max, Min.
    */
  var floatingPoint: js.UndefOr[Double] = js.native
  
  /**
    * List of floating point numbers, for Set.
    */
  var floatingPointList: js.UndefOr[SchemaFloatingPointList] = js.native
  
  /**
    * Floating point mean aggregation value for Mean.
    */
  var floatingPointMean: js.UndefOr[SchemaFloatingPointMean] = js.native
  
  /**
    * Integer value for Sum, Max, Min.
    */
  var integer: js.UndefOr[SchemaSplitInt64] = js.native
  
  /**
    * Gauge data
    */
  var integerGauge: js.UndefOr[SchemaIntegerGauge] = js.native
  
  /**
    * List of integers, for Set.
    */
  var integerList: js.UndefOr[SchemaIntegerList] = js.native
  
  /**
    * Integer mean aggregation value for Mean.
    */
  var integerMean: js.UndefOr[SchemaIntegerMean] = js.native
  
  /**
    * Value for internally-defined counters used by the Dataflow service.
    */
  var internal: js.UndefOr[js.Any] = js.native
  
  /**
    * Counter name and aggregation type.
    */
  var nameAndKind: js.UndefOr[SchemaNameAndKind] = js.native
  
  /**
    * The service-generated short identifier for this counter. The short_id
    * -&gt; (name, metadata) mapping is constant for the lifetime of a job.
    */
  var shortId: js.UndefOr[String] = js.native
  
  /**
    * List of strings, for Set.
    */
  var stringList: js.UndefOr[SchemaStringList] = js.native
  
  /**
    * Counter structured name and metadata.
    */
  var structuredNameAndMetadata: js.UndefOr[SchemaCounterStructuredNameAndMetadata] = js.native
}
object SchemaCounterUpdate {
  
  @scala.inline
  def apply(): SchemaCounterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCounterUpdate]
  }
  
  @scala.inline
  implicit class SchemaCounterUpdateMutableBuilder[Self <: SchemaCounterUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolean(value: Boolean): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
    
    @scala.inline
    def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    @scala.inline
    def setDistribution(value: SchemaDistributionUpdate): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    @scala.inline
    def setFloatingPoint(value: Double): Self = StObject.set(x, "floatingPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingPointList(value: SchemaFloatingPointList): Self = StObject.set(x, "floatingPointList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingPointListUndefined: Self = StObject.set(x, "floatingPointList", js.undefined)
    
    @scala.inline
    def setFloatingPointMean(value: SchemaFloatingPointMean): Self = StObject.set(x, "floatingPointMean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingPointMeanUndefined: Self = StObject.set(x, "floatingPointMean", js.undefined)
    
    @scala.inline
    def setFloatingPointUndefined: Self = StObject.set(x, "floatingPoint", js.undefined)
    
    @scala.inline
    def setInteger(value: SchemaSplitInt64): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerGauge(value: SchemaIntegerGauge): Self = StObject.set(x, "integerGauge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerGaugeUndefined: Self = StObject.set(x, "integerGauge", js.undefined)
    
    @scala.inline
    def setIntegerList(value: SchemaIntegerList): Self = StObject.set(x, "integerList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerListUndefined: Self = StObject.set(x, "integerList", js.undefined)
    
    @scala.inline
    def setIntegerMean(value: SchemaIntegerMean): Self = StObject.set(x, "integerMean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerMeanUndefined: Self = StObject.set(x, "integerMean", js.undefined)
    
    @scala.inline
    def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
    
    @scala.inline
    def setInternal(value: js.Any): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    @scala.inline
    def setNameAndKind(value: SchemaNameAndKind): Self = StObject.set(x, "nameAndKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameAndKindUndefined: Self = StObject.set(x, "nameAndKind", js.undefined)
    
    @scala.inline
    def setShortId(value: String): Self = StObject.set(x, "shortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortIdUndefined: Self = StObject.set(x, "shortId", js.undefined)
    
    @scala.inline
    def setStringList(value: SchemaStringList): Self = StObject.set(x, "stringList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringListUndefined: Self = StObject.set(x, "stringList", js.undefined)
    
    @scala.inline
    def setStructuredNameAndMetadata(value: SchemaCounterStructuredNameAndMetadata): Self = StObject.set(x, "structuredNameAndMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredNameAndMetadataUndefined: Self = StObject.set(x, "structuredNameAndMetadata", js.undefined)
  }
}
