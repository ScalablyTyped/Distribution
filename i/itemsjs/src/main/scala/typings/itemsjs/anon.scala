package typings.itemsjs

import typings.itemsjs.mod.Bucket
import typings.itemsjs.mod.SearchAggregation
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aggregations[I /* <: js.Object */, A /* <: String */] extends StObject {
    
    var aggregations: Record[A, SearchAggregation[I, A]]
    
    var allFilteredItems: js.Array[I] | Null
    
    var items: js.Array[I]
  }
  object Aggregations {
    
    inline def apply[I /* <: js.Object */, A /* <: String */](aggregations: Record[A, SearchAggregation[I, A]], items: js.Array[I]): Aggregations[I, A] = {
      val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], allFilteredItems = null)
      __obj.asInstanceOf[Aggregations[I, A]]
    }
    
    extension [Self <: Aggregations[?, ?], I /* <: js.Object */, A /* <: String */](x: Self & (Aggregations[I, A])) {
      
      inline def setAggregations(value: Record[A, SearchAggregation[I, A]]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
      
      inline def setAllFilteredItems(value: js.Array[I]): Self = StObject.set(x, "allFilteredItems", value.asInstanceOf[js.Any])
      
      inline def setAllFilteredItemsNull: Self = StObject.set(x, "allFilteredItems", null)
      
      inline def setAllFilteredItemsVarargs(value: I*): Self = StObject.set(x, "allFilteredItems", js.Array(value*))
      
      inline def setItems(value: js.Array[I]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: I*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Buckets[I /* <: js.Object */] extends StObject {
    
    var buckets: typings.itemsjs.mod.Buckets[I]
  }
  object Buckets {
    
    inline def apply[I /* <: js.Object */](buckets: typings.itemsjs.mod.Buckets[I]): Buckets[I] = {
      val __obj = js.Dynamic.literal(buckets = buckets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buckets[I]]
    }
    
    extension [Self <: Buckets[?], I /* <: js.Object */](x: Self & Buckets[I]) {
      
      inline def setBuckets(value: typings.itemsjs.mod.Buckets[I]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
      
      inline def setBucketsVarargs(value: Bucket[I]*): Self = StObject.set(x, "buckets", js.Array(value*))
    }
  }
  
  trait Data[I /* <: js.Object */, A /* <: String */] extends StObject {
    
    var data: Aggregations[I, A]
    
    var pagination: typings.itemsjs.mod.Pagination
    
    var timings: Facets
  }
  object Data {
    
    inline def apply[I /* <: js.Object */, A /* <: String */](data: Aggregations[I, A], pagination: typings.itemsjs.mod.Pagination, timings: Facets): Data[I, A] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[I, A]]
    }
    
    extension [Self <: Data[?, ?], I /* <: js.Object */, A /* <: String */](x: Self & (Data[I, A])) {
      
      inline def setData(value: Aggregations[I, A]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: typings.itemsjs.mod.Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
      
      inline def setTimings(value: Facets): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataPagination[I /* <: js.Object */] extends StObject {
    
    var data: Items[I]
    
    var pagination: typings.itemsjs.mod.Pagination
  }
  object DataPagination {
    
    inline def apply[I /* <: js.Object */](data: Items[I], pagination: typings.itemsjs.mod.Pagination): DataPagination[I] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataPagination[I]]
    }
    
    extension [Self <: DataPagination[?], I /* <: js.Object */](x: Self & DataPagination[I]) {
      
      inline def setData(value: Items[I]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: typings.itemsjs.mod.Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
  
  trait Facets extends StObject {
    
    var facets: Double
    
    var search: Double
    
    var sorting: Double
    
    var total: Double
  }
  object Facets {
    
    inline def apply(facets: Double, search: Double, sorting: Double, total: Double): Facets = {
      val __obj = js.Dynamic.literal(facets = facets.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Facets]
    }
    
    extension [Self <: Facets](x: Self) {
      
      inline def setFacets(value: Double): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSorting(value: Double): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var _id: Double
    
    var intersection_length: Double
  }
  object Id {
    
    inline def apply(_id: Double, intersection_length: Double): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], intersection_length = intersection_length.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setIntersection_length(value: Double): Self = StObject.set(x, "intersection_length", value.asInstanceOf[js.Any])
      
      inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items[I /* <: js.Object */] extends StObject {
    
    var items: js.Array[I & Id]
  }
  object Items {
    
    inline def apply[I /* <: js.Object */](items: js.Array[I & Id]): Items[I] = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items[I]]
    }
    
    extension [Self <: Items[?], I /* <: js.Object */](x: Self & Items[I]) {
      
      inline def setItems(value: js.Array[I & Id]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: (I & Id)*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait Pagination[I /* <: js.Object */] extends StObject {
    
    var data: Buckets[I]
    
    var pagination: typings.itemsjs.mod.Pagination
  }
  object Pagination {
    
    inline def apply[I /* <: js.Object */](data: Buckets[I], pagination: typings.itemsjs.mod.Pagination): Pagination[I] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pagination[I]]
    }
    
    extension [Self <: Pagination[?], I /* <: js.Object */](x: Self & Pagination[I]) {
      
      inline def setData(value: Buckets[I]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPagination(value: typings.itemsjs.mod.Pagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    }
  }
}
