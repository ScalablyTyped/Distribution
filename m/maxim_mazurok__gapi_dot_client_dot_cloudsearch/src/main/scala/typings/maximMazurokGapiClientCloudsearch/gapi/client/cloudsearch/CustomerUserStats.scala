package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerUserStats extends js.Object {
  
  /** Date for which session stats were calculated. Stats calculated on the next day close to midnight are returned. */
  var date: js.UndefOr[Date] = js.native
  
  /** The count of unique active users in the past one day */
  var oneDayActiveUsersCount: js.UndefOr[String] = js.native
  
  /** The count of unique active users in the past seven days */
  var sevenDaysActiveUsersCount: js.UndefOr[String] = js.native
  
  /** The count of unique active users in the past thirty days */
  var thirtyDaysActiveUsersCount: js.UndefOr[String] = js.native
}
object CustomerUserStats {
  
  @scala.inline
  def apply(): CustomerUserStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerUserStats]
  }
  
  @scala.inline
  implicit class CustomerUserStatsOps[Self <: CustomerUserStats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setOneDayActiveUsersCount(value: String): Self = this.set("oneDayActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneDayActiveUsersCount: Self = this.set("oneDayActiveUsersCount", js.undefined)
    
    @scala.inline
    def setSevenDaysActiveUsersCount(value: String): Self = this.set("sevenDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSevenDaysActiveUsersCount: Self = this.set("sevenDaysActiveUsersCount", js.undefined)
    
    @scala.inline
    def setThirtyDaysActiveUsersCount(value: String): Self = this.set("thirtyDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirtyDaysActiveUsersCount: Self = this.set("thirtyDaysActiveUsersCount", js.undefined)
  }
}
