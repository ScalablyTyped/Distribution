package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of the saved query.
  */
@js.native
trait SchemaSavedQuery extends js.Object {
  
  /**
    * Output only. The server generated timestamp at which saved query was
    * created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Name of the saved query.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. The matter id of the associated matter. The server does not
    * look at this field during create and always uses matter id in the URL.
    */
  var matterId: js.UndefOr[String] = js.native
  
  /**
    * The underlying Query object which contains all the information of the
    * saved query.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  
  /**
    * A unique identifier for the saved query.
    */
  var savedQueryId: js.UndefOr[String] = js.native
}
object SchemaSavedQuery {
  
  @scala.inline
  def apply(): SchemaSavedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSavedQuery]
  }
  
  @scala.inline
  implicit class SchemaSavedQueryOps[Self <: SchemaSavedQuery] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = this.set("matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatterId: Self = this.set("matterId", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSavedQueryId(value: String): Self = this.set("savedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavedQueryId: Self = this.set("savedQueryId", js.undefined)
  }
}
