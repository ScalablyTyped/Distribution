package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A quotas entry.
  */
trait SchemaQuota extends StObject {
  
  /**
    * [Output Only] Quota limit for this metric.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Name of the quota metric.
    */
  var metric: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Owning resource. This is the resource on which this quota
    * is applied.
    */
  var owner: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Current usage of this metric.
    */
  var usage: js.UndefOr[Double] = js.undefined
}
object SchemaQuota {
  
  inline def apply(): SchemaQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuota]
  }
  
  extension [Self <: SchemaQuota](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMetric(value: String): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "metric", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
  }
}
