package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServices extends StObject {
  
  /**
    * Baggage storage. A provision for guests to leave their bags at the hotel when they arrive for their stay before the official check-in time. May or may not apply for guests who wish to leave their bags after check-out and before departing the locale. Also known as bag dropoff.
    */
  var baggageStorage: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Baggage storage exception.
    */
  var baggageStorageException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Concierge. Hotel staff member(s) responsible for facilitating an easy, comfortable stay through making reservations for meals, sourcing theater tickets, arranging tours, finding a doctor, making recommendations, and answering questions.
    */
  var concierge: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Concierge exception.
    */
  var conciergeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Convenience store. A shop at the hotel primarily selling snacks, drinks, non-prescription medicines, health and beauty aids, magazines and newspapers.
    */
  var convenienceStore: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Convenience store exception.
    */
  var convenienceStoreException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Currency exchange. A staff member or automated machine tasked with the transaction of providing the native currency of the hotel's locale in exchange for the foreign currency provided by a guest.
    */
  var currencyExchange: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Currency exchange exception.
    */
  var currencyExchangeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Elevator. A passenger elevator that transports guests from one story to another. Also known as lift.
    */
  var elevator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Elevator exception.
    */
  var elevatorException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Front desk. A counter or desk in the lobby or the immediate interior of the hotel where a member of the staff greets guests and processes the information related to their stay (including check-in and check-out). May or may not be manned and open 24/7.
    */
  var frontDesk: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Front desk exception.
    */
  var frontDeskException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Full service laundry. Laundry and dry cleaning facilitated and handled by the hotel on behalf of the guest. Does not include the provision for guests to do their own laundry in on-site machines.
    */
  var fullServiceLaundry: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Full service laundry exception.
    */
  var fullServiceLaundryException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Gift shop. An on-site store primarily selling souvenirs, mementos and other gift items. May or may not also sell sundries, magazines and newspapers, clothing, or snacks.
    */
  var giftShop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Gift shop exception.
    */
  var giftShopException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Languages spoken by at least one staff member.
    */
  var languagesSpoken: js.UndefOr[js.Array[SchemaLanguageSpoken]] = js.undefined
  
  /**
    * Self service laundry. On-site clothes washers and dryers accessible to guests for the purpose of washing and drying their own clothes. May or may not require payment to use the machines.
    */
  var selfServiceLaundry: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Self service laundry exception.
    */
  var selfServiceLaundryException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Social hour. A reception with complimentary soft drinks, tea, coffee, wine and/or cocktails in the afternoon or evening. Can be hosted by hotel staff or guests may serve themselves. Also known as wine hour. The availability of coffee/tea in the lobby throughout the day does not constitute a social or wine hour.
    */
  var socialHour: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Social hour exception.
    */
  var socialHourException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 24hr front desk. Front desk is staffed 24 hours a day.
    */
  var twentyFourHourFrontDesk: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * 24hr front desk exception.
    */
  var twentyFourHourFrontDeskException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Wake up calls. By direction of the guest, a hotel staff member will phone the guest unit at the requested hour. Also known as morning call.
    */
  var wakeUpCalls: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Wake up calls exception.
    */
  var wakeUpCallsException: js.UndefOr[String | Null] = js.undefined
}
object SchemaServices {
  
  inline def apply(): SchemaServices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServices]
  }
  
  extension [Self <: SchemaServices](x: Self) {
    
    inline def setBaggageStorage(value: Boolean): Self = StObject.set(x, "baggageStorage", value.asInstanceOf[js.Any])
    
    inline def setBaggageStorageException(value: String): Self = StObject.set(x, "baggageStorageException", value.asInstanceOf[js.Any])
    
    inline def setBaggageStorageExceptionNull: Self = StObject.set(x, "baggageStorageException", null)
    
    inline def setBaggageStorageExceptionUndefined: Self = StObject.set(x, "baggageStorageException", js.undefined)
    
    inline def setBaggageStorageNull: Self = StObject.set(x, "baggageStorage", null)
    
    inline def setBaggageStorageUndefined: Self = StObject.set(x, "baggageStorage", js.undefined)
    
    inline def setConcierge(value: Boolean): Self = StObject.set(x, "concierge", value.asInstanceOf[js.Any])
    
    inline def setConciergeException(value: String): Self = StObject.set(x, "conciergeException", value.asInstanceOf[js.Any])
    
    inline def setConciergeExceptionNull: Self = StObject.set(x, "conciergeException", null)
    
    inline def setConciergeExceptionUndefined: Self = StObject.set(x, "conciergeException", js.undefined)
    
    inline def setConciergeNull: Self = StObject.set(x, "concierge", null)
    
    inline def setConciergeUndefined: Self = StObject.set(x, "concierge", js.undefined)
    
    inline def setConvenienceStore(value: Boolean): Self = StObject.set(x, "convenienceStore", value.asInstanceOf[js.Any])
    
    inline def setConvenienceStoreException(value: String): Self = StObject.set(x, "convenienceStoreException", value.asInstanceOf[js.Any])
    
    inline def setConvenienceStoreExceptionNull: Self = StObject.set(x, "convenienceStoreException", null)
    
    inline def setConvenienceStoreExceptionUndefined: Self = StObject.set(x, "convenienceStoreException", js.undefined)
    
    inline def setConvenienceStoreNull: Self = StObject.set(x, "convenienceStore", null)
    
    inline def setConvenienceStoreUndefined: Self = StObject.set(x, "convenienceStore", js.undefined)
    
    inline def setCurrencyExchange(value: Boolean): Self = StObject.set(x, "currencyExchange", value.asInstanceOf[js.Any])
    
    inline def setCurrencyExchangeException(value: String): Self = StObject.set(x, "currencyExchangeException", value.asInstanceOf[js.Any])
    
    inline def setCurrencyExchangeExceptionNull: Self = StObject.set(x, "currencyExchangeException", null)
    
    inline def setCurrencyExchangeExceptionUndefined: Self = StObject.set(x, "currencyExchangeException", js.undefined)
    
    inline def setCurrencyExchangeNull: Self = StObject.set(x, "currencyExchange", null)
    
    inline def setCurrencyExchangeUndefined: Self = StObject.set(x, "currencyExchange", js.undefined)
    
    inline def setElevator(value: Boolean): Self = StObject.set(x, "elevator", value.asInstanceOf[js.Any])
    
    inline def setElevatorException(value: String): Self = StObject.set(x, "elevatorException", value.asInstanceOf[js.Any])
    
    inline def setElevatorExceptionNull: Self = StObject.set(x, "elevatorException", null)
    
    inline def setElevatorExceptionUndefined: Self = StObject.set(x, "elevatorException", js.undefined)
    
    inline def setElevatorNull: Self = StObject.set(x, "elevator", null)
    
    inline def setElevatorUndefined: Self = StObject.set(x, "elevator", js.undefined)
    
    inline def setFrontDesk(value: Boolean): Self = StObject.set(x, "frontDesk", value.asInstanceOf[js.Any])
    
    inline def setFrontDeskException(value: String): Self = StObject.set(x, "frontDeskException", value.asInstanceOf[js.Any])
    
    inline def setFrontDeskExceptionNull: Self = StObject.set(x, "frontDeskException", null)
    
    inline def setFrontDeskExceptionUndefined: Self = StObject.set(x, "frontDeskException", js.undefined)
    
    inline def setFrontDeskNull: Self = StObject.set(x, "frontDesk", null)
    
    inline def setFrontDeskUndefined: Self = StObject.set(x, "frontDesk", js.undefined)
    
    inline def setFullServiceLaundry(value: Boolean): Self = StObject.set(x, "fullServiceLaundry", value.asInstanceOf[js.Any])
    
    inline def setFullServiceLaundryException(value: String): Self = StObject.set(x, "fullServiceLaundryException", value.asInstanceOf[js.Any])
    
    inline def setFullServiceLaundryExceptionNull: Self = StObject.set(x, "fullServiceLaundryException", null)
    
    inline def setFullServiceLaundryExceptionUndefined: Self = StObject.set(x, "fullServiceLaundryException", js.undefined)
    
    inline def setFullServiceLaundryNull: Self = StObject.set(x, "fullServiceLaundry", null)
    
    inline def setFullServiceLaundryUndefined: Self = StObject.set(x, "fullServiceLaundry", js.undefined)
    
    inline def setGiftShop(value: Boolean): Self = StObject.set(x, "giftShop", value.asInstanceOf[js.Any])
    
    inline def setGiftShopException(value: String): Self = StObject.set(x, "giftShopException", value.asInstanceOf[js.Any])
    
    inline def setGiftShopExceptionNull: Self = StObject.set(x, "giftShopException", null)
    
    inline def setGiftShopExceptionUndefined: Self = StObject.set(x, "giftShopException", js.undefined)
    
    inline def setGiftShopNull: Self = StObject.set(x, "giftShop", null)
    
    inline def setGiftShopUndefined: Self = StObject.set(x, "giftShop", js.undefined)
    
    inline def setLanguagesSpoken(value: js.Array[SchemaLanguageSpoken]): Self = StObject.set(x, "languagesSpoken", value.asInstanceOf[js.Any])
    
    inline def setLanguagesSpokenUndefined: Self = StObject.set(x, "languagesSpoken", js.undefined)
    
    inline def setLanguagesSpokenVarargs(value: SchemaLanguageSpoken*): Self = StObject.set(x, "languagesSpoken", js.Array(value*))
    
    inline def setSelfServiceLaundry(value: Boolean): Self = StObject.set(x, "selfServiceLaundry", value.asInstanceOf[js.Any])
    
    inline def setSelfServiceLaundryException(value: String): Self = StObject.set(x, "selfServiceLaundryException", value.asInstanceOf[js.Any])
    
    inline def setSelfServiceLaundryExceptionNull: Self = StObject.set(x, "selfServiceLaundryException", null)
    
    inline def setSelfServiceLaundryExceptionUndefined: Self = StObject.set(x, "selfServiceLaundryException", js.undefined)
    
    inline def setSelfServiceLaundryNull: Self = StObject.set(x, "selfServiceLaundry", null)
    
    inline def setSelfServiceLaundryUndefined: Self = StObject.set(x, "selfServiceLaundry", js.undefined)
    
    inline def setSocialHour(value: Boolean): Self = StObject.set(x, "socialHour", value.asInstanceOf[js.Any])
    
    inline def setSocialHourException(value: String): Self = StObject.set(x, "socialHourException", value.asInstanceOf[js.Any])
    
    inline def setSocialHourExceptionNull: Self = StObject.set(x, "socialHourException", null)
    
    inline def setSocialHourExceptionUndefined: Self = StObject.set(x, "socialHourException", js.undefined)
    
    inline def setSocialHourNull: Self = StObject.set(x, "socialHour", null)
    
    inline def setSocialHourUndefined: Self = StObject.set(x, "socialHour", js.undefined)
    
    inline def setTwentyFourHourFrontDesk(value: Boolean): Self = StObject.set(x, "twentyFourHourFrontDesk", value.asInstanceOf[js.Any])
    
    inline def setTwentyFourHourFrontDeskException(value: String): Self = StObject.set(x, "twentyFourHourFrontDeskException", value.asInstanceOf[js.Any])
    
    inline def setTwentyFourHourFrontDeskExceptionNull: Self = StObject.set(x, "twentyFourHourFrontDeskException", null)
    
    inline def setTwentyFourHourFrontDeskExceptionUndefined: Self = StObject.set(x, "twentyFourHourFrontDeskException", js.undefined)
    
    inline def setTwentyFourHourFrontDeskNull: Self = StObject.set(x, "twentyFourHourFrontDesk", null)
    
    inline def setTwentyFourHourFrontDeskUndefined: Self = StObject.set(x, "twentyFourHourFrontDesk", js.undefined)
    
    inline def setWakeUpCalls(value: Boolean): Self = StObject.set(x, "wakeUpCalls", value.asInstanceOf[js.Any])
    
    inline def setWakeUpCallsException(value: String): Self = StObject.set(x, "wakeUpCallsException", value.asInstanceOf[js.Any])
    
    inline def setWakeUpCallsExceptionNull: Self = StObject.set(x, "wakeUpCallsException", null)
    
    inline def setWakeUpCallsExceptionUndefined: Self = StObject.set(x, "wakeUpCallsException", js.undefined)
    
    inline def setWakeUpCallsNull: Self = StObject.set(x, "wakeUpCalls", null)
    
    inline def setWakeUpCallsUndefined: Self = StObject.set(x, "wakeUpCalls", js.undefined)
  }
}
