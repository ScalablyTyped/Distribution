package typings.jsrsasign.jsrsasignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "readFileUTF8")
@js.native
object readFileUTF8 extends js.Object {
  /**
    * read file and return file contents as utf-8 string
    * @param utf8File file name to be read
    * @return utf-8 string of file contents
    * @description
    * This function only works in Node.js.
    */
  def apply(utf8File: String): String = js.native
}

