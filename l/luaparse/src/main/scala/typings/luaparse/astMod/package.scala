package typings.luaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object astMod {
  type BreakStatement = typings.luaparse.astMod.Base[typings.luaparse.luaparseStrings.BreakStatement]
  /* Rewritten from type alias, can be one of: 
    - typings.luaparse.astMod.Statement
    - typings.luaparse.astMod.Expression
    - typings.luaparse.astMod.IfClause
    - typings.luaparse.astMod.ElseifClause
    - typings.luaparse.astMod.ElseClause
    - typings.luaparse.astMod.Chunk
    - typings.luaparse.astMod.TableKey
    - typings.luaparse.astMod.TableKeyString
    - typings.luaparse.astMod.TableValue
    - typings.luaparse.astMod.Comment
  */
  type Node = typings.luaparse.astMod._Node | typings.luaparse.astMod.BreakStatement
  /* Rewritten from type alias, can be one of: 
    - typings.luaparse.astMod.LabelStatement
    - typings.luaparse.astMod.BreakStatement
    - typings.luaparse.astMod.GotoStatement
    - typings.luaparse.astMod.ReturnStatement
    - typings.luaparse.astMod.IfStatement
    - typings.luaparse.astMod.WhileStatement
    - typings.luaparse.astMod.DoStatement
    - typings.luaparse.astMod.RepeatStatement
    - typings.luaparse.astMod.LocalStatement
    - typings.luaparse.astMod.AssignmentStatement
    - typings.luaparse.astMod.CallStatement
    - typings.luaparse.astMod.FunctionDeclaration
    - typings.luaparse.astMod.ForNumericStatement
    - typings.luaparse.astMod.ForGenericStatement
  */
  type Statement = typings.luaparse.astMod._Statement | typings.luaparse.astMod.BreakStatement
}
