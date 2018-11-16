package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListValueNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.ListValue
  val loc: js.UndefOr[Location] = js.undefined
  val values: js.Array[ValueNode]
}

