package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerGroup extends StObject {
  
  var coordinator: Broker
  
  var generationId: Double
  
  var groupId: String
  
  var memberId: String
}
object ConsumerGroup {
  
  inline def apply(coordinator: Broker, generationId: Double, groupId: String, memberId: String): ConsumerGroup = {
    val __obj = js.Dynamic.literal(coordinator = coordinator.asInstanceOf[js.Any], generationId = generationId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroup]
  }
  
  extension [Self <: ConsumerGroup](x: Self) {
    
    inline def setCoordinator(value: Broker): Self = StObject.set(x, "coordinator", value.asInstanceOf[js.Any])
    
    inline def setGenerationId(value: Double): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
  }
}
