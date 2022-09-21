package typings.materialChips

import typings.materialChips.constantsMod.MDCChipActionInteractionTrigger
import typings.materialChips.constantsMod.MDCChipActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait MDCChipActionInteractionEventDetail extends StObject {
    
    var actionID: String
    
    var source: MDCChipActionType
    
    var trigger: MDCChipActionInteractionTrigger
  }
  object MDCChipActionInteractionEventDetail {
    
    inline def apply(actionID: String, source: MDCChipActionType, trigger: MDCChipActionInteractionTrigger): MDCChipActionInteractionEventDetail = {
      val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipActionInteractionEventDetail]
    }
    
    extension [Self <: MDCChipActionInteractionEventDetail](x: Self) {
      
      inline def setActionID(value: String): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
      
      inline def setSource(value: MDCChipActionType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: MDCChipActionInteractionTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCChipActionNavigationEventDetail extends StObject {
    
    var key: String
    
    var source: MDCChipActionType
  }
  object MDCChipActionNavigationEventDetail {
    
    inline def apply(key: String, source: MDCChipActionType): MDCChipActionNavigationEventDetail = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipActionNavigationEventDetail]
    }
    
    extension [Self <: MDCChipActionNavigationEventDetail](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSource(value: MDCChipActionType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
