package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMeteringMembershipState extends StObject {
  
  /**
    * The time stamp of the most recent measurement of the number of vCPUs in the cluster.
    */
  var lastMeasurementTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The vCPUs capacity in the cluster according to the most recent measurement (1/1000 precision).
    */
  var preciseLastMeasuredClusterVcpuCapacity: js.UndefOr[Double | Null] = js.undefined
}
object SchemaMeteringMembershipState {
  
  inline def apply(): SchemaMeteringMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMeteringMembershipState]
  }
  
  extension [Self <: SchemaMeteringMembershipState](x: Self) {
    
    inline def setLastMeasurementTime(value: String): Self = StObject.set(x, "lastMeasurementTime", value.asInstanceOf[js.Any])
    
    inline def setLastMeasurementTimeNull: Self = StObject.set(x, "lastMeasurementTime", null)
    
    inline def setLastMeasurementTimeUndefined: Self = StObject.set(x, "lastMeasurementTime", js.undefined)
    
    inline def setPreciseLastMeasuredClusterVcpuCapacity(value: Double): Self = StObject.set(x, "preciseLastMeasuredClusterVcpuCapacity", value.asInstanceOf[js.Any])
    
    inline def setPreciseLastMeasuredClusterVcpuCapacityNull: Self = StObject.set(x, "preciseLastMeasuredClusterVcpuCapacity", null)
    
    inline def setPreciseLastMeasuredClusterVcpuCapacityUndefined: Self = StObject.set(x, "preciseLastMeasuredClusterVcpuCapacity", js.undefined)
  }
}
