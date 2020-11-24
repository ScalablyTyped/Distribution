package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A query for entities.
  */
@js.native
trait SchemaQuery extends js.Object {
  
  /**
    * The properties to make distinct. The query results will contain the first
    * result for each distinct combination of values for the given properties
    * (if empty, all results are returned).
    */
  var distinctOn: js.UndefOr[js.Array[SchemaPropertyReference]] = js.native
  
  /**
    * An ending point for the query results. Query cursors are returned in
    * query result batches and [can only be used to limit the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var endCursor: js.UndefOr[String] = js.native
  
  /**
    * The filter to apply.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  
  /**
    * The kinds to query (if empty, returns entities of all kinds). Currently
    * at most 1 kind may be specified.
    */
  var kind: js.UndefOr[js.Array[SchemaKindExpression]] = js.native
  
  /**
    * The maximum number of results to return. Applies after all other
    * constraints. Optional. Unspecified is interpreted as no limit. Must be
    * &gt;= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The number of results to skip. Applies before limit, but after all other
    * constraints. Optional. Must be &gt;= 0 if specified.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The order to apply to the query results (if empty, order is unspecified).
    */
  var order: js.UndefOr[js.Array[SchemaPropertyOrder]] = js.native
  
  /**
    * The projection to return. Defaults to returning all properties.
    */
  var projection: js.UndefOr[js.Array[SchemaProjection]] = js.native
  
  /**
    * A starting point for the query results. Query cursors are returned in
    * query result batches and [can only be used to continue the same
    * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
    */
  var startCursor: js.UndefOr[String] = js.native
}
object SchemaQuery {
  
  @scala.inline
  def apply(): SchemaQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuery]
  }
  
  @scala.inline
  implicit class SchemaQueryOps[Self <: SchemaQuery] (val x: Self) extends AnyVal {
    
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
    def setDistinctOnVarargs(value: SchemaPropertyReference*): Self = this.set("distinctOn", js.Array(value :_*))
    
    @scala.inline
    def setDistinctOn(value: js.Array[SchemaPropertyReference]): Self = this.set("distinctOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinctOn: Self = this.set("distinctOn", js.undefined)
    
    @scala.inline
    def setEndCursor(value: String): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCursor: Self = this.set("endCursor", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setKindVarargs(value: SchemaKindExpression*): Self = this.set("kind", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: js.Array[SchemaKindExpression]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: SchemaPropertyOrder*): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[SchemaPropertyOrder]): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setProjectionVarargs(value: SchemaProjection*): Self = this.set("projection", js.Array(value :_*))
    
    @scala.inline
    def setProjection(value: js.Array[SchemaProjection]): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setStartCursor(value: String): Self = this.set("startCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCursor: Self = this.set("startCursor", js.undefined)
  }
}
