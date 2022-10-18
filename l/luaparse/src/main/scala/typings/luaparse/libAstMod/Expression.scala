package typings.luaparse.libAstMod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Expression
  extends StObject
     with _Node
object Expression {
  
  inline def BinaryExpression(
    left: Expression,
    operator: Plussign | `-_` | Asterisk | Percentsign | ^ | Slash | SlashSlash | Ampersand | Verticalline | Tilde | LessthansignLessthansign | GreaterthansignGreaterthansign | DotDot | TildeEqualssign | EqualssignEqualssign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign,
    right: Expression
  ): typings.luaparse.libAstMod.BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.BinaryExpression]
  }
  
  inline def BooleanLiteral(raw: String, value: Boolean): typings.luaparse.libAstMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.luaparse.libAstMod.BooleanLiteral]
  }
  
  inline def CallExpression(arguments: js.Array[Expression], base: Expression): typings.luaparse.libAstMod.CallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.CallExpression]
  }
  
  inline def FunctionDeclaration(body: js.Array[Statement], isLocal: Boolean, parameters: js.Array[Identifier | VarargLiteral]): typings.luaparse.libAstMod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], isLocal = isLocal.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], identifier = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.luaparse.libAstMod.FunctionDeclaration]
  }
  
  inline def Identifier(name: String): typings.luaparse.libAstMod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.luaparse.libAstMod.Identifier]
  }
  
  inline def IndexExpression(base: Expression, index: Expression): typings.luaparse.libAstMod.IndexExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.IndexExpression]
  }
  
  inline def LogicalExpression(left: Expression, operator: or | and, right: Expression): typings.luaparse.libAstMod.LogicalExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.LogicalExpression]
  }
  
  inline def MemberExpression(base: Expression, identifier: Identifier, indexer: Dot | Colon): typings.luaparse.libAstMod.MemberExpression = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.MemberExpression]
  }
  
  inline def NilLiteral(raw: String, value: Null): typings.luaparse.libAstMod.NilLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NilLiteral")
    __obj.asInstanceOf[typings.luaparse.libAstMod.NilLiteral]
  }
  
  inline def NumericLiteral(raw: String, value: Double): typings.luaparse.libAstMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.luaparse.libAstMod.NumericLiteral]
  }
  
  inline def StringCallExpression(argument: Expression, base: Expression): typings.luaparse.libAstMod.StringCallExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringCallExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.StringCallExpression]
  }
  
  inline def StringLiteral(raw: String, value: String): typings.luaparse.libAstMod.StringLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.luaparse.libAstMod.StringLiteral]
  }
  
  inline def TableCallExpression(arguments: Expression, base: Expression): typings.luaparse.libAstMod.TableCallExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableCallExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.TableCallExpression]
  }
  
  inline def TableConstructorExpression(fields: js.Array[TableKey | TableKeyString | TableValue]): typings.luaparse.libAstMod.TableConstructorExpression = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TableConstructorExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.TableConstructorExpression]
  }
  
  inline def UnaryExpression(argument: Expression, operator: not | `-_` | Tilde | Numbersign): typings.luaparse.libAstMod.UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.luaparse.libAstMod.UnaryExpression]
  }
  
  inline def VarargLiteral(raw: String, value: String): typings.luaparse.libAstMod.VarargLiteral = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VarargLiteral")
    __obj.asInstanceOf[typings.luaparse.libAstMod.VarargLiteral]
  }
}
