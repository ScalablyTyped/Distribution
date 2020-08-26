package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was deleted.
  */
@js.native
trait SchemaDelete extends js.Object {
  /**
    * The type of delete action taken.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaDelete {
  @scala.inline
  def apply(): SchemaDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDelete]
  }
  @scala.inline
  implicit class SchemaDeleteOps[Self <: SchemaDelete] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

