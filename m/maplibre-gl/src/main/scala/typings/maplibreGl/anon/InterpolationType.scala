package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.camera
import typings.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationType
  extends StObject
     with SizeData {
  
  var interpolationType: typings.maplibreGl.mod.InterpolationType
  
  var kind: camera
  
  var maxSize: Double
  
  var maxZoom: Double
  
  var minSize: Double
  
  var minZoom: Double
}
object InterpolationType {
  
  inline def apply(
    interpolationType: typings.maplibreGl.mod.InterpolationType,
    maxSize: Double,
    maxZoom: Double,
    minSize: Double,
    minZoom: Double
  ): InterpolationType = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "camera", maxSize = maxSize.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationType]
  }
  
  extension [Self <: InterpolationType](x: Self) {
    
    inline def setInterpolationType(value: typings.maplibreGl.mod.InterpolationType): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: camera): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
  }
}
