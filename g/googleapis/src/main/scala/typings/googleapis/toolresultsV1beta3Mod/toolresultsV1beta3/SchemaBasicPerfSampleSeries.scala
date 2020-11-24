package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the metadata for basic sample series represented by a line
  * chart
  */
@js.native
trait SchemaBasicPerfSampleSeries extends js.Object {
  
  var perfMetricType: js.UndefOr[String] = js.native
  
  var perfUnit: js.UndefOr[String] = js.native
  
  var sampleSeriesLabel: js.UndefOr[String] = js.native
}
object SchemaBasicPerfSampleSeries {
  
  @scala.inline
  def apply(): SchemaBasicPerfSampleSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicPerfSampleSeries]
  }
  
  @scala.inline
  implicit class SchemaBasicPerfSampleSeriesOps[Self <: SchemaBasicPerfSampleSeries] (val x: Self) extends AnyVal {
    
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
    def setPerfMetricType(value: String): Self = this.set("perfMetricType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfMetricType: Self = this.set("perfMetricType", js.undefined)
    
    @scala.inline
    def setPerfUnit(value: String): Self = this.set("perfUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfUnit: Self = this.set("perfUnit", js.undefined)
    
    @scala.inline
    def setSampleSeriesLabel(value: String): Self = this.set("sampleSeriesLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSeriesLabel: Self = this.set("sampleSeriesLabel", js.undefined)
  }
}
