package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersGetTestOrderTemplateResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetTestOrderTemplateResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requested test order template.
    */
  var template: js.UndefOr[SchemaTestOrder] = js.native
}

object SchemaOrdersGetTestOrderTemplateResponse {
  @scala.inline
  def apply(kind: String = null, template: SchemaTestOrder = null): SchemaOrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersGetTestOrderTemplateResponse]
  }
}

