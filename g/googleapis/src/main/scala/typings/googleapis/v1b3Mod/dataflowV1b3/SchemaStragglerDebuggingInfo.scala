package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStragglerDebuggingInfo extends StObject {
  
  /**
    * Hot key debugging details.
    */
  var hotKey: js.UndefOr[SchemaHotKeyDebuggingInfo] = js.undefined
}
object SchemaStragglerDebuggingInfo {
  
  inline def apply(): SchemaStragglerDebuggingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStragglerDebuggingInfo]
  }
  
  extension [Self <: SchemaStragglerDebuggingInfo](x: Self) {
    
    inline def setHotKey(value: SchemaHotKeyDebuggingInfo): Self = StObject.set(x, "hotKey", value.asInstanceOf[js.Any])
    
    inline def setHotKeyUndefined: Self = StObject.set(x, "hotKey", js.undefined)
  }
}
