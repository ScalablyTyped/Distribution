package typings.graphqlTools.mod

import typings.graphqlToolsResolversComposition.resolversCompositionMod.ResolversComposerMapping
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "composeResolvers")
@js.native
object composeResolvers extends js.Object {
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers): Resolvers = js.native
  def apply[Resolvers /* <: Record[String, _] */](resolvers: Resolvers, mapping: ResolversComposerMapping[Resolvers]): Resolvers = js.native
}

