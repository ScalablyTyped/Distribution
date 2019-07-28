package typings.jqueryDotJoyride.jqueryDotJoyrideMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Joyride extends js.Object {
  /**
  		 * Default function, no options
  		 * @method
  		 * @return {JQuery} JQuery instance
  		 */
  def apply(): JQuery = js.native
  /**
  		 * Function with method name and params
  		 * @method
  		 * @param {string} methodName Name of method to call.
  		 * @param {any[]} params parameters for method
  		 * @return {JQuery} JQuery instance
  		 */
  def apply(methodName: String, params: js.Any*): JQuery = js.native
  /**
  		 * Function with options
  		 * @method
  		 * @param {JoyrideOptions} options An object with all the joyride options you want to overwrite.
  		 * @return {JQuery} JQuery instance
  		 */
  def apply(options: JoyrideOptions): JQuery = js.native
}

