package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryCountByStatus extends StObject {
  
  var count: js.UndefOr[String] = js.native
  
  /** This represents the http status code. */
  var statusCode: js.UndefOr[Double] = js.native
}
object QueryCountByStatus {
  
  @scala.inline
  def apply(): QueryCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCountByStatus]
  }
  
  @scala.inline
  implicit class QueryCountByStatusMutableBuilder[Self <: QueryCountByStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
