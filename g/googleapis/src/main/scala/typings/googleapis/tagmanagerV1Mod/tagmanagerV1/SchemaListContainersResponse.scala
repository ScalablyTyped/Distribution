package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait SchemaListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.native
}

object SchemaListContainersResponse {
  @scala.inline
  def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  @scala.inline
  implicit class SchemaListContainersResponseOps[Self <: SchemaListContainersResponse] (val x: Self) extends AnyVal {
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
    def setContainersVarargs(value: SchemaContainer*): Self = this.set("containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: js.Array[SchemaContainer]): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
  }
  
}

