package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corpus specific queries.
  */
trait SchemaCorpusQuery extends StObject {
  
  /**
    * Details pertaining to Drive holds. If set, corpus must be Drive.
    */
  var driveQuery: js.UndefOr[SchemaHeldDriveQuery] = js.undefined
  
  /**
    * Details pertaining to Groups holds. If set, corpus must be Groups.
    */
  var groupsQuery: js.UndefOr[SchemaHeldGroupsQuery] = js.undefined
  
  /**
    * Details pertaining to Hangouts Chat holds. If set, corpus must be
    * Hangouts Chat.
    */
  var hangoutsChatQuery: js.UndefOr[SchemaHeldHangoutsChatQuery] = js.undefined
  
  /**
    * Details pertaining to mail holds. If set, corpus must be mail.
    */
  var mailQuery: js.UndefOr[SchemaHeldMailQuery] = js.undefined
}
object SchemaCorpusQuery {
  
  @scala.inline
  def apply(): SchemaCorpusQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCorpusQuery]
  }
  
  @scala.inline
  implicit class SchemaCorpusQueryMutableBuilder[Self <: SchemaCorpusQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveQuery(value: SchemaHeldDriveQuery): Self = StObject.set(x, "driveQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveQueryUndefined: Self = StObject.set(x, "driveQuery", js.undefined)
    
    @scala.inline
    def setGroupsQuery(value: SchemaHeldGroupsQuery): Self = StObject.set(x, "groupsQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsQueryUndefined: Self = StObject.set(x, "groupsQuery", js.undefined)
    
    @scala.inline
    def setHangoutsChatQuery(value: SchemaHeldHangoutsChatQuery): Self = StObject.set(x, "hangoutsChatQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutsChatQueryUndefined: Self = StObject.set(x, "hangoutsChatQuery", js.undefined)
    
    @scala.inline
    def setMailQuery(value: SchemaHeldMailQuery): Self = StObject.set(x, "mailQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailQueryUndefined: Self = StObject.set(x, "mailQuery", js.undefined)
  }
}
