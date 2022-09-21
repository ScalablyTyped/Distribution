package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMinimizedContact extends StObject {
  
  /**
    * No-contact check-in and check-out.
    */
  var contactlessCheckinCheckout: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Contactless check-in check-out exception.
    */
  var contactlessCheckinCheckoutException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Keyless mobile entry to guest rooms.
    */
  var digitalGuestRoomKeys: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Digital guest room keys exception.
    */
  var digitalGuestRoomKeysException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Housekeeping scheduled by request only.
    */
  var housekeepingScheduledRequestOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Housekeeping scheduled request only exception.
    */
  var housekeepingScheduledRequestOnlyException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * High-touch items, such as magazines, removed from common areas.
    */
  var noHighTouchItemsCommonAreas: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * No high touch items common areas exception.
    */
  var noHighTouchItemsCommonAreasException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * High-touch items, such as decorative pillows, removed from guest rooms.
    */
  var noHighTouchItemsGuestRooms: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * No high touch items guest rooms exception.
    */
  var noHighTouchItemsGuestRoomsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Plastic key cards are disinfected or discarded.
    */
  var plasticKeycardsDisinfected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Plastic keycards disinfected exception.
    */
  var plasticKeycardsDisinfectedException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Buffer maintained between room bookings.
    */
  var roomBookingsBuffer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Room bookings buffer exception.
    */
  var roomBookingsBufferException: js.UndefOr[String | Null] = js.undefined
}
object SchemaMinimizedContact {
  
  inline def apply(): SchemaMinimizedContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMinimizedContact]
  }
  
  extension [Self <: SchemaMinimizedContact](x: Self) {
    
    inline def setContactlessCheckinCheckout(value: Boolean): Self = StObject.set(x, "contactlessCheckinCheckout", value.asInstanceOf[js.Any])
    
    inline def setContactlessCheckinCheckoutException(value: String): Self = StObject.set(x, "contactlessCheckinCheckoutException", value.asInstanceOf[js.Any])
    
    inline def setContactlessCheckinCheckoutExceptionNull: Self = StObject.set(x, "contactlessCheckinCheckoutException", null)
    
    inline def setContactlessCheckinCheckoutExceptionUndefined: Self = StObject.set(x, "contactlessCheckinCheckoutException", js.undefined)
    
    inline def setContactlessCheckinCheckoutNull: Self = StObject.set(x, "contactlessCheckinCheckout", null)
    
    inline def setContactlessCheckinCheckoutUndefined: Self = StObject.set(x, "contactlessCheckinCheckout", js.undefined)
    
    inline def setDigitalGuestRoomKeys(value: Boolean): Self = StObject.set(x, "digitalGuestRoomKeys", value.asInstanceOf[js.Any])
    
    inline def setDigitalGuestRoomKeysException(value: String): Self = StObject.set(x, "digitalGuestRoomKeysException", value.asInstanceOf[js.Any])
    
    inline def setDigitalGuestRoomKeysExceptionNull: Self = StObject.set(x, "digitalGuestRoomKeysException", null)
    
    inline def setDigitalGuestRoomKeysExceptionUndefined: Self = StObject.set(x, "digitalGuestRoomKeysException", js.undefined)
    
    inline def setDigitalGuestRoomKeysNull: Self = StObject.set(x, "digitalGuestRoomKeys", null)
    
    inline def setDigitalGuestRoomKeysUndefined: Self = StObject.set(x, "digitalGuestRoomKeys", js.undefined)
    
    inline def setHousekeepingScheduledRequestOnly(value: Boolean): Self = StObject.set(x, "housekeepingScheduledRequestOnly", value.asInstanceOf[js.Any])
    
    inline def setHousekeepingScheduledRequestOnlyException(value: String): Self = StObject.set(x, "housekeepingScheduledRequestOnlyException", value.asInstanceOf[js.Any])
    
    inline def setHousekeepingScheduledRequestOnlyExceptionNull: Self = StObject.set(x, "housekeepingScheduledRequestOnlyException", null)
    
    inline def setHousekeepingScheduledRequestOnlyExceptionUndefined: Self = StObject.set(x, "housekeepingScheduledRequestOnlyException", js.undefined)
    
    inline def setHousekeepingScheduledRequestOnlyNull: Self = StObject.set(x, "housekeepingScheduledRequestOnly", null)
    
    inline def setHousekeepingScheduledRequestOnlyUndefined: Self = StObject.set(x, "housekeepingScheduledRequestOnly", js.undefined)
    
    inline def setNoHighTouchItemsCommonAreas(value: Boolean): Self = StObject.set(x, "noHighTouchItemsCommonAreas", value.asInstanceOf[js.Any])
    
    inline def setNoHighTouchItemsCommonAreasException(value: String): Self = StObject.set(x, "noHighTouchItemsCommonAreasException", value.asInstanceOf[js.Any])
    
    inline def setNoHighTouchItemsCommonAreasExceptionNull: Self = StObject.set(x, "noHighTouchItemsCommonAreasException", null)
    
    inline def setNoHighTouchItemsCommonAreasExceptionUndefined: Self = StObject.set(x, "noHighTouchItemsCommonAreasException", js.undefined)
    
    inline def setNoHighTouchItemsCommonAreasNull: Self = StObject.set(x, "noHighTouchItemsCommonAreas", null)
    
    inline def setNoHighTouchItemsCommonAreasUndefined: Self = StObject.set(x, "noHighTouchItemsCommonAreas", js.undefined)
    
    inline def setNoHighTouchItemsGuestRooms(value: Boolean): Self = StObject.set(x, "noHighTouchItemsGuestRooms", value.asInstanceOf[js.Any])
    
    inline def setNoHighTouchItemsGuestRoomsException(value: String): Self = StObject.set(x, "noHighTouchItemsGuestRoomsException", value.asInstanceOf[js.Any])
    
    inline def setNoHighTouchItemsGuestRoomsExceptionNull: Self = StObject.set(x, "noHighTouchItemsGuestRoomsException", null)
    
    inline def setNoHighTouchItemsGuestRoomsExceptionUndefined: Self = StObject.set(x, "noHighTouchItemsGuestRoomsException", js.undefined)
    
    inline def setNoHighTouchItemsGuestRoomsNull: Self = StObject.set(x, "noHighTouchItemsGuestRooms", null)
    
    inline def setNoHighTouchItemsGuestRoomsUndefined: Self = StObject.set(x, "noHighTouchItemsGuestRooms", js.undefined)
    
    inline def setPlasticKeycardsDisinfected(value: Boolean): Self = StObject.set(x, "plasticKeycardsDisinfected", value.asInstanceOf[js.Any])
    
    inline def setPlasticKeycardsDisinfectedException(value: String): Self = StObject.set(x, "plasticKeycardsDisinfectedException", value.asInstanceOf[js.Any])
    
    inline def setPlasticKeycardsDisinfectedExceptionNull: Self = StObject.set(x, "plasticKeycardsDisinfectedException", null)
    
    inline def setPlasticKeycardsDisinfectedExceptionUndefined: Self = StObject.set(x, "plasticKeycardsDisinfectedException", js.undefined)
    
    inline def setPlasticKeycardsDisinfectedNull: Self = StObject.set(x, "plasticKeycardsDisinfected", null)
    
    inline def setPlasticKeycardsDisinfectedUndefined: Self = StObject.set(x, "plasticKeycardsDisinfected", js.undefined)
    
    inline def setRoomBookingsBuffer(value: Boolean): Self = StObject.set(x, "roomBookingsBuffer", value.asInstanceOf[js.Any])
    
    inline def setRoomBookingsBufferException(value: String): Self = StObject.set(x, "roomBookingsBufferException", value.asInstanceOf[js.Any])
    
    inline def setRoomBookingsBufferExceptionNull: Self = StObject.set(x, "roomBookingsBufferException", null)
    
    inline def setRoomBookingsBufferExceptionUndefined: Self = StObject.set(x, "roomBookingsBufferException", js.undefined)
    
    inline def setRoomBookingsBufferNull: Self = StObject.set(x, "roomBookingsBuffer", null)
    
    inline def setRoomBookingsBufferUndefined: Self = StObject.set(x, "roomBookingsBuffer", js.undefined)
  }
}
