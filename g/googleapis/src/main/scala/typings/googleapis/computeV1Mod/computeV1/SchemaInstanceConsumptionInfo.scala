package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceConsumptionInfo extends StObject {
  
  /**
    * The number of virtual CPUs that are available to the instance.
    */
  var guestCpus: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of local SSD storage available to the instance, defined in GiB.
    */
  var localSsdGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount of physical memory available to the instance, defined in MiB.
    */
  var memoryMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimal guaranteed number of virtual CPUs that are reserved.
    */
  var minNodeCpus: js.UndefOr[Double | Null] = js.undefined
}
object SchemaInstanceConsumptionInfo {
  
  inline def apply(): SchemaInstanceConsumptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceConsumptionInfo]
  }
  
  extension [Self <: SchemaInstanceConsumptionInfo](x: Self) {
    
    inline def setGuestCpus(value: Double): Self = StObject.set(x, "guestCpus", value.asInstanceOf[js.Any])
    
    inline def setGuestCpusNull: Self = StObject.set(x, "guestCpus", null)
    
    inline def setGuestCpusUndefined: Self = StObject.set(x, "guestCpus", js.undefined)
    
    inline def setLocalSsdGb(value: Double): Self = StObject.set(x, "localSsdGb", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdGbNull: Self = StObject.set(x, "localSsdGb", null)
    
    inline def setLocalSsdGbUndefined: Self = StObject.set(x, "localSsdGb", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbNull: Self = StObject.set(x, "memoryMb", null)
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setMinNodeCpus(value: Double): Self = StObject.set(x, "minNodeCpus", value.asInstanceOf[js.Any])
    
    inline def setMinNodeCpusNull: Self = StObject.set(x, "minNodeCpus", null)
    
    inline def setMinNodeCpusUndefined: Self = StObject.set(x, "minNodeCpus", js.undefined)
  }
}
