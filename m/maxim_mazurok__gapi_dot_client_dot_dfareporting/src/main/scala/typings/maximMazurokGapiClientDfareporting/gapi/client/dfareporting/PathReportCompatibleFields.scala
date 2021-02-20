package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathReportCompatibleFields extends StObject {
  
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
  implicit class PathReportCompatibleFieldsMutableBuilder[Self <: PathReportCompatibleFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelGroupings(value: js.Array[Dimension]): Self = StObject.set(x, "channelGroupings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupingsUndefined: Self = StObject.set(x, "channelGroupings", js.undefined)
    
    @scala.inline
    def setChannelGroupingsVarargs(value: Dimension*): Self = StObject.set(x, "channelGroupings", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setPathFilters(value: js.Array[Dimension]): Self = StObject.set(x, "pathFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathFiltersUndefined: Self = StObject.set(x, "pathFilters", js.undefined)
    
    @scala.inline
    def setPathFiltersVarargs(value: Dimension*): Self = StObject.set(x, "pathFilters", js.Array(value :_*))
  }
}
