package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaterializedViewDefinition extends StObject {
  
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
  implicit class MaterializedViewDefinitionMutableBuilder[Self <: MaterializedViewDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableRefresh(value: Boolean): Self = StObject.set(x, "enableRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRefreshUndefined: Self = StObject.set(x, "enableRefresh", js.undefined)
    
    @scala.inline
    def setLastRefreshTime(value: String): Self = StObject.set(x, "lastRefreshTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRefreshTimeUndefined: Self = StObject.set(x, "lastRefreshTime", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRefreshIntervalMs(value: String): Self = StObject.set(x, "refreshIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshIntervalMsUndefined: Self = StObject.set(x, "refreshIntervalMs", js.undefined)
  }
}
