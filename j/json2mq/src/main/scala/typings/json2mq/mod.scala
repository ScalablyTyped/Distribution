package typings.json2mq

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json2mq", JSImport.Namespace)
  @js.native
  def apply(query: js.Array[QueryObject]): String = js.native
  @JSImport("json2mq", JSImport.Namespace)
  @js.native
  def apply(query: QueryObject): String = js.native
  
  type QueryObject = StringDictionary[String | Double | Boolean]
}
