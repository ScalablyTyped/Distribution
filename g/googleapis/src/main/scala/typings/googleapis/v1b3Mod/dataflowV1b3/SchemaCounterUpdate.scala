package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An update to a Counter sent from a worker.
  */
@js.native
trait SchemaCounterUpdate extends js.Object {
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
  implicit class SchemaCounterUpdateOps[Self <: SchemaCounterUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoolean(value: Boolean): Self = this.set("boolean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolean: Self = this.set("boolean", js.undefined)
    @scala.inline
    def setCumulative(value: Boolean): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCumulative: Self = this.set("cumulative", js.undefined)
    @scala.inline
    def setDistribution(value: SchemaDistributionUpdate): Self = this.set("distribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    @scala.inline
    def setFloatingPoint(value: Double): Self = this.set("floatingPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingPoint: Self = this.set("floatingPoint", js.undefined)
    @scala.inline
    def setFloatingPointList(value: SchemaFloatingPointList): Self = this.set("floatingPointList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingPointList: Self = this.set("floatingPointList", js.undefined)
    @scala.inline
    def setFloatingPointMean(value: SchemaFloatingPointMean): Self = this.set("floatingPointMean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatingPointMean: Self = this.set("floatingPointMean", js.undefined)
    @scala.inline
    def setInteger(value: SchemaSplitInt64): Self = this.set("integer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteger: Self = this.set("integer", js.undefined)
    @scala.inline
    def setIntegerGauge(value: SchemaIntegerGauge): Self = this.set("integerGauge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerGauge: Self = this.set("integerGauge", js.undefined)
    @scala.inline
    def setIntegerList(value: SchemaIntegerList): Self = this.set("integerList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerList: Self = this.set("integerList", js.undefined)
    @scala.inline
    def setIntegerMean(value: SchemaIntegerMean): Self = this.set("integerMean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegerMean: Self = this.set("integerMean", js.undefined)
    @scala.inline
    def setInternal(value: js.Any): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setNameAndKind(value: SchemaNameAndKind): Self = this.set("nameAndKind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameAndKind: Self = this.set("nameAndKind", js.undefined)
    @scala.inline
    def setShortId(value: String): Self = this.set("shortId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortId: Self = this.set("shortId", js.undefined)
    @scala.inline
    def setStringList(value: SchemaStringList): Self = this.set("stringList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringList: Self = this.set("stringList", js.undefined)
    @scala.inline
    def setStructuredNameAndMetadata(value: SchemaCounterStructuredNameAndMetadata): Self = this.set("structuredNameAndMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructuredNameAndMetadata: Self = this.set("structuredNameAndMetadata", js.undefined)
  }
  
}

