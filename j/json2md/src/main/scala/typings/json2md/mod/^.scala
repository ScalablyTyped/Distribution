package typings.json2md.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2md", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(data: String): String = js.native
  def apply(data: String, prefix: String): String = js.native
  def apply(data: js.Array[DataObject | String]): String = js.native
  def apply(data: js.Array[DataObject | String], prefix: String): String = js.native
  /**
    * Converts a JSON input to markdown.
    *
    * @param data The input JSON data.
    * @param prefix A snippet to add before each line.
    * @return The generated markdown result.
    */
  def apply(data: DataObject): String = js.native
  def apply(data: DataObject, prefix: String): String = js.native
}

