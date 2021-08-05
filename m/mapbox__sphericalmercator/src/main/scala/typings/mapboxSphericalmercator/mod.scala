package typings.mapboxSphericalmercator

import typings.mapboxSphericalmercator.anon.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/sphericalmercator", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with SphericalMercator {
    def this(options: Size) = this()
  }
  
  type BoundingBox = js.Tuple4[Double, Double, Double, Double]
  
  type LatLngPoint = js.Tuple2[Double, Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.WGS84
    - typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.`900913`
  */
  trait Projection extends StObject
  object Projection {
    
    inline def `900913`: typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.`900913` = "900913".asInstanceOf[typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.`900913`]
    
    inline def WGS84: typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.WGS84 = "WGS84".asInstanceOf[typings.mapboxSphericalmercator.mapboxSphericalmercatorStrings.WGS84]
  }
  
  @js.native
  trait SphericalMercator extends StObject {
    
    def bbox(x: Double, y: Double, zoom: Double): BoundingBox = js.native
    def bbox(x: Double, y: Double, zoom: Double, tms_style: Boolean): BoundingBox = js.native
    def bbox(x: Double, y: Double, zoom: Double, tms_style: Boolean, srs: Projection): BoundingBox = js.native
    def bbox(x: Double, y: Double, zoom: Double, tms_style: Unit, srs: Projection): BoundingBox = js.native
    
    def convert(bbox: BoundingBox): BoundingBox = js.native
    def convert(bbox: BoundingBox, to: Projection): BoundingBox = js.native
    
    def forward(ll: LatLngPoint): XYPoint = js.native
    
    def inverse(xy: XYPoint): LatLngPoint = js.native
    
    def ll(px: XYPoint, zoom: Double): LatLngPoint = js.native
    
    def px(ll: LatLngPoint, zoom: Double): XYPoint = js.native
    
    def xyz(bbox: BoundingBox, zoom: Double): XYBounds = js.native
    def xyz(bbox: BoundingBox, zoom: Double, tms_style: Boolean): XYBounds = js.native
    def xyz(bbox: BoundingBox, zoom: Double, tms_style: Boolean, srs: Projection): XYBounds = js.native
    def xyz(bbox: BoundingBox, zoom: Double, tms_style: Unit, srs: Projection): XYBounds = js.native
  }
  
  trait XYBounds extends StObject {
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
  }
  object XYBounds {
    
    inline def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): XYBounds = {
      val __obj = js.Dynamic.literal(maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[XYBounds]
    }
    
    extension [Self <: XYBounds](x: Self) {
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
    }
  }
  
  type XYPoint = js.Tuple2[Double, Double]
}
