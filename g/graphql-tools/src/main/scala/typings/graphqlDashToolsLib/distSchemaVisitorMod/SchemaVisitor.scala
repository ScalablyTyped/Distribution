package typings
package graphqlDashToolsLib.distSchemaVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
abstract class SchemaVisitor () extends js.Object {
  var schema: graphqlLib.graphqlMod.GraphQLSchema = js.native
  def visitArgumentDefinition(argument: graphqlLib.typeDefinitionMod.GraphQLArgument, details: graphqlDashToolsLib.Anon_FieldKey): graphqlLib.typeDefinitionMod.GraphQLArgument | scala.Unit | scala.Null = js.native
  def visitEnum(`type`: graphqlLib.graphqlMod.GraphQLEnumType): graphqlLib.graphqlMod.GraphQLEnumType | scala.Unit | scala.Null = js.native
  def visitEnumValue(value: graphqlLib.typeDefinitionMod.GraphQLEnumValue, details: graphqlDashToolsLib.Anon_EnumType): graphqlLib.typeDefinitionMod.GraphQLEnumValue | scala.Unit | scala.Null = js.native
  def visitFieldDefinition(
    field: graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    details: graphqlDashToolsLib.Anon_ObjectType
  ): (graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | scala.Unit | scala.Null = js.native
  def visitInputFieldDefinition(
    field: graphqlLib.typeDefinitionMod.GraphQLInputField,
    details: graphqlDashToolsLib.Anon_ObjectTypeGraphQLInputObjectType
  ): graphqlLib.typeDefinitionMod.GraphQLInputField | scala.Unit | scala.Null = js.native
  def visitInputObject(`object`: graphqlLib.graphqlMod.GraphQLInputObjectType): graphqlLib.graphqlMod.GraphQLInputObjectType | scala.Unit | scala.Null = js.native
  def visitInterface(iface: graphqlLib.graphqlMod.GraphQLInterfaceType): graphqlLib.graphqlMod.GraphQLInterfaceType | scala.Unit | scala.Null = js.native
  def visitObject(`object`: graphqlLib.graphqlMod.GraphQLObjectType): graphqlLib.graphqlMod.GraphQLObjectType | scala.Unit | scala.Null = js.native
  def visitScalar(scalar: graphqlLib.graphqlMod.GraphQLScalarType): graphqlLib.graphqlMod.GraphQLScalarType | scala.Unit | scala.Null = js.native
  def visitSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def visitUnion(union: graphqlLib.graphqlMod.GraphQLUnionType): graphqlLib.graphqlMod.GraphQLUnionType | scala.Unit | scala.Null = js.native
}

@JSImport("graphql-tools/dist/schemaVisitor", "SchemaVisitor")
@js.native
object SchemaVisitor extends js.Object {
  def implementsVisitorMethod(methodName: java.lang.String): scala.Boolean = js.native
}

