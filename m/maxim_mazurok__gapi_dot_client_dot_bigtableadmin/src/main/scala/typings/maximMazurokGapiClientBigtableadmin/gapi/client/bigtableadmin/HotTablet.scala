package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotTablet extends StObject {
  
  /** Tablet End Key (inclusive). */
  var endKey: js.UndefOr[String] = js.undefined
  
  /** Output only. The end time of the hot tablet. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** The unique name of the hot tablet. Values are of the form `projects/{project}/instances/{instance}/clusters/{cluster}/hotTablets/[a-zA-Z0-9_-]*`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The average CPU usage spent by a node on this tablet over the start_time to end_time time range. The percentage is the amount of CPU used by the node to serve the
    * tablet, from 0% (tablet was not interacted with) to 100% (the node spent all cycles serving the hot tablet).
    */
  var nodeCpuUsagePercent: js.UndefOr[Double] = js.undefined
  
  /** Tablet Start Key (inclusive). */
  var startKey: js.UndefOr[String] = js.undefined
  
  /** Output only. The start time of the hot tablet. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Name of the table that contains the tablet. Values are of the form `projects/{project}/instances/{instance}/tables/_a-zA-Z0-9*`. */
  var tableName: js.UndefOr[String] = js.undefined
}
object HotTablet {
  
  inline def apply(): HotTablet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotTablet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HotTablet] (val x: Self) extends AnyVal {
    
    inline def setEndKey(value: String): Self = StObject.set(x, "endKey", value.asInstanceOf[js.Any])
    
    inline def setEndKeyUndefined: Self = StObject.set(x, "endKey", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeCpuUsagePercent(value: Double): Self = StObject.set(x, "nodeCpuUsagePercent", value.asInstanceOf[js.Any])
    
    inline def setNodeCpuUsagePercentUndefined: Self = StObject.set(x, "nodeCpuUsagePercent", js.undefined)
    
    inline def setStartKey(value: String): Self = StObject.set(x, "startKey", value.asInstanceOf[js.Any])
    
    inline def setStartKeyUndefined: Self = StObject.set(x, "startKey", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
  }
}
