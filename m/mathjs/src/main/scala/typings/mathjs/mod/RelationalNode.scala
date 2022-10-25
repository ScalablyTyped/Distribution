package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalNode[TParams /* <: js.Array[MathNode] */]
  extends StObject
     with MathNode {
  
  var conditionals: js.Array[String] = js.native
  
  var isRelationalNode: `true` = js.native
  
  var params: TParams = js.native
  
  @JSName("type")
  var type_RelationalNode: typings.mathjs.mathjsStrings.RelationalNode = js.native
}
