package typings.heredatalens.H.datalens.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The format of Data Lens query data.
  * The Data Lens query data has a table-like structure with named columns and rows.
  */
trait Data extends js.Object {
  /** Column names */
  var columns: js.Array[String]
  /** Rows of data */
  var rows: js.Array[js.Array[_]]
}

object Data {
  @scala.inline
  def apply(columns: js.Array[String], rows: js.Array[js.Array[_]]): Data = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

