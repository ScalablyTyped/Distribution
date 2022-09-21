package typings.grommet.utilsMod

import typings.grommet.grommetStrings.`no-repeat`
import typings.grommet.grommetStrings.contain
import typings.grommet.grommetStrings.cover
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.repeat
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundObject extends StObject {
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var dark: js.UndefOr[Boolean | String] = js.undefined
  
  var image: js.UndefOr[String] = js.undefined
  
  var light: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[weak | medium | strong | Double | Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var repeat: js.UndefOr[`no-repeat` | typings.grommet.grommetStrings.repeat | String] = js.undefined
  
  var size: js.UndefOr[cover | contain | String] = js.undefined
}
object BackgroundObject {
  
  inline def apply(): BackgroundObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundObject]
  }
  
  extension [Self <: BackgroundObject](x: Self) {
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDark(value: Boolean | String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    
    inline def setOpacity(value: weak | medium | strong | Double | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRepeat(value: `no-repeat` | repeat | String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setSize(value: cover | contain | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
