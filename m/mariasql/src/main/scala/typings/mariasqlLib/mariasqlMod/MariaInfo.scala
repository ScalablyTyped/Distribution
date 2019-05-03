package typings
package mariasqlLib.mariasqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MariaInfo extends js.Object {
  var affectedRows: scala.Double
  var insertId: scala.Double
  var numRows: scala.Double
}

object MariaInfo {
  @scala.inline
  def apply(affectedRows: scala.Double, insertId: scala.Double, numRows: scala.Double): MariaInfo = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows, insertId = insertId, numRows = numRows)
  
    __obj.asInstanceOf[MariaInfo]
  }
}

