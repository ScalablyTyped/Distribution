package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.composite
import typings.maplibreGl.mod.SizeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxZoom_
  extends StObject
     with SizeData {
  
  var interpolationType: typings.maplibreGl.mod.InterpolationType
  
  var kind: composite
  
  var maxZoom: Double
  
  var minZoom: Double
}
object MaxZoom_ {
  
  inline def apply(interpolationType: typings.maplibreGl.mod.InterpolationType, maxZoom: Double, minZoom: Double): MaxZoom_ = {
    val __obj = js.Dynamic.literal(interpolationType = interpolationType.asInstanceOf[js.Any], kind = "composite", maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxZoom_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxZoom_] (val x: Self) extends AnyVal {
    
    inline def setInterpolationType(value: typings.maplibreGl.mod.InterpolationType): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setKind(value: composite): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
  }
}
