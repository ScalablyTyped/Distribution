package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DarkLight extends StObject {
  
  var dark: js.UndefOr[None] = js.undefined
  
  var light: js.UndefOr[None] = js.undefined
}
object DarkLight {
  
  @scala.inline
  def apply(): DarkLight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DarkLight]
  }
  
  @scala.inline
  implicit class DarkLightMutableBuilder[Self <: DarkLight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: None): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setLight(value: None): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
