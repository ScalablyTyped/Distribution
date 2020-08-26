package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a turn-based match creation request.
  */
@js.native
trait SchemaTurnBasedMatchCreateRequest extends js.Object {
  /**
    * Criteria for auto-matching players into this match.
    */
  var autoMatchingCriteria: js.UndefOr[SchemaTurnBasedAutoMatchingCriteria] = js.native
  /**
    * The player ids to invite to the match.
    */
  var invitedPlayerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#turnBasedMatchCreateRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A randomly generated numeric ID. This number is used at the server to
    * ensure that the request is handled correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The variant / mode of the application to be played. This can be any
    * integer value, or left blank. You should use a small number of variants
    * to keep the auto-matching pool as large as possible.
    */
  var variant: js.UndefOr[Double] = js.native
}

object SchemaTurnBasedMatchCreateRequest {
  @scala.inline
  def apply(): SchemaTurnBasedMatchCreateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTurnBasedMatchCreateRequest]
  }
  @scala.inline
  implicit class SchemaTurnBasedMatchCreateRequestOps[Self <: SchemaTurnBasedMatchCreateRequest] (val x: Self) extends AnyVal {
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
    def setAutoMatchingCriteria(value: SchemaTurnBasedAutoMatchingCriteria): Self = this.set("autoMatchingCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMatchingCriteria: Self = this.set("autoMatchingCriteria", js.undefined)
    @scala.inline
    def setInvitedPlayerIdsVarargs(value: String*): Self = this.set("invitedPlayerIds", js.Array(value :_*))
    @scala.inline
    def setInvitedPlayerIds(value: js.Array[String]): Self = this.set("invitedPlayerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedPlayerIds: Self = this.set("invitedPlayerIds", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    @scala.inline
    def setVariant(value: Double): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

