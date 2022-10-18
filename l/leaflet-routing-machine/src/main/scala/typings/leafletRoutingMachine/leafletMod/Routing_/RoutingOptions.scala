package typings.leafletRoutingMachine.leafletMod.Routing_

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Interfaces
trait RoutingOptions extends StObject {
  
  var allowUTurns: Boolean
  
  var fileFormat: String
  
  var geometryOnly: Boolean
  
  var simplifyGeometry: Boolean
  
  var z: Double
}
object RoutingOptions {
  
  inline def apply(
    allowUTurns: Boolean,
    fileFormat: String,
    geometryOnly: Boolean,
    simplifyGeometry: Boolean,
    z: Double
  ): RoutingOptions = {
    val __obj = js.Dynamic.literal(allowUTurns = allowUTurns.asInstanceOf[js.Any], fileFormat = fileFormat.asInstanceOf[js.Any], geometryOnly = geometryOnly.asInstanceOf[js.Any], simplifyGeometry = simplifyGeometry.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingOptions]
  }
  
  extension [Self <: RoutingOptions](x: Self) {
    
    inline def setAllowUTurns(value: Boolean): Self = StObject.set(x, "allowUTurns", value.asInstanceOf[js.Any])
    
    inline def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
    
    inline def setGeometryOnly(value: Boolean): Self = StObject.set(x, "geometryOnly", value.asInstanceOf[js.Any])
    
    inline def setSimplifyGeometry(value: Boolean): Self = StObject.set(x, "simplifyGeometry", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
