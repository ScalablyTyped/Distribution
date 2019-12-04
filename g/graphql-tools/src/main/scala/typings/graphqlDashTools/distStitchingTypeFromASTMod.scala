package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLInputObjectType
import typings.graphql.graphqlMod.GraphQLInterfaceType
import typings.graphql.graphqlMod.GraphQLObjectType
import typings.graphql.languageAstMod.DefinitionNode
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphqlDashTools.graphqlDashToolsStrings.`object`
import typings.graphqlDashTools.graphqlDashToolsStrings.input
import typings.graphqlDashTools.graphqlDashToolsStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/typeFromAST", JSImport.Namespace)
@js.native
object distStitchingTypeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  type GetType = js.Function2[
    /* name */ String, 
    /* type */ `object` | interface | input, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputObjectType | GraphQLInterfaceType
  ]
}

