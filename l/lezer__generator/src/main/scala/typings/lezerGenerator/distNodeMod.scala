package typings.lezerGenerator

import typings.lezerGenerator.anon.Expr
import typings.lezerGenerator.anon.Id
import typings.lezerGenerator.anon.IdProps
import typings.lezerGenerator.anon.Props
import typings.lezerGenerator.lezerGeneratorStrings.Asterisk
import typings.lezerGenerator.lezerGeneratorStrings.Plussign
import typings.lezerGenerator.lezerGeneratorStrings.Questionmark
import typings.lezerGenerator.lezerGeneratorStrings.ambig
import typings.lezerGenerator.lezerGeneratorStrings.extend
import typings.lezerGenerator.lezerGeneratorStrings.prec
import typings.lezerGenerator.lezerGeneratorStrings.specialize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeMod {
  
  @JSImport("@lezer/generator/dist/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lezer/generator/dist/node", "AnyExpression")
  @js.native
  open class AnyExpression protected () extends Expression {
    def this(start: Double) = this()
    
    def eq(): Boolean = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "CharClass")
  @js.native
  open class CharClass protected () extends Expression {
    def this(start: Double, `type`: String) = this()
    
    def eq(expr: CharClass): Boolean = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ChoiceExpression")
  @js.native
  open class ChoiceExpression protected () extends Expression {
    def this(start: Double, exprs: js.Array[Expression]) = this()
    
    def eq(other: ChoiceExpression): Boolean = js.native
    
    val exprs: js.Array[Expression] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ConflictMarker")
  @js.native
  open class ConflictMarker protected () extends Node {
    def this(start: Double, id: Identifier, `type`: ambig | prec) = this()
    
    def eq(other: ConflictMarker): Boolean = js.native
    
    val id: Identifier = js.native
    
    val `type`: ambig | prec = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ContextDeclaration")
  @js.native
  open class ContextDeclaration protected () extends Node {
    def this(start: Double, id: Identifier, source: String) = this()
    
    val id: Identifier = js.native
    
    val source: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "Expression")
  @js.native
  open class Expression protected () extends Node {
    def this(start: Double) = this()
    
    def eq(_other: Expression): Boolean = js.native
    
    var prec: Double = js.native
    
    def walk(f: js.Function1[/* expr */ this.type, this.type]): Expression = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ExternalPropDeclaration")
  @js.native
  open class ExternalPropDeclaration protected () extends Node {
    def this(start: Double, id: Identifier, externalID: Identifier, source: String) = this()
    
    val externalID: Identifier = js.native
    
    val id: Identifier = js.native
    
    val source: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ExternalPropSourceDeclaration")
  @js.native
  open class ExternalPropSourceDeclaration protected () extends Node {
    def this(start: Double, id: Identifier, source: String) = this()
    
    val id: Identifier = js.native
    
    val source: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ExternalSpecializeDeclaration")
  @js.native
  open class ExternalSpecializeDeclaration protected () extends Node {
    def this(
      start: Double,
      `type`: extend | specialize,
      token: Expression,
      id: Identifier,
      source: String,
      tokens: js.Array[IdProps]
    ) = this()
    
    val id: Identifier = js.native
    
    val source: String = js.native
    
    val token: Expression = js.native
    
    val tokens: js.Array[IdProps] = js.native
    
    val `type`: extend | specialize = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "ExternalTokenDeclaration")
  @js.native
  open class ExternalTokenDeclaration protected () extends Node {
    def this(start: Double, id: Identifier, source: String, tokens: js.Array[IdProps]) = this()
    
    val id: Identifier = js.native
    
    val source: String = js.native
    
    val tokens: js.Array[IdProps] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "GrammarDeclaration")
  @js.native
  open class GrammarDeclaration protected () extends Node {
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: Null,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: Null,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: Null,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Null,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    def this(
      start: Double,
      rules: js.Array[RuleDeclaration],
      topRules: js.Array[RuleDeclaration],
      tokens: TokenDeclaration,
      localTokens: js.Array[LocalTokenDeclaration],
      context: ContextDeclaration,
      externalTokens: js.Array[ExternalTokenDeclaration],
      externalSpecializers: js.Array[ExternalSpecializeDeclaration],
      externalPropSources: js.Array[ExternalPropSourceDeclaration],
      precedences: PrecDeclaration,
      mainSkip: Expression,
      scopedSkip: js.Array[Expr],
      dialects: js.Array[Identifier],
      externalProps: js.Array[ExternalPropDeclaration],
      autoDelim: Boolean
    ) = this()
    
    val autoDelim: Boolean = js.native
    
    val context: ContextDeclaration | Null = js.native
    
    val dialects: js.Array[Identifier] = js.native
    
    val externalPropSources: js.Array[ExternalPropSourceDeclaration] = js.native
    
    val externalProps: js.Array[ExternalPropDeclaration] = js.native
    
    val externalSpecializers: js.Array[ExternalSpecializeDeclaration] = js.native
    
    val externalTokens: js.Array[ExternalTokenDeclaration] = js.native
    
    val localTokens: js.Array[LocalTokenDeclaration] = js.native
    
    val mainSkip: Expression | Null = js.native
    
    val precedences: PrecDeclaration | Null = js.native
    
    val rules: js.Array[RuleDeclaration] = js.native
    
    val scopedSkip: js.Array[Expr] = js.native
    
    val tokens: TokenDeclaration | Null = js.native
    
    val topRules: js.Array[RuleDeclaration] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "Identifier")
  @js.native
  open class Identifier protected () extends Node {
    def this(start: Double, name: String) = this()
    
    val name: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "InlineRuleExpression")
  @js.native
  open class InlineRuleExpression protected () extends Expression {
    def this(start: Double, rule: RuleDeclaration) = this()
    
    def eq(other: InlineRuleExpression): Boolean = js.native
    
    val rule: RuleDeclaration = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "LiteralDeclaration")
  @js.native
  open class LiteralDeclaration protected () extends Node {
    def this(start: Double, literal: String, props: js.Array[Prop]) = this()
    
    val literal: String = js.native
    
    val props: js.Array[Prop] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "LiteralExpression")
  @js.native
  open class LiteralExpression protected () extends Expression {
    def this(start: Double, value: String) = this()
    
    def eq(other: LiteralExpression): Boolean = js.native
    
    val value: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "LocalTokenDeclaration")
  @js.native
  open class LocalTokenDeclaration protected () extends Node {
    def this(start: Double, precedences: js.Array[TokenPrecDeclaration], rules: js.Array[RuleDeclaration]) = this()
    def this(
      start: Double,
      precedences: js.Array[TokenPrecDeclaration],
      rules: js.Array[RuleDeclaration],
      fallback: Props
    ) = this()
    
    val fallback: Props | Null = js.native
    
    val precedences: js.Array[TokenPrecDeclaration] = js.native
    
    val rules: js.Array[RuleDeclaration] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "NameExpression")
  @js.native
  open class NameExpression protected () extends Expression {
    def this(start: Double, id: Identifier, args: js.Array[Expression]) = this()
    
    val args: js.Array[Expression] = js.native
    
    def eq(other: NameExpression): Boolean = js.native
    
    val id: Identifier = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "Node")
  @js.native
  open class Node protected () extends StObject {
    def this(start: Double) = this()
    
    val start: Double = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "PrecDeclaration")
  @js.native
  open class PrecDeclaration protected () extends Node {
    def this(start: Double, items: js.Array[Id]) = this()
    
    val items: js.Array[Id] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "Prop")
  @js.native
  open class Prop protected () extends Node {
    def this(start: Double, at: Boolean, name: String, value: js.Array[PropPart]) = this()
    
    val at: Boolean = js.native
    
    def eq(other: Prop): Boolean = js.native
    
    val name: String = js.native
    
    val value: js.Array[PropPart] = js.native
  }
  /* static members */
  object Prop {
    
    @JSImport("@lezer/generator/dist/node", "Prop")
    @js.native
    val ^ : js.Any = js.native
    
    inline def eqProps(a: js.Array[Prop], b: js.Array[Prop]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eqProps")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("@lezer/generator/dist/node", "PropPart")
  @js.native
  open class PropPart protected () extends Node {
    def this(start: Double) = this()
    def this(start: Double, value: String) = this()
    def this(start: Double, value: String, name: String) = this()
    def this(start: Double, value: Null, name: String) = this()
    
    val name: String | Null = js.native
    
    val value: String | Null = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "RepeatExpression")
  @js.native
  open class RepeatExpression protected () extends Expression {
    def this(start: Double, expr: Expression, kind: Questionmark | Asterisk | Plussign) = this()
    
    def eq(other: RepeatExpression): Boolean = js.native
    
    val expr: Expression = js.native
    
    val kind: Questionmark | Asterisk | Plussign = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "RuleDeclaration")
  @js.native
  open class RuleDeclaration protected () extends Node {
    def this(
      start: Double,
      id: Identifier,
      props: js.Array[Prop],
      params: js.Array[Identifier],
      expr: Expression
    ) = this()
    
    val expr: Expression = js.native
    
    val id: Identifier = js.native
    
    val params: js.Array[Identifier] = js.native
    
    val props: js.Array[Prop] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "SequenceExpression")
  @js.native
  open class SequenceExpression protected () extends Expression {
    def this(start: Double, exprs: js.Array[Expression], markers: js.Array[js.Array[ConflictMarker]]) = this()
    def this(
      start: Double,
      exprs: js.Array[Expression],
      markers: js.Array[js.Array[ConflictMarker]],
      empty: Boolean
    ) = this()
    
    val empty: Boolean = js.native
    
    def eq(other: SequenceExpression): Boolean = js.native
    
    val exprs: js.Array[Expression] = js.native
    
    val markers: js.Array[js.Array[ConflictMarker]] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "SetExpression")
  @js.native
  open class SetExpression protected () extends Expression {
    def this(start: Double, ranges: js.Array[js.Tuple2[Double, Double]], inverted: Boolean) = this()
    
    def eq(other: SetExpression): Boolean = js.native
    
    val inverted: Boolean = js.native
    
    val ranges: js.Array[js.Tuple2[Double, Double]] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "SpecializeExpression")
  @js.native
  open class SpecializeExpression protected () extends Expression {
    def this(start: Double, `type`: String, props: js.Array[Prop], token: Expression, content: Expression) = this()
    
    val content: Expression = js.native
    
    def eq(other: SpecializeExpression): Boolean = js.native
    
    val props: js.Array[Prop] = js.native
    
    val token: Expression = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "TokenConflictDeclaration")
  @js.native
  open class TokenConflictDeclaration protected () extends Node {
    def this(start: Double, a: LiteralExpression, b: LiteralExpression) = this()
    def this(start: Double, a: LiteralExpression, b: NameExpression) = this()
    def this(start: Double, a: NameExpression, b: LiteralExpression) = this()
    def this(start: Double, a: NameExpression, b: NameExpression) = this()
    
    val a: NameExpression | LiteralExpression = js.native
    
    val b: NameExpression | LiteralExpression = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "TokenDeclaration")
  @js.native
  open class TokenDeclaration protected () extends Node {
    def this(
      start: Double,
      precedences: js.Array[TokenPrecDeclaration],
      conflicts: js.Array[TokenConflictDeclaration],
      rules: js.Array[RuleDeclaration],
      literals: js.Array[LiteralDeclaration]
    ) = this()
    
    val conflicts: js.Array[TokenConflictDeclaration] = js.native
    
    val literals: js.Array[LiteralDeclaration] = js.native
    
    val precedences: js.Array[TokenPrecDeclaration] = js.native
    
    val rules: js.Array[RuleDeclaration] = js.native
  }
  
  @JSImport("@lezer/generator/dist/node", "TokenPrecDeclaration")
  @js.native
  open class TokenPrecDeclaration protected () extends Node {
    def this(start: Double, items: js.Array[NameExpression | LiteralExpression]) = this()
    
    val items: js.Array[NameExpression | LiteralExpression] = js.native
  }
  
  inline def exprEq(a: Expression, b: Expression): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exprEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def exprsEq(a: js.Array[Expression], b: js.Array[Expression]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exprsEq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
