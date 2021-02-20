package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSortingOptionsObject extends StObject {
  
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
  implicit class DataSortingOptionsObjectMutableBuilder[Self <: DataSortingOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMatchByName(value: Boolean): Self = StObject.set(x, "matchByName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchByNameUndefined: Self = StObject.set(x, "matchByName", js.undefined)
    
    @scala.inline
    def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
  }
}
