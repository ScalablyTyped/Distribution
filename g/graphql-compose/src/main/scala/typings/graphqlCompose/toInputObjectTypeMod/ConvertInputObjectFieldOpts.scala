package typings.graphqlCompose.toInputObjectTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvertInputObjectFieldOpts extends js.Object {
  var fieldName: js.UndefOr[String] = js.native
  var outputTypeName: js.UndefOr[String] = js.native
  var postfix: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object ConvertInputObjectFieldOpts {
  @scala.inline
  def apply(): ConvertInputObjectFieldOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertInputObjectFieldOpts]
  }
  @scala.inline
  implicit class ConvertInputObjectFieldOptsOps[Self <: ConvertInputObjectFieldOpts] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setOutputTypeName(value: String): Self = this.set("outputTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputTypeName: Self = this.set("outputTypeName", js.undefined)
    @scala.inline
    def setPostfix(value: String): Self = this.set("postfix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostfix: Self = this.set("postfix", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

