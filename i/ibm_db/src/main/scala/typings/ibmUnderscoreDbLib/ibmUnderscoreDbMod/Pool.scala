package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "Pool")
@js.native
class Pool () extends PoolOptions {
  def this(options: PoolOptions) = this()
  var availablePool: js.Object = js.native
  var index: scala.Double = js.native
  var odbc: ODBC = js.native
  var options: PoolOptions = js.native
  var poolsize: scala.Double = js.native
  var usedPool: js.Object = js.native
  def cleanup(connStr: java.lang.String): scala.Boolean = js.native
  def close(cb: js.Function2[/* foo */ js.Any, /* bar */ js.Any, _]): scala.Unit = js.native
  def init(count: scala.Double, connStr: java.lang.String): scala.Boolean = js.native
  def open(connStr: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* db */ Database, scala.Unit]): scala.Unit = js.native
  def setConnectTimeout(timeout: scala.Double): scala.Boolean = js.native
  def setMaxPoolSize(count: scala.Double): scala.Boolean = js.native
}

