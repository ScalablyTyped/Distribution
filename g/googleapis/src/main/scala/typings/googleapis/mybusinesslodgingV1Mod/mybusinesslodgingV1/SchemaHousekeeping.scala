package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHousekeeping extends StObject {
  
  /**
    * Daily housekeeping. Guest units are cleaned by hotel staff daily during guest's stay.
    */
  var dailyHousekeeping: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Daily housekeeping exception.
    */
  var dailyHousekeepingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Housekeeping available. Guest units are cleaned by hotel staff during guest's stay. Schedule may vary from daily, weekly, or specific days of the week.
    */
  var housekeepingAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Housekeeping available exception.
    */
  var housekeepingAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Turndown service. Hotel staff enters guest units to prepare the bed for sleep use. May or may not include some light housekeeping. May or may not include an evening snack or candy. Also known as evening service.
    */
  var turndownService: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Turndown service exception.
    */
  var turndownServiceException: js.UndefOr[String | Null] = js.undefined
}
object SchemaHousekeeping {
  
  inline def apply(): SchemaHousekeeping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHousekeeping]
  }
  
  extension [Self <: SchemaHousekeeping](x: Self) {
    
    inline def setDailyHousekeeping(value: Boolean): Self = StObject.set(x, "dailyHousekeeping", value.asInstanceOf[js.Any])
    
    inline def setDailyHousekeepingException(value: String): Self = StObject.set(x, "dailyHousekeepingException", value.asInstanceOf[js.Any])
    
    inline def setDailyHousekeepingExceptionNull: Self = StObject.set(x, "dailyHousekeepingException", null)
    
    inline def setDailyHousekeepingExceptionUndefined: Self = StObject.set(x, "dailyHousekeepingException", js.undefined)
    
    inline def setDailyHousekeepingNull: Self = StObject.set(x, "dailyHousekeeping", null)
    
    inline def setDailyHousekeepingUndefined: Self = StObject.set(x, "dailyHousekeeping", js.undefined)
    
    inline def setHousekeepingAvailable(value: Boolean): Self = StObject.set(x, "housekeepingAvailable", value.asInstanceOf[js.Any])
    
    inline def setHousekeepingAvailableException(value: String): Self = StObject.set(x, "housekeepingAvailableException", value.asInstanceOf[js.Any])
    
    inline def setHousekeepingAvailableExceptionNull: Self = StObject.set(x, "housekeepingAvailableException", null)
    
    inline def setHousekeepingAvailableExceptionUndefined: Self = StObject.set(x, "housekeepingAvailableException", js.undefined)
    
    inline def setHousekeepingAvailableNull: Self = StObject.set(x, "housekeepingAvailable", null)
    
    inline def setHousekeepingAvailableUndefined: Self = StObject.set(x, "housekeepingAvailable", js.undefined)
    
    inline def setTurndownService(value: Boolean): Self = StObject.set(x, "turndownService", value.asInstanceOf[js.Any])
    
    inline def setTurndownServiceException(value: String): Self = StObject.set(x, "turndownServiceException", value.asInstanceOf[js.Any])
    
    inline def setTurndownServiceExceptionNull: Self = StObject.set(x, "turndownServiceException", null)
    
    inline def setTurndownServiceExceptionUndefined: Self = StObject.set(x, "turndownServiceException", js.undefined)
    
    inline def setTurndownServiceNull: Self = StObject.set(x, "turndownService", null)
    
    inline def setTurndownServiceUndefined: Self = StObject.set(x, "turndownService", js.undefined)
  }
}
