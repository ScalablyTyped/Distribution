package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryTimelineSample extends StObject {
  
  /** Total number of units currently being processed by workers. This does not correspond directly to slot usage. This is the largest value observed since the last sample. */
  var activeUnits: js.UndefOr[String] = js.native
  
  /** Total parallel units of work completed by this query. */
  var completedUnits: js.UndefOr[String] = js.native
  
  /** Milliseconds elapsed since the start of query execution. */
  var elapsedMs: js.UndefOr[String] = js.native
  
  /** Total parallel units of work remaining for the active stages. */
  var pendingUnits: js.UndefOr[String] = js.native
  
  /** Cumulative slot-ms consumed by the query. */
  var totalSlotMs: js.UndefOr[String] = js.native
}
object QueryTimelineSample {
  
  @scala.inline
  def apply(): QueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryTimelineSample]
  }
  
  @scala.inline
  implicit class QueryTimelineSampleMutableBuilder[Self <: QueryTimelineSample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveUnits(value: String): Self = StObject.set(x, "activeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUnitsUndefined: Self = StObject.set(x, "activeUnits", js.undefined)
    
    @scala.inline
    def setCompletedUnits(value: String): Self = StObject.set(x, "completedUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUnitsUndefined: Self = StObject.set(x, "completedUnits", js.undefined)
    
    @scala.inline
    def setElapsedMs(value: String): Self = StObject.set(x, "elapsedMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedMsUndefined: Self = StObject.set(x, "elapsedMs", js.undefined)
    
    @scala.inline
    def setPendingUnits(value: String): Self = StObject.set(x, "pendingUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingUnitsUndefined: Self = StObject.set(x, "pendingUnits", js.undefined)
    
    @scala.inline
    def setTotalSlotMs(value: String): Self = StObject.set(x, "totalSlotMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSlotMsUndefined: Self = StObject.set(x, "totalSlotMs", js.undefined)
  }
}
