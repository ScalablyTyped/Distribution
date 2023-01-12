package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryCountByStatus extends StObject {
  
  var count: js.UndefOr[String] = js.undefined
  
  /** This represents the http status code. */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object QueryCountByStatus {
  
  inline def apply(): QueryCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCountByStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryCountByStatus] (val x: Self) extends AnyVal {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
