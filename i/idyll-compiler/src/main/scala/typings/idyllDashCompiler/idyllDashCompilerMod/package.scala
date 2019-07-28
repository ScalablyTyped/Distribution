package typings.idyllDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllDashCompilerMod {
  type AST = js.Array[Node]
  type Node = TreeNode | String
  type PostProcessor = (js.Function1[/* ast */ AST, AST]) | (js.Function2[
    /* ast */ AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ AST, Unit], 
    Unit
  ])
  type PropData = String | Double | Boolean
  type PropKey = String
  type PropValue = js.Tuple2[PropType, PropData]
  type Property = js.Tuple2[PropKey, PropValue]
  type __RecursiveNode[T] = js.Tuple3[String, js.Array[Property], js.Array[T]]
}
