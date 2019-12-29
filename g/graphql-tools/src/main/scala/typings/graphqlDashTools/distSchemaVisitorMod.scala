package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
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
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", JSImport.Namespace)
@js.native
object distSchemaVisitorMod extends js.Object {
  @js.native
  class SchemaDirectiveVisitor protected () extends SchemaVisitor {
    protected def this(config: Anon_Args) = this()
    var args: StringDictionary[js.Any] = js.native
    var context: StringDictionary[js.Any] = js.native
    var name: String = js.native
    var visitedType: VisitableSchemaType = js.native
  }
  
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
  
  def healSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def visitSchema(
    schema: GraphQLSchema,
    visitorSelector: js.Function2[/* type */ VisitableSchemaType, /* methodName */ String, js.Array[SchemaVisitor]]
  ): GraphQLSchema = js.native
  /* static members */
  @js.native
  object SchemaDirectiveVisitor extends js.Object {
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor]): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: StringDictionary[TypeofClassSchemaDirectiveVisitor],
      context: StringDictionary[js.Any]
    ): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
  }
  
  /* static members */
  @js.native
  object SchemaVisitor extends js.Object {
    def implementsVisitorMethod(methodName: String): Boolean = js.native
  }
  
  type VisitableSchemaType = GraphQLSchema | (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInterfaceType | GraphQLInputObjectType | GraphQLNamedType | GraphQLScalarType | (GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLArgument | GraphQLUnionType | GraphQLEnumType | GraphQLEnumValue | GraphQLInputField
}

