package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StragglerDebuggingInfo extends StObject {
  
  /** Hot key debugging details. */
  var hotKey: js.UndefOr[HotKeyDebuggingInfo] = js.undefined
}
object StragglerDebuggingInfo {
  
  inline def apply(): StragglerDebuggingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StragglerDebuggingInfo]
  }
  
  extension [Self <: StragglerDebuggingInfo](x: Self) {
    
    inline def setHotKey(value: HotKeyDebuggingInfo): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
    
    inline def setHotKeyUndefined: Self = StObject.set(x, "hotKey", js.undefined)
  }
}
