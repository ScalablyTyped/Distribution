package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.categorical
import typings.mapboxGl.mapboxGlStrings.exponential
import typings.mapboxGl.mapboxGlStrings.hcl
import typings.mapboxGl.mapboxGlStrings.identity
import typings.mapboxGl.mapboxGlStrings.interval
import typings.mapboxGl.mapboxGlStrings.lab
import typings.mapboxGl.mapboxGlStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFunction extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var base: js.UndefOr[Double] = js.undefined
  
  var colorSpace: js.UndefOr[rgb | lab | hcl] = js.undefined
  
  var property: js.UndefOr[String] = js.undefined
  
  var stops: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
  
  var `type`: js.UndefOr[identity | exponential | interval | categorical] = js.undefined
}
object StyleFunction {
  
  inline def apply(): StyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleFunction]
  }
  
  extension [Self <: StyleFunction](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setColorSpace(value: rgb | lab | hcl): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setStops(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: identity | exponential | interval | categorical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
