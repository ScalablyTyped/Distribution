package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPersonalProtection extends StObject {
  
  /**
    * Hand-sanitizer and/or sanitizing wipes are offered in common areas.
    */
  var commonAreasOfferSanitizingItems: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Common areas offer sanitizing items exception.
    */
  var commonAreasOfferSanitizingItemsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Masks required on the property.
    */
  var faceMaskRequired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Face mask required exception.
    */
  var faceMaskRequiredException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * In-room hygiene kits with masks, hand sanitizer, and/or antibacterial wipes.
    */
  var guestRoomHygieneKitsAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Guest room hygiene kits available exception.
    */
  var guestRoomHygieneKitsAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Masks and/or gloves available for guests.
    */
  var protectiveEquipmentAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Protective equipment available exception.
    */
  var protectiveEquipmentAvailableException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPersonalProtection {
  
  inline def apply(): SchemaPersonalProtection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPersonalProtection]
  }
  
  extension [Self <: SchemaPersonalProtection](x: Self) {
    
    inline def setCommonAreasOfferSanitizingItems(value: Boolean): Self = StObject.set(x, "commonAreasOfferSanitizingItems", value.asInstanceOf[js.Any])
    
    inline def setCommonAreasOfferSanitizingItemsException(value: String): Self = StObject.set(x, "commonAreasOfferSanitizingItemsException", value.asInstanceOf[js.Any])
    
    inline def setCommonAreasOfferSanitizingItemsExceptionNull: Self = StObject.set(x, "commonAreasOfferSanitizingItemsException", null)
    
    inline def setCommonAreasOfferSanitizingItemsExceptionUndefined: Self = StObject.set(x, "commonAreasOfferSanitizingItemsException", js.undefined)
    
    inline def setCommonAreasOfferSanitizingItemsNull: Self = StObject.set(x, "commonAreasOfferSanitizingItems", null)
    
    inline def setCommonAreasOfferSanitizingItemsUndefined: Self = StObject.set(x, "commonAreasOfferSanitizingItems", js.undefined)
    
    inline def setFaceMaskRequired(value: Boolean): Self = StObject.set(x, "faceMaskRequired", value.asInstanceOf[js.Any])
    
    inline def setFaceMaskRequiredException(value: String): Self = StObject.set(x, "faceMaskRequiredException", value.asInstanceOf[js.Any])
    
    inline def setFaceMaskRequiredExceptionNull: Self = StObject.set(x, "faceMaskRequiredException", null)
    
    inline def setFaceMaskRequiredExceptionUndefined: Self = StObject.set(x, "faceMaskRequiredException", js.undefined)
    
    inline def setFaceMaskRequiredNull: Self = StObject.set(x, "faceMaskRequired", null)
    
    inline def setFaceMaskRequiredUndefined: Self = StObject.set(x, "faceMaskRequired", js.undefined)
    
    inline def setGuestRoomHygieneKitsAvailable(value: Boolean): Self = StObject.set(x, "guestRoomHygieneKitsAvailable", value.asInstanceOf[js.Any])
    
    inline def setGuestRoomHygieneKitsAvailableException(value: String): Self = StObject.set(x, "guestRoomHygieneKitsAvailableException", value.asInstanceOf[js.Any])
    
    inline def setGuestRoomHygieneKitsAvailableExceptionNull: Self = StObject.set(x, "guestRoomHygieneKitsAvailableException", null)
    
    inline def setGuestRoomHygieneKitsAvailableExceptionUndefined: Self = StObject.set(x, "guestRoomHygieneKitsAvailableException", js.undefined)
    
    inline def setGuestRoomHygieneKitsAvailableNull: Self = StObject.set(x, "guestRoomHygieneKitsAvailable", null)
    
    inline def setGuestRoomHygieneKitsAvailableUndefined: Self = StObject.set(x, "guestRoomHygieneKitsAvailable", js.undefined)
    
    inline def setProtectiveEquipmentAvailable(value: Boolean): Self = StObject.set(x, "protectiveEquipmentAvailable", value.asInstanceOf[js.Any])
    
    inline def setProtectiveEquipmentAvailableException(value: String): Self = StObject.set(x, "protectiveEquipmentAvailableException", value.asInstanceOf[js.Any])
    
    inline def setProtectiveEquipmentAvailableExceptionNull: Self = StObject.set(x, "protectiveEquipmentAvailableException", null)
    
    inline def setProtectiveEquipmentAvailableExceptionUndefined: Self = StObject.set(x, "protectiveEquipmentAvailableException", js.undefined)
    
    inline def setProtectiveEquipmentAvailableNull: Self = StObject.set(x, "protectiveEquipmentAvailable", null)
    
    inline def setProtectiveEquipmentAvailableUndefined: Self = StObject.set(x, "protectiveEquipmentAvailable", js.undefined)
  }
}
