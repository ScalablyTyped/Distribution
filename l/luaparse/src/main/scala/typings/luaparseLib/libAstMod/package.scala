package typings
package luaparseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAstMod {
  type BreakStatement = Base[luaparseLib.luaparseLibStrings.BreakStatement]
  /* Rewritten from type alias, can be one of: 
    - Statement
    - Expression
    - IfClause
    - ElseifClause
    - ElseClause
    - Chunk
    - TableKey
    - TableKeyString
    - TableValue
    - Comment
  */
  type Node = _Node | BreakStatement
  /* Rewritten from type alias, can be one of: 
    - LabelStatement
    - BreakStatement
    - GotoStatement
    - ReturnStatement
    - IfStatement
    - WhileStatement
    - DoStatement
    - RepeatStatement
    - LocalStatement
    - AssignmentStatement
    - CallStatement
    - FunctionDeclaration
    - ForNumericStatement
    - ForGenericStatement
  */
  type Statement = _Statement | BreakStatement
}
