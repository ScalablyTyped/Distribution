package typings
package heredatalensLib.HNs.datalensNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * The format of Data Lens query data.
         * The Data Lens query data has a table-like structure with named columns and rows.
         */

trait Data extends js.Object {
  /** Column names */
  var columns: js.Array[java.lang.String]
  /** Rows of data */
  var rows: js.Array[js.Array[_]]
}

