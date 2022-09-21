package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCaseclassificationsSearch
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of cases fetched with each request.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying the page of results to return. If unspecified, the first page is retrieved.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An expression written in the Cloud filter language. If non-empty, then only cases whose fields match the filter are returned. If empty, then no messages are filtered out.
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceCaseclassificationsSearch {
  
  inline def apply(): ParamsResourceCaseclassificationsSearch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCaseclassificationsSearch]
  }
  
  extension [Self <: ParamsResourceCaseclassificationsSearch](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
