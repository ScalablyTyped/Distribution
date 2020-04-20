package typings.mariasql.mod

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
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], insertId = insertId.asInstanceOf[js.Any], numRows = numRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaInfo]
  }
}

