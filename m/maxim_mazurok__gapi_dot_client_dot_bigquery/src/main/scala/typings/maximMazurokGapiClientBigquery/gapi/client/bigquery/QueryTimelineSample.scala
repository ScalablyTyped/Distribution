package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTimelineSample extends StObject {
  
  /** Total number of units currently being processed by workers. This does not correspond directly to slot usage. This is the largest value observed since the last sample. */
  var activeUnits: js.UndefOr[String] = js.undefined
  
  /** Total parallel units of work completed by this query. */
  var completedUnits: js.UndefOr[String] = js.undefined
  
  /** Milliseconds elapsed since the start of query execution. */
  var elapsedMs: js.UndefOr[String] = js.undefined
  
  /**
    * Units of work that can be scheduled immediately. Providing additional slots for these units of work will speed up the query, provided no other query in the reservation needs
    * additional slots.
    */
  var estimatedRunnableUnits: js.UndefOr[String] = js.undefined
  
  /** Total units of work remaining for the query. This number can be revised (increased or decreased) while the query is running. */
  var pendingUnits: js.UndefOr[String] = js.undefined
  
  /** Cumulative slot-ms consumed by the query. */
  var totalSlotMs: js.UndefOr[String] = js.undefined
}
object QueryTimelineSample {
  
  inline def apply(): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimelineSample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryTimelineSample] (val x: Self) extends AnyVal {
    
    inline def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
    
    inline def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
    
    inline def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    inline def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    inline def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
    
    inline def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
    
    inline def setEstimatedRunnableUnits(value: String): Self = StObject.set(x, "estimatedRunnableUnits", value.asInstanceOf[js.Any])
    
    inline def setEstimatedRunnableUnitsUndefined: Self = StObject.set(x, "estimatedRunnableUnits", js.undefined)
    
    inline def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
    
    inline def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
    
    inline def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    inline def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
