package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Paging details for lists of resources, including total number of items
  * available and number of resources returned in a single page.
  */
@js.native
trait SchemaPageInfo extends StObject {
  
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double] = js.native
}
object SchemaPageInfo {
  
  @scala.inline
  def apply(): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageInfo]
  }
  
  @scala.inline
  implicit class SchemaPageInfoMutableBuilder[Self <: SchemaPageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultsPerPage(value: Double): Self = StObject.set(x, "resultsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsPerPageUndefined: Self = StObject.set(x, "resultsPerPage", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
