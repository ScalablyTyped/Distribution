package typings.kiwicomOrbitDesignTokens.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Palette extends StObject {
  
  var blue: StatusColor
  
  var cloud: CloudColor
  
  var green: StatusColor
  
  var ink: InkColor
  
  var orange: StatusColor
  
  var product: ProductColor
  
  var red: StatusColor
  
  var social: SocialColor
  
  var white: WhiteColor
}
object Palette {
  
  @scala.inline
  def apply(
    blue: StatusColor,
    cloud: CloudColor,
    green: StatusColor,
    ink: InkColor,
    orange: StatusColor,
    product: ProductColor,
    red: StatusColor,
    social: SocialColor,
    white: WhiteColor
  ): Palette = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cloud = cloud.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], ink = ink.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], social = social.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
    __obj.asInstanceOf[Palette]
  }
  
  @scala.inline
  implicit class PaletteMutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: StatusColor): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloud(value: CloudColor): Self = StObject.set(x, "cloud", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: StatusColor): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInk(value: InkColor): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrange(value: StatusColor): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: ProductColor): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: StatusColor): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocial(value: SocialColor): Self = StObject.set(x, "social", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: WhiteColor): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
  }
}
