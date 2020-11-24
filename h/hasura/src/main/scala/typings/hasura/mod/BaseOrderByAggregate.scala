package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOrderByAggregate[T] extends js.Object {
  
  var count: js.UndefOr[ScalarOrderBy] = js.native
  
  var max: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.BaseOrderByAggregate with TopLevel[js.Any]
  ] = js.native
  
  var min: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.BaseOrderByAggregate with TopLevel[js.Any]
  ] = js.native
}
object BaseOrderByAggregate {
  
  @scala.inline
  def apply[T](): BaseOrderByAggregate[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseOrderByAggregate[T]]
  }
  
  @scala.inline
  implicit class BaseOrderByAggregateOps[Self <: BaseOrderByAggregate[_], T] (val x: Self with BaseOrderByAggregate[T]) extends AnyVal {
    
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
    def setCount(value: ScalarOrderBy): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.BaseOrderByAggregate with TopLevel[js.Any]
    ): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.BaseOrderByAggregate with TopLevel[js.Any]
    ): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
