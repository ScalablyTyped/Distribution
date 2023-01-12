package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountedDataDisk extends StObject {
  
  /**
    * The name of the data disk. This name is local to the Google Cloud Platform project and uniquely identifies the disk within that project, for example
    * "myproject-1014-104817-4c2-harness-0-disk-1".
    */
  var dataDisk: js.UndefOr[String] = js.undefined
}
object MountedDataDisk {
  
  inline def apply(): MountedDataDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MountedDataDisk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MountedDataDisk] (val x: Self) extends AnyVal {
    
    inline def setDataDisk(value: String): Self = StObject.set(x, "dataDisk", value.asInstanceOf[js.Any])
    
    inline def setDataDiskUndefined: Self = StObject.set(x, "dataDisk", js.undefined)
  }
}
