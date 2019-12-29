package typings.luaparse.libAstMod

import typings.luaparse.Anon_End
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
  - typings.luaparse.libAstMod.FunctionDeclaration
  - typings.luaparse.libAstMod.Identifier
  - typings.luaparse.libAstMod.StringLiteral
  - typings.luaparse.libAstMod.NumericLiteral
  - typings.luaparse.libAstMod.BooleanLiteral
  - typings.luaparse.libAstMod.NilLiteral
  - typings.luaparse.libAstMod.VarargLiteral
  - typings.luaparse.libAstMod.TableConstructorExpression
  - typings.luaparse.libAstMod.BinaryExpression
  - typings.luaparse.libAstMod.LogicalExpression
  - typings.luaparse.libAstMod.UnaryExpression
  - typings.luaparse.libAstMod.MemberExpression
  - typings.luaparse.libAstMod.IndexExpression
  - typings.luaparse.libAstMod.CallExpression
  - typings.luaparse.libAstMod.TableCallExpression
  - typings.luaparse.libAstMod.StringCallExpression
*/
trait Expression extends _Node

object Expression {
  @scala.inline
  def VarargLiteral(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.VarargLiteral,
    value: String,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringLiteral(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.StringLiteral,
    value: String,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableConstructorExpression(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typings.luaparse.luaparseStrings.UnaryExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def TableCallExpression(
    arguments: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.TableCallExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^  | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.BinaryExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def StringCallExpression(
    argument: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.StringCallExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NumericLiteral(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.NumericLiteral,
    value: Double,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def MemberExpression(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typings.luaparse.luaparseStrings.MemberExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def CallExpression(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.CallExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def IndexExpression(
    base: Expression,
    index: Expression,
    `type`: typings.luaparse.luaparseStrings.IndexExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def BooleanLiteral(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.BooleanLiteral,
    value: Boolean,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration,
    identifier: Identifier | MemberExpression = null,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def NilLiteral(
    raw: String,
    `type`: typings.luaparse.luaparseStrings.NilLiteral,
    value: Null,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def Identifier(name: String, `type`: typings.luaparse.luaparseStrings.Identifier, loc: Anon_End = null): Expression = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.LogicalExpression,
    loc: Anon_End = null
  ): Expression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expression]
  }
}

