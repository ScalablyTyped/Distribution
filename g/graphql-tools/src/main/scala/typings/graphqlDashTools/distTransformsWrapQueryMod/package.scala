package typings.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsWrapQueryMod {
  import typings.graphql.languageAstMod.SelectionNode
  import typings.graphql.languageAstMod.SelectionSetNode

  type QueryWrapper = js.Function1[/* subtree */ SelectionSetNode, SelectionNode | SelectionSetNode]
}
