package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PartialBlockStatement extends Node {
  var closeStrip: StripFlags
  var hash: Hash
  var name: PathExpression | SubExpression
  var openStrip: StripFlags
  var params: js.Array[Expression]
  var program: Program
}

