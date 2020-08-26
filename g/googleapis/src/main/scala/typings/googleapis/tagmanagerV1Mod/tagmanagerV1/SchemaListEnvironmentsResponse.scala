package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Environments Response.
  */
@js.native
trait SchemaListEnvironmentsResponse extends js.Object {
  /**
    * All Environments of a GTM Container.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.native
}

object SchemaListEnvironmentsResponse {
  @scala.inline
  def apply(): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
  @scala.inline
  implicit class SchemaListEnvironmentsResponseOps[Self <: SchemaListEnvironmentsResponse] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: SchemaEnvironment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[SchemaEnvironment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
  }
  
}

