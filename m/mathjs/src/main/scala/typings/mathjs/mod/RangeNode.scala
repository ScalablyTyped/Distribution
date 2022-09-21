package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeNode
  extends StObject
     with MathNodeCommon
     with _MathNode {
  
  var end: MathNode = js.native
  
  var isRangeNode: `true` = js.native
  
  var start: MathNode = js.native
  
  var step: MathNode | Null = js.native
  
  @JSName("type")
  var type_RangeNode: typings.mathjs.mathjsStrings.RangeNode = js.native
}
