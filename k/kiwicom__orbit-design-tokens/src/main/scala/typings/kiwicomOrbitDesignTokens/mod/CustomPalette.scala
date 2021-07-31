package typings.kiwicomOrbitDesignTokens.mod

import typings.kiwicomOrbitDesignTokens.anon.PartialCloudColor
import typings.kiwicomOrbitDesignTokens.anon.PartialInkColor
import typings.kiwicomOrbitDesignTokens.anon.PartialProductColor
import typings.kiwicomOrbitDesignTokens.anon.PartialSocialColor
import typings.kiwicomOrbitDesignTokens.anon.PartialStatusColor
import typings.kiwicomOrbitDesignTokens.anon.PartialWhiteColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPalette extends StObject {
  
  var blue: js.UndefOr[PartialStatusColor] = js.undefined
  
  var cloud: js.UndefOr[PartialCloudColor] = js.undefined
  
  var green: js.UndefOr[PartialStatusColor] = js.undefined
  
  var ink: js.UndefOr[PartialInkColor] = js.undefined
  
  var orange: js.UndefOr[PartialStatusColor] = js.undefined
  
  var product: js.UndefOr[PartialProductColor] = js.undefined
  
  var red: js.UndefOr[PartialStatusColor] = js.undefined
  
  var social: js.UndefOr[PartialSocialColor] = js.undefined
  
  var white: js.UndefOr[PartialWhiteColor] = js.undefined
}
object CustomPalette {
  
  @scala.inline
  def apply(): CustomPalette = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomPalette]
  }
  
  @scala.inline
  implicit class CustomPaletteMutableBuilder[Self <: CustomPalette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: PartialStatusColor): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueUndefined: Self = StObject.set(x, "blue", js.undefined)
    
    @scala.inline
    def setCloud(value: PartialCloudColor): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudUndefined: Self = StObject.set(x, "cloud", js.undefined)
    
    @scala.inline
    def setGreen(value: PartialStatusColor): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    @scala.inline
    def setInk(value: PartialInkColor): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    @scala.inline
    def setOrange(value: PartialStatusColor): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrangeUndefined: Self = StObject.set(x, "orange", js.undefined)
    
    @scala.inline
    def setProduct(value: PartialProductColor): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setRed(value: PartialStatusColor): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    @scala.inline
    def setSocial(value: PartialSocialColor): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialUndefined: Self = StObject.set(x, "social", js.undefined)
    
    @scala.inline
    def setWhite(value: PartialWhiteColor): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
  }
}
