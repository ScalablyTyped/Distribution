package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryInfo extends StObject {
  
  /** Total internal storage on device in bytes. */
  var totalInternalStorage: js.UndefOr[String] = js.native
  
  /** Total RAM on device in bytes. */
  var totalRam: js.UndefOr[String] = js.native
}
object MemoryInfo {
  
  @scala.inline
  def apply(): MemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryInfo]
  }
  
  @scala.inline
  implicit class MemoryInfoMutableBuilder[Self <: MemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalInternalStorage(value: String): Self = StObject.set(x, "totalInternalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInternalStorageUndefined: Self = StObject.set(x, "totalInternalStorage", js.undefined)
    
    @scala.inline
    def setTotalRam(value: String): Self = StObject.set(x, "totalRam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRamUndefined: Self = StObject.set(x, "totalRam", js.undefined)
  }
}
