package typings.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsrsasign", "saveFile")
@js.native
object saveFile extends js.Object {
  
  /**
    * save raw string to file
    * @param binFile file name to save contents.
    * @param rawString string contents to be saved.
    * @description
    * This function only works in Node.js.
    */
  def apply(binFile: String, rawString: String): Unit = js.native
}
