package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "intarystrtohex")
@js.native
object intarystrtohex extends js.Object {
  /**
    * convert string of integer array to hexadecimal string.
    * @param s string of integer array
    * @return hexadecimal string
    * @throws "malformed integer array string: *" for wrong input
    * @description
    * This function converts a string of JavaScript integer array to
    * a hexadecimal string. Each integer value shall be in a range
    * from 0 to 255 otherwise it raise exception. Input string can
    * have extra space or newline string so that they will be ignored.
    *
    * @example
    * intarystrtohex(" [123, 34, 101, 34, 58] ")
    * → 7b2265223a (i.e. '{"e":' as string)
    */
  def apply(s: String): String = js.native
}

