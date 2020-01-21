package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "ODBCResult")
@js.native
class ODBCResult () extends js.Object {
  var fetchMode: Double = js.native
  def closeSync(): Unit = js.native
  def fetchAllSync(): js.Array[_] = js.native
  def fetchSync(): js.Array[_] = js.native
  def moreResultsSync(): js.Array[_] = js.native
}

