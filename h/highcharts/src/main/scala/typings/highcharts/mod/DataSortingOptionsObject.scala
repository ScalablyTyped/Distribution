package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSortingOptionsObject extends StObject {
  
  /**
    * Enable or disable data sorting for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to allow matching points by name in an update.
    */
  var matchByName: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines what data value should be used to sort by.
    */
  var sortKey: js.UndefOr[String] = js.undefined
}
object DataSortingOptionsObject {
  
  inline def apply(): DataSortingOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSortingOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSortingOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMatchByName(value: Boolean): Self = StObject.set(x, "matchByName", value.asInstanceOf[js.Any])
    
    inline def setMatchByNameUndefined: Self = StObject.set(x, "matchByName", js.undefined)
    
    inline def setSortKey(value: String): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
    
    inline def setSortKeyUndefined: Self = StObject.set(x, "sortKey", js.undefined)
  }
}
