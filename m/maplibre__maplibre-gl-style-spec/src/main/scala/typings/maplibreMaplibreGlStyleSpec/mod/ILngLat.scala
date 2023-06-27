package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILngLat
  extends StObject
     with _ILngLatLike {
  
  def convert(input: ILngLatLike): ILngLat
  
  def distanceTo(lngLat: ILngLat): js.Object
  
  def toArray(): js.Object
  
  def wrap(): js.Object
}
object ILngLat {
  
  inline def apply(
    convert: ILngLatLike => ILngLat,
    distanceTo: ILngLat => js.Object,
    toArray: () => js.Object,
    wrap: () => js.Object
  ): ILngLat = {
    val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), distanceTo = js.Any.fromFunction1(distanceTo), toArray = js.Any.fromFunction0(toArray), wrap = js.Any.fromFunction0(wrap))
    __obj.asInstanceOf[ILngLat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILngLat] (val x: Self) extends AnyVal {
    
    inline def setConvert(value: ILngLatLike => ILngLat): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    inline def setDistanceTo(value: ILngLat => js.Object): Self = StObject.set(x, "distanceTo", js.Any.fromFunction1(value))
    
    inline def setToArray(value: () => js.Object): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    inline def setWrap(value: () => js.Object): Self = StObject.set(x, "wrap", js.Any.fromFunction0(value))
  }
}
