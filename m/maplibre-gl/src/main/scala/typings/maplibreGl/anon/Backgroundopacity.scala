package typings.maplibreGl.anon

import typings.maplibreGl.distStyleSpecMod.ColorSpecification
import typings.maplibreGl.distStyleSpecMod.PropertyValueSpecification
import typings.maplibreGl.distStyleSpecMod.ResolvedImageSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backgroundopacity extends StObject {
  
  var `background-color`: js.UndefOr[PropertyValueSpecification[ColorSpecification]] = js.undefined
  
  var `background-opacity`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `background-pattern`: js.UndefOr[PropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
}
object Backgroundopacity {
  
  inline def apply(): Backgroundopacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backgroundopacity]
  }
  
  extension [Self <: Backgroundopacity](x: Self) {
    
    inline def `setBackground-color`(value: PropertyValueSpecification[ColorSpecification]): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def `setBackground-opacity`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "background-opacity", value.asInstanceOf[js.Any])
    
    inline def `setBackground-opacityUndefined`: Self = StObject.set(x, "background-opacity", js.undefined)
    
    inline def `setBackground-pattern`(value: PropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "background-pattern", value.asInstanceOf[js.Any])
    
    inline def `setBackground-patternUndefined`: Self = StObject.set(x, "background-pattern", js.undefined)
  }
}
