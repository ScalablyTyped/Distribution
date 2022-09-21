package typings.mapboxGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerrainSpecification extends StObject {
  
  var exaggeration: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var source: String
}
object TerrainSpecification {
  
  inline def apply(source: String): TerrainSpecification = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainSpecification]
  }
  
  extension [Self <: TerrainSpecification](x: Self) {
    
    inline def setExaggeration(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "exaggeration", value.asInstanceOf[js.Any])
    
    inline def setExaggerationUndefined: Self = StObject.set(x, "exaggeration", js.undefined)
    
    inline def setExaggerationVarargs(value: Any*): Self = StObject.set(x, "exaggeration", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
