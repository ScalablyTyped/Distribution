package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHotKeyDebuggingInfo extends StObject {
  
  /**
    * Debugging information for each detected hot key. Keyed by a hash of the key.
    */
  var detectedHotKeys: js.UndefOr[StringDictionary[SchemaHotKeyInfo] | Null] = js.undefined
}
object SchemaHotKeyDebuggingInfo {
  
  inline def apply(): SchemaHotKeyDebuggingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHotKeyDebuggingInfo]
  }
  
  extension [Self <: SchemaHotKeyDebuggingInfo](x: Self) {
    
    inline def setDetectedHotKeys(value: StringDictionary[SchemaHotKeyInfo]): Self = StObject.set(x, "detectedHotKeys", value.asInstanceOf[js.Any])
    
    inline def setDetectedHotKeysNull: Self = StObject.set(x, "detectedHotKeys", null)
    
    inline def setDetectedHotKeysUndefined: Self = StObject.set(x, "detectedHotKeys", js.undefined)
  }
}
