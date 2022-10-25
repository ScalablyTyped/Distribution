package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayNode[TItems /* <: js.Array[MathNode] */]
  extends StObject
     with MathNode {
  
  var isArrayNode: `true` = js.native
  
  var items: TItems = js.native
  
  @JSName("type")
  var type_ArrayNode: typings.mathjs.mathjsStrings.ArrayNode = js.native
}
