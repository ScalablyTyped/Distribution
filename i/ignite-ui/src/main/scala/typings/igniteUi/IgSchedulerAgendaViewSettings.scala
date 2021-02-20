package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSchedulerAgendaViewSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets the number of days shown in AgendaView mode.
    *
    */
  var dateRangeInterval: js.UndefOr[Double] = js.native
}
object IgSchedulerAgendaViewSettings {
  
  @scala.inline
  def apply(): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
  
  @scala.inline
  implicit class IgSchedulerAgendaViewSettingsMutableBuilder[Self <: IgSchedulerAgendaViewSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateRangeInterval(value: Double): Self = StObject.set(x, "dateRangeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateRangeIntervalUndefined: Self = StObject.set(x, "dateRangeInterval", js.undefined)
  }
}
