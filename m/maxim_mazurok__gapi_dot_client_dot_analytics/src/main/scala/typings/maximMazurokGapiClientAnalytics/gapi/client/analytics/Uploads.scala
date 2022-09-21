package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uploads extends StObject {
  
  /** A list of uploads. */
  var items: js.UndefOr[js.Array[Upload]] = js.undefined
  
  /**
    * The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
    * otherwise specified by the max-results query parameter.
    */
  var itemsPerPage: js.UndefOr[Double] = js.undefined
  
  /** Collection type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Link to next page for this upload collection. */
  var nextLink: js.UndefOr[String] = js.undefined
  
  /** Link to previous page for this upload collection. */
  var previousLink: js.UndefOr[String] = js.undefined
  
  /** The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /** The total number of results for the query, regardless of the number of resources in the result. */
  var totalResults: js.UndefOr[Double] = js.undefined
}
object Uploads {
  
  inline def apply(): Uploads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uploads]
  }
  
  extension [Self <: Uploads](x: Self) {
    
    inline def setItems(value: js.Array[Upload]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Upload*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextLink(value: String): Self = StObject.set(x, "nextLink", value.asInstanceOf[js.Any])
    
    inline def setNextLinkUndefined: Self = StObject.set(x, "nextLink", js.undefined)
    
    inline def setPreviousLink(value: String): Self = StObject.set(x, "previousLink", value.asInstanceOf[js.Any])
    
    inline def setPreviousLinkUndefined: Self = StObject.set(x, "previousLink", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTotalResults(value: Double): Self = StObject.set(x, "totalResults", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsUndefined: Self = StObject.set(x, "totalResults", js.undefined)
  }
}
