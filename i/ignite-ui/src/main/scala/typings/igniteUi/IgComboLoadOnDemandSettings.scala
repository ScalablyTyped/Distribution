package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboLoadOnDemandSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets option to enable load on demand.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets/Sets number of records loaded on each request.
    *
    */
  var pageSize: js.UndefOr[Double] = js.undefined
}
object IgComboLoadOnDemandSettings {
  
  inline def apply(): IgComboLoadOnDemandSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLoadOnDemandSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgComboLoadOnDemandSettings] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
