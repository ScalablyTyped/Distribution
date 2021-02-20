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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleFunction extends StObject {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var base: js.UndefOr[Double] = js.native
  
  var colorSpace: js.UndefOr[rgb | lab | hcl] = js.native
  
  var property: js.UndefOr[String] = js.native
  
  var stops: js.UndefOr[js.Array[js.Array[_]]] = js.native
  
  var `type`: js.UndefOr[identity | exponential | interval | categorical] = js.native
}
object StyleFunction {
  
  @scala.inline
  def apply(): StyleFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleFunction]
  }
  
  @scala.inline
  implicit class StyleFunctionMutableBuilder[Self <: StyleFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    @scala.inline
    def setColorSpace(value: rgb | lab | hcl): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setStops(value: js.Array[js.Array[_]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setStopsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    @scala.inline
    def setType(value: identity | exponential | interval | categorical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
