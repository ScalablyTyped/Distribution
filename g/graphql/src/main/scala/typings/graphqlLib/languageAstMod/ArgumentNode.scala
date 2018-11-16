package typings
package graphqlLib.languageAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArgumentNode extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.Argument
  val loc: js.UndefOr[Location] = js.undefined
  val name: NameNode
  val value: ValueNode
}

