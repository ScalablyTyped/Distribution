package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashPair extends Node {
  var key: java.lang.String
  var value: Expression
}

object HashPair {
  @scala.inline
  def apply(key: java.lang.String, loc: SourceLocation, `type`: java.lang.String, value: Expression): HashPair = {
    val __obj = js.Dynamic.literal(key = key, loc = loc, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HashPair]
  }
}

