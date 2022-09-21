package typings.maximMazurokGapiClientCustomsearch

import org.scalablytyped.runtime.TopLevel
import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientCustomsearch.anon.Accesstoken
import typings.maximMazurokGapiClientCustomsearch.anon.ByteSize
import typings.maximMazurokGapiClientCustomsearch.anon.CorrectedQuery
import typings.maximMazurokGapiClientCustomsearch.anon.DisplayName
import typings.maximMazurokGapiClientCustomsearch.anon.FormattedSearchTime
import typings.maximMazurokGapiClientCustomsearch.anon.Height
import typings.maximMazurokGapiClientCustomsearch.anon.HtmlTitle
import typings.maximMazurokGapiClientCustomsearch.anon.NextPage
import typings.maximMazurokGapiClientCustomsearch.anon.Template
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object customsearch {
      
      @js.native
      trait CseResource extends StObject {
        
        /** Returns metadata about the search performed, metadata about the engine used for the search, and the search results. */
        def list(): Request[Search] = js.native
        def list(request: Accesstoken): Request[Search] = js.native
        
        var siterestrict: SiterestrictResource = js.native
      }
      
      trait Promotion extends StObject {
        
        /** An array of block objects for this promotion. */
        var bodyLines: js.UndefOr[js.Array[HtmlTitle]] = js.undefined
        
        /** An abridged version of this search's result URL, e.g. www.example.com. */
        var displayLink: js.UndefOr[String] = js.undefined
        
        /** The title of the promotion, in HTML. */
        var htmlTitle: js.UndefOr[String] = js.undefined
        
        /** Image belonging to a promotion. */
        var image: js.UndefOr[Height] = js.undefined
        
        /** The URL of the promotion. */
        var link: js.UndefOr[String] = js.undefined
        
        /** The title of the promotion. */
        var title: js.UndefOr[String] = js.undefined
      }
      object Promotion {
        
        inline def apply(): Promotion = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Promotion]
        }
        
        extension [Self <: Promotion](x: Self) {
          
          inline def setBodyLines(value: js.Array[HtmlTitle]): Self = StObject.set(x, "bodyLines", value.asInstanceOf[js.Any])
          
          inline def setBodyLinesUndefined: Self = StObject.set(x, "bodyLines", js.undefined)
          
          inline def setBodyLinesVarargs(value: HtmlTitle*): Self = StObject.set(x, "bodyLines", js.Array(value*))
          
          inline def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
          
          inline def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
          
          inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
          
          inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
          
          inline def setImage(value: Height): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
          
          inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      trait Result extends StObject {
        
        /** Indicates the ID of Google's cached version of the search result. */
        var cacheId: js.UndefOr[String] = js.undefined
        
        /** An abridged version of this search result’s URL, e.g. www.example.com. */
        var displayLink: js.UndefOr[String] = js.undefined
        
        /** The file format of the search result. */
        var fileFormat: js.UndefOr[String] = js.undefined
        
        /** The URL displayed after the snippet for each search result. */
        var formattedUrl: js.UndefOr[String] = js.undefined
        
        /** The HTML-formatted URL displayed after the snippet for each search result. */
        var htmlFormattedUrl: js.UndefOr[String] = js.undefined
        
        /** The snippet of the search result, in HTML. */
        var htmlSnippet: js.UndefOr[String] = js.undefined
        
        /** The title of the search result, in HTML. */
        var htmlTitle: js.UndefOr[String] = js.undefined
        
        /** Image belonging to a custom search result. */
        var image: js.UndefOr[ByteSize] = js.undefined
        
        /** A unique identifier for the type of current object. For this API, it is `customsearch#result.` */
        var kind: js.UndefOr[String] = js.undefined
        
        /** Encapsulates all information about refinement labels. */
        var labels: js.UndefOr[js.Array[DisplayName]] = js.undefined
        
        /** The full URL to which the search result is pointing, e.g. http://www.example.com/foo/bar. */
        var link: js.UndefOr[String] = js.undefined
        
        /** The MIME type of the search result. */
        var mime: js.UndefOr[String] = js.undefined
        
        /** Contains [PageMap](https://developers.google.com/custom-search/docs/structured_data#pagemaps) information for this search result. */
        var pagemap: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Result & TopLevel[Any]
              ] = js.undefined
        
        /** The snippet of the search result, in plain text. */
        var snippet: js.UndefOr[String] = js.undefined
        
        /** The title of the search result, in plain text. */
        var title: js.UndefOr[String] = js.undefined
      }
      object Result {
        
        inline def apply(): Result = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Result]
        }
        
        extension [Self <: Result](x: Self) {
          
          inline def setCacheId(value: String): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
          
          inline def setCacheIdUndefined: Self = StObject.set(x, "cacheId", js.undefined)
          
          inline def setDisplayLink(value: String): Self = StObject.set(x, "displayLink", value.asInstanceOf[js.Any])
          
          inline def setDisplayLinkUndefined: Self = StObject.set(x, "displayLink", js.undefined)
          
          inline def setFileFormat(value: String): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
          
          inline def setFileFormatUndefined: Self = StObject.set(x, "fileFormat", js.undefined)
          
          inline def setFormattedUrl(value: String): Self = StObject.set(x, "formattedUrl", value.asInstanceOf[js.Any])
          
          inline def setFormattedUrlUndefined: Self = StObject.set(x, "formattedUrl", js.undefined)
          
          inline def setHtmlFormattedUrl(value: String): Self = StObject.set(x, "htmlFormattedUrl", value.asInstanceOf[js.Any])
          
          inline def setHtmlFormattedUrlUndefined: Self = StObject.set(x, "htmlFormattedUrl", js.undefined)
          
          inline def setHtmlSnippet(value: String): Self = StObject.set(x, "htmlSnippet", value.asInstanceOf[js.Any])
          
          inline def setHtmlSnippetUndefined: Self = StObject.set(x, "htmlSnippet", js.undefined)
          
          inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
          
          inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
          
          inline def setImage(value: ByteSize): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
          
          inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setLabels(value: js.Array[DisplayName]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          inline def setLabelsVarargs(value: DisplayName*): Self = StObject.set(x, "labels", js.Array(value*))
          
          inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
          
          inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
          
          inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
          
          inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
          
          inline def setPagemap(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Result & TopLevel[Any]
          ): Self = StObject.set(x, "pagemap", value.asInstanceOf[js.Any])
          
          inline def setPagemapUndefined: Self = StObject.set(x, "pagemap", js.undefined)
          
          inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
          
          inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      trait Search extends StObject {
        
        /**
          * Metadata and refinements associated with the given search engine, including: * The name of the search engine that was used for the query. * A set of [facet
          * objects](https://developers.google.com/custom-search/docs/refinements#create) (refinements) you can use for refining a search.
          */
        var context: js.UndefOr[
                /* import warning: importer.ImportType#apply c Unsupported type mapping: 
        {[ P in string ]: any}
          */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Search & TopLevel[Any]
              ] = js.undefined
        
        /** The current set of custom search results. */
        var items: js.UndefOr[js.Array[Result]] = js.undefined
        
        /** Unique identifier for the type of current object. For this API, it is customsearch#search. */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * The set of [promotions](https://developers.google.com/custom-search/docs/promotions). Present only if the custom search engine's configuration files define any promotions for the
          * given query.
          */
        var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
        
        /** Query metadata for the previous, current, and next pages of results. */
        var queries: js.UndefOr[NextPage] = js.undefined
        
        /** Metadata about a search operation. */
        var searchInformation: js.UndefOr[FormattedSearchTime] = js.undefined
        
        /** Spell correction information for a query. */
        var spelling: js.UndefOr[CorrectedQuery] = js.undefined
        
        /** OpenSearch template and URL. */
        var url: js.UndefOr[Template] = js.undefined
      }
      object Search {
        
        inline def apply(): Search = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Search]
        }
        
        extension [Self <: Search](x: Self) {
          
          inline def setContext(
            value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
          {[ P in string ]: any}
            */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Search & TopLevel[Any]
          ): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
          
          inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
          
          inline def setItems(value: js.Array[Result]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: Result*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
          
          inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
          
          inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
          
          inline def setQueries(value: NextPage): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
          
          inline def setQueriesUndefined: Self = StObject.set(x, "queries", js.undefined)
          
          inline def setSearchInformation(value: FormattedSearchTime): Self = StObject.set(x, "searchInformation", value.asInstanceOf[js.Any])
          
          inline def setSearchInformationUndefined: Self = StObject.set(x, "searchInformation", js.undefined)
          
          inline def setSpelling(value: CorrectedQuery): Self = StObject.set(x, "spelling", value.asInstanceOf[js.Any])
          
          inline def setSpellingUndefined: Self = StObject.set(x, "spelling", js.undefined)
          
          inline def setUrl(value: Template): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
        }
      }
      
      @js.native
      trait SiterestrictResource extends StObject {
        
        /** Returns metadata about the search performed, metadata about the engine used for the search, and the search results. Uses a small set of url patterns. */
        def list(): Request[Search] = js.native
        def list(request: Accesstoken): Request[Search] = js.native
      }
    }
  }
}
