package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectionSetNode extends js.Object {
  var kind: graphqlLib.graphqlLibStrings.SelectionSet
  var loc: js.UndefOr[Location] = js.undefined
  var selections: js.Array[SelectionNode]
}

