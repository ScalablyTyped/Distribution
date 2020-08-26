package typings.graphql.kindsMod

import typings.graphql.graphqlStrings.Field_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  NAME :'Name',   DOCUMENT :'Document',   OPERATION_DEFINITION :'OperationDefinition',   VARIABLE_DEFINITION :'VariableDefinition',   SELECTION_SET :'SelectionSet',   FIELD :'Field',   ARGUMENT :'Argument',   FRAGMENT_SPREAD :'FragmentSpread',   INLINE_FRAGMENT :'InlineFragment',   FRAGMENT_DEFINITION :'FragmentDefinition',   VARIABLE :'Variable',   INT :'IntValue',   FLOAT :'FloatValue',   STRING :'StringValue',   BOOLEAN :'BooleanValue',   NULL :'NullValue',   ENUM :'EnumValue',   LIST :'ListValue',   OBJECT :'ObjectValue',   OBJECT_FIELD :'ObjectField',   DIRECTIVE :'Directive',   NAMED_TYPE :'NamedType',   LIST_TYPE :'ListType',   NON_NULL_TYPE :'NonNullType',   SCHEMA_DEFINITION :'SchemaDefinition',   OPERATION_TYPE_DEFINITION :'OperationTypeDefinition',   SCALAR_TYPE_DEFINITION :'ScalarTypeDefinition',   OBJECT_TYPE_DEFINITION :'ObjectTypeDefinition',   FIELD_DEFINITION :'FieldDefinition',   INPUT_VALUE_DEFINITION :'InputValueDefinition',   INTERFACE_TYPE_DEFINITION :'InterfaceTypeDefinition',   UNION_TYPE_DEFINITION :'UnionTypeDefinition',   ENUM_TYPE_DEFINITION :'EnumTypeDefinition',   ENUM_VALUE_DEFINITION :'EnumValueDefinition',   INPUT_OBJECT_TYPE_DEFINITION :'InputObjectTypeDefinition',   DIRECTIVE_DEFINITION :'DirectiveDefinition',   SCHEMA_EXTENSION :'SchemaExtension',   SCALAR_TYPE_EXTENSION :'ScalarTypeExtension',   OBJECT_TYPE_EXTENSION :'ObjectTypeExtension',   INTERFACE_TYPE_EXTENSION :'InterfaceTypeExtension',   UNION_TYPE_EXTENSION :'UnionTypeExtension',   ENUM_TYPE_EXTENSION :'EnumTypeExtension',   INPUT_OBJECT_TYPE_EXTENSION :'InputObjectTypeExtension'}[keyof {  NAME :'Name',   DOCUMENT :'Document',   OPERATION_DEFINITION :'OperationDefinition',   VARIABLE_DEFINITION :'VariableDefinition',   SELECTION_SET :'SelectionSet',   FIELD :'Field',   ARGUMENT :'Argument',   FRAGMENT_SPREAD :'FragmentSpread',   INLINE_FRAGMENT :'InlineFragment',   FRAGMENT_DEFINITION :'FragmentDefinition',   VARIABLE :'Variable',   INT :'IntValue',   FLOAT :'FloatValue',   STRING :'StringValue',   BOOLEAN :'BooleanValue',   NULL :'NullValue',   ENUM :'EnumValue',   LIST :'ListValue',   OBJECT :'ObjectValue',   OBJECT_FIELD :'ObjectField',   DIRECTIVE :'Directive',   NAMED_TYPE :'NamedType',   LIST_TYPE :'ListType',   NON_NULL_TYPE :'NonNullType',   SCHEMA_DEFINITION :'SchemaDefinition',   OPERATION_TYPE_DEFINITION :'OperationTypeDefinition',   SCALAR_TYPE_DEFINITION :'ScalarTypeDefinition',   OBJECT_TYPE_DEFINITION :'ObjectTypeDefinition',   FIELD_DEFINITION :'FieldDefinition',   INPUT_VALUE_DEFINITION :'InputValueDefinition',   INTERFACE_TYPE_DEFINITION :'InterfaceTypeDefinition',   UNION_TYPE_DEFINITION :'UnionTypeDefinition',   ENUM_TYPE_DEFINITION :'EnumTypeDefinition',   ENUM_VALUE_DEFINITION :'EnumValueDefinition',   INPUT_OBJECT_TYPE_DEFINITION :'InputObjectTypeDefinition',   DIRECTIVE_DEFINITION :'DirectiveDefinition',   SCHEMA_EXTENSION :'SchemaExtension',   SCALAR_TYPE_EXTENSION :'ScalarTypeExtension',   OBJECT_TYPE_EXTENSION :'ObjectTypeExtension',   INTERFACE_TYPE_EXTENSION :'InterfaceTypeExtension',   UNION_TYPE_EXTENSION :'UnionTypeExtension',   ENUM_TYPE_EXTENSION :'EnumTypeExtension',   INPUT_OBJECT_TYPE_EXTENSION :'InputObjectTypeExtension'}] */
/* Rewritten from type alias, can be one of: 
  - typings.graphql.graphqlStrings.InterfaceTypeExtension
  - typings.graphql.graphqlStrings.SelectionSet
  - typings.graphql.graphqlStrings.InterfaceTypeDefinition
  - typings.graphql.graphqlStrings.OperationDefinition
  - typings.graphql.graphqlStrings.VariableDefinition
  - typings.graphql.graphqlStrings.ListType
  - typings.graphql.graphqlStrings.InlineFragment
  - typings.graphql.graphqlStrings.DirectiveDefinition
  - typings.graphql.graphqlStrings.EnumValue
  - typings.graphql.graphqlStrings.Directive
  - typings.graphql.graphqlStrings.UnionTypeDefinition
  - typings.graphql.graphqlStrings.OperationTypeDefinition
  - typings.graphql.graphqlStrings.IntValue
  - typings.graphql.graphqlStrings.SchemaDefinition
  - typings.graphql.graphqlStrings.StringValue
  - typings.graphql.graphqlStrings.NullValue
  - typings.graphql.graphqlStrings.BooleanValue
  - typings.graphql.graphqlStrings.SchemaExtension
  - typings.graphql.graphqlStrings.FloatValue
  - typings.graphql.graphqlStrings.Document
  - typings.graphql.graphqlStrings.NamedType
  - typings.graphql.graphqlStrings.Name
  - typings.graphql.graphqlStrings.EnumValueDefinition
  - typings.graphql.graphqlStrings.UnionTypeExtension
  - typings.graphql.graphqlStrings.Argument
  - typings.graphql.graphqlStrings.ListValue
  - typings.graphql.graphqlStrings.EnumTypeDefinition
  - typings.graphql.graphqlStrings.NonNullType
  - typings.graphql.graphqlStrings.InputObjectTypeDefinition
  - typings.graphql.graphqlStrings.FragmentDefinition
  - typings.graphql.graphqlStrings.EnumTypeExtension
  - typings.graphql.graphqlStrings.Variable
  - typings.graphql.graphqlStrings.ObjectValue
  - typings.graphql.graphqlStrings.ObjectField
  - typings.graphql.graphqlStrings.ScalarTypeDefinition
  - typings.graphql.graphqlStrings.ScalarTypeExtension
  - typings.graphql.graphqlStrings.InputObjectTypeExtension
  - typings.graphql.graphqlStrings.ObjectTypeDefinition
  - typings.graphql.graphqlStrings.ObjectTypeExtension
  - typings.graphql.graphqlStrings.InputValueDefinition
  - typings.graphql.graphqlStrings.FieldDefinition
  - typings.graphql.graphqlStrings.FragmentSpread
  - typings.graphql.graphqlStrings.Field_
*/
trait KindEnum extends js.Object

object KindEnum {
  @scala.inline
  def Argument: typings.graphql.graphqlStrings.Argument = "Argument".asInstanceOf[typings.graphql.graphqlStrings.Argument]
  @scala.inline
  def BooleanValue: typings.graphql.graphqlStrings.BooleanValue = "BooleanValue".asInstanceOf[typings.graphql.graphqlStrings.BooleanValue]
  @scala.inline
  def Directive: typings.graphql.graphqlStrings.Directive = "Directive".asInstanceOf[typings.graphql.graphqlStrings.Directive]
  @scala.inline
  def DirectiveDefinition: typings.graphql.graphqlStrings.DirectiveDefinition = "DirectiveDefinition".asInstanceOf[typings.graphql.graphqlStrings.DirectiveDefinition]
  @scala.inline
  def Document: typings.graphql.graphqlStrings.Document = "Document".asInstanceOf[typings.graphql.graphqlStrings.Document]
  @scala.inline
  def EnumTypeDefinition: typings.graphql.graphqlStrings.EnumTypeDefinition = "EnumTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.EnumTypeDefinition]
  @scala.inline
  def EnumTypeExtension: typings.graphql.graphqlStrings.EnumTypeExtension = "EnumTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.EnumTypeExtension]
  @scala.inline
  def EnumValue: typings.graphql.graphqlStrings.EnumValue = "EnumValue".asInstanceOf[typings.graphql.graphqlStrings.EnumValue]
  @scala.inline
  def EnumValueDefinition: typings.graphql.graphqlStrings.EnumValueDefinition = "EnumValueDefinition".asInstanceOf[typings.graphql.graphqlStrings.EnumValueDefinition]
  @scala.inline
  def Field: Field_ = "Field".asInstanceOf[Field_]
  @scala.inline
  def FieldDefinition: typings.graphql.graphqlStrings.FieldDefinition = "FieldDefinition".asInstanceOf[typings.graphql.graphqlStrings.FieldDefinition]
  @scala.inline
  def FloatValue: typings.graphql.graphqlStrings.FloatValue = "FloatValue".asInstanceOf[typings.graphql.graphqlStrings.FloatValue]
  @scala.inline
  def FragmentDefinition: typings.graphql.graphqlStrings.FragmentDefinition = "FragmentDefinition".asInstanceOf[typings.graphql.graphqlStrings.FragmentDefinition]
  @scala.inline
  def FragmentSpread: typings.graphql.graphqlStrings.FragmentSpread = "FragmentSpread".asInstanceOf[typings.graphql.graphqlStrings.FragmentSpread]
  @scala.inline
  def InlineFragment: typings.graphql.graphqlStrings.InlineFragment = "InlineFragment".asInstanceOf[typings.graphql.graphqlStrings.InlineFragment]
  @scala.inline
  def InputObjectTypeDefinition: typings.graphql.graphqlStrings.InputObjectTypeDefinition = "InputObjectTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.InputObjectTypeDefinition]
  @scala.inline
  def InputObjectTypeExtension: typings.graphql.graphqlStrings.InputObjectTypeExtension = "InputObjectTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.InputObjectTypeExtension]
  @scala.inline
  def InputValueDefinition: typings.graphql.graphqlStrings.InputValueDefinition = "InputValueDefinition".asInstanceOf[typings.graphql.graphqlStrings.InputValueDefinition]
  @scala.inline
  def IntValue: typings.graphql.graphqlStrings.IntValue = "IntValue".asInstanceOf[typings.graphql.graphqlStrings.IntValue]
  @scala.inline
  def InterfaceTypeDefinition: typings.graphql.graphqlStrings.InterfaceTypeDefinition = "InterfaceTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.InterfaceTypeDefinition]
  @scala.inline
  def InterfaceTypeExtension: typings.graphql.graphqlStrings.InterfaceTypeExtension = "InterfaceTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.InterfaceTypeExtension]
  @scala.inline
  def ListType: typings.graphql.graphqlStrings.ListType = "ListType".asInstanceOf[typings.graphql.graphqlStrings.ListType]
  @scala.inline
  def ListValue: typings.graphql.graphqlStrings.ListValue = "ListValue".asInstanceOf[typings.graphql.graphqlStrings.ListValue]
  @scala.inline
  def Name: typings.graphql.graphqlStrings.Name = "Name".asInstanceOf[typings.graphql.graphqlStrings.Name]
  @scala.inline
  def NamedType: typings.graphql.graphqlStrings.NamedType = "NamedType".asInstanceOf[typings.graphql.graphqlStrings.NamedType]
  @scala.inline
  def NonNullType: typings.graphql.graphqlStrings.NonNullType = "NonNullType".asInstanceOf[typings.graphql.graphqlStrings.NonNullType]
  @scala.inline
  def NullValue: typings.graphql.graphqlStrings.NullValue = "NullValue".asInstanceOf[typings.graphql.graphqlStrings.NullValue]
  @scala.inline
  def ObjectField: typings.graphql.graphqlStrings.ObjectField = "ObjectField".asInstanceOf[typings.graphql.graphqlStrings.ObjectField]
  @scala.inline
  def ObjectTypeDefinition: typings.graphql.graphqlStrings.ObjectTypeDefinition = "ObjectTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.ObjectTypeDefinition]
  @scala.inline
  def ObjectTypeExtension: typings.graphql.graphqlStrings.ObjectTypeExtension = "ObjectTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.ObjectTypeExtension]
  @scala.inline
  def ObjectValue: typings.graphql.graphqlStrings.ObjectValue = "ObjectValue".asInstanceOf[typings.graphql.graphqlStrings.ObjectValue]
  @scala.inline
  def OperationDefinition: typings.graphql.graphqlStrings.OperationDefinition = "OperationDefinition".asInstanceOf[typings.graphql.graphqlStrings.OperationDefinition]
  @scala.inline
  def OperationTypeDefinition: typings.graphql.graphqlStrings.OperationTypeDefinition = "OperationTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.OperationTypeDefinition]
  @scala.inline
  def ScalarTypeDefinition: typings.graphql.graphqlStrings.ScalarTypeDefinition = "ScalarTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.ScalarTypeDefinition]
  @scala.inline
  def ScalarTypeExtension: typings.graphql.graphqlStrings.ScalarTypeExtension = "ScalarTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.ScalarTypeExtension]
  @scala.inline
  def SchemaDefinition: typings.graphql.graphqlStrings.SchemaDefinition = "SchemaDefinition".asInstanceOf[typings.graphql.graphqlStrings.SchemaDefinition]
  @scala.inline
  def SchemaExtension: typings.graphql.graphqlStrings.SchemaExtension = "SchemaExtension".asInstanceOf[typings.graphql.graphqlStrings.SchemaExtension]
  @scala.inline
  def SelectionSet: typings.graphql.graphqlStrings.SelectionSet = "SelectionSet".asInstanceOf[typings.graphql.graphqlStrings.SelectionSet]
  @scala.inline
  def StringValue: typings.graphql.graphqlStrings.StringValue = "StringValue".asInstanceOf[typings.graphql.graphqlStrings.StringValue]
  @scala.inline
  def UnionTypeDefinition: typings.graphql.graphqlStrings.UnionTypeDefinition = "UnionTypeDefinition".asInstanceOf[typings.graphql.graphqlStrings.UnionTypeDefinition]
  @scala.inline
  def UnionTypeExtension: typings.graphql.graphqlStrings.UnionTypeExtension = "UnionTypeExtension".asInstanceOf[typings.graphql.graphqlStrings.UnionTypeExtension]
  @scala.inline
  def Variable: typings.graphql.graphqlStrings.Variable = "Variable".asInstanceOf[typings.graphql.graphqlStrings.Variable]
  @scala.inline
  def VariableDefinition: typings.graphql.graphqlStrings.VariableDefinition = "VariableDefinition".asInstanceOf[typings.graphql.graphqlStrings.VariableDefinition]
}

