package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalDisk extends StObject {
  
  /** Specifies the number of such disks. */
  var diskCount: js.UndefOr[Double] = js.undefined
  
  /** Specifies the size of the disk in base-2 GB. */
  var diskSizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and
    * not its URL.
    */
  var diskType: js.UndefOr[String] = js.undefined
}
object LocalDisk {
  
  inline def apply(): LocalDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalDisk]
  }
  
  extension [Self <: LocalDisk](x: Self) {
    
    inline def setDiskCount(value: Double): Self = StObject.set(x, "diskCount", value.asInstanceOf[js.Any])
    
    inline def setDiskCountUndefined: Self = StObject.set(x, "diskCount", js.undefined)
    
    inline def setDiskSizeGb(value: Double): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
  }
}
