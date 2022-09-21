package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBinLogCoordinates extends StObject {
  
  /**
    * Name of the binary log file for a Cloud SQL instance.
    */
  var binLogFileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Position (offset) within the binary log file.
    */
  var binLogPosition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#binLogCoordinates`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBinLogCoordinates {
  
  inline def apply(): SchemaBinLogCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinLogCoordinates]
  }
  
  extension [Self <: SchemaBinLogCoordinates](x: Self) {
    
    inline def setBinLogFileName(value: String): Self = StObject.set(x, "binLogFileName", value.asInstanceOf[js.Any])
    
    inline def setBinLogFileNameNull: Self = StObject.set(x, "binLogFileName", null)
    
    inline def setBinLogFileNameUndefined: Self = StObject.set(x, "binLogFileName", js.undefined)
    
    inline def setBinLogPosition(value: String): Self = StObject.set(x, "binLogPosition", value.asInstanceOf[js.Any])
    
    inline def setBinLogPositionNull: Self = StObject.set(x, "binLogPosition", null)
    
    inline def setBinLogPositionUndefined: Self = StObject.set(x, "binLogPosition", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
