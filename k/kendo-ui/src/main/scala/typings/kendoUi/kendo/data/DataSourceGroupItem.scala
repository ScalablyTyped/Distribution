package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceGroupItem extends js.Object {
  
  var aggregates: js.UndefOr[js.Array[DataSourceGroupItemAggregate]] = js.native
  
  var compare: js.UndefOr[
    js.Function2[/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem, Double]
  ] = js.native
  
  var dir: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
}
object DataSourceGroupItem {
  
  @scala.inline
  def apply(): DataSourceGroupItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceGroupItem]
  }
  
  @scala.inline
  implicit class DataSourceGroupItemOps[Self <: DataSourceGroupItem] (val x: Self) extends AnyVal {
    
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
    def setAggregatesVarargs(value: DataSourceGroupItemAggregate*): Self = this.set("aggregates", js.Array(value :_*))
    
    @scala.inline
    def setAggregates(value: js.Array[DataSourceGroupItemAggregate]): Self = this.set("aggregates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregates: Self = this.set("aggregates", js.undefined)
    
    @scala.inline
    def setCompare(value: (/* a */ DataSourceGroupCompareItem, /* b */ DataSourceGroupCompareItem) => Double): Self = this.set("compare", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
  }
}
