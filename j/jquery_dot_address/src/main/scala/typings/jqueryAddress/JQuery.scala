package typings.jqueryAddress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("address")
  var address_Original: JQueryAddress = js.native
  /**
    * Adds the plugin functionality to a DOM element and disables the default behavior. Designed primarily to support links and forms. 
    * Accepts an optional function parameter that allows custom processing of the deep link value.
    */
  def address(): JQuery = js.native
  /**
    * Adds the plugin functionality to a DOM element and disables the default behavior. Designed primarily to support links and forms. 
    * Accepts an optional function parameter that allows custom processing of the deep link value.
    */
  def address(fn: js.Function): JQuery = js.native
}

