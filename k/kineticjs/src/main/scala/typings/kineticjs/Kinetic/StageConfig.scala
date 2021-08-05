package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageConfig
  extends StObject
     with ObjectOptionsConfig {
  
  var container: String
  
  @JSName("height")
  var height_StageConfig: Double
  
  @JSName("width")
  var width_StageConfig: Double
}
object StageConfig {
  
  inline def apply(container: String, height: Double, width: Double): StageConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageConfig]
  }
  
  extension [Self <: StageConfig](x: Self) {
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
