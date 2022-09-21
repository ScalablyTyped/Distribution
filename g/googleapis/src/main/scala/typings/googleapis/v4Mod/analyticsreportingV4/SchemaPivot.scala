package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPivot extends StObject {
  
  /**
    * DimensionFilterClauses are logically combined with an `AND` operator: only data that is included by all these DimensionFilterClauses contributes to the values in this pivot region. Dimension filters can be used to restrict the columns shown in the pivot region. For example if you have `ga:browser` as the requested dimension in the pivot region, and you specify key filters to restrict `ga:browser` to only "IE" or "Firefox", then only those two browsers would show up as columns.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[SchemaDimensionFilterClause]] = js.undefined
  
  /**
    * A list of dimensions to show as pivot columns. A Pivot can have a maximum of 4 dimensions. Pivot dimensions are part of the restriction on the total number of dimensions allowed in the request.
    */
  var dimensions: js.UndefOr[js.Array[SchemaDimension]] = js.undefined
  
  /**
    * Specifies the maximum number of groups to return. The default value is 10, also the maximum value is 1,000.
    */
  var maxGroupCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The pivot metrics. Pivot metrics are part of the restriction on total number of metrics allowed in the request.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetric]] = js.undefined
  
  /**
    * If k metrics were requested, then the response will contain some data-dependent multiple of k columns in the report. E.g., if you pivoted on the dimension `ga:browser` then you'd get k columns for "Firefox", k columns for "IE", k columns for "Chrome", etc. The ordering of the groups of columns is determined by descending order of "total" for the first of the k values. Ties are broken by lexicographic ordering of the first pivot dimension, then lexicographic ordering of the second pivot dimension, and so on. E.g., if the totals for the first value for Firefox, IE, and Chrome were 8, 2, 8, respectively, the order of columns would be Chrome, Firefox, IE. The following let you choose which of the groups of k columns are included in the response.
    */
  var startGroup: js.UndefOr[Double | Null] = js.undefined
}
object SchemaPivot {
  
  inline def apply(): SchemaPivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivot]
  }
  
  extension [Self <: SchemaPivot](x: Self) {
    
    inline def setDimensionFilterClauses(value: js.Array[SchemaDimensionFilterClause]): Self = StObject.set(x, "dimensionFilterClauses", value.asInstanceOf[js.Any])
    
    inline def setDimensionFilterClausesUndefined: Self = StObject.set(x, "dimensionFilterClauses", js.undefined)
    
    inline def setDimensionFilterClausesVarargs(value: SchemaDimensionFilterClause*): Self = StObject.set(x, "dimensionFilterClauses", js.Array(value*))
    
    inline def setDimensions(value: js.Array[SchemaDimension]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: SchemaDimension*): Self = StObject.set(x, "dimensions", js.Array(value*))
    
    inline def setMaxGroupCount(value: Double): Self = StObject.set(x, "maxGroupCount", value.asInstanceOf[js.Any])
    
    inline def setMaxGroupCountNull: Self = StObject.set(x, "maxGroupCount", null)
    
    inline def setMaxGroupCountUndefined: Self = StObject.set(x, "maxGroupCount", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetric]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetric*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setStartGroup(value: Double): Self = StObject.set(x, "startGroup", value.asInstanceOf[js.Any])
    
    inline def setStartGroupNull: Self = StObject.set(x, "startGroup", null)
    
    inline def setStartGroupUndefined: Self = StObject.set(x, "startGroup", js.undefined)
  }
}
