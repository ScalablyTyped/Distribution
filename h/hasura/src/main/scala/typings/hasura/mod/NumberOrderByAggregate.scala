package typings.hasura.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberOrderByAggregate[T, Keys /* <: /* keyof T */ String */] extends StObject {
  
  var avg: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var stddev: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var stddev_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var stddev_samp: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var sum: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var var_pop: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
  
  var variance: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
    */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
  ] = js.undefined
}
object NumberOrderByAggregate {
  
  @scala.inline
  def apply[T, Keys /* <: /* keyof T */ String */](): NumberOrderByAggregate[T, Keys] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOrderByAggregate[T, Keys]]
  }
  
  @scala.inline
  implicit class NumberOrderByAggregateMutableBuilder[Self <: NumberOrderByAggregate[?, ?], T, Keys /* <: /* keyof T */ String */] (val x: Self & (NumberOrderByAggregate[T, Keys])) extends AnyVal {
    
    @scala.inline
    def setAvg(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvgUndefined: Self = StObject.set(x, "avg", js.undefined)
    
    @scala.inline
    def setStddev(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddevUndefined: Self = StObject.set(x, "stddev", js.undefined)
    
    @scala.inline
    def setStddev_pop(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "stddev_pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev_popUndefined: Self = StObject.set(x, "stddev_pop", js.undefined)
    
    @scala.inline
    def setStddev_samp(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "stddev_samp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStddev_sampUndefined: Self = StObject.set(x, "stddev_samp", js.undefined)
    
    @scala.inline
    def setSum(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    @scala.inline
    def setVar_pop(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "var_pop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVar_popUndefined: Self = StObject.set(x, "var_pop", js.undefined)
    
    @scala.inline
    def setVariance(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in Keys ]:? hasura.hasura.ScalarOrderBy}
      */ typings.hasura.hasuraStrings.NumberOrderByAggregate & TopLevel[js.Any]
    ): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
