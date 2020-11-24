package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaCorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorpusQuery]
  }
  
  @scala.inline
  implicit class SchemaCorpusQueryOps[Self <: SchemaCorpusQuery] (val x: Self) extends AnyVal {
    
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
    def setDriveQuery(value: SchemaHeldDriveQuery): Self = this.set("driveQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveQuery: Self = this.set("driveQuery", js.undefined)
    
    @scala.inline
    def setGroupsQuery(value: SchemaHeldGroupsQuery): Self = this.set("groupsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupsQuery: Self = this.set("groupsQuery", js.undefined)
    
    @scala.inline
    def setHangoutsChatQuery(value: SchemaHeldHangoutsChatQuery): Self = this.set("hangoutsChatQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutsChatQuery: Self = this.set("hangoutsChatQuery", js.undefined)
    
    @scala.inline
    def setMailQuery(value: SchemaHeldMailQuery): Self = this.set("mailQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailQuery: Self = this.set("mailQuery", js.undefined)
  }
}
