package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Corpus specific queries.
  */
@js.native
trait SchemaCorpusQuery extends js.Object {
  /**
    * Details pertaining to Drive holds. If set, corpus must be Drive.
    */
  var driveQuery: js.UndefOr[SchemaHeldDriveQuery] = js.native
  /**
    * Details pertaining to Groups holds. If set, corpus must be Groups.
    */
  var groupsQuery: js.UndefOr[SchemaHeldGroupsQuery] = js.native
  /**
    * Details pertaining to Hangouts Chat holds. If set, corpus must be
    * Hangouts Chat.
    */
  var hangoutsChatQuery: js.UndefOr[SchemaHeldHangoutsChatQuery] = js.native
  /**
    * Details pertaining to mail holds. If set, corpus must be mail.
    */
  var mailQuery: js.UndefOr[SchemaHeldMailQuery] = js.native
}

object SchemaCorpusQuery {
  @scala.inline
  def apply(
    driveQuery: SchemaHeldDriveQuery = null,
    groupsQuery: SchemaHeldGroupsQuery = null,
    hangoutsChatQuery: SchemaHeldHangoutsChatQuery = null,
    mailQuery: SchemaHeldMailQuery = null
  ): SchemaCorpusQuery = {
    val __obj = js.Dynamic.literal()
    if (driveQuery != null) __obj.updateDynamic("driveQuery")(driveQuery.asInstanceOf[js.Any])
    if (groupsQuery != null) __obj.updateDynamic("groupsQuery")(groupsQuery.asInstanceOf[js.Any])
    if (hangoutsChatQuery != null) __obj.updateDynamic("hangoutsChatQuery")(hangoutsChatQuery.asInstanceOf[js.Any])
    if (mailQuery != null) __obj.updateDynamic("mailQuery")(mailQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCorpusQuery]
  }
}

