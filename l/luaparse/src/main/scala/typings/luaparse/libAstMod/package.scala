package typings.luaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAstMod {
  type BreakStatement = Base[typings.luaparse.luaparseStrings.BreakStatement]
  /* Rewritten from type alias, can be one of: 
    - typings.luaparse.libAstMod.Statement
    - typings.luaparse.libAstMod.Expression
    - typings.luaparse.libAstMod.IfClause
    - typings.luaparse.libAstMod.ElseifClause
    - typings.luaparse.libAstMod.ElseClause
    - typings.luaparse.libAstMod.Chunk
    - typings.luaparse.libAstMod.TableKey
    - typings.luaparse.libAstMod.TableKeyString
    - typings.luaparse.libAstMod.TableValue
    - typings.luaparse.libAstMod.Comment
  */
  type Node = _Node | BreakStatement
  /* Rewritten from type alias, can be one of: 
    - typings.luaparse.libAstMod.LabelStatement
    - typings.luaparse.libAstMod.BreakStatement
    - typings.luaparse.libAstMod.GotoStatement
    - typings.luaparse.libAstMod.ReturnStatement
    - typings.luaparse.libAstMod.IfStatement
    - typings.luaparse.libAstMod.WhileStatement
    - typings.luaparse.libAstMod.DoStatement
    - typings.luaparse.libAstMod.RepeatStatement
    - typings.luaparse.libAstMod.LocalStatement
    - typings.luaparse.libAstMod.AssignmentStatement
    - typings.luaparse.libAstMod.CallStatement
    - typings.luaparse.libAstMod.FunctionDeclaration
    - typings.luaparse.libAstMod.ForNumericStatement
    - typings.luaparse.libAstMod.ForGenericStatement
  */
  type Statement = _Statement | BreakStatement
}
