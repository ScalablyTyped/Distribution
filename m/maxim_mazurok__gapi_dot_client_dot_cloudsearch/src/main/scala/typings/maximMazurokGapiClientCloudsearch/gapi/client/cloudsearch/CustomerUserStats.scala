package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerUserStats extends StObject {
  
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
  implicit class CustomerUserStatsMutableBuilder[Self <: CustomerUserStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setOneDayActiveUsersCount(value: String): Self = StObject.set(x, "oneDayActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneDayActiveUsersCountUndefined: Self = StObject.set(x, "oneDayActiveUsersCount", js.undefined)
    
    @scala.inline
    def setSevenDaysActiveUsersCount(value: String): Self = StObject.set(x, "sevenDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSevenDaysActiveUsersCountUndefined: Self = StObject.set(x, "sevenDaysActiveUsersCount", js.undefined)
    
    @scala.inline
    def setThirtyDaysActiveUsersCount(value: String): Self = StObject.set(x, "thirtyDaysActiveUsersCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThirtyDaysActiveUsersCountUndefined: Self = StObject.set(x, "thirtyDaysActiveUsersCount", js.undefined)
  }
}
