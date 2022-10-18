package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HotKeyDebuggingInfo extends StObject {
  
  /** Debugging information for each detected hot key. Keyed by a hash of the key. */
  var detectedHotKeys: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.HotKeyInfo} */ js.Any
  ] = js.undefined
}
object HotKeyDebuggingInfo {
  
  inline def apply(): HotKeyDebuggingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeyDebuggingInfo]
  }
  
  extension [Self <: HotKeyDebuggingInfo](x: Self) {
    
    inline def setDetectedHotKeys(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dataflow.gapi.client.dataflow.HotKeyInfo} */ js.Any
    ): Self = StObject.set(x, "detectedHotKeys", value.asInstanceOf[js.Any])
    
    inline def setDetectedHotKeysUndefined: Self = StObject.set(x, "detectedHotKeys", js.undefined)
  }
}
