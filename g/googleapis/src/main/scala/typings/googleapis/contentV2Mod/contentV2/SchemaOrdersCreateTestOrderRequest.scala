package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCreateTestOrderRequest extends StObject {
  
  /**
    * The  CLDR territory code of the country of the test order to create.
    * Affects the currency and addresses of orders created via template_name,
    * or the addresses of orders created via test_order.  Acceptable values
    * are:   - &quot;US&quot;  - &quot;FR&quot;  Defaults to US.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The test order template to use. Specify as an alternative to testOrder as
    * a shortcut for retrieving a template and then creating an order using
    * that template.
    */
  var templateName: js.UndefOr[String] = js.native
  
  /**
    * The test order to create.
    */
  var testOrder: js.UndefOr[SchemaTestOrder] = js.native
}
object SchemaOrdersCreateTestOrderRequest {
  
  @scala.inline
  def apply(): SchemaOrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersCreateTestOrderRequestMutableBuilder[Self <: SchemaOrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setTemplateName(value: String): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "templateName", js.undefined)
    
    @scala.inline
    def setTestOrder(value: SchemaTestOrder): Self = StObject.set(x, "testOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOrderUndefined: Self = StObject.set(x, "testOrder", js.undefined)
  }
}
