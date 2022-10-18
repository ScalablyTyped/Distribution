package typings.maplibreGl.distStyleSpecMod

import typings.maplibreGl.maplibreGlStrings.geojson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONSourceSpecification
  extends StObject
     with SourceSpecification {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var cluster: js.UndefOr[Boolean] = js.undefined
  
  var clusterMaxZoom: js.UndefOr[Double] = js.undefined
  
  var clusterMinPoints: js.UndefOr[Double] = js.undefined
  
  var clusterProperties: js.UndefOr[Any] = js.undefined
  
  var clusterRadius: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
  
  var filter: js.UndefOr[Any] = js.undefined
  
  var generateId: js.UndefOr[Boolean] = js.undefined
  
  var lineMetrics: js.UndefOr[Boolean] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
  
  var `type`: geojson
}
object GeoJSONSourceSpecification {
  
  inline def apply(): GeoJSONSourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("geojson")
    __obj.asInstanceOf[GeoJSONSourceSpecification]
  }
  
  extension [Self <: GeoJSONSourceSpecification](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCluster(value: Boolean): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterMaxZoom(value: Double): Self = StObject.set(x, "clusterMaxZoom", value.asInstanceOf[js.Any])
    
    inline def setClusterMaxZoomUndefined: Self = StObject.set(x, "clusterMaxZoom", js.undefined)
    
    inline def setClusterMinPoints(value: Double): Self = StObject.set(x, "clusterMinPoints", value.asInstanceOf[js.Any])
    
    inline def setClusterMinPointsUndefined: Self = StObject.set(x, "clusterMinPoints", js.undefined)
    
    inline def setClusterProperties(value: Any): Self = StObject.set(x, "clusterProperties", value.asInstanceOf[js.Any])
    
    inline def setClusterPropertiesUndefined: Self = StObject.set(x, "clusterProperties", js.undefined)
    
    inline def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    inline def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGenerateId(value: Boolean): Self = StObject.set(x, "generateId", value.asInstanceOf[js.Any])
    
    inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    inline def setLineMetrics(value: Boolean): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
    
    inline def setLineMetricsUndefined: Self = StObject.set(x, "lineMetrics", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    inline def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    
    inline def setType(value: geojson): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
