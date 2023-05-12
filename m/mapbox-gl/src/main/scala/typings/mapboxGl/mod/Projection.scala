package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.albers
import typings.mapboxGl.mapboxGlStrings.equalEarth
import typings.mapboxGl.mapboxGlStrings.equirectangular
import typings.mapboxGl.mapboxGlStrings.globe
import typings.mapboxGl.mapboxGlStrings.lambertConformalConic
import typings.mapboxGl.mapboxGlStrings.mercator
import typings.mapboxGl.mapboxGlStrings.naturalEarth
import typings.mapboxGl.mapboxGlStrings.winkelTripel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Projection extends StObject {
  
  var center: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var name: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
  
  var parallels: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object Projection {
  
  inline def apply(
    name: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
  ): Projection = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Projection] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setName(
      value: albers | equalEarth | equirectangular | lambertConformalConic | mercator | naturalEarth | winkelTripel | globe
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParallels(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
    
    inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
  }
}
