package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jsrsasign.saveFileBinByHex")
@js.native
object saveFileBinByHex extends js.Object {
  /**
    * save data represented by hexadecimal string to file
    * @param binFile file name to save contents.
    * @param hexString hexadecimal string to be saved.
    * @description
    * This function only works in Node.js.
    */
  def apply(binFile: String, hexString: String): Unit = js.native
}

