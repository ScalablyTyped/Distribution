package typings.json2mq

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(query: js.Array[QueryObject]): String = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(query: QueryObject): String = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("json2mq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type QueryObject = StringDictionary[String | Double | Boolean]
}
