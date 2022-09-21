package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructuredQuery extends StObject {
  
  /**
    * A end point for the query results.
    */
  var endAt: js.UndefOr[SchemaCursor] = js.undefined
  
  /**
    * The collections to query.
    */
  var from: js.UndefOr[js.Array[SchemaCollectionSelector]] = js.undefined
  
  /**
    * The maximum number of results to return. Applies after all other constraints. Must be \>= 0 if specified.
    */
  var limit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of results to skip. Applies before limit, but after all other constraints. Must be \>= 0 if specified.
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The order to apply to the query results. Firestore allows callers to provide a full ordering, a partial ordering, or no ordering at all. In all cases, Firestore guarantees a stable ordering through the following rules: * The `order_by` is required to reference all fields used with an inequality filter. * All fields that are required to be in the `order_by` but are not already present are appended in lexicographical ordering of the field name. * If an order on `__name__` is not specified, it is appended by default. Fields are appended with the same sort direction as the last order specified, or 'ASCENDING' if no order was specified. For example: * `ORDER BY a` becomes `ORDER BY a ASC, __name__ ASC` * `ORDER BY a DESC` becomes `ORDER BY a DESC, __name__ DESC` * `WHERE a \> 1` becomes `WHERE a \> 1 ORDER BY a ASC, __name__ ASC` * `WHERE __name__ \> ... AND a \> 1` becomes `WHERE __name__ \> ... AND a \> 1 ORDER BY a ASC, __name__ ASC`
    */
  var orderBy: js.UndefOr[js.Array[SchemaOrder]] = js.undefined
  
  /**
    * The projection to return.
    */
  var select: js.UndefOr[SchemaProjection] = js.undefined
  
  /**
    * A starting point for the query results.
    */
  var startAt: js.UndefOr[SchemaCursor] = js.undefined
  
  /**
    * The filter to apply.
    */
  var where: js.UndefOr[SchemaFilter] = js.undefined
}
object SchemaStructuredQuery {
  
  inline def apply(): SchemaStructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredQuery]
  }
  
  extension [Self <: SchemaStructuredQuery](x: Self) {
    
    inline def setEndAt(value: SchemaCursor): Self = StObject.set(x, "endAt", value.asInstanceOf[js.Any])
    
    inline def setEndAtUndefined: Self = StObject.set(x, "endAt", js.undefined)
    
    inline def setFrom(value: js.Array[SchemaCollectionSelector]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: SchemaCollectionSelector*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: js.Array[SchemaOrder]): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrderByVarargs(value: SchemaOrder*): Self = StObject.set(x, "orderBy", js.Array(value*))
    
    inline def setSelect(value: SchemaProjection): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStartAt(value: SchemaCursor): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    
    inline def setWhere(value: SchemaFilter): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
