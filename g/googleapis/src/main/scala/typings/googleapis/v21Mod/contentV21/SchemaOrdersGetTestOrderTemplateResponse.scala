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
  def apply(): SchemaOrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetTestOrderTemplateResponse]
  }
  @scala.inline
  implicit class SchemaOrdersGetTestOrderTemplateResponseOps[Self <: SchemaOrdersGetTestOrderTemplateResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTemplate(value: SchemaTestOrder): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

