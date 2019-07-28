package typings.graphqlDashTools

import typings.graphql.languageAstMod.SelectionNode
import typings.graphql.languageAstMod.SelectionSetNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsWrapQueryMod {
  type QueryWrapper = js.Function1[/* subtree */ SelectionSetNode, SelectionNode | SelectionSetNode]
}
