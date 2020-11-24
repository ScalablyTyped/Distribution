package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceRestriction extends js.Object {
  
  /**
    * Filter options restricting the results. If multiple filters are present, they are grouped by object type before joining. Filters with the same object type are joined conjunctively,
    * then the resulting expressions are joined disjunctively. The maximum number of elements is 20. NOTE: Suggest API supports only few filters at the moment: "objecttype", "type" and
    * "mimetype". For now, schema specific filters cannot be used to filter suggestions.
    */
  var filterOptions: js.UndefOr[js.Array[FilterOptions]] = js.native
  
  /** The source of restriction. */
  var source: js.UndefOr[Source] = js.native
}
object DataSourceRestriction {
  
  @scala.inline
  def apply(): DataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRestriction]
  }
  
  @scala.inline
  implicit class DataSourceRestrictionOps[Self <: DataSourceRestriction] (val x: Self) extends AnyVal {
    
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
    def setFilterOptionsVarargs(value: FilterOptions*): Self = this.set("filterOptions", js.Array(value :_*))
    
    @scala.inline
    def setFilterOptions(value: js.Array[FilterOptions]): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
