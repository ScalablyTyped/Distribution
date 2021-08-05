package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemePaletteColors extends StObject {
  
  var productDark: String
  
  var productDarkActive: js.UndefOr[String] = js.undefined
  
  var productDarkHover: js.UndefOr[String] = js.undefined
  
  var productDarker: js.UndefOr[String] = js.undefined
  
  var productLight: String
  
  var productLightActive: String
  
  var productLightHover: String
  
  var productNormal: String
  
  var productNormalActive: String
  
  var productNormalHover: String
}
object ThemePaletteColors {
  
  inline def apply(
    productDark: String,
    productLight: String,
    productLightActive: String,
    productLightHover: String,
    productNormal: String,
    productNormalActive: String,
    productNormalHover: String
  ): ThemePaletteColors = {
    val __obj = js.Dynamic.literal(productDark = productDark.asInstanceOf[js.Any], productLight = productLight.asInstanceOf[js.Any], productLightActive = productLightActive.asInstanceOf[js.Any], productLightHover = productLightHover.asInstanceOf[js.Any], productNormal = productNormal.asInstanceOf[js.Any], productNormalActive = productNormalActive.asInstanceOf[js.Any], productNormalHover = productNormalHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemePaletteColors]
  }
  
  extension [Self <: ThemePaletteColors](x: Self) {
    
    inline def setProductDark(value: String): Self = StObject.set(x, "productDark", value.asInstanceOf[js.Any])
    
    inline def setProductDarkActive(value: String): Self = StObject.set(x, "productDarkActive", value.asInstanceOf[js.Any])
    
    inline def setProductDarkActiveUndefined: Self = StObject.set(x, "productDarkActive", js.undefined)
    
    inline def setProductDarkHover(value: String): Self = StObject.set(x, "productDarkHover", value.asInstanceOf[js.Any])
    
    inline def setProductDarkHoverUndefined: Self = StObject.set(x, "productDarkHover", js.undefined)
    
    inline def setProductDarker(value: String): Self = StObject.set(x, "productDarker", value.asInstanceOf[js.Any])
    
    inline def setProductDarkerUndefined: Self = StObject.set(x, "productDarker", js.undefined)
    
    inline def setProductLight(value: String): Self = StObject.set(x, "productLight", value.asInstanceOf[js.Any])
    
    inline def setProductLightActive(value: String): Self = StObject.set(x, "productLightActive", value.asInstanceOf[js.Any])
    
    inline def setProductLightHover(value: String): Self = StObject.set(x, "productLightHover", value.asInstanceOf[js.Any])
    
    inline def setProductNormal(value: String): Self = StObject.set(x, "productNormal", value.asInstanceOf[js.Any])
    
    inline def setProductNormalActive(value: String): Self = StObject.set(x, "productNormalActive", value.asInstanceOf[js.Any])
    
    inline def setProductNormalHover(value: String): Self = StObject.set(x, "productNormalHover", value.asInstanceOf[js.Any])
  }
}
