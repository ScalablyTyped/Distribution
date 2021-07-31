package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountStatusProducts extends StObject {
  
  /** The channel the data applies to. Acceptable values are: - "`local`" - "`online`" */
  var channel: js.UndefOr[String] = js.undefined
  
  /** The country the data applies to. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The destination the data applies to. */
  var destination: js.UndefOr[String] = js.undefined
  
  /** List of item-level issues. */
  var itemLevelIssues: js.UndefOr[js.Array[AccountStatusItemLevelIssue]] = js.undefined
  
  /** Aggregated product statistics. */
  var statistics: js.UndefOr[AccountStatusStatistics] = js.undefined
}
object AccountStatusProducts {
  
  @scala.inline
  def apply(): AccountStatusProducts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusProducts]
  }
  
  @scala.inline
  implicit class AccountStatusProductsMutableBuilder[Self <: AccountStatusProducts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setItemLevelIssues(value: js.Array[AccountStatusItemLevelIssue]): Self = StObject.set(x, "itemLevelIssues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemLevelIssuesUndefined: Self = StObject.set(x, "itemLevelIssues", js.undefined)
    
    @scala.inline
    def setItemLevelIssuesVarargs(value: AccountStatusItemLevelIssue*): Self = StObject.set(x, "itemLevelIssues", js.Array(value :_*))
    
    @scala.inline
    def setStatistics(value: AccountStatusStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
