package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a CloseMatterRequest.
  */
@js.native
trait SchemaCloseMatterResponse extends js.Object {
  /**
    * The updated matter, with state CLOSED.
    */
  var matter: js.UndefOr[SchemaMatter] = js.native
}

object SchemaCloseMatterResponse {
  @scala.inline
  def apply(): SchemaCloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloseMatterResponse]
  }
  @scala.inline
  implicit class SchemaCloseMatterResponseOps[Self <: SchemaCloseMatterResponse] (val x: Self) extends AnyVal {
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
    def setMatter(value: SchemaMatter): Self = this.set("matter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatter: Self = this.set("matter", js.undefined)
  }
  
}

