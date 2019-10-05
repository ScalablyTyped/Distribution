package typings.graphqlDashCompose.graphqlDashComposeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "getFlatProjectionFromAST")
@js.native
object getFlatProjectionFromAST extends js.Object {
  def apply(info: GraphQLResolveInfo): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FieldNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: FragmentDefinitionNode): StringDictionary[Boolean] = js.native
  def apply(info: GraphQLResolveInfo, fieldNodes: InlineFragmentNode): StringDictionary[Boolean] = js.native
}

