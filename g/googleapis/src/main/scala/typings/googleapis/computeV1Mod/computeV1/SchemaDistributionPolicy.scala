package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDistributionPolicy extends StObject {
  
  /**
    * Zones where the regional managed instance group will create and manage
    * instances.
    */
  var zones: js.UndefOr[js.Array[SchemaDistributionPolicyZoneConfiguration]] = js.undefined
}
object SchemaDistributionPolicy {
  
  @scala.inline
  def apply(): SchemaDistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicy]
  }
  
  @scala.inline
  implicit class SchemaDistributionPolicyMutableBuilder[Self <: SchemaDistributionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZones(value: js.Array[SchemaDistributionPolicyZoneConfiguration]): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZonesUndefined: Self = StObject.set(x, "zones", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: SchemaDistributionPolicyZoneConfiguration*): Self = StObject.set(x, "zones", js.Array(value :_*))
  }
}
