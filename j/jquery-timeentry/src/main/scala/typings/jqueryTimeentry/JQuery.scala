package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * initialize TimeEntry plugin
    */
  def timeEntry(): js.Any
  def timeEntry(configOrFnName: String): js.Any
  def timeEntry(configOrFnName: String, nameOrOption: js.Any): js.Any
  def timeEntry(configOrFnName: String, nameOrOption: js.Any, value: js.Any): js.Any
  def timeEntry(configOrFnName: String, nameOrOption: Unit, value: js.Any): js.Any
  def timeEntry(configOrFnName: Unit, nameOrOption: js.Any): js.Any
  def timeEntry(configOrFnName: Unit, nameOrOption: js.Any, value: js.Any): js.Any
  def timeEntry(configOrFnName: Unit, nameOrOption: Unit, value: js.Any): js.Any
  def timeEntry(configOrFnName: ITimeEntryOptions): js.Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: js.Any): js.Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: js.Any, value: js.Any): js.Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: Unit, value: js.Any): js.Any
  /**
    * initialize TimeEntry plugin
    */
  @JSName("timeEntry")
  var timeEntry_Original: ITimeEntry
}
object JQuery {
  
  inline def apply(
    timeEntry: (/* configOrFnName */ js.UndefOr[ITimeEntryOptions | String], /* nameOrOption */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => js.Any
  ): JQuery = {
    val __obj = js.Dynamic.literal(timeEntry = js.Any.fromFunction3(timeEntry))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setTimeEntry(
      value: (/* configOrFnName */ js.UndefOr[ITimeEntryOptions | String], /* nameOrOption */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => js.Any
    ): Self = StObject.set(x, "timeEntry", js.Any.fromFunction3(value))
  }
}
