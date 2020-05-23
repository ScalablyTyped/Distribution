package typings.luaparse.astMod

import typings.luaparse.anon.End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Statement extends _Node

object _Statement {
  @scala.inline
  def LabelStatement(label: Identifier, `type`: typings.luaparse.luaparseStrings.LabelStatement, loc: End = null): _Statement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def ForGenericStatement(
    body: js.Array[Statement],
    iterators: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ForGenericStatement,
    variables: js.Array[Identifier],
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], iterators = iterators.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def LocalStatement(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.LocalStatement,
    variables: js.Array[Identifier],
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def IfStatement(
    clauses: js.Array[IfClause | ElseifClause | ElseClause],
    `type`: typings.luaparse.luaparseStrings.IfStatement,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(clauses = clauses.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def DoStatement(body: js.Array[Statement], `type`: typings.luaparse.luaparseStrings.DoStatement, loc: End = null): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def AssignmentStatement(
    init: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.AssignmentStatement,
    variables: js.Array[IndexExpression | MemberExpression | Identifier],
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def CallStatement(
    expression: CallExpression | StringCallExpression | TableCallExpression,
    `type`: typings.luaparse.luaparseStrings.CallStatement,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def GotoStatement(label: Identifier, `type`: typings.luaparse.luaparseStrings.GotoStatement, loc: End = null): _Statement = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def WhileStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.WhileStatement,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def ForNumericStatement(
    body: js.Array[Statement],
    end: Expression,
    start: Expression,
    `type`: typings.luaparse.luaparseStrings.ForNumericStatement,
    variable: Identifier,
    loc: End = null,
    step: Expression = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def RepeatStatement(
    body: js.Array[Statement],
    condition: Expression,
    `type`: typings.luaparse.luaparseStrings.RepeatStatement,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
  @scala.inline
  def ReturnStatement(
    arguments: js.Array[Expression],
    `type`: typings.luaparse.luaparseStrings.ReturnStatement,
    loc: End = null
  ): _Statement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Statement]
  }
}

