package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLFieldConfigMap
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/fields", JSImport.Namespace)
@js.native
object fieldsMod extends js.Object {
  def appendObjectFields(schema: GraphQLSchema, typeName: String, additionalFields: GraphQLFieldConfigMap[_, _]): GraphQLSchema = js.native
  def modifyObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ],
    newFields: GraphQLFieldConfigMap[_, _]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
  def removeObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ]
  ): js.Tuple2[GraphQLSchema, GraphQLFieldConfigMap[_, _]] = js.native
  def selectObjectFields(
    schema: GraphQLSchema,
    typeName: String,
    testFn: js.Function2[
      /* fieldName */ String, 
      /* field */ GraphQLFieldConfig[_, _, StringDictionary[_]], 
      Boolean
    ]
  ): GraphQLFieldConfigMap[_, _] = js.native
}

