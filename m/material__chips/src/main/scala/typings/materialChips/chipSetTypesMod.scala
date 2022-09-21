package typings.materialChips

import typings.materialChips.chipTypesMod.MDCChipAnimationEventDetail
import typings.materialChips.chipTypesMod.MDCChipInteractionEventDetail
import typings.materialChips.chipTypesMod.MDCChipNavigationEventDetail
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipSetTypesMod {
  
  type ChipAnimationEvent = CustomEvent[MDCChipAnimationEventDetail]
  
  type ChipInteractionEvent = CustomEvent[MDCChipInteractionEventDetail]
  
  type ChipNavigationEvent = CustomEvent[MDCChipNavigationEventDetail]
  
  trait MDCChipSetInteractionEventDetail extends StObject {
    
    var chipID: String
    
    var chipIndex: Double
  }
  object MDCChipSetInteractionEventDetail {
    
    inline def apply(chipID: String, chipIndex: Double): MDCChipSetInteractionEventDetail = {
      val __obj = js.Dynamic.literal(chipID = chipID.asInstanceOf[js.Any], chipIndex = chipIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipSetInteractionEventDetail]
    }
    
    extension [Self <: MDCChipSetInteractionEventDetail](x: Self) {
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setChipIndex(value: Double): Self = StObject.set(x, "chipIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCChipSetRemovalEventDetail extends StObject {
    
    var chipID: String
    
    var chipIndex: Double
    
    var isComplete: Boolean
  }
  object MDCChipSetRemovalEventDetail {
    
    inline def apply(chipID: String, chipIndex: Double, isComplete: Boolean): MDCChipSetRemovalEventDetail = {
      val __obj = js.Dynamic.literal(chipID = chipID.asInstanceOf[js.Any], chipIndex = chipIndex.asInstanceOf[js.Any], isComplete = isComplete.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipSetRemovalEventDetail]
    }
    
    extension [Self <: MDCChipSetRemovalEventDetail](x: Self) {
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setChipIndex(value: Double): Self = StObject.set(x, "chipIndex", value.asInstanceOf[js.Any])
      
      inline def setIsComplete(value: Boolean): Self = StObject.set(x, "isComplete", value.asInstanceOf[js.Any])
    }
  }
  
  trait MDCChipSetSelectionEventDetail extends StObject {
    
    var chipID: String
    
    var chipIndex: Double
    
    var isSelected: Boolean
  }
  object MDCChipSetSelectionEventDetail {
    
    inline def apply(chipID: String, chipIndex: Double, isSelected: Boolean): MDCChipSetSelectionEventDetail = {
      val __obj = js.Dynamic.literal(chipID = chipID.asInstanceOf[js.Any], chipIndex = chipIndex.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipSetSelectionEventDetail]
    }
    
    extension [Self <: MDCChipSetSelectionEventDetail](x: Self) {
      
      inline def setChipID(value: String): Self = StObject.set(x, "chipID", value.asInstanceOf[js.Any])
      
      inline def setChipIndex(value: Double): Self = StObject.set(x, "chipIndex", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    }
  }
}
