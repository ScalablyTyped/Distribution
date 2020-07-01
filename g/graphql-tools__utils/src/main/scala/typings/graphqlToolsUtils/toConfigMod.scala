package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLArgumentConfig
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLFieldConfigArgumentMap
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLInputFieldConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/toConfig", JSImport.Namespace)
@js.native
object toConfigMod extends js.Object {
  def argsToFieldConfigArgumentMap(args: js.Array[GraphQLArgument]): GraphQLFieldConfigArgumentMap = js.native
  def argumentToArgumentConfig(arg: GraphQLArgument): GraphQLArgumentConfig = js.native
  def fieldToFieldConfig(field: GraphQLField[_, _, StringDictionary[_]]): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def inputFieldToFieldConfig(field: GraphQLInputField): GraphQLInputFieldConfig = js.native
}

