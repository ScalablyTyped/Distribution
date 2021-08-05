package typings.heremaps.H.map

import typings.heremaps.H.geo.MultiPolygon
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a polygon in geo-space. It is defined by a strip containing the vertices of a geo shape object (lat, lng, alt values) and a pen to use when rendering the polyline.
  * Polygon represents a closed plane defined by the list of verticies, projected on the map display. List of vericies which define the polygon are is a list of geo coordinates encapsulated
  * by the strip object H.geo.Strip
  */
@js.native
trait Polygon
  extends StObject
     with GeoShape {
  
  /**
    * To obtain the polygon's geometry. If you modify the obtained geometry, you must call setGeometry afterwards to not violate the integrity of the polygon.
    */
  def getGeometry(): typings.heremaps.H.geo.Polygon | MultiPolygon = js.native
  
  /**
    * See H.map.Polygon#setNorthPoleCovering
    * @returns {boolean}
    */
  def getNorthPoleCovering(): Boolean = js.native
  
  def setGeometry(geometry: MultiPolygon): Polygon = js.native
  /**
    * To set the polygon's geometry. If the given geometry is modified afterwards, it must be set via setGeometry again to not violate the integrity of the polygon.
    * @param geometry
    */
  def setGeometry(geometry: typings.heremaps.H.geo.Polygon): Polygon = js.native
  
  /**
    * To set the indicator whether this polygon covers the north pole. It's needed for Polygons whose strip is defined as lines arround the world on longitude axis (for example a circle whose
    * center is one of the poles). In this case a additional information is needed to know if the southern or northern part of the world should be covered by the poygon.
    * @param flag {boolean} - A value of true means it covers the north pole, false means south pole
    * @returns {H.map.Polygon} - the Polygon instance itself
    */
  def setNorthPoleCovering(flag: Boolean): Polygon = js.native
}
object Polygon {
  
  /**
    * @property style {H.map.SpatialStyle | H.map.SpatialStyle.Options} - The style to be used when tracing the spatial object.
    * @property arrows {H.map.ArrowStyle | H.map.ArrowStyle.Options} - The arrows style to be used when rendering the spatial object.
    * @property visibility {boolean}
    * Indicates whether the map object is visible, the default is true A map object is only treated as visible, if it self and all of its nesting parent groups are visible.
    */
  trait Options extends StObject {
    
    var arrows: js.UndefOr[ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options] = js.undefined
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var elevation: js.UndefOr[Double] = js.undefined
    
    var extrusion: js.UndefOr[Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider | Null] = js.undefined
    
    var style: js.UndefOr[SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options] = js.undefined
    
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    var volatility: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArrows(value: ArrowStyle | typings.heremaps.H.map.ArrowStyle.Options): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setExtrusion(value: Double): Self = StObject.set(x, "extrusion", value.asInstanceOf[js.Any])
      
      inline def setExtrusionUndefined: Self = StObject.set(x, "extrusion", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderNull: Self = StObject.set(x, "provider", null)
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setStyle(value: SpatialStyle | typings.heremaps.H.map.SpatialStyle.Options): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setVolatility(value: Boolean): Self = StObject.set(x, "volatility", value.asInstanceOf[js.Any])
      
      inline def setVolatilityUndefined: Self = StObject.set(x, "volatility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
