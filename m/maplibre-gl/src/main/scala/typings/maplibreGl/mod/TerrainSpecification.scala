package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerrainSpecification extends StObject {
  
  var elevationOffset: js.UndefOr[Double] = js.undefined
  
  var exaggeration: js.UndefOr[Double] = js.undefined
  
  var source: String
}
object TerrainSpecification {
  
  inline def apply(source: String): TerrainSpecification = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerrainSpecification] (val x: Self) extends AnyVal {
    
    inline def setElevationOffset(value: Double): Self = StObject.set(x, "elevationOffset", value.asInstanceOf[js.Any])
    
    inline def setElevationOffsetUndefined: Self = StObject.set(x, "elevationOffset", js.undefined)
    
    inline def setExaggeration(value: Double): Self = StObject.set(x, "exaggeration", value.asInstanceOf[js.Any])
    
    inline def setExaggerationUndefined: Self = StObject.set(x, "exaggeration", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
