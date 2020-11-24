package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAggregateResult[T] extends js.Object {
  
  var count: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
    */ typings.hasura.hasuraStrings.BaseAggregateResult with TopLevel[T]
  ] = js.native
  
  var min: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
    */ typings.hasura.hasuraStrings.BaseAggregateResult with TopLevel[T]
  ] = js.native
}
object BaseAggregateResult {
  
  @scala.inline
  def apply[T](): BaseAggregateResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseAggregateResult[T]]
  }
  
  @scala.inline
  implicit class BaseAggregateResultOps[Self <: BaseAggregateResult[_], T] (val x: Self with BaseAggregateResult[T]) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setMax(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
      */ typings.hasura.hasuraStrings.BaseAggregateResult with TopLevel[T]
    ): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in hasura.hasura.MinMaxAggregateKeys<T> ]:? T[key]}
      */ typings.hasura.hasuraStrings.BaseAggregateResult with TopLevel[T]
    ): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
  }
}
