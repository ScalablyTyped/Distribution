package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemePaletteColors extends StObject {
  
  var productDark: String = js.native
  
  var productDarkActive: js.UndefOr[String] = js.native
  
  var productDarkHover: js.UndefOr[String] = js.native
  
  var productDarker: js.UndefOr[String] = js.native
  
  var productLight: String = js.native
  
  var productLightActive: String = js.native
  
  var productLightHover: String = js.native
  
  var productNormal: String = js.native
  
  var productNormalActive: String = js.native
  
  var productNormalHover: String = js.native
}
object ThemePaletteColors {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ThemePaletteColorsMutableBuilder[Self <: ThemePaletteColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductDark(value: String): Self = StObject.set(x, "productDark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDarkActive(value: String): Self = StObject.set(x, "productDarkActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDarkActiveUndefined: Self = StObject.set(x, "productDarkActive", js.undefined)
    
    @scala.inline
    def setProductDarkHover(value: String): Self = StObject.set(x, "productDarkHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDarkHoverUndefined: Self = StObject.set(x, "productDarkHover", js.undefined)
    
    @scala.inline
    def setProductDarker(value: String): Self = StObject.set(x, "productDarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDarkerUndefined: Self = StObject.set(x, "productDarker", js.undefined)
    
    @scala.inline
    def setProductLight(value: String): Self = StObject.set(x, "productLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLightActive(value: String): Self = StObject.set(x, "productLightActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductLightHover(value: String): Self = StObject.set(x, "productLightHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNormal(value: String): Self = StObject.set(x, "productNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNormalActive(value: String): Self = StObject.set(x, "productNormalActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNormalHover(value: String): Self = StObject.set(x, "productNormalHover", value.asInstanceOf[js.Any])
  }
}
