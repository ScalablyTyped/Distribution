package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimeEntryStatic extends StObject {
  
  var regionalOptions: ITimeEntryLocales = js.native
  
  def setDefaults(settings: ITimeEntryOptions): Unit = js.native
}
object ITimeEntryStatic {
  
  @scala.inline
  def apply(regionalOptions: ITimeEntryLocales, setDefaults: ITimeEntryOptions => Unit): ITimeEntryStatic = {
    val __obj = js.Dynamic.literal(regionalOptions = regionalOptions.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[ITimeEntryStatic]
  }
  
  @scala.inline
  implicit class ITimeEntryStaticMutableBuilder[Self <: ITimeEntryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionalOptions(value: ITimeEntryLocales): Self = StObject.set(x, "regionalOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaults(value: ITimeEntryOptions => Unit): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1(value))
  }
}
