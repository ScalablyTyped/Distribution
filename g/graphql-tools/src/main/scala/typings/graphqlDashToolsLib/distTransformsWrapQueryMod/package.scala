package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTransformsWrapQueryMod {
  type QueryWrapper = js.Function1[
    /* subtree */ graphqlLib.languageAstMod.SelectionSetNode, 
    graphqlLib.languageAstMod.SelectionNode | graphqlLib.languageAstMod.SelectionSetNode
  ]
}
