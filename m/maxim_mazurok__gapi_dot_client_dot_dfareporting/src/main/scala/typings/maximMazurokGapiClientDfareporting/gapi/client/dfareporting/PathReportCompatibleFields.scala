package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathReportCompatibleFields extends js.Object {
  
  /** Dimensions which are compatible to be selected in the "channelGroupings" section of the report. */
  var channelGroupings: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Dimensions which are compatible to be selected in the "dimensions" section of the report. */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** The kind of resource this is, in this case dfareporting#pathReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.native
  
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /** Dimensions which are compatible to be selected in the "pathFilters" section of the report. */
  var pathFilters: js.UndefOr[js.Array[Dimension]] = js.native
}
object PathReportCompatibleFields {
  
  @scala.inline
  def apply(): PathReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathReportCompatibleFields]
  }
  
  @scala.inline
  implicit class PathReportCompatibleFieldsOps[Self <: PathReportCompatibleFields] (val x: Self) extends AnyVal {
    
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
    def setChannelGroupingsVarargs(value: Dimension*): Self = this.set("channelGroupings", js.Array(value :_*))
    
    @scala.inline
    def setChannelGroupings(value: js.Array[Dimension]): Self = this.set("channelGroupings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelGroupings: Self = this.set("channelGroupings", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: Dimension*): Self = this.set("pathFilters", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[Dimension]): Self = this.set("pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathFilters: Self = this.set("pathFilters", js.undefined)
  }
}
