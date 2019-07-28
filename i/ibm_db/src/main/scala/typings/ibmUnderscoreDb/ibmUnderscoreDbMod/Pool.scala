package typings.ibmUnderscoreDb.ibmUnderscoreDbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "Pool")
@js.native
class Pool () extends PoolOptions {
  def this(options: PoolOptions) = this()
  var availablePool: js.Object = js.native
  var index: Double = js.native
  var odbc: ODBC = js.native
  var options: PoolOptions = js.native
  var poolsize: Double = js.native
  var usedPool: js.Object = js.native
  def cleanup(connStr: String): Boolean = js.native
  def close(cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): Unit = js.native
  def init(count: Double, connStr: String): Boolean = js.native
  def open(connStr: String, cb: js.Function2[/* err */ Error, /* db */ Database, Unit]): Unit = js.native
  def setConnectTimeout(timeout: Double): Boolean = js.native
  def setMaxPoolSize(count: Double): Boolean = js.native
}

