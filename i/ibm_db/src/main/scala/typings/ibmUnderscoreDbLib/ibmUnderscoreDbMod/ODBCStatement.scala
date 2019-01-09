package typings
package ibmUnderscoreDbLib.ibmUnderscoreDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "ODBCStatement")
@js.native
class ODBCStatement () extends js.Object {
  var bindQueue: SimpleQueue = js.native
  var queue: SimpleQueue = js.native
  def _bind(params: js.Array[_], cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def _bindSync(ary: js.Array[_]): scala.Unit = js.native
  // TODO: type of outparams is unknown
  def _execute(cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def _executeDirect(
    sql: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  // _executeDirectSync // TODO: Add missing piece
  def _executeNonQuery(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def _executeSync(): ODBCResult = js.native
  def _executeSync(params: js.Array[_]): ODBCResult = js.native
  // _executeNonQuerySync // TODO: Add missing piece
  def _prepare(sql: java.lang.String, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def bind(ary: js.Array[_], cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def bindSync(ary: js.Array[_]): scala.Unit = js.native
   // TODO: type of outparams is unknown
  def execute(
    cb: js.Function3[/* err */ stdLib.Error, /* result */ js.Array[_], /* outparams */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def execute(params: js.Array[_]): js.Promise[ibmUnderscoreDbLib.Anon_Outparams] = js.native
  def execute(
    params: js.Array[_],
    cb: js.Function3[/* err */ stdLib.Error, /* result */ js.Array[_], /* outparams */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def executeDirect(
    sql: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def executeNonQuery(): js.Promise[scala.Unit] = js.native
  def executeNonQuery(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def executeNonQuery(params: js.Array[_]): js.Promise[scala.Unit] = js.native
  def executeNonQuery(params: js.Array[_], cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Array[_], scala.Unit]): scala.Unit = js.native
  def executeSync(): ODBCResult = js.native
  def executeSync(params: js.Array[_]): ODBCResult = js.native
  def prepare(
    sql: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* result */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
}

