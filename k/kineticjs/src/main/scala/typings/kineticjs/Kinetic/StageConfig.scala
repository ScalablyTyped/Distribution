package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageConfig extends ObjectOptionsConfig {
  
  var container: String = js.native
  
  @JSName("height")
  var height_StageConfig: Double = js.native
  
  @JSName("width")
  var width_StageConfig: Double = js.native
}
object StageConfig {
  
  @scala.inline
  def apply(container: String, height: Double, width: Double): StageConfig = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageConfig]
  }
  
  @scala.inline
  implicit class StageConfigMutableBuilder[Self <: StageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
