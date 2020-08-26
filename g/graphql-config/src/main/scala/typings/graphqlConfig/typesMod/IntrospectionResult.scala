package typings.graphqlConfig.typesMod

import typings.graphql.getIntrospectionQueryMod.IntrospectionQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionResult extends js.Object {
  var data: IntrospectionQuery = js.native
  var errors: js.UndefOr[js.Any] = js.native
  var extensions: js.UndefOr[js.Object] = js.native
}

object IntrospectionResult {
  @scala.inline
  def apply(data: IntrospectionQuery): IntrospectionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResult]
  }
  @scala.inline
  implicit class IntrospectionResultOps[Self <: IntrospectionResult] (val x: Self) extends AnyVal {
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
    def setData(value: IntrospectionQuery): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setExtensions(value: js.Object): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
  }
  
}

