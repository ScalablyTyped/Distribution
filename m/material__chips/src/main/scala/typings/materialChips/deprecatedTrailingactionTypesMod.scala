package typings.materialChips

import typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedTrailingactionTypesMod {
  
  @js.native
  trait MDCChipTrailingActionInteractionEvent
    extends StObject
       with Event {
    
    val detail: MDCChipTrailingActionInteractionEventDetail = js.native
  }
  
  trait MDCChipTrailingActionInteractionEventDetail extends StObject {
    
    var trigger: InteractionTrigger
  }
  object MDCChipTrailingActionInteractionEventDetail {
    
    inline def apply(trigger: InteractionTrigger): MDCChipTrailingActionInteractionEventDetail = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipTrailingActionInteractionEventDetail]
    }
    
    extension [Self <: MDCChipTrailingActionInteractionEventDetail](x: Self) {
      
      inline def setTrigger(value: InteractionTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCChipTrailingActionNavigationEvent
    extends StObject
       with Event {
    
    val detail: MDCChipTrailingActionNavigationEventDetail = js.native
  }
  
  trait MDCChipTrailingActionNavigationEventDetail extends StObject {
    
    var key: String
  }
  object MDCChipTrailingActionNavigationEventDetail {
    
    inline def apply(key: String): MDCChipTrailingActionNavigationEventDetail = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipTrailingActionNavigationEventDetail]
    }
    
    extension [Self <: MDCChipTrailingActionNavigationEventDetail](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
