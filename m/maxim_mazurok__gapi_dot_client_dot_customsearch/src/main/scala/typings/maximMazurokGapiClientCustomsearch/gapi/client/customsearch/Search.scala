package typings.maximMazurokGapiClientCustomsearch.gapi.client.customsearch

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientCustomsearch.anon.CorrectedQuery
import typings.maximMazurokGapiClientCustomsearch.anon.FormattedSearchTime
import typings.maximMazurokGapiClientCustomsearch.anon.NextPage
import typings.maximMazurokGapiClientCustomsearch.anon.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  /**
    * Metadata and refinements associated with the given search engine, including: * The name of the search engine that was used for the query. * A set of [facet
    * objects](https://developers.google.com/custom-search/docs/refinements#create) (refinements) you can use for refining a search.
    */
  var context: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Search with TopLevel[js.Any]
  ] = js.native
  
  /** The current set of custom search results. */
  var items: js.UndefOr[js.Array[Result]] = js.native
  
  /** Unique identifier for the type of current object. For this API, it is customsearch#search. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The set of [promotions](https://developers.google.com/custom-search/docs/promotions). Present only if the custom search engine's configuration files define any promotions for the
    * given query.
    */
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  
  /** Query metadata for the previous, current, and next pages of results. */
  var queries: js.UndefOr[NextPage] = js.native
  
  /** Metadata about a search operation. */
  var searchInformation: js.UndefOr[FormattedSearchTime] = js.native
  
  /** Spell correction information for a query. */
  var spelling: js.UndefOr[CorrectedQuery] = js.native
  
  /** OpenSearch template and URL. */
  var url: js.UndefOr[Template] = js.native
}
object Search {
  
  @scala.inline
  def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientCustomsearch.maximMazurokGapiClientCustomsearchStrings.Search with TopLevel[js.Any]
    ): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Result*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Result]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setQueries(value: NextPage): Self = this.set("queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    
    @scala.inline
    def setSearchInformation(value: FormattedSearchTime): Self = this.set("searchInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchInformation: Self = this.set("searchInformation", js.undefined)
    
    @scala.inline
    def setSpelling(value: CorrectedQuery): Self = this.set("spelling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpelling: Self = this.set("spelling", js.undefined)
    
    @scala.inline
    def setUrl(value: Template): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
