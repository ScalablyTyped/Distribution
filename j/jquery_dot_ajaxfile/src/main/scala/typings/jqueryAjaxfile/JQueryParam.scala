package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryParam extends js.Object {
  /**
    * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
    * 
    * @param obj An array or object to serialize.
    */
  def apply(obj: js.Any): String = js.native
  /**
    * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
    * 
    * @param obj An array or object to serialize.
    * @param traditional A Boolean indicating whether to perform a traditional "shallow" serialization.
    */
  def apply(obj: js.Any, traditional: Boolean): String = js.native
}

