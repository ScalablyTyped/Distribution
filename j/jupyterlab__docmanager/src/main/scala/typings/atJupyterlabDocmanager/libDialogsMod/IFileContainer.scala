package typings.atJupyterlabDocmanager.libDialogsMod

import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileContainer extends JSONObject {
  /**
    * The list of item names in the current working directory.
    */
  var items: js.Array[String]
  /**
    * The current working directory of the file container.
    */
  var path: String
}

object IFileContainer {
  @scala.inline
  def apply(items: js.Array[String], path: String): IFileContainer = {
    val __obj = js.Dynamic.literal(items = items, path = path)
  
    __obj.asInstanceOf[IFileContainer]
  }
}

