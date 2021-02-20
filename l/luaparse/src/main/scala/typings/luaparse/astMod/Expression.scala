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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.BinaryExpression
  ): typings.luaparse.astMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.BinaryExpression]
  }
  
  @scala.inline
  def BooleanLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.BooleanLiteral, value: Boolean): typings.luaparse.astMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.BooleanLiteral]
  }
  
  @scala.inline
  def CallExpression(
    arguments: js.Array[Expression],
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.CallExpression
  ): typings.luaparse.astMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.CallExpression]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: js.Array[Statement],
    isLocal: Boolean,
    parameters: js.Array[Identifier | VarargLiteral],
    `type`: typings.luaparse.luaparseStrings.FunctionDeclaration
  ): typings.luaparse.astMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.FunctionDeclaration]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typings.luaparse.luaparseStrings.Identifier): typings.luaparse.astMod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.Identifier]
  }
  
  @scala.inline
  def IndexExpression(base: Expression, index: Expression, `type`: typings.luaparse.luaparseStrings.IndexExpression): typings.luaparse.astMod.IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.IndexExpression]
  }
  
  @scala.inline
  def LogicalExpression(
    left: Expression,
    operator: or | and,
    right: Expression,
    `type`: typings.luaparse.luaparseStrings.LogicalExpression
  ): typings.luaparse.astMod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.LogicalExpression]
  }
  
  @scala.inline
  def MemberExpression(
    base: Expression,
    identifier: Identifier,
    indexer: Dot | Colon,
    `type`: typings.luaparse.luaparseStrings.MemberExpression
  ): typings.luaparse.astMod.MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.MemberExpression]
  }
  
  @scala.inline
  def NilLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.NilLiteral, value: Null): typings.luaparse.astMod.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.NilLiteral]
  }
  
  @scala.inline
  def NumericLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.NumericLiteral, value: Double): typings.luaparse.astMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.NumericLiteral]
  }
  
  @scala.inline
  def StringCallExpression(
    argument: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.StringCallExpression
  ): typings.luaparse.astMod.StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.StringCallExpression]
  }
  
  @scala.inline
  def StringLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.StringLiteral, value: String): typings.luaparse.astMod.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.StringLiteral]
  }
  
  @scala.inline
  def TableCallExpression(
    arguments: Expression,
    base: Expression,
    `type`: typings.luaparse.luaparseStrings.TableCallExpression
  ): typings.luaparse.astMod.TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.TableCallExpression]
  }
  
  @scala.inline
  def TableConstructorExpression(
    fields: js.Array[TableKey | TableKeyString | TableValue],
    `type`: typings.luaparse.luaparseStrings.TableConstructorExpression
  ): typings.luaparse.astMod.TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.TableConstructorExpression]
  }
  
  @scala.inline
  def UnaryExpression(
    argument: Expression,
    operator: not | `-_` | Tilde | Numbersign,
    `type`: typings.luaparse.luaparseStrings.UnaryExpression
  ): typings.luaparse.astMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.UnaryExpression]
  }
  
  @scala.inline
  def VarargLiteral(raw: String, `type`: typings.luaparse.luaparseStrings.VarargLiteral, value: String): typings.luaparse.astMod.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.luaparse.astMod.VarargLiteral]
  }
}
