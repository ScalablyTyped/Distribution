package typings.graphqlDashTools.distSchemaVisitorMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLEnumType
import typings.graphql.graphqlMod.GraphQLInputObjectType
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.graphqlMod.GraphQLScalarType
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.graphqlMod.GraphQLUnionType
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLEnumValue
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphqlDashTools.Anon_EnumType
import typings.graphqlDashTools.Anon_FieldKey
import typings.graphqlDashTools.Anon_Key
import typings.graphqlDashTools.Anon_ObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
abstract class SchemaVisitor () extends js.Object {
  var schema: GraphQLSchema = js.native
  def visitArgumentDefinition(argument: GraphQLArgument, details: Anon_FieldKey): GraphQLArgument | Unit | Null = js.native
  def visitEnum(`type`: GraphQLEnumType): GraphQLEnumType | Unit | Null = js.native
  def visitEnumValue(value: GraphQLEnumValue, details: Anon_EnumType): GraphQLEnumValue | Unit | Null = js.native
  def visitFieldDefinition(field: GraphQLField[_, _, StringDictionary[_]], details: Anon_Key): (GraphQLField[_, _, StringDictionary[_]]) | Unit | Null = js.native
  def visitInputFieldDefinition(field: GraphQLInputField, details: Anon_ObjectType): GraphQLInputField | Unit | Null = js.native
  def visitInputObject(`object`: GraphQLInputObjectType): GraphQLInputObjectType | Unit | Null = js.native
  def visitInterface(iface: GraphQLInterfaceType): GraphQLInterfaceType | Unit | Null = js.native
  def visitObject(`object`: GraphQLObjectType[_, _, StringDictionary[_]]): (GraphQLObjectType[_, _, StringDictionary[_]]) | Unit | Null = js.native
  def visitScalar(scalar: GraphQLScalarType): GraphQLScalarType | Unit | Null = js.native
  def visitSchema(schema: GraphQLSchema): Unit = js.native
  def visitUnion(union: GraphQLUnionType): GraphQLUnionType | Unit | Null = js.native
}

/* static members */
@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
object SchemaVisitor extends js.Object {
  def implementsVisitorMethod(methodName: String): Boolean = js.native
}

