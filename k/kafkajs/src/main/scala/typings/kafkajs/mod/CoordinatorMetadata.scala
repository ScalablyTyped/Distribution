package typings.kafkajs.mod

import typings.kafkajs.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinatorMetadata extends StObject {
  
  var coordinator: Host
  
  var errorCode: Double
}
object CoordinatorMetadata {
  
  inline def apply(coordinator: Host, errorCode: Double): CoordinatorMetadata = {
    val __obj = js.Dynamic.literal(coordinator = coordinator.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinatorMetadata]
  }
  
  extension [Self <: CoordinatorMetadata](x: Self) {
    
    inline def setCoordinator(value: Host): Self = StObject.set(x, "coordinator", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
  }
}
