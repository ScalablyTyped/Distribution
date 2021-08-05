package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryInfo extends StObject {
  
  /** Total internal storage on device in bytes. */
  var totalInternalStorage: js.UndefOr[String] = js.undefined
  
  /** Total RAM on device in bytes. */
  var totalRam: js.UndefOr[String] = js.undefined
}
object MemoryInfo {
  
  inline def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  extension [Self <: MemoryInfo](x: Self) {
    
    inline def setTotalInternalStorage(value: String): Self = StObject.set(x, "totalInternalStorage", value.asInstanceOf[js.Any])
    
    inline def setTotalInternalStorageUndefined: Self = StObject.set(x, "totalInternalStorage", js.undefined)
    
    inline def setTotalRam(value: String): Self = StObject.set(x, "totalRam", value.asInstanceOf[js.Any])
    
    inline def setTotalRamUndefined: Self = StObject.set(x, "totalRam", js.undefined)
  }
}
