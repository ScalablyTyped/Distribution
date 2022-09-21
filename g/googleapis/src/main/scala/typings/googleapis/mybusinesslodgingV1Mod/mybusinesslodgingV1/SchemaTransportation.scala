package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransportation extends StObject {
  
  /**
    * Airport shuttle. The hotel provides guests with a chauffeured van or bus to and from the airport. Can be free or for a fee. Guests may share the vehicle with other guests unknown to them. Applies if the hotel has a third-party shuttle service (office/desk etc.) within the hotel. As long as hotel provides this service, it doesn't matter if it's directly with them or a third party they work with. Does not apply if guest has to coordinate with an entity outside/other than the hotel.
    */
  var airportShuttle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Airport shuttle exception.
    */
  var airportShuttleException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Car rental on property. A branch of a rental car company with a processing desk in the hotel. Available cars for rent may be awaiting at the hotel or in a nearby lot.
    */
  var carRentalOnProperty: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Car rental on property exception.
    */
  var carRentalOnPropertyException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free airport shuttle. Airport shuttle is free to guests. Must be free to all guests without any conditions.
    */
  var freeAirportShuttle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free airport shuttle exception.
    */
  var freeAirportShuttleException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free private car service. Private chauffeured car service is free to guests.
    */
  var freePrivateCarService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free private car service exception.
    */
  var freePrivateCarServiceException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Local shuttle. A car, van or bus provided by the hotel to transport guests to destinations within a specified range of distance around the hotel. Usually shopping and/or convention centers, downtown districts, or beaches. Can be free or for a fee.
    */
  var localShuttle: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Local shuttle exception.
    */
  var localShuttleException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private car service. Hotel provides a private chauffeured car to transport guests to destinations. Passengers in the car are either alone or are known to one another and have requested the car together. Service can be free or for a fee and travel distance is usually limited to a specific range. Not a taxi.
    */
  var privateCarService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Private car service exception.
    */
  var privateCarServiceException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Transfer. Hotel provides a shuttle service or car service to take guests to and from the nearest airport or train station. Can be free or for a fee. Guests may share the vehicle with other guests unknown to them.
    */
  var transfer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Transfer exception.
    */
  var transferException: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransportation {
  
  inline def apply(): SchemaTransportation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransportation]
  }
  
  extension [Self <: SchemaTransportation](x: Self) {
    
    inline def setAirportShuttle(value: Boolean): Self = StObject.set(x, "airportShuttle", value.asInstanceOf[js.Any])
    
    inline def setAirportShuttleException(value: String): Self = StObject.set(x, "airportShuttleException", value.asInstanceOf[js.Any])
    
    inline def setAirportShuttleExceptionNull: Self = StObject.set(x, "airportShuttleException", null)
    
    inline def setAirportShuttleExceptionUndefined: Self = StObject.set(x, "airportShuttleException", js.undefined)
    
    inline def setAirportShuttleNull: Self = StObject.set(x, "airportShuttle", null)
    
    inline def setAirportShuttleUndefined: Self = StObject.set(x, "airportShuttle", js.undefined)
    
    inline def setCarRentalOnProperty(value: Boolean): Self = StObject.set(x, "carRentalOnProperty", value.asInstanceOf[js.Any])
    
    inline def setCarRentalOnPropertyException(value: String): Self = StObject.set(x, "carRentalOnPropertyException", value.asInstanceOf[js.Any])
    
    inline def setCarRentalOnPropertyExceptionNull: Self = StObject.set(x, "carRentalOnPropertyException", null)
    
    inline def setCarRentalOnPropertyExceptionUndefined: Self = StObject.set(x, "carRentalOnPropertyException", js.undefined)
    
    inline def setCarRentalOnPropertyNull: Self = StObject.set(x, "carRentalOnProperty", null)
    
    inline def setCarRentalOnPropertyUndefined: Self = StObject.set(x, "carRentalOnProperty", js.undefined)
    
    inline def setFreeAirportShuttle(value: Boolean): Self = StObject.set(x, "freeAirportShuttle", value.asInstanceOf[js.Any])
    
    inline def setFreeAirportShuttleException(value: String): Self = StObject.set(x, "freeAirportShuttleException", value.asInstanceOf[js.Any])
    
    inline def setFreeAirportShuttleExceptionNull: Self = StObject.set(x, "freeAirportShuttleException", null)
    
    inline def setFreeAirportShuttleExceptionUndefined: Self = StObject.set(x, "freeAirportShuttleException", js.undefined)
    
    inline def setFreeAirportShuttleNull: Self = StObject.set(x, "freeAirportShuttle", null)
    
    inline def setFreeAirportShuttleUndefined: Self = StObject.set(x, "freeAirportShuttle", js.undefined)
    
    inline def setFreePrivateCarService(value: Boolean): Self = StObject.set(x, "freePrivateCarService", value.asInstanceOf[js.Any])
    
    inline def setFreePrivateCarServiceException(value: String): Self = StObject.set(x, "freePrivateCarServiceException", value.asInstanceOf[js.Any])
    
    inline def setFreePrivateCarServiceExceptionNull: Self = StObject.set(x, "freePrivateCarServiceException", null)
    
    inline def setFreePrivateCarServiceExceptionUndefined: Self = StObject.set(x, "freePrivateCarServiceException", js.undefined)
    
    inline def setFreePrivateCarServiceNull: Self = StObject.set(x, "freePrivateCarService", null)
    
    inline def setFreePrivateCarServiceUndefined: Self = StObject.set(x, "freePrivateCarService", js.undefined)
    
    inline def setLocalShuttle(value: Boolean): Self = StObject.set(x, "localShuttle", value.asInstanceOf[js.Any])
    
    inline def setLocalShuttleException(value: String): Self = StObject.set(x, "localShuttleException", value.asInstanceOf[js.Any])
    
    inline def setLocalShuttleExceptionNull: Self = StObject.set(x, "localShuttleException", null)
    
    inline def setLocalShuttleExceptionUndefined: Self = StObject.set(x, "localShuttleException", js.undefined)
    
    inline def setLocalShuttleNull: Self = StObject.set(x, "localShuttle", null)
    
    inline def setLocalShuttleUndefined: Self = StObject.set(x, "localShuttle", js.undefined)
    
    inline def setPrivateCarService(value: Boolean): Self = StObject.set(x, "privateCarService", value.asInstanceOf[js.Any])
    
    inline def setPrivateCarServiceException(value: String): Self = StObject.set(x, "privateCarServiceException", value.asInstanceOf[js.Any])
    
    inline def setPrivateCarServiceExceptionNull: Self = StObject.set(x, "privateCarServiceException", null)
    
    inline def setPrivateCarServiceExceptionUndefined: Self = StObject.set(x, "privateCarServiceException", js.undefined)
    
    inline def setPrivateCarServiceNull: Self = StObject.set(x, "privateCarService", null)
    
    inline def setPrivateCarServiceUndefined: Self = StObject.set(x, "privateCarService", js.undefined)
    
    inline def setTransfer(value: Boolean): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferException(value: String): Self = StObject.set(x, "transferException", value.asInstanceOf[js.Any])
    
    inline def setTransferExceptionNull: Self = StObject.set(x, "transferException", null)
    
    inline def setTransferExceptionUndefined: Self = StObject.set(x, "transferException", js.undefined)
    
    inline def setTransferNull: Self = StObject.set(x, "transfer", null)
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
  }
}
