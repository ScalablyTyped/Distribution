package typings.luaparse.astMod

import typings.luaparse.luaparseStrings.Ampersand
import typings.luaparse.luaparseStrings.Asterisk
import typings.luaparse.luaparseStrings.Colon
import typings.luaparse.luaparseStrings.Dot
import typings.luaparse.luaparseStrings.DotDot
import typings.luaparse.luaparseStrings.EqualssignEqualssign
import typings.luaparse.luaparseStrings.Greaterthansign
import typings.luaparse.luaparseStrings.GreaterthansignEqualssign
import typings.luaparse.luaparseStrings.GreaterthansignGreaterthansign
import typings.luaparse.luaparseStrings.Lessthansign
import typings.luaparse.luaparseStrings.LessthansignEqualssign
import typings.luaparse.luaparseStrings.LessthansignLessthansign
import typings.luaparse.luaparseStrings.Numbersign
import typings.luaparse.luaparseStrings.Percentsign
import typings.luaparse.luaparseStrings.Plussign
import typings.luaparse.luaparseStrings.Slash
import typings.luaparse.luaparseStrings.SlashSlash
import typings.luaparse.luaparseStrings.Tilde
import typings.luaparse.luaparseStrings.TildeEqualssign
import typings.luaparse.luaparseStrings.Verticalline
import typings.luaparse.luaparseStrings.^
import typings.luaparse.luaparseStrings.`-_`
import typings.luaparse.luaparseStrings.and
import typings.luaparse.luaparseStrings.not
import typings.luaparse.luaparseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.luaparse.astMod.FunctionDeclaration
  - typings.luaparse.astMod.Identifier
  - typings.luaparse.astMod.StringLiteral
  - typings.luaparse.astMod.NumericLiteral
  - typings.luaparse.astMod.BooleanLiteral
  - typings.luaparse.astMod.NilLiteral
  - typings.luaparse.astMod.VarargLiteral
  - typings.luaparse.astMod.TableConstructorExpression
  - typings.luaparse.astMod.BinaryExpression
  - typings.luaparse.astMod.LogicalExpression
  - typings.luaparse.astMod.UnaryExpression
  - typings.luaparse.astMod.MemberExpression
  - typings.luaparse.astMod.IndexExpression
  - typings.luaparse.astMod.CallExpression
  - typings.luaparse.astMod.TableCallExpression
  - typings.luaparse.astMod.StringCallExpression
*/
trait Expression extends _Node

object Expression {
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration
  ): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def IndexExpression(base: Expression, index: Expression, `type`: typings.luaparse.luaparseStrings.IndexExpression): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def VarargLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.VarargLiteral, value: String): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringCallExpression(
    argument: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.StringCallExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NilLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.NilLiteral, value: Null): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def CallExpression(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.CallExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BooleanLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.BooleanLiteral, value: Boolean): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MemberExpression(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typings.luaparse.luaparseStrings.MemberExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.BinaryExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NumericLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.NumericLiteral, value: Double): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typings.luaparse.luaparseStrings.UnaryExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.LogicalExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableConstructorExpression(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def Identifier(name: String, `type`: typings.luaparse.luaparseStrings.Identifier): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableCallExpression(
    arguments: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.TableCallExpression
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.StringLiteral, value: String): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

