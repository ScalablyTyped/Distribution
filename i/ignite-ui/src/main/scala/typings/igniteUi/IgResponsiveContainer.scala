package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgResponsiveContainer
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * The time between two resize checks in milliseconds.
    */
  var pollingInterval: js.UndefOr[Double] = js.undefined
}
object IgResponsiveContainer {
  
  inline def apply(): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgResponsiveContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgResponsiveContainer] (val x: Self) extends AnyVal {
    
    inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
  }
}
