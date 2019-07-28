package typings.json2md.json2mdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2md", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val converters: ConvertersMethods = js.native
  /**
    * Converts a JSON input to markdown.
    *
    * @param data The input JSON data.
    * @param prefix A snippet to add before each line.
    * @return The generated markdown result.
    */
  def apply(data: DataObject | (js.Array[DataObject | String]) | String): String = js.native
  def apply(data: DataObject | (js.Array[DataObject | String]) | String, prefix: String): String = js.native
}

