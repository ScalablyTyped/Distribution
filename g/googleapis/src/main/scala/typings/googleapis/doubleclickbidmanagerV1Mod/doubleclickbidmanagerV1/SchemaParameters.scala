package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters of a query or report.
  */
trait SchemaParameters extends StObject {
  
  /**
    * Filters used to match traffic data in your report.
    */
  var filters: js.UndefOr[js.Array[SchemaFilterPair]] = js.undefined
  
  /**
    * Data is grouped by the filters listed in this field.
    */
  var groupBys: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Whether to include data from Invite Media.
    */
  var includeInviteData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Metrics to include as columns in your report.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Report type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaParameters {
  
  inline def apply(): SchemaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameters]
  }
  
  extension [Self <: SchemaParameters](x: Self) {
    
    inline def setFilters(value: js.Array[SchemaFilterPair]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SchemaFilterPair*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    inline def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    inline def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    inline def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value :_*))
    
    inline def setIncludeInviteData(value: Boolean): Self = StObject.set(x, "includeInviteData", value.asInstanceOf[js.Any])
    
    inline def setIncludeInviteDataUndefined: Self = StObject.set(x, "includeInviteData", js.undefined)
    
    inline def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
