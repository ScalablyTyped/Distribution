package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportsRequestOptions extends StObject {
  
  var end_date: String
  
  var report_type: js.Array[String]
  
  var start_date: String
  
  var test_mode: js.UndefOr[Double] = js.undefined
}
object ReportsRequestOptions {
  
  inline def apply(end_date: String, report_type: js.Array[String], start_date: String): ReportsRequestOptions = {
    val __obj = js.Dynamic.literal(end_date = end_date.asInstanceOf[js.Any], report_type = report_type.asInstanceOf[js.Any], start_date = start_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportsRequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportsRequestOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd_date(value: String): Self = StObject.set(x, "end_date", value.asInstanceOf[js.Any])
    
    inline def setReport_type(value: js.Array[String]): Self = StObject.set(x, "report_type", value.asInstanceOf[js.Any])
    
    inline def setReport_typeVarargs(value: String*): Self = StObject.set(x, "report_type", js.Array(value*))
    
    inline def setStart_date(value: String): Self = StObject.set(x, "start_date", value.asInstanceOf[js.Any])
    
    inline def setTest_mode(value: Double): Self = StObject.set(x, "test_mode", value.asInstanceOf[js.Any])
    
    inline def setTest_modeUndefined: Self = StObject.set(x, "test_mode", js.undefined)
  }
}
