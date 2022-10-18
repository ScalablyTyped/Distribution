package typings.grommet.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Down extends StObject {
  
  var down: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
  
  var up: js.UndefOr[ReactNode | typings.grommetIcons.iconsMod.Icon] = js.undefined
}
object Down {
  
  inline def apply(): Down = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Down]
  }
  
  extension [Self <: Down](x: Self) {
    
    inline def setDown(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setUp(value: ReactNode | typings.grommetIcons.iconsMod.Icon): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
