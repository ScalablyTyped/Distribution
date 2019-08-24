package typings.graphql.languageVisitorMod

import typings.graphql.graphqlStrings.`type`
import typings.graphql.graphqlStrings.alias
import typings.graphql.graphqlStrings.arguments
import typings.graphql.graphqlStrings.defaultValue
import typings.graphql.graphqlStrings.definitions
import typings.graphql.graphqlStrings.description
import typings.graphql.graphqlStrings.directives
import typings.graphql.graphqlStrings.fields
import typings.graphql.graphqlStrings.interfaces
import typings.graphql.graphqlStrings.locations
import typings.graphql.graphqlStrings.name
import typings.graphql.graphqlStrings.operationTypes
import typings.graphql.graphqlStrings.selectionSet
import typings.graphql.graphqlStrings.selections
import typings.graphql.graphqlStrings.typeCondition
import typings.graphql.graphqlStrings.types
import typings.graphql.graphqlStrings.value
import typings.graphql.graphqlStrings.values
import typings.graphql.graphqlStrings.variable
import typings.graphql.graphqlStrings.variableDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/visitor", "QueryDocumentKeys")
@js.native
object QueryDocumentKeys extends js.Object {
  var Argument: js.Tuple2[name, value] = js.native
  var BooleanValue: EmptyTuple = js.native
  var Directive: js.Tuple2[name, arguments] = js.native
  var DirectiveDefinition: js.Tuple4[description, name, arguments, locations] = js.native
  var Document: js.Array[definitions] = js.native
  var EnumTypeDefinition: js.Tuple4[description, name, directives, values] = js.native
  var EnumTypeExtension: js.Tuple3[name, directives, values] = js.native
  var EnumValue: EmptyTuple = js.native
  var EnumValueDefinition: js.Tuple3[description, name, directives] = js.native
  var Field: js.Tuple5[alias, name, arguments, directives, selectionSet] = js.native
  var FieldDefinition: js.Tuple5[description, name, arguments, `type`, directives] = js.native
  var FloatValue: EmptyTuple = js.native
  // prettier-ignore
  var FragmentDefinition: js.Tuple5[name, variableDefinitions, typeCondition, directives, selectionSet] = js.native
  var FragmentSpread: js.Tuple2[name, directives] = js.native
  var InlineFragment: js.Tuple3[typeCondition, directives, selectionSet] = js.native
  var InputObjectTypeDefinition: js.Tuple4[description, name, directives, fields] = js.native
  var InputObjectTypeExtension: js.Tuple3[name, directives, fields] = js.native
  // prettier-ignore
  var InputValueDefinition: js.Tuple5[description, name, `type`, defaultValue, directives] = js.native
  var IntValue: EmptyTuple = js.native
  var InterfaceTypeDefinition: js.Tuple4[description, name, directives, fields] = js.native
  var InterfaceTypeExtension: js.Tuple3[name, directives, fields] = js.native
  var ListType: js.Array[`type`] = js.native
  var ListValue: js.Array[values] = js.native
  var Name: EmptyTuple = js.native
  var NamedType: js.Array[name] = js.native
  var NonNullType: js.Array[`type`] = js.native
  var NullValue: EmptyTuple = js.native
  var ObjectField: js.Tuple2[name, value] = js.native
  // prettier-ignore
  var ObjectTypeDefinition: js.Tuple5[description, name, interfaces, directives, fields] = js.native
  var ObjectTypeExtension: js.Tuple4[name, interfaces, directives, fields] = js.native
  var ObjectValue: js.Array[fields] = js.native
  // Prettier forces trailing commas, but TS pre 3.2 doesn't allow them.
  // prettier-ignore
  var OperationDefinition: js.Tuple4[name, variableDefinitions, directives, selectionSet] = js.native
  var OperationTypeDefinition: js.Array[`type`] = js.native
  var ScalarTypeDefinition: js.Tuple3[description, name, directives] = js.native
  var ScalarTypeExtension: js.Tuple2[name, directives] = js.native
  var SchemaDefinition: js.Tuple2[directives, operationTypes] = js.native
  var SchemaExtension: js.Tuple2[directives, operationTypes] = js.native
  var SelectionSet: js.Array[selections] = js.native
  var StringValue: EmptyTuple = js.native
  var UnionTypeDefinition: js.Tuple4[description, name, directives, types] = js.native
  var UnionTypeExtension: js.Tuple3[name, directives, types] = js.native
  var Variable: js.Array[name] = js.native
  var VariableDefinition: js.Tuple4[variable, `type`, defaultValue, directives] = js.native
}

