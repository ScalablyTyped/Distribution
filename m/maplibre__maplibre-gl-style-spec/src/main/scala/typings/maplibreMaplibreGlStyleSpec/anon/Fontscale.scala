package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.mod.ColorSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fontscale extends StObject {
  
  var `font-scale`: js.UndefOr[Double | Any] = js.undefined
  
  var `text-color`: js.UndefOr[ColorSpecification | Any] = js.undefined
  
  var `text-font`: js.UndefOr[js.Array[String] | Any] = js.undefined
}
object Fontscale {
  
  inline def apply(): Fontscale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fontscale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fontscale] (val x: Self) extends AnyVal {
    
    inline def `setFont-scale`(value: Double | Any): Self = StObject.set(x, "font-scale", value.asInstanceOf[js.Any])
    
    inline def `setFont-scaleUndefined`: Self = StObject.set(x, "font-scale", js.undefined)
    
    inline def `setText-color`(value: ColorSpecification | Any): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-colorUndefined`: Self = StObject.set(x, "text-color", js.undefined)
    
    inline def `setText-font`(value: js.Array[String] | Any): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    inline def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
    
    inline def `setText-fontVarargs`(value: String*): Self = StObject.set(x, "text-font", js.Array(value*))
  }
}
