package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTruncateLogContext extends StObject {
  
  /**
    * This is always *sql#truncateLogContext*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of log to truncate. Valid values are *MYSQL_GENERAL_TABLE* and *MYSQL_SLOW_TABLE*.
    */
  var logType: js.UndefOr[String | Null] = js.undefined
}
object SchemaTruncateLogContext {
  
  inline def apply(): SchemaTruncateLogContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTruncateLogContext]
  }
  
  extension [Self <: SchemaTruncateLogContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    inline def setLogTypeNull: Self = StObject.set(x, "logType", null)
    
    inline def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}
