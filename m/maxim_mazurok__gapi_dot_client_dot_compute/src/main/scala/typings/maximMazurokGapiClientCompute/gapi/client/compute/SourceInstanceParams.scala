package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceInstanceParams extends StObject {
  
  /**
    * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, new custom images will be created from each disk. For read-only disks,
    * they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
    */
  var diskConfigs: js.UndefOr[js.Array[DiskInstantiationConfig]] = js.undefined
}
object SourceInstanceParams {
  
  inline def apply(): SourceInstanceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceInstanceParams]
  }
  
  extension [Self <: SourceInstanceParams](x: Self) {
    
    inline def setDiskConfigs(value: js.Array[DiskInstantiationConfig]): Self = StObject.set(x, "diskConfigs", value.asInstanceOf[js.Any])
    
    inline def setDiskConfigsUndefined: Self = StObject.set(x, "diskConfigs", js.undefined)
    
    inline def setDiskConfigsVarargs(value: DiskInstantiationConfig*): Self = StObject.set(x, "diskConfigs", js.Array(value :_*))
  }
}
