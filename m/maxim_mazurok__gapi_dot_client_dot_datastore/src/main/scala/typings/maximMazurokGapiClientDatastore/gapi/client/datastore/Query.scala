package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query extends StObject {
  
  /**
    * The properties to make distinct. The query results will contain the first result for each distinct combination of values for the given properties (if empty, all results are
    * returned).
    */
  var distinctOn: js.UndefOr[js.Array[PropertyReference]] = js.undefined
  
  /**
    * An ending point for the query results. Query cursors are returned in query result batches and [can only be used to limit the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.undefined
  
  /** The filter to apply. */
  var filter: js.UndefOr[Filter] = js.undefined
  
  /** The kinds to query (if empty, returns entities of all kinds). Currently at most 1 kind may be specified. */
  var kind: js.UndefOr[js.Array[KindExpression]] = js.undefined
  
  /** The maximum number of results to return. Applies after all other constraints. Optional. Unspecified is interpreted as no limit. Must be >= 0 if specified. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** The number of results to skip. Applies before limit, but after all other constraints. Optional. Must be >= 0 if specified. */
  var offset: js.UndefOr[Double] = js.undefined
  
  /** The order to apply to the query results (if empty, order is unspecified). */
  var order: js.UndefOr[js.Array[PropertyOrder]] = js.undefined
  
  /** The projection to return. Defaults to returning all properties. */
  var projection: js.UndefOr[js.Array[Projection]] = js.undefined
  
  /**
    * A starting point for the query results. Query cursors are returned in query result batches and [can only be used to continue the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.undefined
}
object Query {
  
  inline def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setDistinctOn(value: js.Array[PropertyReference]): Self = StObject.set(x, "distinctOn", value.asInstanceOf[js.Any])
    
    inline def setDistinctOnUndefined: Self = StObject.set(x, "distinctOn", js.undefined)
    
    inline def setDistinctOnVarargs(value: PropertyReference*): Self = StObject.set(x, "distinctOn", js.Array(value*))
    
    inline def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    inline def setFilter(value: Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setKind(value: js.Array[KindExpression]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setKindVarargs(value: KindExpression*): Self = StObject.set(x, "kind", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrder(value: js.Array[PropertyOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: PropertyOrder*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setProjection(value: js.Array[Projection]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setProjectionVarargs(value: Projection*): Self = StObject.set(x, "projection", js.Array(value*))
    
    inline def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
