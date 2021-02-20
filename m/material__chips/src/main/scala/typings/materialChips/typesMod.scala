package typings.materialChips

import typings.materialChips.chipConstantsMod.EventSource
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait MDCChipInteractionEvent extends Event {
    
    val detail: MDCChipInteractionEventDetail = js.native
  }
  
  @js.native
  trait MDCChipInteractionEventDetail extends StObject {
    
    var chipId: String = js.native
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
  trait MDCChipNavigationEvent extends Event {
    
    val detail: MDCChipNavigationEventDetail = js.native
  }
  
  @js.native
  trait MDCChipNavigationEventDetail extends MDCChipInteractionEventDetail {
    
    var key: String = js.native
    
    var source: EventSource = js.native
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
  trait MDCChipRemovalEvent extends Event {
    
    val detail: MDCChipRemovalEventDetail = js.native
  }
  
  @js.native
  trait MDCChipRemovalEventDetail extends MDCChipInteractionEventDetail {
    
    var removedAnnouncement: String | Null = js.native
  }
  object MDCChipRemovalEventDetail {
    
    @scala.inline
    def apply(chipId: String): MDCChipRemovalEventDetail = {
      val __obj = js.Dynamic.literal(chipId = chipId.asInstanceOf[js.Any])
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
  trait MDCChipSelectionEvent extends Event {
    
    val detail: MDCChipSelectionEventDetail = js.native
  }
  
  @js.native
  trait MDCChipSelectionEventDetail extends MDCChipInteractionEventDetail {
    
    var selected: Boolean = js.native
    
    var shouldIgnore: Boolean = js.native
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
