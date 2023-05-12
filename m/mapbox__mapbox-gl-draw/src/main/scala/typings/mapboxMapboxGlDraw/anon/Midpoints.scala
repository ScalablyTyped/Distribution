package typings.mapboxMapboxGlDraw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Midpoints extends StObject {
  
  var midpoints: js.UndefOr[Boolean] = js.undefined
  
  var selectedPaths: js.UndefOr[js.Array[String]] = js.undefined
}
object Midpoints {
  
  inline def apply(): Midpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Midpoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Midpoints] (val x: Self) extends AnyVal {
    
    inline def setMidpoints(value: Boolean): Self = StObject.set(x, "midpoints", value.asInstanceOf[js.Any])
    
    inline def setMidpointsUndefined: Self = StObject.set(x, "midpoints", js.undefined)
    
    inline def setSelectedPaths(value: js.Array[String]): Self = StObject.set(x, "selectedPaths", value.asInstanceOf[js.Any])
    
    inline def setSelectedPathsUndefined: Self = StObject.set(x, "selectedPaths", js.undefined)
    
    inline def setSelectedPathsVarargs(value: String*): Self = StObject.set(x, "selectedPaths", js.Array(value*))
  }
}
