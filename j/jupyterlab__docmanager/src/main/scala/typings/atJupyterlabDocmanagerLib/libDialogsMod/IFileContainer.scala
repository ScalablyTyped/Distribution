package typings
package atJupyterlabDocmanagerLib.libDialogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileContainer
  extends atPhosphorCoreutilsLib.libJsonMod.JSONObject {
  /**
    * The list of item names in the current working directory.
    */
  var items: js.Array[java.lang.String]
  /**
    * The current working directory of the file container.
    */
  var path: java.lang.String
}

object IFileContainer {
  @scala.inline
  def apply(items: js.Array[java.lang.String], path: java.lang.String): IFileContainer = {
    val __obj = js.Dynamic.literal(items = items, path = path)
  
    __obj.asInstanceOf[IFileContainer]
  }
}

