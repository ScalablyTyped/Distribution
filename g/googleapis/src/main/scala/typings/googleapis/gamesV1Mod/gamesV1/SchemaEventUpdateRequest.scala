package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventUpdateRequest extends js.Object {
  /**
    * The ID of the event being modified in this update.
    */
  var definitionId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of times this event occurred in this time period.
    */
  var updateCount: js.UndefOr[String] = js.native
}

object SchemaEventUpdateRequest {
  @scala.inline
  def apply(): SchemaEventUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventUpdateRequest]
  }
  @scala.inline
  implicit class SchemaEventUpdateRequestOps[Self <: SchemaEventUpdateRequest] (val x: Self) extends AnyVal {
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
    def setDefinitionId(value: String): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitionId: Self = this.set("definitionId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUpdateCount(value: String): Self = this.set("updateCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateCount: Self = this.set("updateCount", js.undefined)
  }
  
}

