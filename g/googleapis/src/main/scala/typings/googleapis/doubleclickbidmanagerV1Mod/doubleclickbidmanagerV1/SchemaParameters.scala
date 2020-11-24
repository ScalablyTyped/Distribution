package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Parameters of a query or report.
  */
@js.native
trait SchemaParameters extends js.Object {
  
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
  implicit class SchemaParametersOps[Self <: SchemaParameters] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: SchemaFilterPair*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[SchemaFilterPair]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGroupBysVarargs(value: String*): Self = this.set("groupBys", js.Array(value :_*))
    
    @scala.inline
    def setGroupBys(value: js.Array[String]): Self = this.set("groupBys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupBys: Self = this.set("groupBys", js.undefined)
    
    @scala.inline
    def setIncludeInviteData(value: Boolean): Self = this.set("includeInviteData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeInviteData: Self = this.set("includeInviteData", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: String*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[String]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
