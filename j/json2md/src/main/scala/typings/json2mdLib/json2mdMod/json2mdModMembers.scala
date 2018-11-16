package typings
package json2mdLib.json2mdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2md", JSImport.Namespace)
@js.native
object json2mdModMembers extends js.Object {
  val converters: json2mdLib.json2mdMod.json2mdNs.ConvertersMethods = js.native
  /**
   * Converts a JSON input to markdown.
   *
   * @param data The input JSON data.
   * @param prefix A snippet to add before each line.
   * @return The generated markdown result.
   */
  def apply(
    data: json2mdLib.json2mdMod.json2mdNs.DataObject | js.Array[json2mdLib.json2mdMod.json2mdNs.DataObject] | java.lang.String | js.Array[java.lang.String]
  ): java.lang.String = js.native
  /**
   * Converts a JSON input to markdown.
   *
   * @param data The input JSON data.
   * @param prefix A snippet to add before each line.
   * @return The generated markdown result.
   */
  def apply(
    data: json2mdLib.json2mdMod.json2mdNs.DataObject | js.Array[json2mdLib.json2mdMod.json2mdNs.DataObject] | java.lang.String | js.Array[java.lang.String],
    prefix: java.lang.String
  ): java.lang.String = js.native
}

