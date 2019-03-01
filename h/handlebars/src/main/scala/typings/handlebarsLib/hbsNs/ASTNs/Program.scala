package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program extends Node {
  var blockParams: js.Array[java.lang.String]
  var body: js.Array[Statement]
}

object Program {
  @scala.inline
  def apply(
    blockParams: js.Array[java.lang.String],
    body: js.Array[Statement],
    loc: SourceLocation,
    `type`: java.lang.String
  ): Program = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("blockParams")(blockParams)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Program]
  }
}

