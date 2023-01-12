package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icons extends StObject {
  
  var icons: js.UndefOr[`5`] = js.undefined
}
object Icons {
  
  inline def apply(): Icons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icons] (val x: Self) extends AnyVal {
    
    inline def setIcons(value: `5`): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
  }
}
