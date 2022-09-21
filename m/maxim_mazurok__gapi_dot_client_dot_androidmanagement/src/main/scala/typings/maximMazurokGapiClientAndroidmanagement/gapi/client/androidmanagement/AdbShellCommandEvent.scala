package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdbShellCommandEvent extends StObject {
  
  /** Shell command that was issued over ADB via "adb shell command". Redacted to empty string on organization-owned managed profile devices. */
  var shellCmd: js.UndefOr[String] = js.undefined
}
object AdbShellCommandEvent {
  
  inline def apply(): AdbShellCommandEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdbShellCommandEvent]
  }
  
  extension [Self <: AdbShellCommandEvent](x: Self) {
    
    inline def setShellCmd(value: String): Self = StObject.set(x, "shellCmd", value.asInstanceOf[js.Any])
    
    inline def setShellCmdUndefined: Self = StObject.set(x, "shellCmd", js.undefined)
  }
}
