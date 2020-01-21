package typings.jqueryTimeentry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
    * initialize TimeEntry plugin
    */
  @JSName("timeEntry")
  var timeEntry_Original: ITimeEntry = js.native
  /**
    * initialize TimeEntry plugin
    */
  def timeEntry(): js.Any = js.native
  def timeEntry(configOrFnName: String): js.Any = js.native
  def timeEntry(configOrFnName: String, nameOrOption: js.Any): js.Any = js.native
  def timeEntry(configOrFnName: String, nameOrOption: js.Any, value: js.Any): js.Any = js.native
  def timeEntry(configOrFnName: ITimeEntryOptions): js.Any = js.native
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: js.Any): js.Any = js.native
  def timeEntry(configOrFnName: ITimeEntryOptions, nameOrOption: js.Any, value: js.Any): js.Any = js.native
}

