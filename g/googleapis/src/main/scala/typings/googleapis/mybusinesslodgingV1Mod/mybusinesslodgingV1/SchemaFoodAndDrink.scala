package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFoodAndDrink extends StObject {
  
  /**
    * Bar. A designated room, lounge or area of an on-site restaurant with seating at a counter behind which a hotel staffer takes the guest's order and provides the requested alcoholic drink. Can be indoors or outdoors. Also known as Pub.
    */
  var bar: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Bar exception.
    */
  var barException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Breakfast available. The morning meal is offered to all guests. Can be free or for a fee.
    */
  var breakfastAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Breakfast available exception.
    */
  var breakfastAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Breakfast buffet. Breakfast meal service where guests serve themselves from a variety of dishes/foods that are put out on a table.
    */
  var breakfastBuffet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Breakfast buffet exception.
    */
  var breakfastBuffetException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Buffet. A type of meal where guests serve themselves from a variety of dishes/foods that are put out on a table. Includes lunch and/or dinner meals. A breakfast-only buffet is not sufficient.
    */
  var buffet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Buffet exception.
    */
  var buffetException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dinner buffet. Dinner meal service where guests serve themselves from a variety of dishes/foods that are put out on a table.
    */
  var dinnerBuffet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Dinner buffet exception.
    */
  var dinnerBuffetException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free breakfast. Breakfast is offered for free to all guests. Does not apply if limited to certain room packages.
    */
  var freeBreakfast: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Free breakfast exception.
    */
  var freeBreakfastException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Restaurant. A business onsite at the hotel that is open to the public as well as guests, and offers meals and beverages to consume at tables or counters. May or may not include table service. Also known as cafe, buffet, eatery. A "breakfast room" where the hotel serves breakfast only to guests (not the general public) does not count as a restaurant.
    */
  var restaurant: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Restaurant exception.
    */
  var restaurantException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Restaurants count. The number of restaurants at the hotel.
    */
  var restaurantsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Restaurants count exception.
    */
  var restaurantsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Room service. A hotel staffer delivers meals prepared onsite to a guest's room as per their request. May or may not be available during specific hours. Services should be available to all guests (not based on rate/room booked/reward program, etc).
    */
  var roomService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Room service exception.
    */
  var roomServiceException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Table service. A restaurant in which a staff member is assigned to a guest's table to take their order, deliver and clear away food, and deliver the bill, if applicable. Also known as sit-down restaurant.
    */
  var tableService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Table service exception.
    */
  var tableServiceException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * 24hr room service. Room service is available 24 hours a day.
    */
  var twentyFourHourRoomService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * 24hr room service exception.
    */
  var twentyFourHourRoomServiceException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Vending machine. A glass-fronted mechanized cabinet displaying and dispensing snacks and beverages for purchase by coins, paper money and/or credit cards.
    */
  var vendingMachine: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Vending machine exception.
    */
  var vendingMachineException: js.UndefOr[String | Null] = js.undefined
}
object SchemaFoodAndDrink {
  
  inline def apply(): SchemaFoodAndDrink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFoodAndDrink]
  }
  
  extension [Self <: SchemaFoodAndDrink](x: Self) {
    
    inline def setBar(value: Boolean): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarException(value: String): Self = StObject.set(x, "barException", value.asInstanceOf[js.Any])
    
    inline def setBarExceptionNull: Self = StObject.set(x, "barException", null)
    
    inline def setBarExceptionUndefined: Self = StObject.set(x, "barException", js.undefined)
    
    inline def setBarNull: Self = StObject.set(x, "bar", null)
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    inline def setBreakfastAvailable(value: Boolean): Self = StObject.set(x, "breakfastAvailable", value.asInstanceOf[js.Any])
    
    inline def setBreakfastAvailableException(value: String): Self = StObject.set(x, "breakfastAvailableException", value.asInstanceOf[js.Any])
    
    inline def setBreakfastAvailableExceptionNull: Self = StObject.set(x, "breakfastAvailableException", null)
    
    inline def setBreakfastAvailableExceptionUndefined: Self = StObject.set(x, "breakfastAvailableException", js.undefined)
    
    inline def setBreakfastAvailableNull: Self = StObject.set(x, "breakfastAvailable", null)
    
    inline def setBreakfastAvailableUndefined: Self = StObject.set(x, "breakfastAvailable", js.undefined)
    
    inline def setBreakfastBuffet(value: Boolean): Self = StObject.set(x, "breakfastBuffet", value.asInstanceOf[js.Any])
    
    inline def setBreakfastBuffetException(value: String): Self = StObject.set(x, "breakfastBuffetException", value.asInstanceOf[js.Any])
    
    inline def setBreakfastBuffetExceptionNull: Self = StObject.set(x, "breakfastBuffetException", null)
    
    inline def setBreakfastBuffetExceptionUndefined: Self = StObject.set(x, "breakfastBuffetException", js.undefined)
    
    inline def setBreakfastBuffetNull: Self = StObject.set(x, "breakfastBuffet", null)
    
    inline def setBreakfastBuffetUndefined: Self = StObject.set(x, "breakfastBuffet", js.undefined)
    
    inline def setBuffet(value: Boolean): Self = StObject.set(x, "buffet", value.asInstanceOf[js.Any])
    
    inline def setBuffetException(value: String): Self = StObject.set(x, "buffetException", value.asInstanceOf[js.Any])
    
    inline def setBuffetExceptionNull: Self = StObject.set(x, "buffetException", null)
    
    inline def setBuffetExceptionUndefined: Self = StObject.set(x, "buffetException", js.undefined)
    
    inline def setBuffetNull: Self = StObject.set(x, "buffet", null)
    
    inline def setBuffetUndefined: Self = StObject.set(x, "buffet", js.undefined)
    
    inline def setDinnerBuffet(value: Boolean): Self = StObject.set(x, "dinnerBuffet", value.asInstanceOf[js.Any])
    
    inline def setDinnerBuffetException(value: String): Self = StObject.set(x, "dinnerBuffetException", value.asInstanceOf[js.Any])
    
    inline def setDinnerBuffetExceptionNull: Self = StObject.set(x, "dinnerBuffetException", null)
    
    inline def setDinnerBuffetExceptionUndefined: Self = StObject.set(x, "dinnerBuffetException", js.undefined)
    
    inline def setDinnerBuffetNull: Self = StObject.set(x, "dinnerBuffet", null)
    
    inline def setDinnerBuffetUndefined: Self = StObject.set(x, "dinnerBuffet", js.undefined)
    
    inline def setFreeBreakfast(value: Boolean): Self = StObject.set(x, "freeBreakfast", value.asInstanceOf[js.Any])
    
    inline def setFreeBreakfastException(value: String): Self = StObject.set(x, "freeBreakfastException", value.asInstanceOf[js.Any])
    
    inline def setFreeBreakfastExceptionNull: Self = StObject.set(x, "freeBreakfastException", null)
    
    inline def setFreeBreakfastExceptionUndefined: Self = StObject.set(x, "freeBreakfastException", js.undefined)
    
    inline def setFreeBreakfastNull: Self = StObject.set(x, "freeBreakfast", null)
    
    inline def setFreeBreakfastUndefined: Self = StObject.set(x, "freeBreakfast", js.undefined)
    
    inline def setRestaurant(value: Boolean): Self = StObject.set(x, "restaurant", value.asInstanceOf[js.Any])
    
    inline def setRestaurantException(value: String): Self = StObject.set(x, "restaurantException", value.asInstanceOf[js.Any])
    
    inline def setRestaurantExceptionNull: Self = StObject.set(x, "restaurantException", null)
    
    inline def setRestaurantExceptionUndefined: Self = StObject.set(x, "restaurantException", js.undefined)
    
    inline def setRestaurantNull: Self = StObject.set(x, "restaurant", null)
    
    inline def setRestaurantUndefined: Self = StObject.set(x, "restaurant", js.undefined)
    
    inline def setRestaurantsCount(value: Double): Self = StObject.set(x, "restaurantsCount", value.asInstanceOf[js.Any])
    
    inline def setRestaurantsCountException(value: String): Self = StObject.set(x, "restaurantsCountException", value.asInstanceOf[js.Any])
    
    inline def setRestaurantsCountExceptionNull: Self = StObject.set(x, "restaurantsCountException", null)
    
    inline def setRestaurantsCountExceptionUndefined: Self = StObject.set(x, "restaurantsCountException", js.undefined)
    
    inline def setRestaurantsCountNull: Self = StObject.set(x, "restaurantsCount", null)
    
    inline def setRestaurantsCountUndefined: Self = StObject.set(x, "restaurantsCount", js.undefined)
    
    inline def setRoomService(value: Boolean): Self = StObject.set(x, "roomService", value.asInstanceOf[js.Any])
    
    inline def setRoomServiceException(value: String): Self = StObject.set(x, "roomServiceException", value.asInstanceOf[js.Any])
    
    inline def setRoomServiceExceptionNull: Self = StObject.set(x, "roomServiceException", null)
    
    inline def setRoomServiceExceptionUndefined: Self = StObject.set(x, "roomServiceException", js.undefined)
    
    inline def setRoomServiceNull: Self = StObject.set(x, "roomService", null)
    
    inline def setRoomServiceUndefined: Self = StObject.set(x, "roomService", js.undefined)
    
    inline def setTableService(value: Boolean): Self = StObject.set(x, "tableService", value.asInstanceOf[js.Any])
    
    inline def setTableServiceException(value: String): Self = StObject.set(x, "tableServiceException", value.asInstanceOf[js.Any])
    
    inline def setTableServiceExceptionNull: Self = StObject.set(x, "tableServiceException", null)
    
    inline def setTableServiceExceptionUndefined: Self = StObject.set(x, "tableServiceException", js.undefined)
    
    inline def setTableServiceNull: Self = StObject.set(x, "tableService", null)
    
    inline def setTableServiceUndefined: Self = StObject.set(x, "tableService", js.undefined)
    
    inline def setTwentyFourHourRoomService(value: Boolean): Self = StObject.set(x, "twentyFourHourRoomService", value.asInstanceOf[js.Any])
    
    inline def setTwentyFourHourRoomServiceException(value: String): Self = StObject.set(x, "twentyFourHourRoomServiceException", value.asInstanceOf[js.Any])
    
    inline def setTwentyFourHourRoomServiceExceptionNull: Self = StObject.set(x, "twentyFourHourRoomServiceException", null)
    
    inline def setTwentyFourHourRoomServiceExceptionUndefined: Self = StObject.set(x, "twentyFourHourRoomServiceException", js.undefined)
    
    inline def setTwentyFourHourRoomServiceNull: Self = StObject.set(x, "twentyFourHourRoomService", null)
    
    inline def setTwentyFourHourRoomServiceUndefined: Self = StObject.set(x, "twentyFourHourRoomService", js.undefined)
    
    inline def setVendingMachine(value: Boolean): Self = StObject.set(x, "vendingMachine", value.asInstanceOf[js.Any])
    
    inline def setVendingMachineException(value: String): Self = StObject.set(x, "vendingMachineException", value.asInstanceOf[js.Any])
    
    inline def setVendingMachineExceptionNull: Self = StObject.set(x, "vendingMachineException", null)
    
    inline def setVendingMachineExceptionUndefined: Self = StObject.set(x, "vendingMachineException", js.undefined)
    
    inline def setVendingMachineNull: Self = StObject.set(x, "vendingMachine", null)
    
    inline def setVendingMachineUndefined: Self = StObject.set(x, "vendingMachine", js.undefined)
  }
}
