package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dark extends StObject {
  
  var dark: js.UndefOr[String] = js.native
  
  var light: js.UndefOr[String] = js.native
}
object Dark {
  
  @scala.inline
  def apply(): Dark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dark]
  }
  
  @scala.inline
  implicit class DarkMutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    @scala.inline
    def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
  }
}
