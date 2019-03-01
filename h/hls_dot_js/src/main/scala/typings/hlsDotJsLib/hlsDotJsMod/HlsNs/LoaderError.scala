package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderError extends js.Object {
  /**
    * error code
    */
  var code: scala.Double
  /**
    *  error description
    */
  var text: java.lang.String
}

object LoaderError {
  @scala.inline
  def apply(code: scala.Double, text: java.lang.String): LoaderError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[LoaderError]
  }
}

