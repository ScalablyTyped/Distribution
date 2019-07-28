package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderError extends js.Object {
  /**
    * error code
    */
  var code: Double
  /**
    *  error description
    */
  var text: String
}

object LoaderError {
  @scala.inline
  def apply(code: Double, text: String): LoaderError = {
    val __obj = js.Dynamic.literal(code = code, text = text)
  
    __obj.asInstanceOf[LoaderError]
  }
}

