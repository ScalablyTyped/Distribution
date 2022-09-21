package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod._HoverIndicatorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundElevation
  extends StObject
     with _HoverIndicatorType {
  
  var background: BackgroundType
  
  var elevation: ElevationType
}
object BackgroundElevation {
  
  inline def apply(background: BackgroundType, elevation: ElevationType): BackgroundElevation = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundElevation]
  }
  
  extension [Self <: BackgroundElevation](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
  }
}
