package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexNode[TDims /* <: js.Array[MathNode] */]
  extends StObject
     with MathNode {
  
  var dimensions: TDims = js.native
  
  var dotNotation: Boolean = js.native
  
  var isIndexNode: `true` = js.native
  
  @JSName("type")
  var type_IndexNode: typings.mathjs.mathjsStrings.IndexNode = js.native
}
