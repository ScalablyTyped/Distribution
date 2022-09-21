package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProperty extends StObject {
  
  /**
    * Built year. The year that construction of the property was completed.
    */
  var builtYear: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Built year exception.
    */
  var builtYearException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floors count. The number of stories the building has from the ground floor to the top floor that are accessible to guests.
    */
  var floorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Floors count exception.
    */
  var floorsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Last renovated year. The year when the most recent renovation of the property was completed. Renovation may include all or any combination of the following: the units, the public spaces, the exterior, or the interior.
    */
  var lastRenovatedYear: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Last renovated year exception.
    */
  var lastRenovatedYearException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Rooms count. The total number of rooms and suites bookable by guests for an overnight stay. Does not include event space, public spaces, conference rooms, fitness rooms, business centers, spa, salon, restaurants/bars, or shops.
    */
  var roomsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Rooms count exception.
    */
  var roomsCountException: js.UndefOr[String | Null] = js.undefined
}
object SchemaProperty {
  
  inline def apply(): SchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProperty]
  }
  
  extension [Self <: SchemaProperty](x: Self) {
    
    inline def setBuiltYear(value: Double): Self = StObject.set(x, "builtYear", value.asInstanceOf[js.Any])
    
    inline def setBuiltYearException(value: String): Self = StObject.set(x, "builtYearException", value.asInstanceOf[js.Any])
    
    inline def setBuiltYearExceptionNull: Self = StObject.set(x, "builtYearException", null)
    
    inline def setBuiltYearExceptionUndefined: Self = StObject.set(x, "builtYearException", js.undefined)
    
    inline def setBuiltYearNull: Self = StObject.set(x, "builtYear", null)
    
    inline def setBuiltYearUndefined: Self = StObject.set(x, "builtYear", js.undefined)
    
    inline def setFloorsCount(value: Double): Self = StObject.set(x, "floorsCount", value.asInstanceOf[js.Any])
    
    inline def setFloorsCountException(value: String): Self = StObject.set(x, "floorsCountException", value.asInstanceOf[js.Any])
    
    inline def setFloorsCountExceptionNull: Self = StObject.set(x, "floorsCountException", null)
    
    inline def setFloorsCountExceptionUndefined: Self = StObject.set(x, "floorsCountException", js.undefined)
    
    inline def setFloorsCountNull: Self = StObject.set(x, "floorsCount", null)
    
    inline def setFloorsCountUndefined: Self = StObject.set(x, "floorsCount", js.undefined)
    
    inline def setLastRenovatedYear(value: Double): Self = StObject.set(x, "lastRenovatedYear", value.asInstanceOf[js.Any])
    
    inline def setLastRenovatedYearException(value: String): Self = StObject.set(x, "lastRenovatedYearException", value.asInstanceOf[js.Any])
    
    inline def setLastRenovatedYearExceptionNull: Self = StObject.set(x, "lastRenovatedYearException", null)
    
    inline def setLastRenovatedYearExceptionUndefined: Self = StObject.set(x, "lastRenovatedYearException", js.undefined)
    
    inline def setLastRenovatedYearNull: Self = StObject.set(x, "lastRenovatedYear", null)
    
    inline def setLastRenovatedYearUndefined: Self = StObject.set(x, "lastRenovatedYear", js.undefined)
    
    inline def setRoomsCount(value: Double): Self = StObject.set(x, "roomsCount", value.asInstanceOf[js.Any])
    
    inline def setRoomsCountException(value: String): Self = StObject.set(x, "roomsCountException", value.asInstanceOf[js.Any])
    
    inline def setRoomsCountExceptionNull: Self = StObject.set(x, "roomsCountException", null)
    
    inline def setRoomsCountExceptionUndefined: Self = StObject.set(x, "roomsCountException", js.undefined)
    
    inline def setRoomsCountNull: Self = StObject.set(x, "roomsCount", null)
    
    inline def setRoomsCountUndefined: Self = StObject.set(x, "roomsCount", js.undefined)
  }
}
