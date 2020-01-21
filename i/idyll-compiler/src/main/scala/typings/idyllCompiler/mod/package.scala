package typings.idyllCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AST = js.Array[typings.idyllCompiler.mod.Node]
  type Node = typings.idyllCompiler.mod.TreeNode | java.lang.String
  type PostProcessor = (js.Function1[/* ast */ typings.idyllCompiler.mod.AST, typings.idyllCompiler.mod.AST]) | (js.Function2[
    /* ast */ typings.idyllCompiler.mod.AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ typings.idyllCompiler.mod.AST, scala.Unit], 
    scala.Unit
  ])
  type PropData = java.lang.String | scala.Double | scala.Boolean
  type PropKey = java.lang.String
  type PropValue = js.Tuple2[typings.idyllCompiler.mod.PropType, typings.idyllCompiler.mod.PropData]
  type Property = js.Tuple2[typings.idyllCompiler.mod.PropKey, typings.idyllCompiler.mod.PropValue]
  type RecursiveNode[T] = js.Tuple3[java.lang.String, js.Array[typings.idyllCompiler.mod.Property], js.Array[T]]
}
