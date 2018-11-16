package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MustacheStatement extends Node {
  var escaped: scala.Boolean
  var hash: Hash
  var params: js.Array[Expression]
  var path: PathExpression | Literal
  var strip: StripFlags
}

