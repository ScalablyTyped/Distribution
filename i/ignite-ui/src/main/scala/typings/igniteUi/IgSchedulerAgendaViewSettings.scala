package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSchedulerAgendaViewSettings
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets the number of days shown in AgendaView mode.
    *
    */
  var dateRangeInterval: js.UndefOr[Double] = js.undefined
}
object IgSchedulerAgendaViewSettings {
  
  inline def apply(): IgSchedulerAgendaViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSchedulerAgendaViewSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgSchedulerAgendaViewSettings] (val x: Self) extends AnyVal {
    
    inline def setDateRangeInterval(value: Double): Self = StObject.set(x, "dateRangeInterval", value.asInstanceOf[js.Any])
    
    inline def setDateRangeIntervalUndefined: Self = StObject.set(x, "dateRangeInterval", js.undefined)
  }
}
