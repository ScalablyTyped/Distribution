package typings.mathjs.mod

import typings.mathjs.mathjsBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectNode[TProps /* <: Record[String, MathNode] */]
  extends StObject
     with MathNode {
  
  var isObjectNode: `true` = js.native
  
  var properties: TProps = js.native
  
  @JSName("type")
  var type_ObjectNode: typings.mathjs.mathjsStrings.ObjectNode = js.native
}
