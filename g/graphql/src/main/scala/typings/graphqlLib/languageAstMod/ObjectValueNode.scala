package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectValueNode extends js.Object {
  val fields: js.Array[ObjectFieldNode]
  val kind: graphqlLib.graphqlLibStrings.ObjectValue
  val loc: js.UndefOr[Location] = js.undefined
}

