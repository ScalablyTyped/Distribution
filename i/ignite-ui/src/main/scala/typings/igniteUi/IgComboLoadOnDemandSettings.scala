package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgComboLoadOnDemandSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets option to enable load on demand.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets number of records loaded on each request.
    *
    */
  var pageSize: js.UndefOr[Double] = js.native
}
object IgComboLoadOnDemandSettings {
  
  @scala.inline
  def apply(): IgComboLoadOnDemandSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboLoadOnDemandSettings]
  }
  
  @scala.inline
  implicit class IgComboLoadOnDemandSettingsMutableBuilder[Self <: IgComboLoadOnDemandSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
  }
}
