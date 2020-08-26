package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Variables Response.
  */
@js.native
trait SchemaListVariablesResponse extends js.Object {
  /**
    * All GTM Variables of a GTM Container.
    */
  var variables: js.UndefOr[js.Array[SchemaVariable]] = js.native
}

object SchemaListVariablesResponse {
  @scala.inline
  def apply(): SchemaListVariablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListVariablesResponse]
  }
  @scala.inline
  implicit class SchemaListVariablesResponseOps[Self <: SchemaListVariablesResponse] (val x: Self) extends AnyVal {
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
    def setVariablesVarargs(value: SchemaVariable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: js.Array[SchemaVariable]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

