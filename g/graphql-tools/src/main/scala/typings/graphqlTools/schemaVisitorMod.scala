package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.GraphQLUnionType
import typings.graphqlTools.anon.Args
import typings.graphqlTools.anon.EnumType
import typings.graphqlTools.anon.FieldObjectType
import typings.graphqlTools.anon.ObjectType
import typings.graphqlTools.anon.ObjectTypeGraphQLInputObjectType
import typings.graphqlTools.anon.TypeofSchemaDirectiveVisi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/schemaVisitor", JSImport.Namespace)
@js.native
object schemaVisitorMod extends js.Object {
  @js.native
  class SchemaDirectiveVisitor protected () extends SchemaVisitor {
    protected def this(config: Args) = this()
    var args: StringDictionary[js.Any] = js.native
    var context: StringDictionary[js.Any] = js.native
    var name: String = js.native
    var visitedType: VisitableSchemaType = js.native
  }
  
  @js.native
  abstract class SchemaVisitor () extends js.Object {
    var schema: GraphQLSchema = js.native
    def visitArgumentDefinition(argument: GraphQLArgument, details: FieldObjectType): GraphQLArgument | Unit | Null = js.native
    def visitEnum(`type`: GraphQLEnumType): GraphQLEnumType | Unit | Null = js.native
    def visitEnumValue(value: GraphQLEnumValue, details: EnumType): GraphQLEnumValue | Unit | Null = js.native
    def visitFieldDefinition(field: GraphQLField[_, _, StringDictionary[_]], details: ObjectType): (GraphQLField[_, _, StringDictionary[_]]) | Unit | Null = js.native
    def visitInputFieldDefinition(field: GraphQLInputField, details: ObjectTypeGraphQLInputObjectType): GraphQLInputField | Unit | Null = js.native
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
    /* protected */ def getDeclaredDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[GraphQLDirective] = js.native
    def getDirectiveDeclaration(directiveName: String, schema: GraphQLSchema): GraphQLDirective = js.native
    def visitSchemaDirectives(schema: GraphQLSchema, directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi]): StringDictionary[js.Array[SchemaDirectiveVisitor]] = js.native
    def visitSchemaDirectives(
      schema: GraphQLSchema,
      directiveVisitors: StringDictionary[TypeofSchemaDirectiveVisi],
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

