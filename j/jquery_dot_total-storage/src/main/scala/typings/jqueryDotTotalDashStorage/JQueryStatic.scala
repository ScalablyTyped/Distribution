package typings.jqueryDotTotalDashStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("totalStorage")
  var totalStorage_Original: JQueryTotalStorage = js.native
  /**
    * @desc Set or get a key's value
    * @param key Key to set.
    * @param value Value to set for key. If ommited, current value for key is returned.
  	* @param options Not implemented.
    */
  def totalStorage(key: String): js.Any = js.native
  def totalStorage(key: String, value: js.Any): js.Any = js.native
  def totalStorage(key: String, value: js.Any, options: JQueryTotalStorageOptions): js.Any = js.native
}

