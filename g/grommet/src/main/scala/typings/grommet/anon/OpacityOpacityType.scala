package typings.grommet.anon

import typings.grommet.utilsMod.OpacityType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityOpacityType extends StObject {
  
  var opacity: OpacityType
}
object OpacityOpacityType {
  
  inline def apply(opacity: OpacityType): OpacityOpacityType = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityOpacityType]
  }
  
  extension [Self <: OpacityOpacityType](x: Self) {
    
    inline def setOpacity(value: OpacityType): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
