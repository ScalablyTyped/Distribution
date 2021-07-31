package typings.materialChips

import typings.materialChips.trailingactionConstantsMod.InteractionTrigger
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trailingactionTypesMod {
  
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
    
    @scala.inline
    def apply(trigger: InteractionTrigger): MDCChipTrailingActionInteractionEventDetail = {
      val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipTrailingActionInteractionEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipTrailingActionInteractionEventDetailMutableBuilder[Self <: MDCChipTrailingActionInteractionEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTrigger(value: InteractionTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(key: String): MDCChipTrailingActionNavigationEventDetail = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipTrailingActionNavigationEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipTrailingActionNavigationEventDetailMutableBuilder[Self <: MDCChipTrailingActionNavigationEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
