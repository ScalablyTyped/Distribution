package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccessibility extends StObject {
  
  /**
    * Mobility accessible. Throughout the property there are physical adaptations to ease the stay of a person in a wheelchair, such as auto-opening doors, wide elevators, wide bathrooms or ramps.
    */
  var mobilityAccessible: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobility accessible elevator. A lift that transports people from one level to another and is built to accommodate a wheelchair-using passenger owing to the width of its doors and placement of call buttons.
    */
  var mobilityAccessibleElevator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobility accessible elevator exception.
    */
  var mobilityAccessibleElevatorException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobility accessible exception.
    */
  var mobilityAccessibleException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobility accessible parking. The presence of a marked, designated area of prescribed size in which only registered, labeled vehicles transporting a person with physical challenges may park.
    */
  var mobilityAccessibleParking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobility accessible parking exception.
    */
  var mobilityAccessibleParkingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobility accessible pool. A swimming pool equipped with a mechanical chair that can be lowered and raised for the purpose of moving physically challenged guests into and out of the pool. May be powered by electricity or water. Also known as pool lift.
    */
  var mobilityAccessiblePool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobility accessible pool exception.
    */
  var mobilityAccessiblePoolException: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccessibility {
  
  inline def apply(): SchemaAccessibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccessibility]
  }
  
  extension [Self <: SchemaAccessibility](x: Self) {
    
    inline def setMobilityAccessible(value: Boolean): Self = StObject.set(x, "mobilityAccessible", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleElevator(value: Boolean): Self = StObject.set(x, "mobilityAccessibleElevator", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleElevatorException(value: String): Self = StObject.set(x, "mobilityAccessibleElevatorException", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleElevatorExceptionNull: Self = StObject.set(x, "mobilityAccessibleElevatorException", null)
    
    inline def setMobilityAccessibleElevatorExceptionUndefined: Self = StObject.set(x, "mobilityAccessibleElevatorException", js.undefined)
    
    inline def setMobilityAccessibleElevatorNull: Self = StObject.set(x, "mobilityAccessibleElevator", null)
    
    inline def setMobilityAccessibleElevatorUndefined: Self = StObject.set(x, "mobilityAccessibleElevator", js.undefined)
    
    inline def setMobilityAccessibleException(value: String): Self = StObject.set(x, "mobilityAccessibleException", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleExceptionNull: Self = StObject.set(x, "mobilityAccessibleException", null)
    
    inline def setMobilityAccessibleExceptionUndefined: Self = StObject.set(x, "mobilityAccessibleException", js.undefined)
    
    inline def setMobilityAccessibleNull: Self = StObject.set(x, "mobilityAccessible", null)
    
    inline def setMobilityAccessibleParking(value: Boolean): Self = StObject.set(x, "mobilityAccessibleParking", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleParkingException(value: String): Self = StObject.set(x, "mobilityAccessibleParkingException", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessibleParkingExceptionNull: Self = StObject.set(x, "mobilityAccessibleParkingException", null)
    
    inline def setMobilityAccessibleParkingExceptionUndefined: Self = StObject.set(x, "mobilityAccessibleParkingException", js.undefined)
    
    inline def setMobilityAccessibleParkingNull: Self = StObject.set(x, "mobilityAccessibleParking", null)
    
    inline def setMobilityAccessibleParkingUndefined: Self = StObject.set(x, "mobilityAccessibleParking", js.undefined)
    
    inline def setMobilityAccessiblePool(value: Boolean): Self = StObject.set(x, "mobilityAccessiblePool", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessiblePoolException(value: String): Self = StObject.set(x, "mobilityAccessiblePoolException", value.asInstanceOf[js.Any])
    
    inline def setMobilityAccessiblePoolExceptionNull: Self = StObject.set(x, "mobilityAccessiblePoolException", null)
    
    inline def setMobilityAccessiblePoolExceptionUndefined: Self = StObject.set(x, "mobilityAccessiblePoolException", js.undefined)
    
    inline def setMobilityAccessiblePoolNull: Self = StObject.set(x, "mobilityAccessiblePool", null)
    
    inline def setMobilityAccessiblePoolUndefined: Self = StObject.set(x, "mobilityAccessiblePool", js.undefined)
    
    inline def setMobilityAccessibleUndefined: Self = StObject.set(x, "mobilityAccessible", js.undefined)
  }
}
