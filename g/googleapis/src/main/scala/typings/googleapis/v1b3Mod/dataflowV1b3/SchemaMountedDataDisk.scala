package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMountedDataDisk extends StObject {
  
  /**
    * The name of the data disk. This name is local to the Google Cloud Platform project and uniquely identifies the disk within that project, for example "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String | Null] = js.undefined
}
object SchemaMountedDataDisk {
  
  inline def apply(): SchemaMountedDataDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMountedDataDisk]
  }
  
  extension [Self <: SchemaMountedDataDisk](x: Self) {
    
    inline def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    inline def setDataDiskNull: Self = StObject.set(x, "dataDisk", null)
    
    inline def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
  }
}
