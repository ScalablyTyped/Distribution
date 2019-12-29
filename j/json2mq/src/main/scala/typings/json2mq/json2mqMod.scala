package typings.json2mq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json2mq", JSImport.Namespace)
@js.native
object json2mqMod extends js.Object {
  def apply(query: js.Array[QueryObject]): String = js.native
  def apply(query: QueryObject): String = js.native
  type QueryObject = StringDictionary[String | Double | Boolean]
}

