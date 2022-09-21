package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParenthesisNode[TContent /* <: MathNode */]
  extends StObject
     with MathNodeCommon {
  
  var content: TContent = js.native
  
  var isParenthesisNode: `true` = js.native
  
  @JSName("type")
  var type_ParenthesisNode: typings.mathjs.mathjsStrings.ParenthesisNode = js.native
}
