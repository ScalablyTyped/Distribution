package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstantNode
  extends StObject
     with MathNode {
  
  var isConstantNode: `true` = js.native
  
  @JSName("type")
  var type_ConstantNode: typings.mathjs.mathjsStrings.ConstantNode = js.native
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var value: Any = js.native
}
