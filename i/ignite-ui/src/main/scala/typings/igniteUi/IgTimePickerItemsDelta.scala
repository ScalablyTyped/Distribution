package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTimePickerItemsDelta
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var hours: js.UndefOr[Double] = js.undefined
  
  var minutes: js.UndefOr[Double] = js.undefined
}
object IgTimePickerItemsDelta {
  
  @scala.inline
  def apply(): IgTimePickerItemsDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTimePickerItemsDelta]
  }
  
  @scala.inline
  implicit class IgTimePickerItemsDeltaMutableBuilder[Self <: IgTimePickerItemsDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
  }
}
