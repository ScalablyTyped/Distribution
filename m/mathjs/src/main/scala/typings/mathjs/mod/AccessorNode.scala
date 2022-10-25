package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessorNode[TObject /* <: MathNode */]
  extends StObject
     with MathNode {
  
  var index: IndexNode[js.Array[MathNode]] = js.native
  
  var isAccessorNode: `true` = js.native
  
  var name: String = js.native
  
  var `object`: TObject = js.native
  
  @JSName("type")
  var type_AccessorNode: typings.mathjs.mathjsStrings.AccessorNode = js.native
}
