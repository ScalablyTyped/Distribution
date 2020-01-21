package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wrapQueryMod {
  type QueryWrapper = js.Function1[
    /* subtree */ typings.graphql.astMod.SelectionSetNode, 
    typings.graphql.astMod.SelectionNode | typings.graphql.astMod.SelectionSetNode
  ]
}
