package typings.json2mq

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json2mq", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(query: js.Array[QueryObject]): String = js.native
  def apply(query: QueryObject): String = js.native
  
  type QueryObject = StringDictionary[String | Double | Boolean]
}
