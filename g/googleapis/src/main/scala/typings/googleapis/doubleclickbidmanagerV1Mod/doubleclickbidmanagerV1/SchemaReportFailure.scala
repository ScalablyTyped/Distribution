package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An explanation of a report failure.
  */
trait SchemaReportFailure extends StObject {
  
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String] = js.undefined
}
object SchemaReportFailure {
  
  inline def apply(): SchemaReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportFailure]
  }
  
  extension [Self <: SchemaReportFailure](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
  }
}
