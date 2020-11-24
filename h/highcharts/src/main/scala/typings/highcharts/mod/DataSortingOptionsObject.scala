package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSortingOptionsObject extends js.Object {
  
  /**
    * Enable or disable data sorting for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to allow matching points by name in an update.
    */
  var matchByName: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines what data value should be used to sort by.
    */
  var sortKey: js.UndefOr[String] = js.native
}
object DataSortingOptionsObject {
  
  @scala.inline
  def apply(): DataSortingOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSortingOptionsObject]
  }
  
  @scala.inline
  implicit class DataSortingOptionsObjectOps[Self <: DataSortingOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMatchByName(value: Boolean): Self = this.set("matchByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchByName: Self = this.set("matchByName", js.undefined)
    
    @scala.inline
    def setSortKey(value: String): Self = this.set("sortKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortKey: Self = this.set("sortKey", js.undefined)
  }
}
