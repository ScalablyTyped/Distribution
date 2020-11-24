package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Targets being watched have changed.
  */
@js.native
trait SchemaTargetChange extends js.Object {
  
  /**
    * The error that resulted in this change, if applicable.
    */
  var cause: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * The consistent `read_time` for the given `target_ids` (omitted when the
    * target_ids are not at a consistent snapshot).  The stream is guaranteed
    * to send a `read_time` with `target_ids` empty whenever the entire stream
    * reaches a new consistent snapshot. ADD, CURRENT, and RESET messages are
    * guaranteed to (eventually) result in a new consistent snapshot (while
    * NO_CHANGE and REMOVE messages are not).  For a given stream, `read_time`
    * is guaranteed to be monotonically increasing.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * A token that can be used to resume the stream for the given `target_ids`,
    * or all targets if `target_ids` is empty.  Not set on every target change.
    */
  var resumeToken: js.UndefOr[String] = js.native
  
  /**
    * The type of change that occurred.
    */
  var targetChangeType: js.UndefOr[String] = js.native
  
  /**
    * The target IDs of targets that have changed.  If empty, the change
    * applies to all targets.  For `target_change_type=ADD`, the order of the
    * target IDs matches the order of the requests to add the targets. This
    * allows clients to unambiguously associate server-assigned target IDs with
    * added targets.  For other states, the order of the target IDs is not
    * defined.
    */
  var targetIds: js.UndefOr[js.Array[Double]] = js.native
}
object SchemaTargetChange {
  
  @scala.inline
  def apply(): SchemaTargetChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetChange]
  }
  
  @scala.inline
  implicit class SchemaTargetChangeOps[Self <: SchemaTargetChange] (val x: Self) extends AnyVal {
    
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
    def setCause(value: SchemaStatus): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    
    @scala.inline
    def setResumeToken(value: String): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeToken: Self = this.set("resumeToken", js.undefined)
    
    @scala.inline
    def setTargetChangeType(value: String): Self = this.set("targetChangeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetChangeType: Self = this.set("targetChangeType", js.undefined)
    
    @scala.inline
    def setTargetIdsVarargs(value: Double*): Self = this.set("targetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: js.Array[Double]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIds: Self = this.set("targetIds", js.undefined)
  }
}
