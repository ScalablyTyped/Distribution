package typings.mariasql.mariasqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MariaInfo extends js.Object {
  var affectedRows: Double
  var insertId: Double
  var numRows: Double
}

object MariaInfo {
  @scala.inline
  def apply(affectedRows: Double, insertId: Double, numRows: Double): MariaInfo = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows, insertId = insertId, numRows = numRows)
  
    __obj.asInstanceOf[MariaInfo]
  }
}

