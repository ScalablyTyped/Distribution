package typings.graphql

import typings.graphql.languageAstMod.ASTKindToNode
import typings.graphql.languageAstMod.ASTNode
import typings.graphql.languageAstMod.ArgumentNode
import typings.graphql.languageAstMod.BooleanValueNode
import typings.graphql.languageAstMod.DirectiveDefinitionNode
import typings.graphql.languageAstMod.DirectiveNode
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.EnumTypeDefinitionNode
import typings.graphql.languageAstMod.EnumTypeExtensionNode
import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.languageAstMod.EnumValueNode
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FloatValueNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.FragmentSpreadNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.languageAstMod.IntValueNode
import typings.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.languageAstMod.ListTypeNode
import typings.graphql.languageAstMod.ListValueNode
import typings.graphql.languageAstMod.NameNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.NonNullTypeNode
import typings.graphql.languageAstMod.NullValueNode
import typings.graphql.languageAstMod.ObjectFieldNode
import typings.graphql.languageAstMod.ObjectTypeDefinitionNode
import typings.graphql.languageAstMod.ObjectTypeExtensionNode
import typings.graphql.languageAstMod.ObjectValueNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.languageAstMod.OperationTypeDefinitionNode
import typings.graphql.languageAstMod.ScalarTypeDefinitionNode
import typings.graphql.languageAstMod.ScalarTypeExtensionNode
import typings.graphql.languageAstMod.SchemaDefinitionNode
import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.languageAstMod.SelectionSetNode
import typings.graphql.languageAstMod.StringValueNode
import typings.graphql.languageAstMod.TypeNode
import typings.graphql.languageAstMod.UnionTypeDefinitionNode
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.languageAstMod.VariableDefinitionNode
import typings.graphql.languageAstMod.VariableNode
import typings.graphql.languageDirectiveLocationMod._DirectiveLocation
import typings.graphql.languageKindsMod._Kind
import typings.graphql.languageLexerMod.Lexer
import typings.graphql.languageLocationMod.SourceLocation
import typings.graphql.languageParserMod.ParseOptions
import typings.graphql.languageSourceMod.Location
import typings.graphql.languageTokenKindMod._TokenKind
import typings.graphql.languageVisitorMod.VisitFn
import typings.graphql.languageVisitorMod.Visitor
import typings.graphql.languageVisitorMod.VisitorKeyMap
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.utilitiesTypeInfoMod.TypeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Source protected ()
    extends typings.graphql.languageSourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  val BREAK: js.Any = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val Kind: _Kind = js.native
  val TokenKind: _TokenKind = js.native
  def createLexer[TOptions](source: typings.graphql.languageSourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def getLocation(source: typings.graphql.languageSourceMod.Source, position: Double): SourceLocation = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typings.graphql.languageSourceMod.Source): DocumentNode = js.native
  def parse(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typings.graphql.languageSourceMod.Source): TypeNode = js.native
  def parseType(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typings.graphql.languageSourceMod.Source): ValueNode = js.native
  def parseValue(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printLocation(location: typings.graphql.languageAstMod.Location): String = js.native
  def printSourceLocation(source: typings.graphql.languageSourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMap[ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
    ]
  ): Visitor[
    ASTKindToNode, 
    NullValueNode | FragmentDefinitionNode | UnionTypeExtensionNode | ArgumentNode | InlineFragmentNode | ListTypeNode | FieldDefinitionNode | OperationDefinitionNode | OperationTypeDefinitionNode | UnionTypeDefinitionNode | InputObjectTypeDefinitionNode | ListValueNode | SelectionSetNode | InterfaceTypeDefinitionNode | VariableNode | EnumValueDefinitionNode | EnumValueNode | EnumTypeExtensionNode | ObjectTypeDefinitionNode | SchemaDefinitionNode | SchemaExtensionNode | DirectiveNode | StringValueNode | NameNode | FloatValueNode | IntValueNode | ObjectFieldNode | NonNullTypeNode | DirectiveDefinitionNode | ObjectTypeExtensionNode | BooleanValueNode | ObjectValueNode | ScalarTypeExtensionNode | DocumentNode | InterfaceTypeExtensionNode | FieldNode | ScalarTypeDefinitionNode | VariableDefinitionNode | FragmentSpreadNode | NamedTypeNode | InputValueDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeExtensionNode
  ] = js.native
}

