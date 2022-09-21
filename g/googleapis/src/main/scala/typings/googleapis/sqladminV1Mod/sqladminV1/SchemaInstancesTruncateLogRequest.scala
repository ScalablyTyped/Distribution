package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesTruncateLogRequest extends StObject {
  
  /**
    * Contains details about the truncate log operation.
    */
  var truncateLogContext: js.UndefOr[SchemaTruncateLogContext] = js.undefined
}
object SchemaInstancesTruncateLogRequest {
  
  inline def apply(): SchemaInstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesTruncateLogRequest]
  }
  
  extension [Self <: SchemaInstancesTruncateLogRequest](x: Self) {
    
    inline def setTruncateLogContext(value: SchemaTruncateLogContext): Self = StObject.set(x, "truncateLogContext", value.asInstanceOf[js.Any])
    
    inline def setTruncateLogContextUndefined: Self = StObject.set(x, "truncateLogContext", js.undefined)
  }
}
