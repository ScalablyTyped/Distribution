package typings.graphqlDashBinding

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLInputObjectType
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldMap
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphqlDashBinding.distCodegenGeneratorMod.Generator
import typings.graphqlDashBinding.distCodegenTypesMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/FlowGenerator", JSImport.Namespace)
@js.native
object distCodegenFlowGeneratorMod extends js.Object {
  @js.native
  class FlowGenerator protected () extends Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: Anon_InputSchemaPath) = this()
    var graphqlRenderers: Anon_GraphQLEnumType = js.native
    var scalarMapping: Anon_Boolean = js.native
    def getPayloadType(operation: String, `type`: String): String = js.native
    def getTypeNames(): js.Array[String] = js.native
    def renderDescription(description: Maybe[String]): String = js.native
    def renderFieldName(field: GraphQLField[_, _, StringDictionary[_]]): String = js.native
    def renderFieldName(field: GraphQLInputField): String = js.native
    def renderFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInputFieldType(`type`: GraphQLInputType | GraphQLOutputType): js.Any = js.native
    def renderInterfaceOrObject(`type`: GraphQLInputObjectType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInterfaceType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLObjectType[_, _, StringDictionary[_]]): String = js.native
    def renderInterfaceWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      interfaces: js.Array[GraphQLInterfaceType],
      fieldDefinition: String
    ): String = js.native
    def renderMainMethodFields(operation: String, fields: GraphQLFieldMap[_, _, StringDictionary[_]]): String = js.native
    def renderMutations(): String = js.native
    def renderObjectWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      objects: js.Array[GraphQLObjectType[_, _, StringDictionary[_]]],
      fieldDefinition: String
    ): String = js.native
    def renderQueries(): String = js.native
    def renderSubscriptions(): String = js.native
    def renderTypeWrapper(typeName: String, typeDescription: Maybe[String], fieldDefinition: String): String = js.native
    def renderTypes(): String = js.native
  }
  
}

