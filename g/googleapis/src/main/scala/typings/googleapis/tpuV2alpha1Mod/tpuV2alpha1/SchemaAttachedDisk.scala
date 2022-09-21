package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAttachedDisk extends StObject {
  
  /**
    * The mode in which to attach this disk. If not specified, the default is READ_WRITE mode. Only applicable to data_disks.
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the full path to an existing disk. For example: "projects/my-project/zones/us-central1-c/disks/my-disk".
    */
  var sourceDisk: js.UndefOr[String | Null] = js.undefined
}
object SchemaAttachedDisk {
  
  inline def apply(): SchemaAttachedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachedDisk]
  }
  
  extension [Self <: SchemaAttachedDisk](x: Self) {
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSourceDisk(value: String): Self = StObject.set(x, "sourceDisk", value.asInstanceOf[js.Any])
    
    inline def setSourceDiskNull: Self = StObject.set(x, "sourceDisk", null)
    
    inline def setSourceDiskUndefined: Self = StObject.set(x, "sourceDisk", js.undefined)
  }
}
