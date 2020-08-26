package typings.graphqlBinding

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldMap
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlBinding.anon.DateTime
import typings.graphqlBinding.anon.GraphQLEnumType
import typings.graphqlBinding.anon.InputSchemaPath
import typings.graphqlBinding.generatorMod.Generator
import typings.graphqlBinding.typesMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/codegen/TypescriptGenerator", JSImport.Namespace)
@js.native
object typescriptGeneratorMod extends js.Object {
  @js.native
  class TypescriptGenerator protected () extends Generator {
    def this(hasSchemaInputSchemaPathOutputBindingPathIsDefaultExport: InputSchemaPath) = this()
    var graphqlRenderers: GraphQLEnumType = js.native
    var scalarMapping: DateTime = js.native
    def getPayloadType(operation: String, nonNullType: Boolean): String = js.native
    def getTypeNames(): js.Array[String] = js.native
    def renderDescription(description: Maybe[String]): String = js.native
    def renderFieldName(field: GraphQLField[_, _, StringDictionary[_]]): String = js.native
    def renderFieldName(field: GraphQLInputField): String = js.native
    def renderFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInputFieldType(`type`: GraphQLInputType | GraphQLOutputType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInputObjectType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLInterfaceType): String = js.native
    def renderInterfaceOrObject(`type`: GraphQLObjectType[_, _]): String = js.native
    def renderInterfaceWrapper(
      typeName: String,
      typeDescription: Maybe[String],
      interfaces: js.Array[GraphQLInterfaceType],
      fieldDefinition: String
    ): String = js.native
    def renderMainMethodFields(operation: String, fields: GraphQLFieldMap[_, _]): String = js.native
    def renderMutations(): String = js.native
    def renderQueries(): String = js.native
    def renderSubscriptions(): String = js.native
    def renderTypeWrapper(typeName: String, typeDescription: Maybe[String], fieldDefinition: String): String = js.native
    def renderTypes(): String = js.native
  }
  
}

