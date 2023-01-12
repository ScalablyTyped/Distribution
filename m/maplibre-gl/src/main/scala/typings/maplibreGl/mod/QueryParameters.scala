package typings.maplibreGl.mod

import typings.glMatrix.mod.mat4
import typings.mapboxPointGeometry.mod.^
import typings.maplibreGl.anon.AvailableImages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameters extends StObject {
  
  var cameraQueryGeometry: js.Array[^]
  
  var params: AvailableImages
  
  var pixelPosMatrix: mat4
  
  var queryGeometry: js.Array[^]
  
  var queryPadding: Double
  
  var scale: Double
  
  var tileSize: Double
  
  var transform: Transform
}
object QueryParameters {
  
  inline def apply(
    cameraQueryGeometry: js.Array[^],
    params: AvailableImages,
    pixelPosMatrix: mat4,
    queryGeometry: js.Array[^],
    queryPadding: Double,
    scale: Double,
    tileSize: Double,
    transform: Transform
  ): QueryParameters = {
    val __obj = js.Dynamic.literal(cameraQueryGeometry = cameraQueryGeometry.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], pixelPosMatrix = pixelPosMatrix.asInstanceOf[js.Any], queryGeometry = queryGeometry.asInstanceOf[js.Any], queryPadding = queryPadding.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryParameters] (val x: Self) extends AnyVal {
    
    inline def setCameraQueryGeometry(value: js.Array[^]): Self = StObject.set(x, "cameraQueryGeometry", value.asInstanceOf[js.Any])
    
    inline def setCameraQueryGeometryVarargs(value: ^ *): Self = StObject.set(x, "cameraQueryGeometry", js.Array(value*))
    
    inline def setParams(value: AvailableImages): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPixelPosMatrix(value: mat4): Self = StObject.set(x, "pixelPosMatrix", value.asInstanceOf[js.Any])
    
    inline def setQueryGeometry(value: js.Array[^]): Self = StObject.set(x, "queryGeometry", value.asInstanceOf[js.Any])
    
    inline def setQueryGeometryVarargs(value: ^ *): Self = StObject.set(x, "queryGeometry", js.Array(value*))
    
    inline def setQueryPadding(value: Double): Self = StObject.set(x, "queryPadding", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
