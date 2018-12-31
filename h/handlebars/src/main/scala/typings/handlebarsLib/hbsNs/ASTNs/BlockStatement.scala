package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockStatement extends Node {
  var closeStrip: StripFlags
  var hash: Hash
  var inverse: Program
  var inverseStrip: StripFlags
  var openStrip: StripFlags
  var params: js.Array[Expression]
  var path: PathExpression
  var program: Program
}

