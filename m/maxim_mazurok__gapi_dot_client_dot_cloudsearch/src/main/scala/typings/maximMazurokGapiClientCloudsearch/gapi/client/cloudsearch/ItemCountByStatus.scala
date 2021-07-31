package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCountByStatus extends StObject {
  
  /** Number of items matching the status code. */
  var count: js.UndefOr[String] = js.undefined
  
  /** Status of the items. */
  var statusCode: js.UndefOr[String] = js.undefined
}
object ItemCountByStatus {
  
  @scala.inline
  def apply(): ItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCountByStatus]
  }
  
  @scala.inline
  implicit class ItemCountByStatusMutableBuilder[Self <: ItemCountByStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
