package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a BigQuery connector used by the job.
  */
@js.native
trait SchemaBigQueryIODetails extends js.Object {
  
  /**
    * Dataset accessed in the connection.
    */
  var dataset: js.UndefOr[String] = js.native
  
  /**
    * Project accessed in the connection.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Query used to access data in the connection.
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Table accessed in the connection.
    */
  var table: js.UndefOr[String] = js.native
}
object SchemaBigQueryIODetails {
  
  @scala.inline
  def apply(): SchemaBigQueryIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBigQueryIODetails]
  }
  
  @scala.inline
  implicit class SchemaBigQueryIODetailsOps[Self <: SchemaBigQueryIODetails] (val x: Self) extends AnyVal {
    
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
    def setDataset(value: String): Self = this.set("dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataset: Self = this.set("dataset", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTable: Self = this.set("table", js.undefined)
  }
}
