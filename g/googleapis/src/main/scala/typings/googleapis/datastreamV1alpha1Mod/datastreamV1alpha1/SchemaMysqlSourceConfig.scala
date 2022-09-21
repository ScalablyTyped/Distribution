package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlSourceConfig extends StObject {
  
  /**
    * MySQL objects to retrieve from the source.
    */
  var allowlist: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * MySQL objects to exclude from the stream.
    */
  var rejectlist: js.UndefOr[SchemaMysqlRdbms] = js.undefined
}
object SchemaMysqlSourceConfig {
  
  inline def apply(): SchemaMysqlSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlSourceConfig]
  }
  
  extension [Self <: SchemaMysqlSourceConfig](x: Self) {
    
    inline def setAllowlist(value: SchemaMysqlRdbms): Self = StObject.set(x, "allowlist", value.asInstanceOf[js.Any])
    
    inline def setAllowlistUndefined: Self = StObject.set(x, "allowlist", js.undefined)
    
    inline def setRejectlist(value: SchemaMysqlRdbms): Self = StObject.set(x, "rejectlist", value.asInstanceOf[js.Any])
    
    inline def setRejectlistUndefined: Self = StObject.set(x, "rejectlist", js.undefined)
  }
}
