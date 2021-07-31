package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `ListCrawledUrls` method.
  */
trait SchemaListCrawledUrlsResponse extends StObject {
  
  /**
    * The list of CrawledUrls returned.
    */
  var crawledUrls: js.UndefOr[js.Array[SchemaCrawledUrl]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCrawledUrlsResponse {
  
  @scala.inline
  def apply(): SchemaListCrawledUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCrawledUrlsResponse]
  }
  
  @scala.inline
  implicit class SchemaListCrawledUrlsResponseMutableBuilder[Self <: SchemaListCrawledUrlsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawledUrls(value: js.Array[SchemaCrawledUrl]): Self = StObject.set(x, "crawledUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawledUrlsUndefined: Self = StObject.set(x, "crawledUrls", js.undefined)
    
    @scala.inline
    def setCrawledUrlsVarargs(value: SchemaCrawledUrl*): Self = StObject.set(x, "crawledUrls", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
