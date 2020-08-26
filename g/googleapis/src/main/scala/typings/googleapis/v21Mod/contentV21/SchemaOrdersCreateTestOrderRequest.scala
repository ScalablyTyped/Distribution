package typings.googleapis.v21Mod.contentV21

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
  def apply(): SchemaOrdersCreateTestOrderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCreateTestOrderRequest]
  }
  @scala.inline
  implicit class SchemaOrdersCreateTestOrderRequestOps[Self <: SchemaOrdersCreateTestOrderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    @scala.inline
    def setTestOrder(value: SchemaTestOrder): Self = this.set("testOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestOrder: Self = this.set("testOrder", js.undefined)
  }
  
}

