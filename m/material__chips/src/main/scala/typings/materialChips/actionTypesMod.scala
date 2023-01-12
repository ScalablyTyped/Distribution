package typings.materialChips

import typings.materialChips.actionConstantsMod.MDCChipActionInteractionTrigger
import typings.materialChips.actionConstantsMod.MDCChipActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionTypesMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCChipActionInteractionEventDetail] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCChipActionNavigationEventDetail] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSource(value: MDCChipActionType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
