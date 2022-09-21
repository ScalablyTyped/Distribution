package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<hellosign-sdk.hellosign-sdk.ReportsRequestOptions, 'test_mode'> */
trait Report extends StObject {
  
  var end_date: String
  
  var report_type: js.Array[String]
  
  var start_date: String
  
  var success: js.UndefOr[String] = js.undefined
}
object Report {
  
  inline def apply(end_date: String, report_type: js.Array[String], start_date: String): Report = {
    val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], report_type = report_type.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setEnd_date(value: String): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
    
    inline def setReport_type(value: js.Array[String]): Self = StObject.set(x, "report_type", value.asInstanceOf[js.Any])
    
    inline def setReport_typeVarargs(value: String*): Self = StObject.set(x, "report_type", js.Array(value*))
    
    inline def setStart_date(value: String): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
