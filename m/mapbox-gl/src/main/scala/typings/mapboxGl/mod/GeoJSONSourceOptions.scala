package typings.mapboxGl.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONSourceOptions extends js.Object {
  
  var attribution: js.UndefOr[String] = js.native
  
  var buffer: js.UndefOr[Double] = js.native
  
  var cluster: js.UndefOr[Double | Boolean] = js.native
  
  var clusterMaxZoom: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of points necessary to form a cluster if clustering is enabled. Defaults to `2`.
    */
  var clusterMinPoints: js.UndefOr[Double] = js.native
  
  var clusterProperties: js.UndefOr[js.Object] = js.native
  
  var clusterRadius: js.UndefOr[Double] = js.native
  
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.native
  
  var filter: js.UndefOr[js.Any] = js.native
  
  var generateId: js.UndefOr[Boolean] = js.native
  
  var lineMetrics: js.UndefOr[Boolean] = js.native
  
  var maxzoom: js.UndefOr[Double] = js.native
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.native
  
  var tolerance: js.UndefOr[Double] = js.native
}
object GeoJSONSourceOptions {
  
  @scala.inline
  def apply(): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
  
  @scala.inline
  implicit class GeoJSONSourceOptionsOps[Self <: GeoJSONSourceOptions] (val x: Self) extends AnyVal {
    
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
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
    
    @scala.inline
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    
    @scala.inline
    def setCluster(value: Double | Boolean): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
    
    @scala.inline
    def setClusterMaxZoom(value: Double): Self = this.set("clusterMaxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMaxZoom: Self = this.set("clusterMaxZoom", js.undefined)
    
    @scala.inline
    def setClusterMinPoints(value: Double): Self = this.set("clusterMinPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterMinPoints: Self = this.set("clusterMinPoints", js.undefined)
    
    @scala.inline
    def setClusterProperties(value: js.Object): Self = this.set("clusterProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterProperties: Self = this.set("clusterProperties", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double): Self = this.set("clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRadius: Self = this.set("clusterRadius", js.undefined)
    
    @scala.inline
    def setData(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Any): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGenerateId(value: Boolean): Self = this.set("generateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateId: Self = this.set("generateId", js.undefined)
    
    @scala.inline
    def setLineMetrics(value: Boolean): Self = this.set("lineMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineMetrics: Self = this.set("lineMetrics", js.undefined)
    
    @scala.inline
    def setMaxzoom(value: Double): Self = this.set("maxzoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxzoom: Self = this.set("maxzoom", js.undefined)
    
    @scala.inline
    def setPromoteId(value: PromoteIdSpecification): Self = this.set("promoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoteId: Self = this.set("promoteId", js.undefined)
    
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
}
