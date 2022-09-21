package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalDisk extends StObject {
  
  /**
    * Specifies the number of such disks.
    */
  var diskCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalDisk {
  
  inline def apply(): SchemaLocalDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalDisk]
  }
  
  extension [Self <: SchemaLocalDisk](x: Self) {
    
    inline def setDiskCount(value: Double): Self = StObject.set(x, "diskCount", value.asInstanceOf[js.Any])
    
    inline def setDiskCountNull: Self = StObject.set(x, "diskCount", null)
    
    inline def setDiskCountUndefined: Self = StObject.set(x, "diskCount", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
  }
}
