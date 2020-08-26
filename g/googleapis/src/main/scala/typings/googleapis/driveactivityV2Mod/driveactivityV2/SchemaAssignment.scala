package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A comment with an assignment.
  */
@js.native
trait SchemaAssignment extends js.Object {
  /**
    * The sub-type of this event.
    */
  var subtype: js.UndefOr[String] = js.native
}

object SchemaAssignment {
  @scala.inline
  def apply(): SchemaAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAssignment]
  }
  @scala.inline
  implicit class SchemaAssignmentOps[Self <: SchemaAssignment] (val x: Self) extends AnyVal {
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
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
  }
  
}

