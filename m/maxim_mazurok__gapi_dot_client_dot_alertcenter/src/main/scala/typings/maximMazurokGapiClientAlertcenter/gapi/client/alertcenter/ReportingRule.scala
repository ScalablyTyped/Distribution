package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportingRule extends StObject {
  
  /** Any other associated alert details, for example, AlertConfiguration. */
  var alertDetails: js.UndefOr[String] = js.undefined
  
  /** Rule name */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Alert Rule query Sample Query query { condition { filter { expected_application_id: 777491262838 expected_event_name: "indexable_content_change" filter_op: IN } }
    * conjunction_operator: OR }
    */
  var query: js.UndefOr[String] = js.undefined
}
object ReportingRule {
  
  inline def apply(): ReportingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportingRule] (val x: Self) extends AnyVal {
    
    inline def setAlertDetails(value: String): Self = StObject.set(x, "alertDetails", value.asInstanceOf[js.Any])
    
    inline def setAlertDetailsUndefined: Self = StObject.set(x, "alertDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
