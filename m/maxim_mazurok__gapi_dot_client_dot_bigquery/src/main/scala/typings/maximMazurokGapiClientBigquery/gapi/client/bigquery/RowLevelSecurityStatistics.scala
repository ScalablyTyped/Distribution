package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowLevelSecurityStatistics extends StObject {
  
  /** [Output-only] [Preview] Whether any accessed data was protected by row access policies. */
  var rowLevelSecurityApplied: js.UndefOr[Boolean] = js.native
}
object RowLevelSecurityStatistics {
  
  @scala.inline
  def apply(): RowLevelSecurityStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowLevelSecurityStatistics]
  }
  
  @scala.inline
  implicit class RowLevelSecurityStatisticsMutableBuilder[Self <: RowLevelSecurityStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowLevelSecurityApplied(value: Boolean): Self = StObject.set(x, "rowLevelSecurityApplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLevelSecurityAppliedUndefined: Self = StObject.set(x, "rowLevelSecurityApplied", js.undefined)
  }
}
