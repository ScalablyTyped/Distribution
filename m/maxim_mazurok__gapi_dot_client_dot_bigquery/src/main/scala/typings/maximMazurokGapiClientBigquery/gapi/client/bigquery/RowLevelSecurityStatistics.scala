package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowLevelSecurityStatistics extends js.Object {
  
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
  implicit class RowLevelSecurityStatisticsOps[Self <: RowLevelSecurityStatistics] (val x: Self) extends AnyVal {
    
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
    def setRowLevelSecurityApplied(value: Boolean): Self = this.set("rowLevelSecurityApplied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLevelSecurityApplied: Self = this.set("rowLevelSecurityApplied", js.undefined)
  }
}
