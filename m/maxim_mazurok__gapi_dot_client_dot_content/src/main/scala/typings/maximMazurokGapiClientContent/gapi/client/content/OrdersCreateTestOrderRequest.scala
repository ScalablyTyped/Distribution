package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCreateTestOrderRequest extends StObject {
  
  /**
    * The CLDR territory code of the country of the test order to create. Affects the currency and addresses of orders created through `template_name`, or the addresses of orders created
    * through `test_order`. Acceptable values are: - "`US`" - "`FR`" Defaults to "`US`".
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The test order template to use. Specify as an alternative to `testOrder` as a shortcut for retrieving a template and then creating an order using that template. Acceptable values
    * are: - "`template1`" - "`template1a`" - "`template1b`" - "`template2`" - "`template3`"
    */
  var templateName: js.UndefOr[String] = js.undefined
  
  /** The test order to create. */
  var testOrder: js.UndefOr[TestOrder] = js.undefined
}
object OrdersCreateTestOrderRequest {
  
  inline def apply(): OrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
    
    inline def setTestOrder(value: TestOrder): Self = StObject.set(x, "testOrder", value.asInstanceOf[js.Any])
    
    inline def setTestOrderUndefined: Self = StObject.set(x, "testOrder", js.undefined)
  }
}
