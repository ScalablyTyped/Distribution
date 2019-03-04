package typings
package jsforceLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult[T] extends js.Object {
  var done: scala.Boolean
  var nextRecordsUrl: js.UndefOr[java.lang.String] = js.undefined
  var records: js.Array[T]
  var totalSize: scala.Double
}

object QueryResult {
  @scala.inline
  def apply[T](
    done: scala.Boolean,
    records: js.Array[T],
    totalSize: scala.Double,
    nextRecordsUrl: java.lang.String = null
  ): QueryResult[T] = {
    val __obj = js.Dynamic.literal(done = done, records = records, totalSize = totalSize)
    if (nextRecordsUrl != null) __obj.updateDynamic("nextRecordsUrl")(nextRecordsUrl)
    __obj.asInstanceOf[QueryResult[T]]
  }
}

