package typings.graphql

import typings.graphql.anon.VisitorKeyMapASTKindToNod
import typings.graphql.astMod.ASTKindToNode
import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.BooleanValueNode
import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.astMod.DirectiveNode
import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.astMod.EnumValueNode
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FloatValueNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.FragmentSpreadNode
import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.astMod.IntValueNode
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.astMod.ListTypeNode
import typings.graphql.astMod.ListValueNode
import typings.graphql.astMod.NameNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.NonNullTypeNode
import typings.graphql.astMod.NullValueNode
import typings.graphql.astMod.ObjectFieldNode
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.astMod.ObjectValueNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.astMod.OperationTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.astMod.StringValueNode
import typings.graphql.astMod.TypeNode
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.astMod.VariableNode
import typings.graphql.graphqlStrings.$
import typings.graphql.graphqlStrings.Ampersand
import typings.graphql.graphqlStrings.Argument
import typings.graphql.graphqlStrings.BlockString
import typings.graphql.graphqlStrings.BooleanValue
import typings.graphql.graphqlStrings.Colon
import typings.graphql.graphqlStrings.Comment
import typings.graphql.graphqlStrings.Directive
import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.Document
import typings.graphql.graphqlStrings.DotDotDot
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.EnumValue
import typings.graphql.graphqlStrings.EnumValueDefinition
import typings.graphql.graphqlStrings.Equalssign
import typings.graphql.graphqlStrings.Exclamationmark
import typings.graphql.graphqlStrings.FieldDefinition
import typings.graphql.graphqlStrings.Field_
import typings.graphql.graphqlStrings.Float
import typings.graphql.graphqlStrings.FloatValue
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.FragmentSpread
import typings.graphql.graphqlStrings.InlineFragment
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InputValueDefinition
import typings.graphql.graphqlStrings.Int
import typings.graphql.graphqlStrings.IntValue
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.Leftcurlybracket
import typings.graphql.graphqlStrings.Leftparenthesis
import typings.graphql.graphqlStrings.LessthansignEOFGreaterthansign
import typings.graphql.graphqlStrings.LessthansignSOFGreaterthansign
import typings.graphql.graphqlStrings.ListType
import typings.graphql.graphqlStrings.ListValue
import typings.graphql.graphqlStrings.Name
import typings.graphql.graphqlStrings.NamedType
import typings.graphql.graphqlStrings.NonNullType
import typings.graphql.graphqlStrings.NullValue
import typings.graphql.graphqlStrings.ObjectField
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.ObjectValue
import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.graphqlStrings.OperationTypeDefinition
import typings.graphql.graphqlStrings.Rightcurlybracket
import typings.graphql.graphqlStrings.Rightparenthesis
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.SchemaDefinition
import typings.graphql.graphqlStrings.SchemaExtension
import typings.graphql.graphqlStrings.SelectionSet
import typings.graphql.graphqlStrings.StringValue
import typings.graphql.graphqlStrings.UnionTypeDefinition
import typings.graphql.graphqlStrings.UnionTypeExtension
import typings.graphql.graphqlStrings.Variable
import typings.graphql.graphqlStrings.VariableDefinition
import typings.graphql.graphqlStrings.Verticalline
import typings.graphql.graphqlStrings.`@`
import typings.graphql.graphqlStrings.`[`
import typings.graphql.graphqlStrings.`]`
import typings.graphql.locationMod.SourceLocation
import typings.graphql.maybeMod.Maybe
import typings.graphql.parserMod.ParseOptions
import typings.graphql.tokenKindMod.TokenKindEnum
import typings.graphql.visitorMod.VisitFn
import typings.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language", JSImport.Namespace)
@js.native
object languageMod extends js.Object {
  @js.native
  class Lexer protected ()
    extends typings.graphql.lexerMod.Lexer {
    def this(source: typings.graphql.sourceMod.Source) = this()
  }
  
  @js.native
  class Location protected ()
    extends typings.graphql.astMod.Location {
    def this(
      startToken: typings.graphql.astMod.Token,
      endToken: typings.graphql.astMod.Token,
      source: typings.graphql.sourceMod.Source
    ) = this()
  }
  
  @js.native
  class Source protected ()
    extends typings.graphql.sourceMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: js.UndefOr[scala.Nothing], locationOffset: typings.graphql.sourceMod.Location) = this()
    def this(body: String, name: String, locationOffset: typings.graphql.sourceMod.Location) = this()
  }
  
  @js.native
  class Token protected ()
    extends typings.graphql.astMod.Token {
    def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: typings.graphql.astMod.Token
    ) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: Null,
      value: String
    ) = this()
    def this(
      kind: TokenKindEnum,
      start: Double,
      end: Double,
      line: Double,
      column: Double,
      prev: typings.graphql.astMod.Token,
      value: String
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  def getLocation(source: typings.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
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
  def parse(source: typings.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typings.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typings.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typings.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typings.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typings.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printLocation(location: typings.graphql.astMod.Location): String = js.native
  def printSourceLocation(source: typings.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  @js.native
  object DirectiveLocation extends js.Object {
    var ARGUMENT_DEFINITION: typings.graphql.graphqlStrings.ARGUMENT_DEFINITION = js.native
    var ENUM: typings.graphql.graphqlStrings.ENUM = js.native
    var ENUM_VALUE: typings.graphql.graphqlStrings.ENUM_VALUE = js.native
    var FIELD: typings.graphql.graphqlStrings.FIELD = js.native
    var FIELD_DEFINITION: typings.graphql.graphqlStrings.FIELD_DEFINITION = js.native
    var FRAGMENT_DEFINITION: typings.graphql.graphqlStrings.FRAGMENT_DEFINITION = js.native
    var FRAGMENT_SPREAD: typings.graphql.graphqlStrings.FRAGMENT_SPREAD = js.native
    var INLINE_FRAGMENT: typings.graphql.graphqlStrings.INLINE_FRAGMENT = js.native
    var INPUT_FIELD_DEFINITION: typings.graphql.graphqlStrings.INPUT_FIELD_DEFINITION = js.native
    var INPUT_OBJECT: typings.graphql.graphqlStrings.INPUT_OBJECT = js.native
    var INTERFACE: typings.graphql.graphqlStrings.INTERFACE = js.native
    var MUTATION: typings.graphql.graphqlStrings.MUTATION = js.native
    var OBJECT: typings.graphql.graphqlStrings.OBJECT = js.native
    // Request Definitions
    var QUERY: typings.graphql.graphqlStrings.QUERY = js.native
    var SCALAR: typings.graphql.graphqlStrings.SCALAR = js.native
    // Type System Definitions
    var SCHEMA: typings.graphql.graphqlStrings.SCHEMA = js.native
    var SUBSCRIPTION: typings.graphql.graphqlStrings.SUBSCRIPTION = js.native
    var UNION: typings.graphql.graphqlStrings.UNION = js.native
    var VARIABLE_DEFINITION: typings.graphql.graphqlStrings.VARIABLE_DEFINITION = js.native
  }
  
  @js.native
  object Kind extends js.Object {
    var ARGUMENT: Argument = js.native
    var BOOLEAN: BooleanValue = js.native
    // Directives
    var DIRECTIVE: Directive = js.native
    // Directive Definitions
    var DIRECTIVE_DEFINITION: DirectiveDefinition = js.native
    // Document
    var DOCUMENT: Document = js.native
    var ENUM: EnumValue = js.native
    var ENUM_TYPE_DEFINITION: EnumTypeDefinition = js.native
    var ENUM_TYPE_EXTENSION: EnumTypeExtension = js.native
    var ENUM_VALUE_DEFINITION: EnumValueDefinition = js.native
    var FIELD: Field_ = js.native
    var FIELD_DEFINITION: FieldDefinition = js.native
    var FLOAT: FloatValue = js.native
    var FRAGMENT_DEFINITION: FragmentDefinition = js.native
    // Fragments
    var FRAGMENT_SPREAD: FragmentSpread = js.native
    var INLINE_FRAGMENT: InlineFragment = js.native
    var INPUT_OBJECT_TYPE_DEFINITION: InputObjectTypeDefinition = js.native
    var INPUT_OBJECT_TYPE_EXTENSION: InputObjectTypeExtension = js.native
    var INPUT_VALUE_DEFINITION: InputValueDefinition = js.native
    var INT: IntValue = js.native
    var INTERFACE_TYPE_DEFINITION: InterfaceTypeDefinition = js.native
    var INTERFACE_TYPE_EXTENSION: InterfaceTypeExtension = js.native
    var LIST: ListValue = js.native
    var LIST_TYPE: ListType = js.native
    // Name
    var NAME: Name = js.native
    // Types
    var NAMED_TYPE: NamedType = js.native
    var NON_NULL_TYPE: NonNullType = js.native
    var NULL: NullValue = js.native
    var OBJECT: ObjectValue = js.native
    var OBJECT_FIELD: ObjectField = js.native
    var OBJECT_TYPE_DEFINITION: ObjectTypeDefinition = js.native
    var OBJECT_TYPE_EXTENSION: ObjectTypeExtension = js.native
    var OPERATION_DEFINITION: OperationDefinition = js.native
    var OPERATION_TYPE_DEFINITION: OperationTypeDefinition = js.native
    // Type Definitions
    var SCALAR_TYPE_DEFINITION: ScalarTypeDefinition = js.native
    // Type Extensions
    var SCALAR_TYPE_EXTENSION: ScalarTypeExtension = js.native
    // Type System Definitions
    var SCHEMA_DEFINITION: SchemaDefinition = js.native
    // Type System Extensions
    var SCHEMA_EXTENSION: SchemaExtension = js.native
    var SELECTION_SET: SelectionSet = js.native
    var STRING: StringValue = js.native
    var UNION_TYPE_DEFINITION: UnionTypeDefinition = js.native
    var UNION_TYPE_EXTENSION: UnionTypeExtension = js.native
    // Values
    var VARIABLE: Variable = js.native
    var VARIABLE_DEFINITION: VariableDefinition = js.native
  }
  
  @js.native
  object TokenKind extends js.Object {
    var AMP: Ampersand = js.native
    var AT: `@` = js.native
    var BANG: Exclamationmark = js.native
    var BLOCK_STRING: BlockString = js.native
    var BRACE_L: Leftcurlybracket = js.native
    var BRACE_R: Rightcurlybracket = js.native
    var BRACKET_L: `[` = js.native
    var BRACKET_R: `]` = js.native
    var COLON: Colon = js.native
    var COMMENT: Comment = js.native
    var DOLLAR: $ = js.native
    var EOF: LessthansignEOFGreaterthansign = js.native
    var EQUALS: Equalssign = js.native
    var FLOAT: Float = js.native
    var INT: Int = js.native
    var NAME: Name = js.native
    var PAREN_L: Leftparenthesis = js.native
    var PAREN_R: Rightparenthesis = js.native
    var PIPE: Verticalline = js.native
    var SOF: LessthansignSOFGreaterthansign = js.native
    var SPREAD: DotDotDot = js.native
    var STRING: typings.graphql.graphqlStrings.String = js.native
  }
  
}

