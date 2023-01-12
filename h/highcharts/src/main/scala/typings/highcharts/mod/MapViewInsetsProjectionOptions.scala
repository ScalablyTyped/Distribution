package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapViewInsetsProjectionOptions extends StObject {
  
  /**
    * (Highmaps) Projection name. Built-in projections are `EqualEarth`,
    * `LambertConformalConic`, `Miller`, `Orthographic` and `WebMercator`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * (Highmaps) The two standard parallels that define the map layout in conic
    * projections, like the LambertConformalConic projection. If only one
    * number is given, the second parallel will be the same as the first.
    */
  var parallels: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * (Highmaps) Rotation of the projection in terms of degrees `[lambda, phi,
    * gamma]`. When given, a three-axis spherical rotation is be applied to the
    * globe prior to the projection.
    *
    * * `lambda` shifts the longitudes by the given value.
    *
    * * `phi` shifts the latitudes by the given value. Can be omitted.
    *
    * * `gamma` applies a _roll_. Can be omitted.
    */
  var rotation: js.UndefOr[String] = js.undefined
}
object MapViewInsetsProjectionOptions {
  
  inline def apply(): MapViewInsetsProjectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapViewInsetsProjectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapViewInsetsProjectionOptions] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParallels(value: js.Array[Double]): Self = StObject.set(x, "parallels", value.asInstanceOf[js.Any])
    
    inline def setParallelsUndefined: Self = StObject.set(x, "parallels", js.undefined)
    
    inline def setParallelsVarargs(value: Double*): Self = StObject.set(x, "parallels", js.Array(value*))
    
    inline def setRotation(value: String): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
  }
}
