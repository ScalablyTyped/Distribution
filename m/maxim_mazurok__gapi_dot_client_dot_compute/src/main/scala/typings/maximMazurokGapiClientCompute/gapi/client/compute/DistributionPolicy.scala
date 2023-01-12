package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPolicy extends StObject {
  
  /** The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType). */
  var targetShape: js.UndefOr[String] = js.undefined
  
  /** Zones where the regional managed instance group will create and manage its instances. */
  var zones: js.UndefOr[js.Array[DistributionPolicyZoneConfiguration]] = js.undefined
}
object DistributionPolicy {
  
  inline def apply(): DistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionPolicy] (val x: Self) extends AnyVal {
    
    inline def setTargetShape(value: String): Self = StObject.set(x, "targetShape", value.asInstanceOf[js.Any])
    
    inline def setTargetShapeUndefined: Self = StObject.set(x, "targetShape", js.undefined)
    
    inline def setZones(value: js.Array[DistributionPolicyZoneConfiguration]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    inline def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    inline def setZonesVarargs(value: DistributionPolicyZoneConfiguration*): Self = StObject.set(x, "zones", js.Array(value*))
  }
}
