package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;PATH_TO_CONVERSION&quot;.
  */
@js.native
trait SchemaPathToConversionReportCompatibleFields extends js.Object {
  /**
    * Conversion dimensions which are compatible to be selected in the
    * &quot;conversionDimensions&quot; section of the report.
    */
  var conversionDimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * Custom floodlight variables which are compatible to be selected in the
    * &quot;customFloodlightVariables&quot; section of the report.
    */
  var customFloodlightVariables: js.UndefOr[js.Array[SchemaDimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#pathToConversionReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.native
  /**
    * Per-interaction dimensions which are compatible to be selected in the
    * &quot;perInteractionDimensions&quot; section of the report.
    */
  var perInteractionDimensions: js.UndefOr[js.Array[SchemaDimension]] = js.native
}

object SchemaPathToConversionReportCompatibleFields {
  @scala.inline
  def apply(): SchemaPathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathToConversionReportCompatibleFields]
  }
  @scala.inline
  implicit class SchemaPathToConversionReportCompatibleFieldsOps[Self <: SchemaPathToConversionReportCompatibleFields] (val x: Self) extends AnyVal {
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
    def setConversionDimensionsVarargs(value: SchemaDimension*): Self = this.set("conversionDimensions", js.Array(value :_*))
    @scala.inline
    def setConversionDimensions(value: js.Array[SchemaDimension]): Self = this.set("conversionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConversionDimensions: Self = this.set("conversionDimensions", js.undefined)
    @scala.inline
    def setCustomFloodlightVariablesVarargs(value: SchemaDimension*): Self = this.set("customFloodlightVariables", js.Array(value :_*))
    @scala.inline
    def setCustomFloodlightVariables(value: js.Array[SchemaDimension]): Self = this.set("customFloodlightVariables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFloodlightVariables: Self = this.set("customFloodlightVariables", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: SchemaMetric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[SchemaMetric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setPerInteractionDimensionsVarargs(value: SchemaDimension*): Self = this.set("perInteractionDimensions", js.Array(value :_*))
    @scala.inline
    def setPerInteractionDimensions(value: js.Array[SchemaDimension]): Self = this.set("perInteractionDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerInteractionDimensions: Self = this.set("perInteractionDimensions", js.undefined)
  }
  
}

