package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChartData extends StObject {
  
  /**
    * The aggregation type for the series of a data source chart. Only supported for data source charts.
    */
  var aggregateType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reference to the data source column that the data reads from.
    */
  var columnReference: js.UndefOr[SchemaDataSourceColumnReference] = js.undefined
  
  /**
    * The rule to group the data by if the ChartData backs the domain of a data source chart. Only supported for data source charts.
    */
  var groupRule: js.UndefOr[SchemaChartGroupRule] = js.undefined
  
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[SchemaChartSourceRange] = js.undefined
}
object SchemaChartData {
  
  inline def apply(): SchemaChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartData]
  }
  
  extension [Self <: SchemaChartData](x: Self) {
    
    inline def setAggregateType(value: String): Self = StObject.set(x, "aggregateType", value.asInstanceOf[js.Any])
    
    inline def setAggregateTypeNull: Self = StObject.set(x, "aggregateType", null)
    
    inline def setAggregateTypeUndefined: Self = StObject.set(x, "aggregateType", js.undefined)
    
    inline def setColumnReference(value: SchemaDataSourceColumnReference): Self = StObject.set(x, "columnReference", value.asInstanceOf[js.Any])
    
    inline def setColumnReferenceUndefined: Self = StObject.set(x, "columnReference", js.undefined)
    
    inline def setGroupRule(value: SchemaChartGroupRule): Self = StObject.set(x, "groupRule", value.asInstanceOf[js.Any])
    
    inline def setGroupRuleUndefined: Self = StObject.set(x, "groupRule", js.undefined)
    
    inline def setSourceRange(value: SchemaChartSourceRange): Self = StObject.set(x, "sourceRange", value.asInstanceOf[js.Any])
    
    inline def setSourceRangeUndefined: Self = StObject.set(x, "sourceRange", js.undefined)
  }
}
