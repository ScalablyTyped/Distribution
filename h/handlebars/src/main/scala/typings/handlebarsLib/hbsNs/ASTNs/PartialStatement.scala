package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialStatement extends Node {
  var hash: Hash
  var indent: java.lang.String
  var name: PathExpression | SubExpression
  var params: js.Array[Expression]
  var strip: StripFlags
}

