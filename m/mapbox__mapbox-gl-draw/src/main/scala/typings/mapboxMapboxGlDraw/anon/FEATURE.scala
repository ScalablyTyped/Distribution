package typings.mapboxMapboxGlDraw.anon

import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Feature
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.FeatureCollection
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.LineString
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Multi
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiLineString
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPoint
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.MultiPolygon
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FEATURE extends StObject {
  
  var FEATURE: Feature
  
  var FEATURE_COLLECTION: FeatureCollection
  
  var LINE_STRING: LineString
  
  var MULTI_LINE_STRING: MultiLineString
  
  var MULTI_POINT: MultiPoint
  
  var MULTI_POLYGON: MultiPolygon
  
  var MULTI_PREFIX: Multi
  
  var POINT: typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Point
  
  var POLYGON: Polygon
}
object FEATURE {
  
  inline def apply(): FEATURE = {
    val __obj = js.Dynamic.literal(FEATURE = "Feature", FEATURE_COLLECTION = "FeatureCollection", LINE_STRING = "LineString", MULTI_LINE_STRING = "MultiLineString", MULTI_POINT = "MultiPoint", MULTI_POLYGON = "MultiPolygon", MULTI_PREFIX = "Multi", POINT = "Point", POLYGON = "Polygon")
    __obj.asInstanceOf[FEATURE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FEATURE] (val x: Self) extends AnyVal {
    
    inline def setFEATURE(value: Feature): Self = StObject.set(x, "FEATURE", value.asInstanceOf[js.Any])
    
    inline def setFEATURE_COLLECTION(value: FeatureCollection): Self = StObject.set(x, "FEATURE_COLLECTION", value.asInstanceOf[js.Any])
    
    inline def setLINE_STRING(value: LineString): Self = StObject.set(x, "LINE_STRING", value.asInstanceOf[js.Any])
    
    inline def setMULTI_LINE_STRING(value: MultiLineString): Self = StObject.set(x, "MULTI_LINE_STRING", value.asInstanceOf[js.Any])
    
    inline def setMULTI_POINT(value: MultiPoint): Self = StObject.set(x, "MULTI_POINT", value.asInstanceOf[js.Any])
    
    inline def setMULTI_POLYGON(value: MultiPolygon): Self = StObject.set(x, "MULTI_POLYGON", value.asInstanceOf[js.Any])
    
    inline def setMULTI_PREFIX(value: Multi): Self = StObject.set(x, "MULTI_PREFIX", value.asInstanceOf[js.Any])
    
    inline def setPOINT(value: typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.Point): Self = StObject.set(x, "POINT", value.asInstanceOf[js.Any])
    
    inline def setPOLYGON(value: Polygon): Self = StObject.set(x, "POLYGON", value.asInstanceOf[js.Any])
  }
}
