package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerIndexStats extends StObject {
  
  /** Date for which statistics were calculated. */
  var date: js.UndefOr[Date] = js.undefined
  
  /** Number of items aggregrated by status code. */
  var itemCountByStatus: js.UndefOr[js.Array[ItemCountByStatus]] = js.undefined
}
object CustomerIndexStats {
  
  @scala.inline
  def apply(): CustomerIndexStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerIndexStats]
  }
  
  @scala.inline
  implicit class CustomerIndexStatsMutableBuilder[Self <: CustomerIndexStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setItemCountByStatus(value: js.Array[ItemCountByStatus]): Self = StObject.set(x, "itemCountByStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountByStatusUndefined: Self = StObject.set(x, "itemCountByStatus", js.undefined)
    
    @scala.inline
    def setItemCountByStatusVarargs(value: ItemCountByStatus*): Self = StObject.set(x, "itemCountByStatus", js.Array(value :_*))
  }
}
