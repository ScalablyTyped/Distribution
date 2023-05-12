package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for Events. Your code can react to these
  * events using {@link Service.addEventListener}.
  */
object events {
  
  /**
    * Base Interface for all GPT events. All GPT events below will have the following fields.
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  trait Event extends StObject {
    
    /**
      * Name of the service that triggered the event.
      */
    var serviceName: String
    
    /**
      * The slot that triggered the event.
      */
    var slot: Slot
  }
  object Event {
    
    inline def apply(serviceName: String, slot: Slot): Event = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setSlot(value: Slot): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This is a pseudo-type that maps an event name to its corresponding event object type for {@link Service.addEventListener} and {@link Service.removeEventListener}.
    * It is documented for reference and type safety purposes only.
    */
  trait EventTypeMap extends StObject {
    
    /**
      * Alias for {@link googletag.events.ImpressionViewableEvent}
      */
    var impressionViewable: ImpressionViewableEvent
    
    /**
      * Alias for {@link googletag.events.RewardedSlotClosedEvent}
      */
    var rewardedSlotClosed: RewardedSlotClosedEvent
    
    /**
      * Alias for {@link googletag.events.RewardedSlotGrantedEvent}
      */
    var rewardedSlotGranted: RewardedSlotGrantedEvent
    
    /**
      * Alias for {@link googletag.events.RewardedSlotReadyEvent}
      */
    var rewardedSlotReady: RewardedSlotReadyEvent
    
    /**
      * Alias for {@link googletag.events.SlotOnloadEvent}
      */
    var slotOnload: SlotOnloadEvent
    
    /**
      * Alias for {@link googletag.events.SlotRenderEndedEvent}
      */
    var slotRenderEnded: SlotRenderEndedEvent
    
    /**
      * Alias for {@link googletag.events.SlotRequestedEvent}
      */
    var slotRequested: SlotRequestedEvent
    
    /**
      * Alias for {@link googletag.events.SlotResponseReceived}
      */
    var slotResponseReceived: SlotResponseReceived
    
    /**
      * Alias for {@link googletag.events.SlotVisibilityChangedEvent}
      */
    var slotVisibilityChanged: SlotVisibilityChangedEvent
  }
  object EventTypeMap {
    
    inline def apply(
      impressionViewable: ImpressionViewableEvent,
      rewardedSlotClosed: RewardedSlotClosedEvent,
      rewardedSlotGranted: RewardedSlotGrantedEvent,
      rewardedSlotReady: RewardedSlotReadyEvent,
      slotOnload: SlotOnloadEvent,
      slotRenderEnded: SlotRenderEndedEvent,
      slotRequested: SlotRequestedEvent,
      slotResponseReceived: SlotResponseReceived,
      slotVisibilityChanged: SlotVisibilityChangedEvent
    ): EventTypeMap = {
      val __obj = js.Dynamic.literal(impressionViewable = impressionViewable.asInstanceOf[js.Any], rewardedSlotClosed = rewardedSlotClosed.asInstanceOf[js.Any], rewardedSlotGranted = rewardedSlotGranted.asInstanceOf[js.Any], rewardedSlotReady = rewardedSlotReady.asInstanceOf[js.Any], slotOnload = slotOnload.asInstanceOf[js.Any], slotRenderEnded = slotRenderEnded.asInstanceOf[js.Any], slotRequested = slotRequested.asInstanceOf[js.Any], slotResponseReceived = slotResponseReceived.asInstanceOf[js.Any], slotVisibilityChanged = slotVisibilityChanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventTypeMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventTypeMap] (val x: Self) extends AnyVal {
      
      inline def setImpressionViewable(value: ImpressionViewableEvent): Self = StObject.set(x, "impressionViewable", value.asInstanceOf[js.Any])
      
      inline def setRewardedSlotClosed(value: RewardedSlotClosedEvent): Self = StObject.set(x, "rewardedSlotClosed", value.asInstanceOf[js.Any])
      
      inline def setRewardedSlotGranted(value: RewardedSlotGrantedEvent): Self = StObject.set(x, "rewardedSlotGranted", value.asInstanceOf[js.Any])
      
      inline def setRewardedSlotReady(value: RewardedSlotReadyEvent): Self = StObject.set(x, "rewardedSlotReady", value.asInstanceOf[js.Any])
      
      inline def setSlotOnload(value: SlotOnloadEvent): Self = StObject.set(x, "slotOnload", value.asInstanceOf[js.Any])
      
      inline def setSlotRenderEnded(value: SlotRenderEndedEvent): Self = StObject.set(x, "slotRenderEnded", value.asInstanceOf[js.Any])
      
      inline def setSlotRequested(value: SlotRequestedEvent): Self = StObject.set(x, "slotRequested", value.asInstanceOf[js.Any])
      
      inline def setSlotResponseReceived(value: SlotResponseReceived): Self = StObject.set(x, "slotResponseReceived", value.asInstanceOf[js.Any])
      
      inline def setSlotVisibilityChanged(value: SlotVisibilityChangedEvent): Self = StObject.set(x, "slotVisibilityChanged", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This event is fired when an impression becomes viewable, according to the [Active View criteria](https://support.google.com/admanager/answer/4524488).
    *
    * @example
    *   // This listener is called when an impression becomes viewable.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('impressionViewable',
    *       function(event) {
    *         var slot = event.slot;
    *         console.log('Impression for slot', slot.getSlotElementId(),
    *                     'became viewable.');
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type ImpressionViewableEvent = Event
  
  /**
    * This event is fired when a rewarded ad slot is closed by the user.
    * It may fire either before or after a reward has been granted.
    * To determine whether a reward has been granted, use {@link RewardedSlotGrantedEvent} instead.
    *
    * @example
    *   // This listener is called when the user closes a rewarded ad slot.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('rewardedSlotClosed',
    *       function(event) {
    *         var slot = event.slot;
    *         console.log('Rewarded ad slot', slot.getSlotElementId(),
    *                     'has been closed.');
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * @see [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
    */
  // tslint:disable-next-line:no-empty-interface
  type RewardedSlotClosedEvent = Event
  
  /**
    * This event is fired when a reward is granted for viewing a [rewarded ad](https://support.google.com/admanager/answer/9116812).
    * If the ad is closed before the criteria for granting a reward is met, this event will not fire.
    *
    * @example
    *   // This listener is called whenever a reward is granted for a rewarded ad.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('rewardedSlotGranted',
    *       function(event) {
    *         var slot = event.slot;
    *         console.group(
    *             'Reward granted for slot', slot.getSlotElementId(), '.');
    *         // Log details of the reward.
    *         console.log('Reward type:', event.payload.type);
    *         console.log('Reward amount:', event.payload.amount);
    *         console.groupEnd();
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * @see [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
    */
  trait RewardedSlotGrantedEvent
    extends StObject
       with Event {
    
    /**
      * An object containing information about the reward that was granted.
      */
    var payload: RewardedPayload | Null
  }
  object RewardedSlotGrantedEvent {
    
    inline def apply(serviceName: String, slot: Slot): RewardedSlotGrantedEvent = {
      val __obj = js.Dynamic.literal(serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], payload = null)
      __obj.asInstanceOf[RewardedSlotGrantedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RewardedSlotGrantedEvent] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: RewardedPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    }
  }
  
  /**
    * This event is fired when a [rewarded ad](https://support.google.com/admanager/answer/9116812) is ready to be displayed.
    * The publisher is responsible for presenting the user an option to view the ad before displaying it.
    *
    * @example
    *   // This listener is called when a rewarded ad slot becomes ready to be
    *   // displayed.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('rewardedSlotReady',
    *       function(event) {
    *         var slot = event.slot;
    *         console.log('Rewarded ad slot', slot.getSlotElementId(),
    *                     'is ready to be displayed.');
    *         if('User consents to viewing the ad.') {
    *           // Display the ad.
    *           event.makeRewardedVisible();
    *         }
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * @see [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
    */
  trait RewardedSlotReadyEvent
    extends StObject
       with Event {
    
    /**
      * Displays the rewarded ad. This method should not be called until the user has consented to view the ad.
      */
    def makeRewardedVisible(): Unit
  }
  object RewardedSlotReadyEvent {
    
    inline def apply(makeRewardedVisible: () => Unit, serviceName: String, slot: Slot): RewardedSlotReadyEvent = {
      val __obj = js.Dynamic.literal(makeRewardedVisible = js.Any.fromFunction0(makeRewardedVisible), serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
      __obj.asInstanceOf[RewardedSlotReadyEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RewardedSlotReadyEvent] (val x: Self) extends AnyVal {
      
      inline def setMakeRewardedVisible(value: () => Unit): Self = StObject.set(x, "makeRewardedVisible", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * This event is fired when the creative's iframe fires its load event. When rendering rich media ads in sync rendering mode, no iframe is used so no `SlotOnloadEvent` will be fired.
    *
    * @example
    *   // This listener is called when a creative iframe load event fires.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('slotOnload', function(event) {
    *     var slot = event.slot;
    *     console.log('Creative iframe for slot', slot.getSlotElementId(),
    *                 'has loaded.');
    *     if (slot === targetSlot) {
    *       // Slot specific logic.
    *     }
    *   });
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotOnloadEvent = Event
  
  /**
    * This event is fired when the creative code is injected into a slot.
    * This event will occur before the creative's resources are fetched, so the creative may not be visible yet.
    * If you need to know when all creative resources for a slot have finished loading, consider the {@link SlotOnloadEvent} instead.
    *
    * @example
    *   // This listener is called when a slot has finished rendering.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('slotRenderEnded',
    *       function(event) {
    *         var slot = event.slot;
    *         console.group(
    *             'Slot', slot.getSlotElementId(), 'finished rendering.');
    *         // Log details of the rendered ad.
    *         console.log('Advertiser ID:', event.advertiserId);
    *         console.log('Campaign ID:', event.campaignId);
    *         console.log('Company IDs:', event.companyIds);
    *         console.log('Creative ID:', event.creativeId);
    *         console.log('Creative Template ID:', event.creativeTemplateId);
    *         console.log('Is backfill?:', event.isBackfill);
    *         console.log('Is empty?:', event.isEmpty);
    *         console.log('Label IDs:', event.labelIds);
    *         console.log('Line Item ID:', event.lineItemId);
    *         console.log('Size:', event.size);
    *         console.log('Slot content changed?:', event.slotContentChanged);
    *         console.log('Source Agnostic Creative ID:',
    *                     event.sourceAgnosticCreativeId);
    *         console.log('Source Agnostic Line Item ID:',
    *                     event.sourceAgnosticLineItemId);
    *         console.log('Yield Group IDs:', event.yieldGroupIds);
    *         console.groupEnd();
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  trait SlotRenderEndedEvent
    extends StObject
       with Event {
    
    /**
      * Advertiser ID of the rendered ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var advertiserId: Double | Null
    
    /**
      * Campaign ID of the rendered ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var campaignId: Double | Null
    
    /**
      * IDs of the companies that bid on the rendered backfill ad.
      */
    var companyIds: js.Array[Double] | Null
    
    /**
      * Creative ID of the rendered reservation ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var creativeId: Double | Null
    
    /**
      * Creative template ID of the rendered reservation ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var creativeTemplateId: Double | Null
    
    /**
      * Whether an ad was a backfill ad. Value is `true` if the ad was a backfill ad, `false` otherwise.
      */
    var isBackfill: Boolean
    
    /**
      * Whether an ad was returned for the slot. Value is `true` if no ad was returned, `false` otherwise.
      */
    var isEmpty: Boolean
    
    /**
      * Label IDs of the rendered ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var labelIds: js.Array[Double] | Null
    
    /**
      * Line item ID of the rendered reservation ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var lineItemId: Double | Null
    
    /**
      * Indicates the pixel size of the rendered creative. Example: `[728, 90]`. Value is `null` for empty ad slots.
      */
    var size: js.Array[Double] | String | Null
    
    /**
      * Whether the slot content was changed with the rendered ad. Value is `true` if the content was changed, `false` otherwise.
      */
    var slotContentChanged: Boolean
    
    /**
      * Creative ID of the rendered reservation or backfill ad.
      * Value is `null` if the ad is not a reservation or line item backfill, or the creative is rendered by services other than {@link PubAdsService}.
      */
    var sourceAgnosticCreativeId: Double | Null
    
    /**
      * Line item ID of the rendered reservation or backfill ad.
      * Value is `null` if the ad is not a reservation or line item backfill, or the creative is rendered by services other than {@link PubAdsService}.
      */
    var sourceAgnosticLineItemId: Double | Null
    
    /**
      * IDs of the yield groups for the rendered backfill ad. Value is `null` for empty slots, reservation ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var yieldGroupIds: js.Array[Double] | Null
  }
  object SlotRenderEndedEvent {
    
    inline def apply(
      isBackfill: Boolean,
      isEmpty: Boolean,
      serviceName: String,
      slot: Slot,
      slotContentChanged: Boolean
    ): SlotRenderEndedEvent = {
      val __obj = js.Dynamic.literal(isBackfill = isBackfill.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], slotContentChanged = slotContentChanged.asInstanceOf[js.Any], advertiserId = null, campaignId = null, companyIds = null, creativeId = null, creativeTemplateId = null, labelIds = null, lineItemId = null, size = null, sourceAgnosticCreativeId = null, sourceAgnosticLineItemId = null, yieldGroupIds = null)
      __obj.asInstanceOf[SlotRenderEndedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
      
      inline def setAdvertiserId(value: Double): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
      
      inline def setCampaignId(value: Double): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
      
      inline def setCompanyIds(value: js.Array[Double]): Self = StObject.set(x, "companyIds", value.asInstanceOf[js.Any])
      
      inline def setCompanyIdsNull: Self = StObject.set(x, "companyIds", null)
      
      inline def setCompanyIdsVarargs(value: Double*): Self = StObject.set(x, "companyIds", js.Array(value*))
      
      inline def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
      
      inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
      
      inline def setCreativeTemplateId(value: Double): Self = StObject.set(x, "creativeTemplateId", value.asInstanceOf[js.Any])
      
      inline def setCreativeTemplateIdNull: Self = StObject.set(x, "creativeTemplateId", null)
      
      inline def setIsBackfill(value: Boolean): Self = StObject.set(x, "isBackfill", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLabelIds(value: js.Array[Double]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
      
      inline def setLabelIdsNull: Self = StObject.set(x, "labelIds", null)
      
      inline def setLabelIdsVarargs(value: Double*): Self = StObject.set(x, "labelIds", js.Array(value*))
      
      inline def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
      
      inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
      
      inline def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setSlotContentChanged(value: Boolean): Self = StObject.set(x, "slotContentChanged", value.asInstanceOf[js.Any])
      
      inline def setSourceAgnosticCreativeId(value: Double): Self = StObject.set(x, "sourceAgnosticCreativeId", value.asInstanceOf[js.Any])
      
      inline def setSourceAgnosticCreativeIdNull: Self = StObject.set(x, "sourceAgnosticCreativeId", null)
      
      inline def setSourceAgnosticLineItemId(value: Double): Self = StObject.set(x, "sourceAgnosticLineItemId", value.asInstanceOf[js.Any])
      
      inline def setSourceAgnosticLineItemIdNull: Self = StObject.set(x, "sourceAgnosticLineItemId", null)
      
      inline def setYieldGroupIds(value: js.Array[Double]): Self = StObject.set(x, "yieldGroupIds", value.asInstanceOf[js.Any])
      
      inline def setYieldGroupIdsNull: Self = StObject.set(x, "yieldGroupIds", null)
      
      inline def setYieldGroupIdsVarargs(value: Double*): Self = StObject.set(x, "yieldGroupIds", js.Array(value*))
    }
  }
  
  /**
    * This event is fired when an ad has been requested for a particular slot.
    *
    * @example
    *   // This listener is called when the specified service issues an ad
    *   // request for a slot. Each slot will fire this event, even though they
    *   // may be batched together in a single request if single request
    *   // architecture (SRA) is enabled.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('slotRequested', function(event) {
    *     var slot = event.slot;
    *     console.log('Slot', slot.getSlotElementId(), 'has been requested.');
    *     if (slot === targetSlot) {
    *       // Slot specific logic.
    *     }
    *   });
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotRequestedEvent = Event
  
  /**
    * This event is fired when an ad response has been received for a particular slot.
    *
    * @example
    *   // This listener is called when an ad response has been received
    *   // for a slot.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('slotResponseReceived',
    *       function(event) {
    *         var slot = event.slot;
    *         console.log('Ad response for slot', slot.getSlotElementId(),
    *                     'received.');
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotResponseReceived = Event
  
  /**
    * This event is fired whenever the on-screen percentage of an ad slot's area changes. The event is throttled and will not fire more often than once every 200ms.
    *
    * @example
    *   // This listener is called whenever the on-screen percentage of an
    *   // ad slot's area changes.
    *   var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    *   googletag.pubads().addEventListener('slotVisibilityChanged',
    *       function(event) {
    *         var slot = event.slot;
    *         console.group(
    *             'Visibility of slot', slot.getSlotElementId(), 'changed.');
    *         // Log details of the event.
    *         console.log('Visible area:', event.inViewPercentage + '%');
    *         console.groupEnd();
    *         if (slot === targetSlot) {
    *           // Slot specific logic.
    *         }
    *       }
    *   );
    *
    * @see [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  trait SlotVisibilityChangedEvent
    extends StObject
       with Event {
    
    /**
      * The percentage of the ad's area that is visible. Value is a number between 0 and 100.
      */
    var inViewPercentage: Double
  }
  object SlotVisibilityChangedEvent {
    
    inline def apply(inViewPercentage: Double, serviceName: String, slot: Slot): SlotVisibilityChangedEvent = {
      val __obj = js.Dynamic.literal(inViewPercentage = inViewPercentage.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlotVisibilityChangedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotVisibilityChangedEvent] (val x: Self) extends AnyVal {
      
      inline def setInViewPercentage(value: Double): Self = StObject.set(x, "inViewPercentage", value.asInstanceOf[js.Any])
    }
  }
}
