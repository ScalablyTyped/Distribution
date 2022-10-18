package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.ColorSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Textcolor extends StObject {
  
  var `font-scale`: js.UndefOr[Double | Any] = js.undefined
  
  var `text-color`: ColorSpecification | Any
  
  var `text-font`: js.UndefOr[js.Array[String] | Any] = js.undefined
}
object Textcolor {
  
  inline def apply(`text-color`: ColorSpecification | Any): Textcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text-color")(`text-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textcolor]
  }
  
  extension [Self <: Textcolor](x: Self) {
    
    inline def `setFont-scale`(value: Double | Any): Self = StObject.set(x, "font-scale", value.asInstanceOf[js.Any])
    
    inline def `setFont-scaleUndefined`: Self = StObject.set(x, "font-scale", js.undefined)
    
    inline def `setText-color`(value: ColorSpecification | Any): Self = StObject.set(x, "text-color", value.asInstanceOf[js.Any])
    
    inline def `setText-font`(value: js.Array[String] | Any): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    inline def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
    
    inline def `setText-fontVarargs`(value: String*): Self = StObject.set(x, "text-font", js.Array(value*))
  }
}
