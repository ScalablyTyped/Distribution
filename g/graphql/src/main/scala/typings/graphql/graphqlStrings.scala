package typings.graphql

import typings.graphql.languageAstMod.OperationTypeNode
import typings.graphql.languageDirectiveLocationMod.DirectiveLocationEnum
import typings.graphql.languageKindsMod.KindEnum
import typings.graphql.languageTokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graphqlStrings {
  @js.native
  sealed trait `!` extends TokenKindEnum
  
  @js.native
  sealed trait `&` extends TokenKindEnum
  
  @js.native
  sealed trait `(` extends TokenKindEnum
  
  @js.native
  sealed trait `)` extends TokenKindEnum
  
  @js.native
  sealed trait `:` extends TokenKindEnum
  
  @js.native
  sealed trait `<EOF>` extends TokenKindEnum
  
  @js.native
  sealed trait `<SOF>` extends TokenKindEnum
  
  @js.native
  sealed trait `=` extends TokenKindEnum
  
  @js.native
  sealed trait `@` extends TokenKindEnum
  
  @js.native
  sealed trait ARGUMENT_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait ARG_CHANGED_KIND extends js.Object
  
  @js.native
  sealed trait ARG_DEFAULT_VALUE_CHANGE extends js.Object
  
  @js.native
  sealed trait ARG_REMOVED extends js.Object
  
  @js.native
  sealed trait Argument extends KindEnum
  
  @js.native
  sealed trait BlockString extends TokenKindEnum
  
  @js.native
  sealed trait BooleanValue extends KindEnum
  
  @js.native
  sealed trait Comment extends TokenKindEnum
  
  @js.native
  sealed trait DIRECTIVE_ARG_REMOVED extends js.Object
  
  @js.native
  sealed trait DIRECTIVE_LOCATION_REMOVED extends js.Object
  
  @js.native
  sealed trait DIRECTIVE_REMOVED extends js.Object
  
  @js.native
  sealed trait DOLLAR extends TokenKindEnum
  
  @js.native
  sealed trait DOTDOTDOT extends TokenKindEnum
  
  @js.native
  sealed trait Directive extends KindEnum
  
  @js.native
  sealed trait DirectiveDefinition extends KindEnum
  
  @js.native
  sealed trait Document extends KindEnum
  
  @js.native
  sealed trait ENUM extends DirectiveLocationEnum
  
  @js.native
  sealed trait ENUM_VALUE extends DirectiveLocationEnum
  
  @js.native
  sealed trait EnterLeaveVisitor extends js.Object
  
  @js.native
  sealed trait EnumTypeDefinition extends KindEnum
  
  @js.native
  sealed trait EnumTypeExtension extends KindEnum
  
  @js.native
  sealed trait EnumValue extends KindEnum
  
  @js.native
  sealed trait EnumValueDefinition extends KindEnum
  
  @js.native
  sealed trait FIELD extends DirectiveLocationEnum
  
  @js.native
  sealed trait FIELD_CHANGED_KIND extends js.Object
  
  @js.native
  sealed trait FIELD_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait FIELD_REMOVED extends js.Object
  
  @js.native
  sealed trait FRAGMENT_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait FRAGMENT_SPREAD extends DirectiveLocationEnum
  
  @js.native
  sealed trait FieldDefinition extends KindEnum
  
  @js.native
  sealed trait Field_ extends KindEnum
  
  @js.native
  sealed trait Float extends TokenKindEnum
  
  @js.native
  sealed trait FloatValue extends KindEnum
  
  @js.native
  sealed trait FragmentDefinition extends KindEnum
  
  @js.native
  sealed trait FragmentSpread extends KindEnum
  
  @js.native
  sealed trait INLINE_FRAGMENT extends DirectiveLocationEnum
  
  @js.native
  sealed trait INPUT_FIELD_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait INPUT_OBJECT extends DirectiveLocationEnum
  
  @js.native
  sealed trait INTERFACE extends DirectiveLocationEnum
  
  @js.native
  sealed trait INTERFACE_ADDED_TO_OBJECT extends js.Object
  
  @js.native
  sealed trait INTERFACE_REMOVED_FROM_OBJECT extends js.Object
  
  @js.native
  sealed trait InlineFragment extends KindEnum
  
  @js.native
  sealed trait InputObjectTypeDefinition extends KindEnum
  
  @js.native
  sealed trait InputObjectTypeExtension extends KindEnum
  
  @js.native
  sealed trait InputValueDefinition extends KindEnum
  
  @js.native
  sealed trait Int extends TokenKindEnum
  
  @js.native
  sealed trait IntValue extends KindEnum
  
  @js.native
  sealed trait InterfaceTypeDefinition extends KindEnum
  
  @js.native
  sealed trait InterfaceTypeExtension extends KindEnum
  
  @js.native
  sealed trait LIST extends js.Object
  
  @js.native
  sealed trait ListType extends KindEnum
  
  @js.native
  sealed trait ListValue extends KindEnum
  
  @js.native
  sealed trait MUTATION extends DirectiveLocationEnum
  
  @js.native
  sealed trait NON_NULL extends js.Object
  
  @js.native
  sealed trait Name
    extends KindEnum
       with TokenKindEnum
  
  @js.native
  sealed trait NamedType extends KindEnum
  
  @js.native
  sealed trait `No longer supported` extends js.Object
  
  @js.native
  sealed trait NonNullType extends KindEnum
  
  @js.native
  sealed trait NullValue extends KindEnum
  
  @js.native
  sealed trait OBJECT extends DirectiveLocationEnum
  
  @js.native
  sealed trait OPTIONAL_ARG_ADDED extends js.Object
  
  @js.native
  sealed trait OPTIONAL_INPUT_FIELD_ADDED extends js.Object
  
  @js.native
  sealed trait ObjectField extends KindEnum
  
  @js.native
  sealed trait ObjectTypeDefinition extends KindEnum
  
  @js.native
  sealed trait ObjectTypeExtension extends KindEnum
  
  @js.native
  sealed trait ObjectValue extends KindEnum
  
  @js.native
  sealed trait OperationDefinition extends KindEnum
  
  @js.native
  sealed trait OperationTypeDefinition extends KindEnum
  
  @js.native
  sealed trait QUERY extends DirectiveLocationEnum
  
  @js.native
  sealed trait REQUIRED_ARG_ADDED extends js.Object
  
  @js.native
  sealed trait REQUIRED_DIRECTIVE_ARG_ADDED extends js.Object
  
  @js.native
  sealed trait REQUIRED_INPUT_FIELD_ADDED extends js.Object
  
  @js.native
  sealed trait SCALAR extends DirectiveLocationEnum
  
  @js.native
  sealed trait SCHEMA extends DirectiveLocationEnum
  
  @js.native
  sealed trait SUBSCRIPTION extends DirectiveLocationEnum
  
  @js.native
  sealed trait ScalarTypeDefinition extends KindEnum
  
  @js.native
  sealed trait ScalarTypeExtension extends KindEnum
  
  @js.native
  sealed trait SchemaDefinition extends KindEnum
  
  @js.native
  sealed trait SchemaExtension extends KindEnum
  
  @js.native
  sealed trait SelectionSet extends KindEnum
  
  @js.native
  sealed trait ShapeMapVisitor extends js.Object
  
  @js.native
  sealed trait String extends TokenKindEnum
  
  @js.native
  sealed trait StringValue extends KindEnum
  
  @js.native
  sealed trait TYPE_ADDED_TO_UNION extends js.Object
  
  @js.native
  sealed trait TYPE_CHANGED_KIND extends js.Object
  
  @js.native
  sealed trait TYPE_REMOVED extends js.Object
  
  @js.native
  sealed trait TYPE_REMOVED_FROM_UNION extends js.Object
  
  @js.native
  sealed trait UNION extends DirectiveLocationEnum
  
  @js.native
  sealed trait UnionTypeDefinition extends KindEnum
  
  @js.native
  sealed trait UnionTypeExtension extends KindEnum
  
  @js.native
  sealed trait VALUE_ADDED_TO_ENUM extends js.Object
  
  @js.native
  sealed trait VALUE_REMOVED_FROM_ENUM extends js.Object
  
  @js.native
  sealed trait VARIABLE_DEFINITION extends DirectiveLocationEnum
  
  @js.native
  sealed trait Variable extends KindEnum
  
  @js.native
  sealed trait VariableDefinition extends KindEnum
  
  @js.native
  sealed trait VisitorKeyMap extends js.Object
  
  @js.native
  sealed trait `[` extends TokenKindEnum
  
  @js.native
  sealed trait `]` extends TokenKindEnum
  
  @js.native
  sealed trait alias extends js.Object
  
  @js.native
  sealed trait arguments extends js.Object
  
  @js.native
  sealed trait defaultValue extends js.Object
  
  @js.native
  sealed trait definitions extends js.Object
  
  @js.native
  sealed trait description extends js.Object
  
  @js.native
  sealed trait directives extends js.Object
  
  @js.native
  sealed trait fields extends js.Object
  
  @js.native
  sealed trait interfaces extends js.Object
  
  @js.native
  sealed trait locations extends js.Object
  
  @js.native
  sealed trait mutation_ extends OperationTypeNode
  
  @js.native
  sealed trait name_ extends js.Object
  
  @js.native
  sealed trait operationTypes extends js.Object
  
  @js.native
  sealed trait query_ extends OperationTypeNode
  
  @js.native
  sealed trait selectionSet_ extends js.Object
  
  @js.native
  sealed trait selections extends js.Object
  
  @js.native
  sealed trait subscription_ extends OperationTypeNode
  
  @js.native
  sealed trait `type` extends js.Object
  
  @js.native
  sealed trait typeCondition extends js.Object
  
  @js.native
  sealed trait types extends js.Object
  
  @js.native
  sealed trait value extends js.Object
  
  @js.native
  sealed trait values extends js.Object
  
  @js.native
  sealed trait variableDefinitions extends js.Object
  
  @js.native
  sealed trait variable_ extends js.Object
  
  @js.native
  sealed trait `{` extends TokenKindEnum
  
  @js.native
  sealed trait `|` extends TokenKindEnum
  
  @js.native
  sealed trait `}` extends TokenKindEnum
  
  @scala.inline
  def `!`: `!` = "!".asInstanceOf[`!`]
  @scala.inline
  def `&`: `&` = "&".asInstanceOf[`&`]
  @scala.inline
  def `(`: `(` = "(".asInstanceOf[`(`]
  @scala.inline
  def `)`: `)` = ")".asInstanceOf[`)`]
  @scala.inline
  def `:`: `:` = ":".asInstanceOf[`:`]
  @scala.inline
  def `<EOF>`: `<EOF>` = "<EOF>".asInstanceOf[`<EOF>`]
  @scala.inline
  def `<SOF>`: `<SOF>` = "<SOF>".asInstanceOf[`<SOF>`]
  @scala.inline
  def `=`: `=` = "=".asInstanceOf[`=`]
  @scala.inline
  def `@`: `@` = "@".asInstanceOf[`@`]
  @scala.inline
  def ARGUMENT_DEFINITION: ARGUMENT_DEFINITION = "ARGUMENT_DEFINITION".asInstanceOf[ARGUMENT_DEFINITION]
  @scala.inline
  def ARG_CHANGED_KIND: ARG_CHANGED_KIND = "ARG_CHANGED_KIND".asInstanceOf[ARG_CHANGED_KIND]
  @scala.inline
  def ARG_DEFAULT_VALUE_CHANGE: ARG_DEFAULT_VALUE_CHANGE = "ARG_DEFAULT_VALUE_CHANGE".asInstanceOf[ARG_DEFAULT_VALUE_CHANGE]
  @scala.inline
  def ARG_REMOVED: ARG_REMOVED = "ARG_REMOVED".asInstanceOf[ARG_REMOVED]
  @scala.inline
  def Argument: Argument = "Argument".asInstanceOf[Argument]
  @scala.inline
  def BlockString: BlockString = "BlockString".asInstanceOf[BlockString]
  @scala.inline
  def BooleanValue: BooleanValue = "BooleanValue".asInstanceOf[BooleanValue]
  @scala.inline
  def Comment: Comment = "Comment".asInstanceOf[Comment]
  @scala.inline
  def DIRECTIVE_ARG_REMOVED: DIRECTIVE_ARG_REMOVED = "DIRECTIVE_ARG_REMOVED".asInstanceOf[DIRECTIVE_ARG_REMOVED]
  @scala.inline
  def DIRECTIVE_LOCATION_REMOVED: DIRECTIVE_LOCATION_REMOVED = "DIRECTIVE_LOCATION_REMOVED".asInstanceOf[DIRECTIVE_LOCATION_REMOVED]
  @scala.inline
  def DIRECTIVE_REMOVED: DIRECTIVE_REMOVED = "DIRECTIVE_REMOVED".asInstanceOf[DIRECTIVE_REMOVED]
  @scala.inline
  def DOLLAR: DOLLAR = "$".asInstanceOf[DOLLAR]
  @scala.inline
  def DOTDOTDOT: DOTDOTDOT = "...".asInstanceOf[DOTDOTDOT]
  @scala.inline
  def Directive: Directive = "Directive".asInstanceOf[Directive]
  @scala.inline
  def DirectiveDefinition: DirectiveDefinition = "DirectiveDefinition".asInstanceOf[DirectiveDefinition]
  @scala.inline
  def Document: Document = "Document".asInstanceOf[Document]
  @scala.inline
  def ENUM: ENUM = "ENUM".asInstanceOf[ENUM]
  @scala.inline
  def ENUM_VALUE: ENUM_VALUE = "ENUM_VALUE".asInstanceOf[ENUM_VALUE]
  @scala.inline
  def EnterLeaveVisitor: EnterLeaveVisitor = "EnterLeaveVisitor".asInstanceOf[EnterLeaveVisitor]
  @scala.inline
  def EnumTypeDefinition: EnumTypeDefinition = "EnumTypeDefinition".asInstanceOf[EnumTypeDefinition]
  @scala.inline
  def EnumTypeExtension: EnumTypeExtension = "EnumTypeExtension".asInstanceOf[EnumTypeExtension]
  @scala.inline
  def EnumValue: EnumValue = "EnumValue".asInstanceOf[EnumValue]
  @scala.inline
  def EnumValueDefinition: EnumValueDefinition = "EnumValueDefinition".asInstanceOf[EnumValueDefinition]
  @scala.inline
  def FIELD: FIELD = "FIELD".asInstanceOf[FIELD]
  @scala.inline
  def FIELD_CHANGED_KIND: FIELD_CHANGED_KIND = "FIELD_CHANGED_KIND".asInstanceOf[FIELD_CHANGED_KIND]
  @scala.inline
  def FIELD_DEFINITION: FIELD_DEFINITION = "FIELD_DEFINITION".asInstanceOf[FIELD_DEFINITION]
  @scala.inline
  def FIELD_REMOVED: FIELD_REMOVED = "FIELD_REMOVED".asInstanceOf[FIELD_REMOVED]
  @scala.inline
  def FRAGMENT_DEFINITION: FRAGMENT_DEFINITION = "FRAGMENT_DEFINITION".asInstanceOf[FRAGMENT_DEFINITION]
  @scala.inline
  def FRAGMENT_SPREAD: FRAGMENT_SPREAD = "FRAGMENT_SPREAD".asInstanceOf[FRAGMENT_SPREAD]
  @scala.inline
  def FieldDefinition: FieldDefinition = "FieldDefinition".asInstanceOf[FieldDefinition]
  @scala.inline
  def Field_ : Field_ = "Field".asInstanceOf[Field_]
  @scala.inline
  def Float: Float = "Float".asInstanceOf[Float]
  @scala.inline
  def FloatValue: FloatValue = "FloatValue".asInstanceOf[FloatValue]
  @scala.inline
  def FragmentDefinition: FragmentDefinition = "FragmentDefinition".asInstanceOf[FragmentDefinition]
  @scala.inline
  def FragmentSpread: FragmentSpread = "FragmentSpread".asInstanceOf[FragmentSpread]
  @scala.inline
  def INLINE_FRAGMENT: INLINE_FRAGMENT = "INLINE_FRAGMENT".asInstanceOf[INLINE_FRAGMENT]
  @scala.inline
  def INPUT_FIELD_DEFINITION: INPUT_FIELD_DEFINITION = "INPUT_FIELD_DEFINITION".asInstanceOf[INPUT_FIELD_DEFINITION]
  @scala.inline
  def INPUT_OBJECT: INPUT_OBJECT = "INPUT_OBJECT".asInstanceOf[INPUT_OBJECT]
  @scala.inline
  def INTERFACE: INTERFACE = "INTERFACE".asInstanceOf[INTERFACE]
  @scala.inline
  def INTERFACE_ADDED_TO_OBJECT: INTERFACE_ADDED_TO_OBJECT = "INTERFACE_ADDED_TO_OBJECT".asInstanceOf[INTERFACE_ADDED_TO_OBJECT]
  @scala.inline
  def INTERFACE_REMOVED_FROM_OBJECT: INTERFACE_REMOVED_FROM_OBJECT = "INTERFACE_REMOVED_FROM_OBJECT".asInstanceOf[INTERFACE_REMOVED_FROM_OBJECT]
  @scala.inline
  def InlineFragment: InlineFragment = "InlineFragment".asInstanceOf[InlineFragment]
  @scala.inline
  def InputObjectTypeDefinition: InputObjectTypeDefinition = "InputObjectTypeDefinition".asInstanceOf[InputObjectTypeDefinition]
  @scala.inline
  def InputObjectTypeExtension: InputObjectTypeExtension = "InputObjectTypeExtension".asInstanceOf[InputObjectTypeExtension]
  @scala.inline
  def InputValueDefinition: InputValueDefinition = "InputValueDefinition".asInstanceOf[InputValueDefinition]
  @scala.inline
  def Int: Int = "Int".asInstanceOf[Int]
  @scala.inline
  def IntValue: IntValue = "IntValue".asInstanceOf[IntValue]
  @scala.inline
  def InterfaceTypeDefinition: InterfaceTypeDefinition = "InterfaceTypeDefinition".asInstanceOf[InterfaceTypeDefinition]
  @scala.inline
  def InterfaceTypeExtension: InterfaceTypeExtension = "InterfaceTypeExtension".asInstanceOf[InterfaceTypeExtension]
  @scala.inline
  def LIST: LIST = "LIST".asInstanceOf[LIST]
  @scala.inline
  def ListType: ListType = "ListType".asInstanceOf[ListType]
  @scala.inline
  def ListValue: ListValue = "ListValue".asInstanceOf[ListValue]
  @scala.inline
  def MUTATION: MUTATION = "MUTATION".asInstanceOf[MUTATION]
  @scala.inline
  def NON_NULL: NON_NULL = "NON_NULL".asInstanceOf[NON_NULL]
  @scala.inline
  def Name: Name = "Name".asInstanceOf[Name]
  @scala.inline
  def NamedType: NamedType = "NamedType".asInstanceOf[NamedType]
  @scala.inline
  def `No longer supported`: `No longer supported` = "No longer supported".asInstanceOf[`No longer supported`]
  @scala.inline
  def NonNullType: NonNullType = "NonNullType".asInstanceOf[NonNullType]
  @scala.inline
  def NullValue: NullValue = "NullValue".asInstanceOf[NullValue]
  @scala.inline
  def OBJECT: OBJECT = "OBJECT".asInstanceOf[OBJECT]
  @scala.inline
  def OPTIONAL_ARG_ADDED: OPTIONAL_ARG_ADDED = "OPTIONAL_ARG_ADDED".asInstanceOf[OPTIONAL_ARG_ADDED]
  @scala.inline
  def OPTIONAL_INPUT_FIELD_ADDED: OPTIONAL_INPUT_FIELD_ADDED = "OPTIONAL_INPUT_FIELD_ADDED".asInstanceOf[OPTIONAL_INPUT_FIELD_ADDED]
  @scala.inline
  def ObjectField: ObjectField = "ObjectField".asInstanceOf[ObjectField]
  @scala.inline
  def ObjectTypeDefinition: ObjectTypeDefinition = "ObjectTypeDefinition".asInstanceOf[ObjectTypeDefinition]
  @scala.inline
  def ObjectTypeExtension: ObjectTypeExtension = "ObjectTypeExtension".asInstanceOf[ObjectTypeExtension]
  @scala.inline
  def ObjectValue: ObjectValue = "ObjectValue".asInstanceOf[ObjectValue]
  @scala.inline
  def OperationDefinition: OperationDefinition = "OperationDefinition".asInstanceOf[OperationDefinition]
  @scala.inline
  def OperationTypeDefinition: OperationTypeDefinition = "OperationTypeDefinition".asInstanceOf[OperationTypeDefinition]
  @scala.inline
  def QUERY: QUERY = "QUERY".asInstanceOf[QUERY]
  @scala.inline
  def REQUIRED_ARG_ADDED: REQUIRED_ARG_ADDED = "REQUIRED_ARG_ADDED".asInstanceOf[REQUIRED_ARG_ADDED]
  @scala.inline
  def REQUIRED_DIRECTIVE_ARG_ADDED: REQUIRED_DIRECTIVE_ARG_ADDED = "REQUIRED_DIRECTIVE_ARG_ADDED".asInstanceOf[REQUIRED_DIRECTIVE_ARG_ADDED]
  @scala.inline
  def REQUIRED_INPUT_FIELD_ADDED: REQUIRED_INPUT_FIELD_ADDED = "REQUIRED_INPUT_FIELD_ADDED".asInstanceOf[REQUIRED_INPUT_FIELD_ADDED]
  @scala.inline
  def SCALAR: SCALAR = "SCALAR".asInstanceOf[SCALAR]
  @scala.inline
  def SCHEMA: SCHEMA = "SCHEMA".asInstanceOf[SCHEMA]
  @scala.inline
  def SUBSCRIPTION: SUBSCRIPTION = "SUBSCRIPTION".asInstanceOf[SUBSCRIPTION]
  @scala.inline
  def ScalarTypeDefinition: ScalarTypeDefinition = "ScalarTypeDefinition".asInstanceOf[ScalarTypeDefinition]
  @scala.inline
  def ScalarTypeExtension: ScalarTypeExtension = "ScalarTypeExtension".asInstanceOf[ScalarTypeExtension]
  @scala.inline
  def SchemaDefinition: SchemaDefinition = "SchemaDefinition".asInstanceOf[SchemaDefinition]
  @scala.inline
  def SchemaExtension: SchemaExtension = "SchemaExtension".asInstanceOf[SchemaExtension]
  @scala.inline
  def SelectionSet: SelectionSet = "SelectionSet".asInstanceOf[SelectionSet]
  @scala.inline
  def ShapeMapVisitor: ShapeMapVisitor = "ShapeMapVisitor".asInstanceOf[ShapeMapVisitor]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def StringValue: StringValue = "StringValue".asInstanceOf[StringValue]
  @scala.inline
  def TYPE_ADDED_TO_UNION: TYPE_ADDED_TO_UNION = "TYPE_ADDED_TO_UNION".asInstanceOf[TYPE_ADDED_TO_UNION]
  @scala.inline
  def TYPE_CHANGED_KIND: TYPE_CHANGED_KIND = "TYPE_CHANGED_KIND".asInstanceOf[TYPE_CHANGED_KIND]
  @scala.inline
  def TYPE_REMOVED: TYPE_REMOVED = "TYPE_REMOVED".asInstanceOf[TYPE_REMOVED]
  @scala.inline
  def TYPE_REMOVED_FROM_UNION: TYPE_REMOVED_FROM_UNION = "TYPE_REMOVED_FROM_UNION".asInstanceOf[TYPE_REMOVED_FROM_UNION]
  @scala.inline
  def UNION: UNION = "UNION".asInstanceOf[UNION]
  @scala.inline
  def UnionTypeDefinition: UnionTypeDefinition = "UnionTypeDefinition".asInstanceOf[UnionTypeDefinition]
  @scala.inline
  def UnionTypeExtension: UnionTypeExtension = "UnionTypeExtension".asInstanceOf[UnionTypeExtension]
  @scala.inline
  def VALUE_ADDED_TO_ENUM: VALUE_ADDED_TO_ENUM = "VALUE_ADDED_TO_ENUM".asInstanceOf[VALUE_ADDED_TO_ENUM]
  @scala.inline
  def VALUE_REMOVED_FROM_ENUM: VALUE_REMOVED_FROM_ENUM = "VALUE_REMOVED_FROM_ENUM".asInstanceOf[VALUE_REMOVED_FROM_ENUM]
  @scala.inline
  def VARIABLE_DEFINITION: VARIABLE_DEFINITION = "VARIABLE_DEFINITION".asInstanceOf[VARIABLE_DEFINITION]
  @scala.inline
  def Variable: Variable = "Variable".asInstanceOf[Variable]
  @scala.inline
  def VariableDefinition: VariableDefinition = "VariableDefinition".asInstanceOf[VariableDefinition]
  @scala.inline
  def VisitorKeyMap: VisitorKeyMap = "VisitorKeyMap".asInstanceOf[VisitorKeyMap]
  @scala.inline
  def `[`: `[` = "[".asInstanceOf[`[`]
  @scala.inline
  def `]`: `]` = "]".asInstanceOf[`]`]
  @scala.inline
  def alias: alias = "alias".asInstanceOf[alias]
  @scala.inline
  def arguments: arguments = "arguments".asInstanceOf[arguments]
  @scala.inline
  def defaultValue: defaultValue = "defaultValue".asInstanceOf[defaultValue]
  @scala.inline
  def definitions: definitions = "definitions".asInstanceOf[definitions]
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  @scala.inline
  def directives: directives = "directives".asInstanceOf[directives]
  @scala.inline
  def fields: fields = "fields".asInstanceOf[fields]
  @scala.inline
  def interfaces: interfaces = "interfaces".asInstanceOf[interfaces]
  @scala.inline
  def locations: locations = "locations".asInstanceOf[locations]
  @scala.inline
  def mutation_ : mutation_ = "mutation".asInstanceOf[mutation_]
  @scala.inline
  def name_ : name_ = "name".asInstanceOf[name_]
  @scala.inline
  def operationTypes: operationTypes = "operationTypes".asInstanceOf[operationTypes]
  @scala.inline
  def query_ : query_ = "query".asInstanceOf[query_]
  @scala.inline
  def selectionSet_ : selectionSet_ = "selectionSet".asInstanceOf[selectionSet_]
  @scala.inline
  def selections: selections = "selections".asInstanceOf[selections]
  @scala.inline
  def subscription_ : subscription_ = "subscription".asInstanceOf[subscription_]
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  @scala.inline
  def typeCondition: typeCondition = "typeCondition".asInstanceOf[typeCondition]
  @scala.inline
  def types: types = "types".asInstanceOf[types]
  @scala.inline
  def value: value = "value".asInstanceOf[value]
  @scala.inline
  def values: values = "values".asInstanceOf[values]
  @scala.inline
  def variableDefinitions: variableDefinitions = "variableDefinitions".asInstanceOf[variableDefinitions]
  @scala.inline
  def variable_ : variable_ = "variable".asInstanceOf[variable_]
  @scala.inline
  def `{`: `{` = "{".asInstanceOf[`{`]
  @scala.inline
  def `|`: `|` = "|".asInstanceOf[`|`]
  @scala.inline
  def `}`: `}` = "}".asInstanceOf[`}`]
}

