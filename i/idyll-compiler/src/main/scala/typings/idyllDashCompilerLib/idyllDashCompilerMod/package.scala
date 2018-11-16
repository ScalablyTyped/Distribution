package typings
package idyllDashCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllDashCompilerMod {
  type AST = js.Array[Node]
  type Node = TreeNode | java.lang.String
  type PostProcessor = (js.Function1[/* ast */ AST, AST]) | (js.Function2[
    /* ast */ AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ AST, scala.Unit], 
    scala.Unit
  ])
  type PropData = java.lang.String | scala.Double | scala.Boolean
  type PropKey = java.lang.String
  type PropType = idyllDashCompilerLib.idyllDashCompilerLibStrings.variable | idyllDashCompilerLib.idyllDashCompilerLibStrings.value | idyllDashCompilerLib.idyllDashCompilerLibStrings.expression
  type PropValue = js.Tuple2[PropType, PropData]
  type Property = js.Tuple2[PropKey, PropValue]
}
