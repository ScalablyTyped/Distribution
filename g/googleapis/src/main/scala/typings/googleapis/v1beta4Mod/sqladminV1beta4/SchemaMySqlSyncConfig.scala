package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMySqlSyncConfig extends StObject {
  
  /**
    * Flags to use for the initial dump.
    */
  var initialSyncFlags: js.UndefOr[js.Array[SchemaSyncFlags]] = js.undefined
}
object SchemaMySqlSyncConfig {
  
  inline def apply(): SchemaMySqlSyncConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMySqlSyncConfig]
  }
  
  extension [Self <: SchemaMySqlSyncConfig](x: Self) {
    
    inline def setInitialSyncFlags(value: js.Array[SchemaSyncFlags]): Self = StObject.set(x, "initialSyncFlags", value.asInstanceOf[js.Any])
    
    inline def setInitialSyncFlagsUndefined: Self = StObject.set(x, "initialSyncFlags", js.undefined)
    
    inline def setInitialSyncFlagsVarargs(value: SchemaSyncFlags*): Self = StObject.set(x, "initialSyncFlags", js.Array(value*))
  }
}
