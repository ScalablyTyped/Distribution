package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.GraphQLUnionType
import typings.graphqlToolsUtils.anon.EnumType
import typings.graphqlToolsUtils.anon.Field
import typings.graphqlToolsUtils.anon.ObjectType
import typings.graphqlToolsUtils.anon.ObjectTypeGraphQLInputObjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/SchemaVisitor", JSImport.Namespace)
@js.native
object schemaVisitorMod extends js.Object {
  @js.native
  abstract class SchemaVisitor () extends js.Object {
    var schema: GraphQLSchema = js.native
    def visitArgumentDefinition(_argument: GraphQLArgument, _details: Field): GraphQLArgument | Unit | Null = js.native
    def visitEnum(_type: GraphQLEnumType): GraphQLEnumType | Unit | Null = js.native
    def visitEnumValue(_value: GraphQLEnumValue, _details: EnumType): GraphQLEnumValue | Unit | Null = js.native
    def visitFieldDefinition(_field: GraphQLField[_, _, StringDictionary[_]], _details: ObjectType): (GraphQLField[_, _, StringDictionary[_]]) | Unit | Null = js.native
    def visitInputFieldDefinition(_field: GraphQLInputField, _details: ObjectTypeGraphQLInputObjectType): GraphQLInputField | Unit | Null = js.native
    def visitInputObject(_object: GraphQLInputObjectType): GraphQLInputObjectType | Unit | Null = js.native
    def visitInterface(_iface: GraphQLInterfaceType): GraphQLInterfaceType | Unit | Null = js.native
    def visitObject(_object: GraphQLObjectType[_, _]): (GraphQLObjectType[_, _]) | Unit | Null = js.native
    def visitScalar(_scalar: GraphQLScalarType): GraphQLScalarType | Unit | Null = js.native
    def visitSchema(_schema: GraphQLSchema): Unit = js.native
    def visitUnion(_union: GraphQLUnionType): GraphQLUnionType | Unit | Null = js.native
  }
  
  /* static members */
  @js.native
  object SchemaVisitor extends js.Object {
    def implementsVisitorMethod(methodName: String): Boolean = js.native
  }
  
}

