package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the namespace that GPT uses for `events`.
  */
object events {
  
  /**
    * Base Interface for all GPT events. All GPT events below will have the following fields.
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
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
    * Event type for all GPT events.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.googletag.googletagStrings.impressionViewable
    - typings.googletag.googletagStrings.rewardedSlotClosed
    - typings.googletag.googletagStrings.rewardedSlotGranted
    - typings.googletag.googletagStrings.rewardedSlotReady
    - typings.googletag.googletagStrings.slotOnload
    - typings.googletag.googletagStrings.slotRenderEnded
    - typings.googletag.googletagStrings.slotRequested
    - typings.googletag.googletagStrings.slotResponseReceived
    - typings.googletag.googletagStrings.slotVisibilityChanged
  */
  trait EventType extends StObject
  
  /**
    * This is a pseudo-type that maps an event name to its corresponding event object type for {@link Service.addEventListener} and {@link Service.removeEventListener}.
    * It is documented for reference and type safety purposes only.
    */
  trait EventTypeMap extends StObject {
    
    var impressionViewable: ImpressionViewableEvent
    
    var rewardedSlotClosed: RewardedSlotClosedEvent
    
    var rewardedSlotGranted: RewardedSlotGrantedEvent
    
    var rewardedSlotReady: RewardedSlotReadyEvent
    
    var slotOnload: SlotOnloadEvent
    
    var slotRenderEnded: SlotRenderEndedEvent
    
    var slotRequested: SlotRequestedEvent
    
    var slotResponseReceived: SlotResponseReceived
    
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
    * **Example**
    * ```
    * // This listener is called when an impression becomes viewable.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('impressionViewable',
    *     function(event) {
    *       var slot = event.slot;
    *       console.log('Impression for slot', slot.getSlotElementId(),
    *                   'became viewable.');
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type ImpressionViewableEvent = Event
  
  /**
    * This event is fired when a rewarded ad slot is closed by the user.
    * It may fire either before or after a reward has been granted.
    * To determine whether a reward has been granted, use {@link RewardedSlotGrantedEvent} instead.
    *
    * **Example**
    * ```
    * // This listener is called when the user closes a rewarded ad slot.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('rewardedSlotClosed',
    *     function(event) {
    *       var slot = event.slot;
    *       console.log('Rewarded ad slot', slot.getSlotElementId(),
    *                   'has been closed.');
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * - [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
    */
  // tslint:disable-next-line:no-empty-interface
  type RewardedSlotClosedEvent = Event
  
  /**
    * This event is fired when a reward is granted for viewing a [rewarded ad](https://support.google.com/admanager/answer/9116812).
    * If the ad is closed before the criteria for granting a reward is met, this event will not fire.
    *
    * **Example**
    * ```
    * // This listener is called whenever a reward is granted for a rewarded ad.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('rewardedSlotGranted',
    *     function(event) {
    *       var slot = event.slot;
    *       console.group(
    *           'Reward granted for slot', slot.getSlotElementId(), '.');
    *       // Log details of the reward.
    *       console.log('Reward type:', event.payload.type);
    *       console.log('Reward amount:', event.payload.amount);
    *       console.groupEnd();
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * - [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
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
    * **Example**
    * ```
    * // This listener is called when a rewarded ad slot becomes ready to be
    * // displayed.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('rewardedSlotReady',
    *     function(event) {
    *       var slot = event.slot;
    *       console.log('Rewarded ad slot', slot.getSlotElementId(),
    *                   'is ready to be displayed.');
    *       if('User consents to viewing the ad.') {
    *         // Display the ad.
    *         event.makeRewardedVisible();
    *       }
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    * - [Display a rewarded ad](https://developers.google.com/publisher-tag/samples/display-rewarded-ad)
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
    * **Example**
    * ```
    * // This listener is called when a creative iframe load event fires.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('slotOnload', function(event) {
    *   var slot = event.slot;
    *   console.log('Creative iframe for slot', slot.getSlotElementId(),
    *               'has loaded.');
    *   if (slot === targetSlot) {
    *     // Slot specific logic.
    *   }
    * });
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotOnloadEvent = Event
  
  /**
    * This event is fired when the creative code is injected into a slot.
    * This event will occur before the creative's resources are fetched, so the creative may not be visible yet.
    * If you need to know when all creative resources for a slot have finished loading, consider the {@link SlotOnloadEvent} instead.
    *
    * **Example**
    * ```
    * // This listener is called when a slot has finished rendering.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('slotRenderEnded',
    *     function(event) {
    *       var slot = event.slot;
    *       console.group(
    *           'Slot', slot.getSlotElementId(), 'finished rendering.');
    *       // Log details of the rendered ad.
    *       console.log('Advertiser ID:', event.advertiserId);
    *       console.log('Campaign ID: ', event.campaignId);
    *       console.log('Creative ID: ', event.creativeId);
    *       console.log('Is empty?:', event.isEmpty);
    *       console.log('Line Item ID:', event.lineItemId);
    *       console.log('Size:', event.size);
    *       console.log('Source Agnostic Creative ID:',
    *                   event.sourceAgnosticCreativeId);
    *       console.log('Source Agnostic Line Item ID:',
    *                   event.sourceAgnosticLineItemId);
    *       console.groupEnd();
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
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
      * Creative ID of the rendered reservation ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var creativeId: Double | Null
    
    /**
      * Whether an ad was returned for the slot. Value is `true` if no ad was returned, `false` otherwise.
      */
    var isEmpty: Boolean
    
    /**
      * Line item ID of the rendered reservation ad. Value is `null` for empty slots, backfill ads, and creatives rendered by services other than {@link PubAdsService}.
      */
    var lineItemId: Double | Null
    
    /**
      * Indicates the pixel size of the rendered creative. Example: `[728, 90]`. Value is `null` for empty ad slots.
      */
    var size: js.Array[Double] | String | Null
    
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
  }
  object SlotRenderEndedEvent {
    
    inline def apply(isEmpty: Boolean, serviceName: String, slot: Slot): SlotRenderEndedEvent = {
      val __obj = js.Dynamic.literal(isEmpty = isEmpty.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any], advertiserId = null, campaignId = null, creativeId = null, lineItemId = null, size = null, sourceAgnosticCreativeId = null, sourceAgnosticLineItemId = null)
      __obj.asInstanceOf[SlotRenderEndedEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlotRenderEndedEvent] (val x: Self) extends AnyVal {
      
      inline def setAdvertiserId(value: Double): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
      
      inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
      
      inline def setCampaignId(value: Double): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
      
      inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
      
      inline def setCreativeId(value: Double): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
      
      inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setLineItemId(value: Double): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
      
      inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
      
      inline def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
      
      inline def setSourceAgnosticCreativeId(value: Double): Self = StObject.set(x, "sourceAgnosticCreativeId", value.asInstanceOf[js.Any])
      
      inline def setSourceAgnosticCreativeIdNull: Self = StObject.set(x, "sourceAgnosticCreativeId", null)
      
      inline def setSourceAgnosticLineItemId(value: Double): Self = StObject.set(x, "sourceAgnosticLineItemId", value.asInstanceOf[js.Any])
      
      inline def setSourceAgnosticLineItemIdNull: Self = StObject.set(x, "sourceAgnosticLineItemId", null)
    }
  }
  
  /**
    * This event is fired when an ad has been requested for a particular slot.
    *
    * **Example**
    * ```
    * // This listener is called when the specified service issues an ad
    * // request for a slot. Each slot will fire this event, even though they
    * // may be batched together in a single request if single request
    * // architecture (SRA) is enabled.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('slotRequested', function(event) {
    *   var slot = event.slot;
    *   console.log('Slot', slot.getSlotElementId(), 'has been requested.');
    *   if (slot === targetSlot) {
    *     // Slot specific logic.
    *   }
    * });
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotRequestedEvent = Event
  
  /**
    * This event is fired when an ad response has been received for a particular slot.
    *
    * **Example**
    * ```
    * // This listener is called when an ad response has been received
    * // for a slot.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('slotResponseReceived',
    *     function(event) {
    *       var slot = event.slot;
    *       console.log('Ad response for slot', slot.getSlotElementId(),
    *                   'received.');
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
    */
  // tslint:disable-next-line:no-empty-interface
  type SlotResponseReceived = Event
  
  /**
    * This event is fired whenever the on-screen percentage of an ad slot's area changes. The event is throttled and will not fire more often than once every 200ms.
    *
    * **Example**
    * ```
    * // This listener is called whenever the on-screen percentage of an
    * // ad slot's area changes.
    * var targetSlot = googletag.defineSlot('/1234567/example', [160, 600]);
    * googletag.pubads().addEventListener('slotVisibilityChanged',
    *     function(event) {
    *       var slot = event.slot;
    *       console.group(
    *           'Visibility of slot', slot.getSlotElementId(), 'changed.');
    *       // Log details of the event.
    *       console.log('Visible area:', event.inViewPercentage + '%');
    *       console.groupEnd();
    *       if (slot === targetSlot) {
    *         // Slot specific logic.
    *       }
    *     }
    * );
    * ```
    *
    * **See also**
    * - [Ad event listeners](https://developers.google.com/publisher-tag/samples/ad-event-listeners)
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
