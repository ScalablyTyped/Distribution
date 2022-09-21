package typings.itemsjs

import typings.itemsjs.anon.Data
import typings.itemsjs.anon.DataPagination
import typings.itemsjs.itemsjsStrings.count
import typings.itemsjs.itemsjsStrings.term
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Main itemsjs function
    * @param items The items to index
    * @param configuration itemsjs
    * @template I The type of items being indexed
    */
  inline def apply[I /* <: js.Object */, S /* <: String */, A /* <: String */](items: js.Array[I]): ItemsJs[I, S, A] = ^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any]).asInstanceOf[ItemsJs[I, S, A]]
  inline def apply[I /* <: js.Object */, S /* <: String */, A /* <: String */](items: js.Array[I], configuration: Configuration[I, S, A]): ItemsJs[I, S, A] = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[ItemsJs[I, S, A]]
  
  @JSImport("itemsjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Aggregation extends StObject {
    
    var conjunction: js.UndefOr[Boolean] = js.undefined
    
    /** @default 'asc' */
    var order: js.UndefOr[Order] = js.undefined
    
    /** @default false */
    var show_facet_stats: js.UndefOr[Boolean] = js.undefined
    
    /** @default 10 */
    var size: js.UndefOr[Double] = js.undefined
    
    /** @default 'count' */
    var sort: js.UndefOr[term | count] = js.undefined
    
    var title: String
  }
  object Aggregation {
    
    inline def apply(title: String): Aggregation = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregation]
    }
    
    extension [Self <: Aggregation](x: Self) {
      
      inline def setConjunction(value: Boolean): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setShow_facet_stats(value: Boolean): Self = StObject.set(x, "show_facet_stats", value.asInstanceOf[js.Any])
      
      inline def setShow_facet_statsUndefined: Self = StObject.set(x, "show_facet_stats", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: term | count): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AggregationOptions[A /* <: String */] extends StObject {
    
    var conjunction: js.UndefOr[Boolean] = js.undefined
    
    var name: A
    
    /** @default 1 */
    var page: js.UndefOr[Double] = js.undefined
    
    /** @default 10 */
    var per_page: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
  }
  object AggregationOptions {
    
    inline def apply[A /* <: String */](name: A): AggregationOptions[A] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregationOptions[A]]
    }
    
    extension [Self <: AggregationOptions[?], A /* <: String */](x: Self & AggregationOptions[A]) {
      
      inline def setConjunction(value: Boolean): Self = StObject.set(x, "conjunction", value.asInstanceOf[js.Any])
      
      inline def setConjunctionUndefined: Self = StObject.set(x, "conjunction", js.undefined)
      
      inline def setName(value: A): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait Bucket[I /* <: js.Object */] extends StObject {
    
    var doc_count: Double
    
    var key: /* keyof I */ String
    
    var selected: Boolean
  }
  object Bucket {
    
    inline def apply[I /* <: js.Object */](doc_count: Double, key: /* keyof I */ String, selected: Boolean): Bucket[I] = {
      val __obj = js.Dynamic.literal(doc_count = doc_count.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bucket[I]]
    }
    
    extension [Self <: Bucket[?], I /* <: js.Object */](x: Self & Bucket[I]) {
      
      inline def setDoc_count(value: Double): Self = StObject.set(x, "doc_count", value.asInstanceOf[js.Any])
      
      inline def setKey(value: /* keyof I */ String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  type Buckets[I /* <: js.Object */] = js.Array[Bucket[I]]
  
  /** Configuration for itemsjs */
  trait Configuration[I /* <: js.Object */, S /* <: String */, A /* <: String */] extends StObject {
    
    var aggregations: js.UndefOr[Record[A, Aggregation]] = js.undefined
    
    /** @default true */
    var native_search_enabled: js.UndefOr[Boolean] = js.undefined
    
    /** @default [] */
    var searchableFields: js.UndefOr[js.Array[/* keyof I */ String]] = js.undefined
    
    var sortings: js.UndefOr[Record[S, Sorting[I]]] = js.undefined
  }
  object Configuration {
    
    inline def apply[I /* <: js.Object */, S /* <: String */, A /* <: String */](): Configuration[I, S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration[I, S, A]]
    }
    
    extension [Self <: Configuration[?, ?, ?], I /* <: js.Object */, S /* <: String */, A /* <: String */](x: Self & (Configuration[I, S, A])) {
      
      inline def setAggregations(value: Record[A, Aggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
      
      inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
      
      inline def setNative_search_enabled(value: Boolean): Self = StObject.set(x, "native_search_enabled", value.asInstanceOf[js.Any])
      
      inline def setNative_search_enabledUndefined: Self = StObject.set(x, "native_search_enabled", js.undefined)
      
      inline def setSearchableFields(value: js.Array[/* keyof I */ String]): Self = StObject.set(x, "searchableFields", value.asInstanceOf[js.Any])
      
      inline def setSearchableFieldsUndefined: Self = StObject.set(x, "searchableFields", js.undefined)
      
      inline def setSearchableFieldsVarargs(value: (/* keyof I */ String)*): Self = StObject.set(x, "searchableFields", js.Array(value*))
      
      inline def setSortings(value: Record[S, Sorting[I]]): Self = StObject.set(x, "sortings", value.asInstanceOf[js.Any])
      
      inline def setSortingsUndefined: Self = StObject.set(x, "sortings", js.undefined)
    }
  }
  
  @js.native
  trait ItemsJs[I /* <: js.Object */, S /* <: String */, A /* <: String */] extends StObject {
    
    /** Get data for aggregation */
    def aggregation(options: AggregationOptions[A]): typings.itemsjs.anon.Pagination[I] = js.native
    
    /** Reindex with an entirely new list of items */
    def reindex(data: js.Array[I]): Unit = js.native
    
    /** Search items */
    def search(): Data[I, A] = js.native
    def search(options: SearchOptions[I, S, A]): Data[I, A] = js.native
    
    /**
      * Find similar items.
      * Uses the `id` key on items to check for uniqueness
      */
    def similar(id: Any, options: SimilarOptions[I]): DataPagination[I] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.itemsjs.itemsjsStrings.asc
    - typings.itemsjs.itemsjsStrings.desc
  */
  trait Order extends StObject
  object Order {
    
    inline def asc: typings.itemsjs.itemsjsStrings.asc = "asc".asInstanceOf[typings.itemsjs.itemsjsStrings.asc]
    
    inline def desc: typings.itemsjs.itemsjsStrings.desc = "desc".asInstanceOf[typings.itemsjs.itemsjsStrings.desc]
  }
  
  trait Pagination extends StObject {
    
    var page: Double
    
    var per_page: Double
    
    var total: Double
  }
  object Pagination {
    
    inline def apply(page: Double, per_page: Double, total: Double): Pagination = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination]
    }
    
    extension [Self <: Pagination](x: Self) {
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchAggregation[I /* <: js.Object */, A /* <: String */] extends StObject {
    
    var buckets: Buckets[I]
    
    var name: A
    
    var position: Double
    
    var title: String
  }
  object SearchAggregation {
    
    inline def apply[I /* <: js.Object */, A /* <: String */](buckets: Buckets[I], name: A, position: Double, title: String): SearchAggregation[I, A] = {
      val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchAggregation[I, A]]
    }
    
    extension [Self <: SearchAggregation[?, ?], I /* <: js.Object */, A /* <: String */](x: Self & (SearchAggregation[I, A])) {
      
      inline def setBuckets(value: Buckets[I]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsVarargs(value: Bucket[I]*): Self = StObject.set(x, "buckets", js.Array(value*))
      
      inline def setName(value: A): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchOptions[I /* <: js.Object */, S /* <: String */, A /* <: String */] extends StObject {
    
    /** A custom function to filter values */
    var filter: js.UndefOr[js.Function1[/* item */ I, Boolean]] = js.undefined
    
    var filters: js.UndefOr[Partial[Record[A, js.Array[String]]]] = js.undefined
    
    /** @default false */
    var isExactSearch: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var is_all_filtered_items: js.UndefOr[Boolean] = js.undefined
    
    /** @default 1 */
    var page: js.UndefOr[Double] = js.undefined
    
    /** @default 12 */
    var per_page: js.UndefOr[Double] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var removeStopWordFilter: js.UndefOr[Boolean] = js.undefined
    
    /** The name of a sort defined in the configuration's sortings, or a new custom one */
    var sort: js.UndefOr[S | Sorting[I]] = js.undefined
  }
  object SearchOptions {
    
    inline def apply[I /* <: js.Object */, S /* <: String */, A /* <: String */](): SearchOptions[I, S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions[I, S, A]]
    }
    
    extension [Self <: SearchOptions[?, ?, ?], I /* <: js.Object */, S /* <: String */, A /* <: String */](x: Self & (SearchOptions[I, S, A])) {
      
      inline def setFilter(value: /* item */ I => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFilters(value: Partial[Record[A, js.Array[String]]]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setIsExactSearch(value: Boolean): Self = StObject.set(x, "isExactSearch", value.asInstanceOf[js.Any])
      
      inline def setIsExactSearchUndefined: Self = StObject.set(x, "isExactSearch", js.undefined)
      
      inline def setIs_all_filtered_items(value: Boolean): Self = StObject.set(x, "is_all_filtered_items", value.asInstanceOf[js.Any])
      
      inline def setIs_all_filtered_itemsUndefined: Self = StObject.set(x, "is_all_filtered_items", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRemoveStopWordFilter(value: Boolean): Self = StObject.set(x, "removeStopWordFilter", value.asInstanceOf[js.Any])
      
      inline def setRemoveStopWordFilterUndefined: Self = StObject.set(x, "removeStopWordFilter", js.undefined)
      
      inline def setSort(value: S | Sorting[I]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait SimilarOptions[I /* <: js.Object */] extends StObject {
    
    var field: /* keyof I */ String
    
    /** @default 0 */
    var minimum: js.UndefOr[Double] = js.undefined
    
    /** @default 1 */
    var page: js.UndefOr[Double] = js.undefined
    
    /** @default 10 */
    var per_page: js.UndefOr[Double] = js.undefined
  }
  object SimilarOptions {
    
    inline def apply[I /* <: js.Object */](field: /* keyof I */ String): SimilarOptions[I] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimilarOptions[I]]
    }
    
    extension [Self <: SimilarOptions[?], I /* <: js.Object */](x: Self & SimilarOptions[I]) {
      
      inline def setField(value: /* keyof I */ String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
      
      inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    }
  }
  
  trait Sorting[I /* <: js.Object */] extends StObject {
    
    var field: (/* keyof I */ String) | (js.Array[/* keyof I */ String])
    
    var order: js.UndefOr[Order | js.Array[Order]] = js.undefined
  }
  object Sorting {
    
    inline def apply[I /* <: js.Object */](field: (/* keyof I */ String) | (js.Array[/* keyof I */ String])): Sorting[I] = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sorting[I]]
    }
    
    extension [Self <: Sorting[?], I /* <: js.Object */](x: Self & Sorting[I]) {
      
      inline def setField(value: (/* keyof I */ String) | (js.Array[/* keyof I */ String])): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldVarargs(value: (/* keyof I */ String)*): Self = StObject.set(x, "field", js.Array(value*))
      
      inline def setOrder(value: Order | js.Array[Order]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: Order*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
}
