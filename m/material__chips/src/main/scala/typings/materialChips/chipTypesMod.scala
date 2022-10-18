package typings.materialChips

import typings.materialChips.actionConstantsMod.MDCChipActionType
import typings.materialChips.actionTypesMod.MDCChipActionInteractionEventDetail
import typings.materialChips.actionTypesMod.MDCChipActionNavigationEventDetail
import typings.materialChips.chipConstantsMod.MDCChipAnimation
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipTypesMod {
  
  type ActionInteractionEvent = CustomEvent[MDCChipActionInteractionEventDetail]
  
  type ActionNavigationEvent = CustomEvent[MDCChipActionNavigationEventDetail]
  
  trait MDCChipAnimationEventDetail extends StObject {
    
    var addedAnnouncement: js.UndefOr[String] = js.undefined
    
    var animation: MDCChipAnimation
    
    var chipID: String
    
    var isComplete: Boolean
    
    var removedAnnouncement: js.UndefOr[String] = js.undefined
  }
  object MDCChipAnimationEventDetail {
    
    inline def apply(animation: MDCChipAnimation, chipID: String, isComplete: Boolean): MDCChipAnimationEventDetail = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], chipID = chipID.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipAnimationEventDetail]
    }
    
    extension [Self <: MDCChipAnimationEventDetail](x: Self) {
      
      inline def setAddedAnnouncement(value: String): Self = StObject.set(x, "addedAnnouncement", value.asInstanceOf[js.Any])
      
      inline def setAddedAnnouncementUndefined: Self = StObject.set(x, "addedAnnouncement", js.undefined)
      
      inline def setAnimation(value: MDCChipAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
      
      inline def setRemovedAnnouncement(value: String): Self = StObject.set(x, "removedAnnouncement", value.asInstanceOf[js.Any])
      
      inline def setRemovedAnnouncementUndefined: Self = StObject.set(x, "removedAnnouncement", js.undefined)
    }
  }
  
  trait MDCChipInteractionEventDetail extends StObject {
    
    var actionID: String
    
    var chipID: String
    
    var isSelectable: Boolean
    
    var isSelected: Boolean
    
    var shouldRemove: Boolean
    
    var source: MDCChipActionType
  }
  object MDCChipInteractionEventDetail {
    
    inline def apply(
      actionID: String,
      chipID: String,
      isSelectable: Boolean,
      isSelected: Boolean,
      shouldRemove: Boolean,
      source: MDCChipActionType
    ): MDCChipInteractionEventDetail = {
      val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any], chipID = chipID.asInstanceOf[js.Any], isSelectable = isSelectable.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], shouldRemove = shouldRemove.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipInteractionEventDetail]
    }
    
    extension [Self <: MDCChipInteractionEventDetail](x: Self) {
      
      inline def setActionID(value: String): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setIsSelectable(value: Boolean): Self = StObject.set(x, "isSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setShouldRemove(value: Boolean): Self = StObject.set(x, "shouldRemove", value.asInstanceOf[js.Any])
      
      inline def setSource(value: MDCChipActionType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCChipNavigationEventDetail extends StObject {
    
    var chipID: String
    
    var isRTL: Boolean
    
    var key: String
    
    var source: MDCChipActionType
  }
  object MDCChipNavigationEventDetail {
    
    inline def apply(chipID: String, isRTL: Boolean, key: String, source: MDCChipActionType): MDCChipNavigationEventDetail = {
      val __obj = js.Dynamic.literal(chipID = chipID.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipNavigationEventDetail]
    }
    
    extension [Self <: MDCChipNavigationEventDetail](x: Self) {
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setIsRTL(value: Boolean): Self = StObject.set(x, "isRTL", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSource(value: MDCChipActionType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
