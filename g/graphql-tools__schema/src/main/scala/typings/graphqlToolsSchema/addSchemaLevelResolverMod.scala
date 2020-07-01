package typings.graphqlToolsSchema

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/schema/addSchemaLevelResolver", JSImport.Namespace)
@js.native
object addSchemaLevelResolverMod extends js.Object {
  def addSchemaLevelResolver(schema: GraphQLSchema, fn: GraphQLFieldResolver[_, _, StringDictionary[_]]): GraphQLSchema = js.native
}

