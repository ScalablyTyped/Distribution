package typings.kineticjs.Kinetic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleConfig
  extends DrawOptionsConfig
     with ObjectOptionsConfig {
  
  var radius: Double = js.native
}
object CircleConfig {
  
  @scala.inline
  def apply(radius: Double): CircleConfig = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleConfig]
  }
  
  @scala.inline
  implicit class CircleConfigMutableBuilder[Self <: CircleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
  }
}
