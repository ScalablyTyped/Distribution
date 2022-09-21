package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCrawledUrlsResponse extends StObject {
  
  /**
    * The list of CrawledUrls returned.
    */
  var crawledUrls: js.UndefOr[js.Array[SchemaCrawledUrl]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCrawledUrlsResponse {
  
  inline def apply(): SchemaListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCrawledUrlsResponse]
  }
  
  extension [Self <: SchemaListCrawledUrlsResponse](x: Self) {
    
    inline def setCrawledUrls(value: js.Array[SchemaCrawledUrl]): Self = StObject.set(x, "crawledUrls", value.asInstanceOf[js.Any])
    
    inline def setCrawledUrlsUndefined: Self = StObject.set(x, "crawledUrls", js.undefined)
    
    inline def setCrawledUrlsVarargs(value: SchemaCrawledUrl*): Self = StObject.set(x, "crawledUrls", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
