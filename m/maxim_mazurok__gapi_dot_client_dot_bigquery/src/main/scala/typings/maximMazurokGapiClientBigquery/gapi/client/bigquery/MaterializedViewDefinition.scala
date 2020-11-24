package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterializedViewDefinition extends js.Object {
  
  /** [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true". */
  var enableRefresh: js.UndefOr[Boolean] = js.native
  
  /** [Output-only] [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch. */
  var lastRefreshTime: js.UndefOr[String] = js.native
  
  /** [Required] A query whose result is persisted. */
  var query: js.UndefOr[String] = js.native
  
  /** [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes). */
  var refreshIntervalMs: js.UndefOr[String] = js.native
}
object MaterializedViewDefinition {
  
  @scala.inline
  def apply(): MaterializedViewDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaterializedViewDefinition]
  }
  
  @scala.inline
  implicit class MaterializedViewDefinitionOps[Self <: MaterializedViewDefinition] (val x: Self) extends AnyVal {
    
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
    def setEnableRefresh(value: Boolean): Self = this.set("enableRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRefresh: Self = this.set("enableRefresh", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = this.set("lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastRefreshTime: Self = this.set("lastRefreshTime", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRefreshIntervalMs(value: String): Self = this.set("refreshIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshIntervalMs: Self = this.set("refreshIntervalMs", js.undefined)
  }
}
