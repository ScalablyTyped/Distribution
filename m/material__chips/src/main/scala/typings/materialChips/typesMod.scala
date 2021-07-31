package typings.materialChips

import typings.materialChips.chipConstantsMod.EventSource
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCChipInteractionEvent
    extends StObject
       with Event {
    
    val detail: MDCChipInteractionEventDetail = js.native
  }
  
  trait MDCChipInteractionEventDetail extends StObject {
    
    var chipId: String
  }
  object MDCChipInteractionEventDetail {
    
    @scala.inline
    def apply(chipId: String): MDCChipInteractionEventDetail = {
      val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipInteractionEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipInteractionEventDetailMutableBuilder[Self <: MDCChipInteractionEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChipId(value: String): Self = StObject.set(x, "chipId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCChipNavigationEvent
    extends StObject
       with Event {
    
    val detail: MDCChipNavigationEventDetail = js.native
  }
  
  trait MDCChipNavigationEventDetail
    extends StObject
       with MDCChipInteractionEventDetail {
    
    var key: String
    
    var source: EventSource
  }
  object MDCChipNavigationEventDetail {
    
    @scala.inline
    def apply(chipId: String, key: String, source: EventSource): MDCChipNavigationEventDetail = {
      val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipNavigationEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipNavigationEventDetailMutableBuilder[Self <: MDCChipNavigationEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: EventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MDCChipRemovalEvent
    extends StObject
       with Event {
    
    val detail: MDCChipRemovalEventDetail = js.native
  }
  
  trait MDCChipRemovalEventDetail
    extends StObject
       with MDCChipInteractionEventDetail {
    
    var removedAnnouncement: String | Null
  }
  object MDCChipRemovalEventDetail {
    
    @scala.inline
    def apply(chipId: String): MDCChipRemovalEventDetail = {
      val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any], removedAnnouncement = null)
      __obj.asInstanceOf[MDCChipRemovalEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipRemovalEventDetailMutableBuilder[Self <: MDCChipRemovalEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemovedAnnouncement(value: String): Self = StObject.set(x, "removedAnnouncement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedAnnouncementNull: Self = StObject.set(x, "removedAnnouncement", null)
    }
  }
  
  @js.native
  trait MDCChipSelectionEvent
    extends StObject
       with Event {
    
    val detail: MDCChipSelectionEventDetail = js.native
  }
  
  trait MDCChipSelectionEventDetail
    extends StObject
       with MDCChipInteractionEventDetail {
    
    var selected: Boolean
    
    var shouldIgnore: Boolean
  }
  object MDCChipSelectionEventDetail {
    
    @scala.inline
    def apply(chipId: String, selected: Boolean, shouldIgnore: Boolean): MDCChipSelectionEventDetail = {
      val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], shouldIgnore = shouldIgnore.asInstanceOf[js.Any])
      __obj.asInstanceOf[MDCChipSelectionEventDetail]
    }
    
    @scala.inline
    implicit class MDCChipSelectionEventDetailMutableBuilder[Self <: MDCChipSelectionEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldIgnore(value: Boolean): Self = StObject.set(x, "shouldIgnore", value.asInstanceOf[js.Any])
    }
  }
}
