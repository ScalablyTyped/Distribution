package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "ODBCResult")
@js.native
class ODBCResult () extends js.Object {
  var fetchMode: scala.Double = js.native
  def closeSync(): scala.Unit = js.native
  def fetchAllSync(): js.Array[_] = js.native
  def fetchSync(): js.Array[_] = js.native
  def moreResultsSync(): js.Array[_] = js.native
}

