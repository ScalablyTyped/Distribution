package typings
package handlebarsLib.hbsNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends Node {
  var pairs: js.Array[HashPair]
}

object Hash {
  @scala.inline
  def apply(loc: SourceLocation, pairs: js.Array[HashPair], `type`: java.lang.String): Hash = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("loc")(loc)
    __obj.updateDynamic("pairs")(pairs)
    __obj.asInstanceOf[Hash]
  }
}

