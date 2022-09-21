package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1DiskConfig extends StObject {
  
  /**
    * Size in GB of the boot disk (default is 100GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Type of the boot disk (default is "pd-ssd"). Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or "pd-standard" (Persistent Disk Hard Disk Drive).
    */
  var bootDiskType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1DiskConfig {
  
  inline def apply(): SchemaGoogleCloudMlV1DiskConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1DiskConfig]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1DiskConfig](x: Self) {
    
    inline def setBootDiskSizeGb(value: Double): Self = StObject.set(x, "bootDiskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setBootDiskSizeGbNull: Self = StObject.set(x, "bootDiskSizeGb", null)
    
    inline def setBootDiskSizeGbUndefined: Self = StObject.set(x, "bootDiskSizeGb", js.undefined)
    
    inline def setBootDiskType(value: String): Self = StObject.set(x, "bootDiskType", value.asInstanceOf[js.Any])
    
    inline def setBootDiskTypeNull: Self = StObject.set(x, "bootDiskType", null)
    
    inline def setBootDiskTypeUndefined: Self = StObject.set(x, "bootDiskType", js.undefined)
  }
}
