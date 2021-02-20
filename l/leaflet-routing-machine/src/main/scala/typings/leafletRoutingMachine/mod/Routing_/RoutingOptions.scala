package typings.leafletRoutingMachine.mod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interfaces
@js.native
trait RoutingOptions extends StObject {
  
  var allowUTurns: Boolean = js.native
  
  var fileFormat: String = js.native
  
  var geometryOnly: Boolean = js.native
  
  var simplifyGeometry: Boolean = js.native
  
  var z: Double = js.native
}
object RoutingOptions {
  
  @scala.inline
  def apply(
    allowUTurns: Boolean,
    fileFormat: String,
    geometryOnly: Boolean,
    simplifyGeometry: Boolean,
    z: Double
  ): RoutingOptions = {
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], geometryOnly = geometryOnly.asInstanceOf[js.Any], simplifyGeometry = simplifyGeometry.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingOptions]
  }
  
  @scala.inline
  implicit class RoutingOptionsMutableBuilder[Self <: RoutingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowUTurns(value: Boolean): Self = StObject.set(x, "allowUTurns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryOnly(value: Boolean): Self = StObject.set(x, "geometryOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifyGeometry(value: Boolean): Self = StObject.set(x, "simplifyGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
