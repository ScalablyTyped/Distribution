package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberAggregateResult[T, Keys /* <: /* keyof T */ String */] extends BaseAggregateResult[T] {
  
  var avg: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var stddev: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var stddev_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var stddev_samp: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var sum: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var var_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
  
  var variance: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? number}
    */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
  ] = js.native
}
object NumberAggregateResult {
  
  @scala.inline
  def apply[T, Keys /* <: /* keyof T */ String */](): NumberAggregateResult[T, Keys] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberAggregateResult[T, Keys]]
  }
  
  @scala.inline
  implicit class NumberAggregateResultOps[Self <: NumberAggregateResult[_, _], T, Keys /* <: /* keyof T */ String */] (val x: Self with (NumberAggregateResult[T, Keys])) extends AnyVal {
    
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
    def setAvg(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvg: Self = this.set("avg", js.undefined)
    
    @scala.inline
    def setStddev(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStddev: Self = this.set("stddev", js.undefined)
    
    @scala.inline
    def setStddev_pop(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("stddev_pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStddev_pop: Self = this.set("stddev_pop", js.undefined)
    
    @scala.inline
    def setStddev_samp(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("stddev_samp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStddev_samp: Self = this.set("stddev_samp", js.undefined)
    
    @scala.inline
    def setSum(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSum: Self = this.set("sum", js.undefined)
    
    @scala.inline
    def setVar_pop(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("var_pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVar_pop: Self = this.set("var_pop", js.undefined)
    
    @scala.inline
    def setVariance(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? number}
      */ typings.hasura.hasuraStrings.NumberAggregateResult with TopLevel[js.Any]
    ): Self = this.set("variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariance: Self = this.set("variance", js.undefined)
  }
}
