package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePhotosequencesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The filter expression. For example: `imagery_type=SPHERICAL`. The filters supported are: `imagery_type`, `processing_state`, `min_latitude`, `max_latitude`, `min_longitude`, `max_longitude`, and `filename_query`. See https://google.aip.dev/160 for more information. Filename queries should sent as a Phrase in order to support multple words and special characters by adding escaped quotes. Ex: filename_query="example of a phrase.mp4"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The maximum number of photo sequences to return. `pageSize` must be non-negative. If `pageSize` is zero or is not provided, the default page size of 100 is used. The number of photo sequences returned in the response may be less than `pageSize` if the number of matches is less than `pageSize`. This is currently unimplemented but is in process.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The nextPageToken value returned from a previous ListPhotoSequences request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePhotosequencesList {
  
  inline def apply(): ParamsResourcePhotosequencesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePhotosequencesList]
  }
  
  extension [Self <: ParamsResourcePhotosequencesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
