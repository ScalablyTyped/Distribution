package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportFailure extends StObject {
  
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportFailure {
  
  inline def apply(): SchemaReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportFailure]
  }
  
  extension [Self <: SchemaReportFailure](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeNull: Self = StObject.set(x, "errorCode", null)
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
