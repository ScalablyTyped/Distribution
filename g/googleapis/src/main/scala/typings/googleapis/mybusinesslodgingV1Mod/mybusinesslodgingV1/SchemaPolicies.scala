package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicies extends StObject {
  
  /**
    * All inclusive available. The hotel offers a rate option that includes the cost of the room, meals, activities, and other amenities that might otherwise be charged separately.
    */
  var allInclusiveAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * All inclusive available exception.
    */
  var allInclusiveAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All inclusive only. The only rate option offered by the hotel is a rate that includes the cost of the room, meals, activities and other amenities that might otherwise be charged separately.
    */
  var allInclusiveOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * All inclusive only exception.
    */
  var allInclusiveOnlyException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Check-in time. The time of the day at which the hotel begins providing guests access to their unit at the beginning of their stay.
    */
  var checkinTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Check-in time exception.
    */
  var checkinTimeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Check-out time. The time of the day on the last day of a guest's reserved stay at which the guest must vacate their room and settle their bill. Some hotels may offer late or early check out for a fee.
    */
  var checkoutTime: js.UndefOr[SchemaTimeOfDay] = js.undefined
  
  /**
    * Check-out time exception.
    */
  var checkoutTimeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kids stay free. The children of guests are allowed to stay in the room/suite of a parent or adult without an additional fee. The policy may or may not stipulate a limit of the child's age or the overall number of children allowed.
    */
  var kidsStayFree: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Kids stay free exception.
    */
  var kidsStayFreeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max child age. The hotel allows children up to a certain age to stay in the room/suite of a parent or adult without an additional fee.
    */
  var maxChildAge: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max child age exception.
    */
  var maxChildAgeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max kids stay free count. The hotel allows a specific, defined number of children to stay in the room/suite of a parent or adult without an additional fee.
    */
  var maxKidsStayFreeCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max kids stay free count exception.
    */
  var maxKidsStayFreeCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Forms of payment accepted at the property.
    */
  var paymentOptions: js.UndefOr[SchemaPaymentOptions] = js.undefined
  
  /**
    * Smoke free property. Smoking is not allowed inside the building, on balconies, or in outside spaces. Hotels that offer a designated area for guests to smoke are not considered smoke-free properties.
    */
  var smokeFreeProperty: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Smoke free property exception.
    */
  var smokeFreePropertyException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPolicies {
  
  inline def apply(): SchemaPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicies]
  }
  
  extension [Self <: SchemaPolicies](x: Self) {
    
    inline def setAllInclusiveAvailable(value: Boolean): Self = StObject.set(x, "allInclusiveAvailable", value.asInstanceOf[js.Any])
    
    inline def setAllInclusiveAvailableException(value: String): Self = StObject.set(x, "allInclusiveAvailableException", value.asInstanceOf[js.Any])
    
    inline def setAllInclusiveAvailableExceptionNull: Self = StObject.set(x, "allInclusiveAvailableException", null)
    
    inline def setAllInclusiveAvailableExceptionUndefined: Self = StObject.set(x, "allInclusiveAvailableException", js.undefined)
    
    inline def setAllInclusiveAvailableNull: Self = StObject.set(x, "allInclusiveAvailable", null)
    
    inline def setAllInclusiveAvailableUndefined: Self = StObject.set(x, "allInclusiveAvailable", js.undefined)
    
    inline def setAllInclusiveOnly(value: Boolean): Self = StObject.set(x, "allInclusiveOnly", value.asInstanceOf[js.Any])
    
    inline def setAllInclusiveOnlyException(value: String): Self = StObject.set(x, "allInclusiveOnlyException", value.asInstanceOf[js.Any])
    
    inline def setAllInclusiveOnlyExceptionNull: Self = StObject.set(x, "allInclusiveOnlyException", null)
    
    inline def setAllInclusiveOnlyExceptionUndefined: Self = StObject.set(x, "allInclusiveOnlyException", js.undefined)
    
    inline def setAllInclusiveOnlyNull: Self = StObject.set(x, "allInclusiveOnly", null)
    
    inline def setAllInclusiveOnlyUndefined: Self = StObject.set(x, "allInclusiveOnly", js.undefined)
    
    inline def setCheckinTime(value: SchemaTimeOfDay): Self = StObject.set(x, "checkinTime", value.asInstanceOf[js.Any])
    
    inline def setCheckinTimeException(value: String): Self = StObject.set(x, "checkinTimeException", value.asInstanceOf[js.Any])
    
    inline def setCheckinTimeExceptionNull: Self = StObject.set(x, "checkinTimeException", null)
    
    inline def setCheckinTimeExceptionUndefined: Self = StObject.set(x, "checkinTimeException", js.undefined)
    
    inline def setCheckinTimeUndefined: Self = StObject.set(x, "checkinTime", js.undefined)
    
    inline def setCheckoutTime(value: SchemaTimeOfDay): Self = StObject.set(x, "checkoutTime", value.asInstanceOf[js.Any])
    
    inline def setCheckoutTimeException(value: String): Self = StObject.set(x, "checkoutTimeException", value.asInstanceOf[js.Any])
    
    inline def setCheckoutTimeExceptionNull: Self = StObject.set(x, "checkoutTimeException", null)
    
    inline def setCheckoutTimeExceptionUndefined: Self = StObject.set(x, "checkoutTimeException", js.undefined)
    
    inline def setCheckoutTimeUndefined: Self = StObject.set(x, "checkoutTime", js.undefined)
    
    inline def setKidsStayFree(value: Boolean): Self = StObject.set(x, "kidsStayFree", value.asInstanceOf[js.Any])
    
    inline def setKidsStayFreeException(value: String): Self = StObject.set(x, "kidsStayFreeException", value.asInstanceOf[js.Any])
    
    inline def setKidsStayFreeExceptionNull: Self = StObject.set(x, "kidsStayFreeException", null)
    
    inline def setKidsStayFreeExceptionUndefined: Self = StObject.set(x, "kidsStayFreeException", js.undefined)
    
    inline def setKidsStayFreeNull: Self = StObject.set(x, "kidsStayFree", null)
    
    inline def setKidsStayFreeUndefined: Self = StObject.set(x, "kidsStayFree", js.undefined)
    
    inline def setMaxChildAge(value: Double): Self = StObject.set(x, "maxChildAge", value.asInstanceOf[js.Any])
    
    inline def setMaxChildAgeException(value: String): Self = StObject.set(x, "maxChildAgeException", value.asInstanceOf[js.Any])
    
    inline def setMaxChildAgeExceptionNull: Self = StObject.set(x, "maxChildAgeException", null)
    
    inline def setMaxChildAgeExceptionUndefined: Self = StObject.set(x, "maxChildAgeException", js.undefined)
    
    inline def setMaxChildAgeNull: Self = StObject.set(x, "maxChildAge", null)
    
    inline def setMaxChildAgeUndefined: Self = StObject.set(x, "maxChildAge", js.undefined)
    
    inline def setMaxKidsStayFreeCount(value: Double): Self = StObject.set(x, "maxKidsStayFreeCount", value.asInstanceOf[js.Any])
    
    inline def setMaxKidsStayFreeCountException(value: String): Self = StObject.set(x, "maxKidsStayFreeCountException", value.asInstanceOf[js.Any])
    
    inline def setMaxKidsStayFreeCountExceptionNull: Self = StObject.set(x, "maxKidsStayFreeCountException", null)
    
    inline def setMaxKidsStayFreeCountExceptionUndefined: Self = StObject.set(x, "maxKidsStayFreeCountException", js.undefined)
    
    inline def setMaxKidsStayFreeCountNull: Self = StObject.set(x, "maxKidsStayFreeCount", null)
    
    inline def setMaxKidsStayFreeCountUndefined: Self = StObject.set(x, "maxKidsStayFreeCount", js.undefined)
    
    inline def setPaymentOptions(value: SchemaPaymentOptions): Self = StObject.set(x, "paymentOptions", value.asInstanceOf[js.Any])
    
    inline def setPaymentOptionsUndefined: Self = StObject.set(x, "paymentOptions", js.undefined)
    
    inline def setSmokeFreeProperty(value: Boolean): Self = StObject.set(x, "smokeFreeProperty", value.asInstanceOf[js.Any])
    
    inline def setSmokeFreePropertyException(value: String): Self = StObject.set(x, "smokeFreePropertyException", value.asInstanceOf[js.Any])
    
    inline def setSmokeFreePropertyExceptionNull: Self = StObject.set(x, "smokeFreePropertyException", null)
    
    inline def setSmokeFreePropertyExceptionUndefined: Self = StObject.set(x, "smokeFreePropertyException", js.undefined)
    
    inline def setSmokeFreePropertyNull: Self = StObject.set(x, "smokeFreeProperty", null)
    
    inline def setSmokeFreePropertyUndefined: Self = StObject.set(x, "smokeFreeProperty", js.undefined)
  }
}
