package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A namespace containing utils for the rest of the lunr library
  */
@JSImport("lunr", "utils")
@js.native
object utils extends js.Object {
  /**
    * Convert an object to a string.
    *
    * In the case of `null` and `undefined` the function returns
    * the empty string, in all other cases the result of calling
    * `toString` on the passed object is returned.
    *
    * @param obj The object to convert to a string.
    * @return string representation of the passed object.
    */
  def asString(obj: js.Any): String = js.native
  /**
    * Print a warning message to the console.
    *
    * @param message The message to be printed.
    */
  def warn(message: String): Unit = js.native
}

