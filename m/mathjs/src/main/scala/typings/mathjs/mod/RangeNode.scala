package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeNode[TStart /* <: MathNode */, TEnd /* <: MathNode */, TStep /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var end: TEnd = js.native
  
  var isRangeNode: `true` = js.native
  
  var start: TStart = js.native
  
  var step: TStep | Null = js.native
  
  @JSName("type")
  var type_RangeNode: typings.mathjs.mathjsStrings.RangeNode = js.native
}
