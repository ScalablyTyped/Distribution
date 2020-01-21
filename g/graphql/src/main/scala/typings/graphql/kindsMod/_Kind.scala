package typings.graphql.kindsMod

import typings.graphql.graphqlStrings.Argument
import typings.graphql.graphqlStrings.BooleanValue
import typings.graphql.graphqlStrings.Directive
import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.Document
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.EnumValue
import typings.graphql.graphqlStrings.EnumValueDefinition
import typings.graphql.graphqlStrings.FieldDefinition
import typings.graphql.graphqlStrings.Field_
import typings.graphql.graphqlStrings.FloatValue
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.FragmentSpread
import typings.graphql.graphqlStrings.InlineFragment
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InputValueDefinition
import typings.graphql.graphqlStrings.IntValue
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeExtension
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @internal
trait _Kind extends js.Object {
  var ARGUMENT: Argument
  var BOOLEAN: BooleanValue
  // Directives
  var DIRECTIVE: Directive
  // Directive Definitions
  var DIRECTIVE_DEFINITION: DirectiveDefinition
  // Document
  var DOCUMENT: Document
  var ENUM: EnumValue
  var ENUM_TYPE_DEFINITION: EnumTypeDefinition
  var ENUM_TYPE_EXTENSION: EnumTypeExtension
  var ENUM_VALUE_DEFINITION: EnumValueDefinition
  var FIELD: Field_
  var FIELD_DEFINITION: FieldDefinition
  var FLOAT: FloatValue
  var FRAGMENT_DEFINITION: FragmentDefinition
  // Fragments
  var FRAGMENT_SPREAD: FragmentSpread
  var INLINE_FRAGMENT: InlineFragment
  var INPUT_OBJECT_TYPE_DEFINITION: InputObjectTypeDefinition
  var INPUT_OBJECT_TYPE_EXTENSION: InputObjectTypeExtension
  var INPUT_VALUE_DEFINITION: InputValueDefinition
  var INT: IntValue
  var INTERFACE_TYPE_DEFINITION: InterfaceTypeDefinition
  var INTERFACE_TYPE_EXTENSION: InterfaceTypeExtension
  var LIST: ListValue
  var LIST_TYPE: ListType
  // Name
  var NAME: Name
  // Types
  var NAMED_TYPE: NamedType
  var NON_NULL_TYPE: NonNullType
  var NULL: NullValue
  var OBJECT: ObjectValue
  var OBJECT_FIELD: ObjectField
  var OBJECT_TYPE_DEFINITION: ObjectTypeDefinition
  var OBJECT_TYPE_EXTENSION: ObjectTypeExtension
  var OPERATION_DEFINITION: OperationDefinition
  var OPERATION_TYPE_DEFINITION: OperationTypeDefinition
  // Type Definitions
  var SCALAR_TYPE_DEFINITION: ScalarTypeDefinition
  // Type Extensions
  var SCALAR_TYPE_EXTENSION: ScalarTypeExtension
  // Type System Definitions
  var SCHEMA_DEFINITION: SchemaDefinition
  // Type System Extensions
  var SCHEMA_EXTENSION: SchemaExtension
  var SELECTION_SET: SelectionSet
  var STRING: StringValue
  var UNION_TYPE_DEFINITION: UnionTypeDefinition
  var UNION_TYPE_EXTENSION: UnionTypeExtension
  // Values
  var VARIABLE: Variable
  var VARIABLE_DEFINITION: VariableDefinition
}

object _Kind {
  @scala.inline
  def apply(
    ARGUMENT: Argument,
    BOOLEAN: BooleanValue,
    DIRECTIVE: Directive,
    DIRECTIVE_DEFINITION: DirectiveDefinition,
    DOCUMENT: Document,
    ENUM: EnumValue,
    ENUM_TYPE_DEFINITION: EnumTypeDefinition,
    ENUM_TYPE_EXTENSION: EnumTypeExtension,
    ENUM_VALUE_DEFINITION: EnumValueDefinition,
    FIELD: Field_,
    FIELD_DEFINITION: FieldDefinition,
    FLOAT: FloatValue,
    FRAGMENT_DEFINITION: FragmentDefinition,
    FRAGMENT_SPREAD: FragmentSpread,
    INLINE_FRAGMENT: InlineFragment,
    INPUT_OBJECT_TYPE_DEFINITION: InputObjectTypeDefinition,
    INPUT_OBJECT_TYPE_EXTENSION: InputObjectTypeExtension,
    INPUT_VALUE_DEFINITION: InputValueDefinition,
    INT: IntValue,
    INTERFACE_TYPE_DEFINITION: InterfaceTypeDefinition,
    INTERFACE_TYPE_EXTENSION: InterfaceTypeExtension,
    LIST: ListValue,
    LIST_TYPE: ListType,
    NAME: Name,
    NAMED_TYPE: NamedType,
    NON_NULL_TYPE: NonNullType,
    NULL: NullValue,
    OBJECT: ObjectValue,
    OBJECT_FIELD: ObjectField,
    OBJECT_TYPE_DEFINITION: ObjectTypeDefinition,
    OBJECT_TYPE_EXTENSION: ObjectTypeExtension,
    OPERATION_DEFINITION: OperationDefinition,
    OPERATION_TYPE_DEFINITION: OperationTypeDefinition,
    SCALAR_TYPE_DEFINITION: ScalarTypeDefinition,
    SCALAR_TYPE_EXTENSION: ScalarTypeExtension,
    SCHEMA_DEFINITION: SchemaDefinition,
    SCHEMA_EXTENSION: SchemaExtension,
    SELECTION_SET: SelectionSet,
    STRING: StringValue,
    UNION_TYPE_DEFINITION: UnionTypeDefinition,
    UNION_TYPE_EXTENSION: UnionTypeExtension,
    VARIABLE: Variable,
    VARIABLE_DEFINITION: VariableDefinition
  ): _Kind = {
    val __obj = js.Dynamic.literal(ARGUMENT = ARGUMENT.asInstanceOf[js.Any], BOOLEAN = BOOLEAN.asInstanceOf[js.Any], DIRECTIVE = DIRECTIVE.asInstanceOf[js.Any], DIRECTIVE_DEFINITION = DIRECTIVE_DEFINITION.asInstanceOf[js.Any], DOCUMENT = DOCUMENT.asInstanceOf[js.Any], ENUM = ENUM.asInstanceOf[js.Any], ENUM_TYPE_DEFINITION = ENUM_TYPE_DEFINITION.asInstanceOf[js.Any], ENUM_TYPE_EXTENSION = ENUM_TYPE_EXTENSION.asInstanceOf[js.Any], ENUM_VALUE_DEFINITION = ENUM_VALUE_DEFINITION.asInstanceOf[js.Any], FIELD = FIELD.asInstanceOf[js.Any], FIELD_DEFINITION = FIELD_DEFINITION.asInstanceOf[js.Any], FLOAT = FLOAT.asInstanceOf[js.Any], FRAGMENT_DEFINITION = FRAGMENT_DEFINITION.asInstanceOf[js.Any], FRAGMENT_SPREAD = FRAGMENT_SPREAD.asInstanceOf[js.Any], INLINE_FRAGMENT = INLINE_FRAGMENT.asInstanceOf[js.Any], INPUT_OBJECT_TYPE_DEFINITION = INPUT_OBJECT_TYPE_DEFINITION.asInstanceOf[js.Any], INPUT_OBJECT_TYPE_EXTENSION = INPUT_OBJECT_TYPE_EXTENSION.asInstanceOf[js.Any], INPUT_VALUE_DEFINITION = INPUT_VALUE_DEFINITION.asInstanceOf[js.Any], INT = INT.asInstanceOf[js.Any], INTERFACE_TYPE_DEFINITION = INTERFACE_TYPE_DEFINITION.asInstanceOf[js.Any], INTERFACE_TYPE_EXTENSION = INTERFACE_TYPE_EXTENSION.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], LIST_TYPE = LIST_TYPE.asInstanceOf[js.Any], NAME = NAME.asInstanceOf[js.Any], NAMED_TYPE = NAMED_TYPE.asInstanceOf[js.Any], NON_NULL_TYPE = NON_NULL_TYPE.asInstanceOf[js.Any], NULL = NULL.asInstanceOf[js.Any], OBJECT = OBJECT.asInstanceOf[js.Any], OBJECT_FIELD = OBJECT_FIELD.asInstanceOf[js.Any], OBJECT_TYPE_DEFINITION = OBJECT_TYPE_DEFINITION.asInstanceOf[js.Any], OBJECT_TYPE_EXTENSION = OBJECT_TYPE_EXTENSION.asInstanceOf[js.Any], OPERATION_DEFINITION = OPERATION_DEFINITION.asInstanceOf[js.Any], OPERATION_TYPE_DEFINITION = OPERATION_TYPE_DEFINITION.asInstanceOf[js.Any], SCALAR_TYPE_DEFINITION = SCALAR_TYPE_DEFINITION.asInstanceOf[js.Any], SCALAR_TYPE_EXTENSION = SCALAR_TYPE_EXTENSION.asInstanceOf[js.Any], SCHEMA_DEFINITION = SCHEMA_DEFINITION.asInstanceOf[js.Any], SCHEMA_EXTENSION = SCHEMA_EXTENSION.asInstanceOf[js.Any], SELECTION_SET = SELECTION_SET.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any], UNION_TYPE_DEFINITION = UNION_TYPE_DEFINITION.asInstanceOf[js.Any], UNION_TYPE_EXTENSION = UNION_TYPE_EXTENSION.asInstanceOf[js.Any], VARIABLE = VARIABLE.asInstanceOf[js.Any], VARIABLE_DEFINITION = VARIABLE_DEFINITION.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_Kind]
  }
}

