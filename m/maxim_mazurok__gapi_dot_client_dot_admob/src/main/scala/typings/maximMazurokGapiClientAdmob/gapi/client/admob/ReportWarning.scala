package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportWarning extends StObject {
  
  /** Describes the details of the warning message, in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Type of the warning. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ReportWarning {
  
  inline def apply(): ReportWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportWarning]
  }
  
  extension [Self <: ReportWarning](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
