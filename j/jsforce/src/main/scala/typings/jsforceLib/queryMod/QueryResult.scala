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

