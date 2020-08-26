package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an event period update resource.
  */
@js.native
trait SchemaEventUpdateResponse extends js.Object {
  /**
    * Any batch-wide failures which occurred applying updates.
    */
  var batchFailures: js.UndefOr[js.Array[SchemaEventBatchRecordFailure]] = js.native
  /**
    * Any failures updating a particular event.
    */
  var eventFailures: js.UndefOr[js.Array[SchemaEventRecordFailure]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#eventUpdateResponse.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The current status of any updated events
    */
  var playerEvents: js.UndefOr[js.Array[SchemaPlayerEvent]] = js.native
}

object SchemaEventUpdateResponse {
  @scala.inline
  def apply(): SchemaEventUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventUpdateResponse]
  }
  @scala.inline
  implicit class SchemaEventUpdateResponseOps[Self <: SchemaEventUpdateResponse] (val x: Self) extends AnyVal {
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
    def setBatchFailuresVarargs(value: SchemaEventBatchRecordFailure*): Self = this.set("batchFailures", js.Array(value :_*))
    @scala.inline
    def setBatchFailures(value: js.Array[SchemaEventBatchRecordFailure]): Self = this.set("batchFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchFailures: Self = this.set("batchFailures", js.undefined)
    @scala.inline
    def setEventFailuresVarargs(value: SchemaEventRecordFailure*): Self = this.set("eventFailures", js.Array(value :_*))
    @scala.inline
    def setEventFailures(value: js.Array[SchemaEventRecordFailure]): Self = this.set("eventFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventFailures: Self = this.set("eventFailures", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPlayerEventsVarargs(value: SchemaPlayerEvent*): Self = this.set("playerEvents", js.Array(value :_*))
    @scala.inline
    def setPlayerEvents(value: js.Array[SchemaPlayerEvent]): Self = this.set("playerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerEvents: Self = this.set("playerEvents", js.undefined)
  }
  
}

