package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters of a query or report.
  */
@js.native
trait SchemaParameters extends StObject {
  
  /**
    * Filters used to match traffic data in your report.
    */
  var filters: js.UndefOr[js.Array[SchemaFilterPair]] = js.native
  
  /**
    * Data is grouped by the filters listed in this field.
    */
  var groupBys: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether to include data from Invite Media.
    */
  var includeInviteData: js.UndefOr[Boolean] = js.native
  
  /**
    * Metrics to include as columns in your report.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Report type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaParameters {
  
  @scala.inline
  def apply(): SchemaParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameters]
  }
  
  @scala.inline
  implicit class SchemaParametersMutableBuilder[Self <: SchemaParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: js.Array[SchemaFilterPair]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SchemaFilterPair*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setGroupBys(value: js.Array[String]): Self = StObject.set(x, "groupBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBysUndefined: Self = StObject.set(x, "groupBys", js.undefined)
    
    @scala.inline
    def setGroupBysVarargs(value: String*): Self = StObject.set(x, "groupBys", js.Array(value :_*))
    
    @scala.inline
    def setIncludeInviteData(value: Boolean): Self = StObject.set(x, "includeInviteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeInviteDataUndefined: Self = StObject.set(x, "includeInviteData", js.undefined)
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = StObject.set(x, "metrics", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
