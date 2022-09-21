package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParking extends StObject {
  
  /**
    * Electric car charging stations. Electric power stations, usually located outdoors, into which guests plug their electric cars to receive a charge.
    */
  var electricCarChargingStations: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Electric car charging stations exception.
    */
  var electricCarChargingStationsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free parking. The hotel allows the cars of guests to be parked for free. Parking facility may be an outdoor lot or an indoor garage, but must be onsite. Nearby parking does not apply. Parking may be performed by the guest or by hotel staff. Free parking must be available to all guests (limited conditions does not apply).
    */
  var freeParking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free parking exception.
    */
  var freeParkingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free self parking. Guests park their own cars for free. Parking facility may be an outdoor lot or an indoor garage, but must be onsite. Nearby parking does not apply.
    */
  var freeSelfParking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free self parking exception.
    */
  var freeSelfParkingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free valet parking. Hotel staff member parks the cars of guests. Parking with this service is free.
    */
  var freeValetParking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free valet parking exception.
    */
  var freeValetParkingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parking available. The hotel allows the cars of guests to be parked. Can be free or for a fee. Parking facility may be an outdoor lot or an indoor garage, but must be onsite. Nearby parking does not apply. Parking may be performed by the guest or by hotel staff.
    */
  var parkingAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Parking available exception.
    */
  var parkingAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Self parking available. Guests park their own cars. Parking facility may be an outdoor lot or an indoor garage, but must be onsite. Nearby parking does not apply. Can be free or for a fee.
    */
  var selfParkingAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Self parking available exception.
    */
  var selfParkingAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Valet parking available. Hotel staff member parks the cars of guests. Parking with this service can be free or for a fee.
    */
  var valetParkingAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Valet parking available exception.
    */
  var valetParkingAvailableException: js.UndefOr[String | Null] = js.undefined
}
object SchemaParking {
  
  inline def apply(): SchemaParking = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParking]
  }
  
  extension [Self <: SchemaParking](x: Self) {
    
    inline def setElectricCarChargingStations(value: Boolean): Self = StObject.set(x, "electricCarChargingStations", value.asInstanceOf[js.Any])
    
    inline def setElectricCarChargingStationsException(value: String): Self = StObject.set(x, "electricCarChargingStationsException", value.asInstanceOf[js.Any])
    
    inline def setElectricCarChargingStationsExceptionNull: Self = StObject.set(x, "electricCarChargingStationsException", null)
    
    inline def setElectricCarChargingStationsExceptionUndefined: Self = StObject.set(x, "electricCarChargingStationsException", js.undefined)
    
    inline def setElectricCarChargingStationsNull: Self = StObject.set(x, "electricCarChargingStations", null)
    
    inline def setElectricCarChargingStationsUndefined: Self = StObject.set(x, "electricCarChargingStations", js.undefined)
    
    inline def setFreeParking(value: Boolean): Self = StObject.set(x, "freeParking", value.asInstanceOf[js.Any])
    
    inline def setFreeParkingException(value: String): Self = StObject.set(x, "freeParkingException", value.asInstanceOf[js.Any])
    
    inline def setFreeParkingExceptionNull: Self = StObject.set(x, "freeParkingException", null)
    
    inline def setFreeParkingExceptionUndefined: Self = StObject.set(x, "freeParkingException", js.undefined)
    
    inline def setFreeParkingNull: Self = StObject.set(x, "freeParking", null)
    
    inline def setFreeParkingUndefined: Self = StObject.set(x, "freeParking", js.undefined)
    
    inline def setFreeSelfParking(value: Boolean): Self = StObject.set(x, "freeSelfParking", value.asInstanceOf[js.Any])
    
    inline def setFreeSelfParkingException(value: String): Self = StObject.set(x, "freeSelfParkingException", value.asInstanceOf[js.Any])
    
    inline def setFreeSelfParkingExceptionNull: Self = StObject.set(x, "freeSelfParkingException", null)
    
    inline def setFreeSelfParkingExceptionUndefined: Self = StObject.set(x, "freeSelfParkingException", js.undefined)
    
    inline def setFreeSelfParkingNull: Self = StObject.set(x, "freeSelfParking", null)
    
    inline def setFreeSelfParkingUndefined: Self = StObject.set(x, "freeSelfParking", js.undefined)
    
    inline def setFreeValetParking(value: Boolean): Self = StObject.set(x, "freeValetParking", value.asInstanceOf[js.Any])
    
    inline def setFreeValetParkingException(value: String): Self = StObject.set(x, "freeValetParkingException", value.asInstanceOf[js.Any])
    
    inline def setFreeValetParkingExceptionNull: Self = StObject.set(x, "freeValetParkingException", null)
    
    inline def setFreeValetParkingExceptionUndefined: Self = StObject.set(x, "freeValetParkingException", js.undefined)
    
    inline def setFreeValetParkingNull: Self = StObject.set(x, "freeValetParking", null)
    
    inline def setFreeValetParkingUndefined: Self = StObject.set(x, "freeValetParking", js.undefined)
    
    inline def setParkingAvailable(value: Boolean): Self = StObject.set(x, "parkingAvailable", value.asInstanceOf[js.Any])
    
    inline def setParkingAvailableException(value: String): Self = StObject.set(x, "parkingAvailableException", value.asInstanceOf[js.Any])
    
    inline def setParkingAvailableExceptionNull: Self = StObject.set(x, "parkingAvailableException", null)
    
    inline def setParkingAvailableExceptionUndefined: Self = StObject.set(x, "parkingAvailableException", js.undefined)
    
    inline def setParkingAvailableNull: Self = StObject.set(x, "parkingAvailable", null)
    
    inline def setParkingAvailableUndefined: Self = StObject.set(x, "parkingAvailable", js.undefined)
    
    inline def setSelfParkingAvailable(value: Boolean): Self = StObject.set(x, "selfParkingAvailable", value.asInstanceOf[js.Any])
    
    inline def setSelfParkingAvailableException(value: String): Self = StObject.set(x, "selfParkingAvailableException", value.asInstanceOf[js.Any])
    
    inline def setSelfParkingAvailableExceptionNull: Self = StObject.set(x, "selfParkingAvailableException", null)
    
    inline def setSelfParkingAvailableExceptionUndefined: Self = StObject.set(x, "selfParkingAvailableException", js.undefined)
    
    inline def setSelfParkingAvailableNull: Self = StObject.set(x, "selfParkingAvailable", null)
    
    inline def setSelfParkingAvailableUndefined: Self = StObject.set(x, "selfParkingAvailable", js.undefined)
    
    inline def setValetParkingAvailable(value: Boolean): Self = StObject.set(x, "valetParkingAvailable", value.asInstanceOf[js.Any])
    
    inline def setValetParkingAvailableException(value: String): Self = StObject.set(x, "valetParkingAvailableException", value.asInstanceOf[js.Any])
    
    inline def setValetParkingAvailableExceptionNull: Self = StObject.set(x, "valetParkingAvailableException", null)
    
    inline def setValetParkingAvailableExceptionUndefined: Self = StObject.set(x, "valetParkingAvailableException", js.undefined)
    
    inline def setValetParkingAvailableNull: Self = StObject.set(x, "valetParkingAvailable", null)
    
    inline def setValetParkingAvailableUndefined: Self = StObject.set(x, "valetParkingAvailable", js.undefined)
  }
}
