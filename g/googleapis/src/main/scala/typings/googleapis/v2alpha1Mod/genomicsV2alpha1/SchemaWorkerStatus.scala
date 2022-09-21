package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerStatus extends StObject {
  
  /**
    * Status of attached disks.
    */
  var attachedDisks: js.UndefOr[StringDictionary[SchemaDiskStatus] | Null] = js.undefined
  
  /**
    * Status of the boot disk.
    */
  var bootDisk: js.UndefOr[SchemaDiskStatus] = js.undefined
  
  /**
    * Free RAM.
    */
  var freeRamBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total RAM.
    */
  var totalRamBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System uptime.
    */
  var uptimeSeconds: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerStatus {
  
  inline def apply(): SchemaWorkerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerStatus]
  }
  
  extension [Self <: SchemaWorkerStatus](x: Self) {
    
    inline def setAttachedDisks(value: StringDictionary[SchemaDiskStatus]): Self = StObject.set(x, "attachedDisks", value.asInstanceOf[js.Any])
    
    inline def setAttachedDisksNull: Self = StObject.set(x, "attachedDisks", null)
    
    inline def setAttachedDisksUndefined: Self = StObject.set(x, "attachedDisks", js.undefined)
    
    inline def setBootDisk(value: SchemaDiskStatus): Self = StObject.set(x, "bootDisk", value.asInstanceOf[js.Any])
    
    inline def setBootDiskUndefined: Self = StObject.set(x, "bootDisk", js.undefined)
    
    inline def setFreeRamBytes(value: String): Self = StObject.set(x, "freeRamBytes", value.asInstanceOf[js.Any])
    
    inline def setFreeRamBytesNull: Self = StObject.set(x, "freeRamBytes", null)
    
    inline def setFreeRamBytesUndefined: Self = StObject.set(x, "freeRamBytes", js.undefined)
    
    inline def setTotalRamBytes(value: String): Self = StObject.set(x, "totalRamBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalRamBytesNull: Self = StObject.set(x, "totalRamBytes", null)
    
    inline def setTotalRamBytesUndefined: Self = StObject.set(x, "totalRamBytes", js.undefined)
    
    inline def setUptimeSeconds(value: String): Self = StObject.set(x, "uptimeSeconds", value.asInstanceOf[js.Any])
    
    inline def setUptimeSecondsNull: Self = StObject.set(x, "uptimeSeconds", null)
    
    inline def setUptimeSecondsUndefined: Self = StObject.set(x, "uptimeSeconds", js.undefined)
  }
}
