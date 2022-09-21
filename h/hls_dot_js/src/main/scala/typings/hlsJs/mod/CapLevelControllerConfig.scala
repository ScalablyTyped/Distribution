package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapLevelControllerConfig extends StObject {
  
  var capLevelToPlayerSize: Boolean
}
object CapLevelControllerConfig {
  
  inline def apply(capLevelToPlayerSize: Boolean): CapLevelControllerConfig = {
    val __obj = js.Dynamic.literal(capLevelToPlayerSize = capLevelToPlayerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapLevelControllerConfig]
  }
  
  extension [Self <: CapLevelControllerConfig](x: Self) {
    
    inline def setCapLevelToPlayerSize(value: Boolean): Self = StObject.set(x, "capLevelToPlayerSize", value.asInstanceOf[js.Any])
  }
}
