package typings.graphqlBinding

import typings.graphqlBinding.distTypesMod.FragmentReplacement
import typings.graphqlTools.interfacesMod.IResolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/fragmentReplacements", JSImport.Namespace)
@js.native
object fragmentReplacementsMod extends js.Object {
  def extractFragmentReplacements(resolvers: IResolvers[_, _]): js.Array[FragmentReplacement] = js.native
}

