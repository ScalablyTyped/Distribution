package typings.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionResult extends js.Object {
  var __schema: js.Any = js.native
}

object IntrospectionResult {
  @scala.inline
  def apply(__schema: js.Any): IntrospectionResult = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
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
    def set__schema(value: js.Any): Self = this.set("__schema", value.asInstanceOf[js.Any])
  }
  
}

