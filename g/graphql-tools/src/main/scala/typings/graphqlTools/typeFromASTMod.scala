package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DefinitionNode
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.mod.GraphQLDirective
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphqlTools.graphqlToolsStrings.`object`
import typings.graphqlTools.graphqlToolsStrings.input
import typings.graphqlTools.graphqlToolsStrings.interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/stitching/typeFromAST", JSImport.Namespace)
@js.native
object typeFromASTMod extends js.Object {
  def default(node: DefinitionNode): GraphQLNamedType | GraphQLDirective | Null = js.native
  type GetType = js.Function2[
    /* name */ String, 
    /* type */ `object` | interface | input, 
    (GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]]) | GraphQLInputObjectType | GraphQLInterfaceType
  ]
}

