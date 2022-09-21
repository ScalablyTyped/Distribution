package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollDataSourcesRequest extends StObject {
  
  /** Data sources that are enrolled. It is required to provide at least one data source id. */
  var dataSourceIds: js.UndefOr[js.Array[String]] = js.undefined
}
object EnrollDataSourcesRequest {
  
  inline def apply(): EnrollDataSourcesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollDataSourcesRequest]
  }
  
  extension [Self <: EnrollDataSourcesRequest](x: Self) {
    
    inline def setDataSourceIds(value: js.Array[String]): Self = StObject.set(x, "dataSourceIds", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdsUndefined: Self = StObject.set(x, "dataSourceIds", js.undefined)
    
    inline def setDataSourceIdsVarargs(value: String*): Self = StObject.set(x, "dataSourceIds", js.Array(value*))
  }
}
