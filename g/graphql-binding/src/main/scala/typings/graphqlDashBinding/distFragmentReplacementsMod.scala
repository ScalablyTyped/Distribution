package typings.graphqlDashBinding

import typings.graphqlDashBinding.distTypesMod.FragmentReplacement
import typings.graphqlDashTools.distInterfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/fragmentReplacements", JSImport.Namespace)
@js.native
object distFragmentReplacementsMod extends js.Object {
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
}

