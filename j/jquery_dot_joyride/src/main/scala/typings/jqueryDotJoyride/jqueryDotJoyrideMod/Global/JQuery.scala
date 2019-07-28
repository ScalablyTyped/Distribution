package typings.jqueryDotJoyride.jqueryDotJoyrideMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
  		 * joyride function
  		 * @return {Joyride} Joyride instance.
  		 */
  @JSName("joyride")
  var joyride_Original: Joyride = js.native
  /**
  		 * Default function, no options
  		 * @method
  		 * @return {JQuery} JQuery instance
  		 */
  /**
  		 * joyride function
  		 * @return {Joyride} Joyride instance.
  		 */
  def joyride(): JQuery = js.native
  /**
  		 * Function with method name and params
  		 * @method
  		 * @param {string} methodName Name of method to call.
  		 * @param {any[]} params parameters for method
  		 * @return {JQuery} JQuery instance
  		 */
  /**
  		 * joyride function
  		 * @return {Joyride} Joyride instance.
  		 */
  def joyride(methodName: String, params: js.Any*): JQuery = js.native
  /**
  		 * Function with options
  		 * @method
  		 * @param {JoyrideOptions} options An object with all the joyride options you want to overwrite.
  		 * @return {JQuery} JQuery instance
  		 */
  /**
  		 * joyride function
  		 * @return {Joyride} Joyride instance.
  		 */
  def joyride(options: JoyrideOptions): JQuery = js.native
}

