package typings.jqueryTimeentry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /**
    * initialize TimeEntry plugin
    */
  def timeEntry(): Any
  def timeEntry(configOrFnName: String): Any
  def timeEntry(configOrFnName: String, nameOrOption: Any): Any
  def timeEntry(configOrFnName: String, nameOrOption: Any, value: Any): Any
  def timeEntry(configOrFnName: String, nameOrOption: Unit, value: Any): Any
  def timeEntry(configOrFnName: Unit, nameOrOption: Any): Any
  def timeEntry(configOrFnName: Unit, nameOrOption: Any, value: Any): Any
  def timeEntry(configOrFnName: Unit, nameOrOption: Unit, value: Any): Any
  def timeEntry(configOrFnName: ITimeEntryOptions): Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: Any): Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: Any, value: Any): Any
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: Unit, value: Any): Any
  /**
    * initialize TimeEntry plugin
    */
  @JSName("timeEntry")
  var timeEntry_Original: ITimeEntry
}
object JQuery {
  
  inline def apply(
    timeEntry: (/* configOrFnName */ js.UndefOr[ITimeEntryOptions | String], /* nameOrOption */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Any
  ): JQuery = {
    val __obj = js.Dynamic.literal(timeEntry = js.Any.fromFunction3(timeEntry))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    inline def setTimeEntry(
      value: (/* configOrFnName */ js.UndefOr[ITimeEntryOptions | String], /* nameOrOption */ js.UndefOr[Any], /* value */ js.UndefOr[Any]) => Any
    ): Self = StObject.set(x, "timeEntry", js.Any.fromFunction3(value))
  }
}
