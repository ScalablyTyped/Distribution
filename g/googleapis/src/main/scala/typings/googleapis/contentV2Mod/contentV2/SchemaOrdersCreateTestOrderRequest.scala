package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersCreateTestOrderRequest extends js.Object {
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
  def apply(country: String = null, templateName: String = null, testOrder: SchemaTestOrder = null): SchemaOrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (testOrder != null) __obj.updateDynamic("testOrder")(testOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderRequest]
  }
}

