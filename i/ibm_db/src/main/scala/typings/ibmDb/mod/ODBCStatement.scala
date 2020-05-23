package typings.ibmDb.mod

import typings.ibmDb.anon.Outparams
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ibm_db", "ODBCStatement")
@js.native
class ODBCStatement () extends js.Object {
  var bindQueue: SimpleQueue = js.native
  var queue: SimpleQueue = js.native
  def _bind(params: js.Array[_], cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def _bindSync(ary: js.Array[_]): Unit = js.native
  // TODO: type of outparams is unknown
  def _execute(cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
  def _executeDirect(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
  // _executeDirectSync // TODO: Add missing piece
  def _executeNonQuery(cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def _executeSync(): ODBCResult = js.native
  def _executeSync(params: js.Array[_]): ODBCResult = js.native
  // _executeNonQuerySync // TODO: Add missing piece
  def _prepare(sql: String, cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def bind(ary: js.Array[_], cb: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def bindSync(ary: js.Array[_]): Unit = js.native
   // TODO: type of outparams is unknown
  def execute(cb: js.Function3[/* err */ Error, /* result */ js.Array[_], /* outparams */ js.Any, Unit]): Unit = js.native
  def execute(params: js.Array[_]): js.Promise[Outparams] = js.native
  def execute(
    params: js.Array[_],
    cb: js.Function3[/* err */ Error, /* result */ js.Array[_], /* outparams */ js.Any, Unit]
  ): Unit = js.native
  def executeDirect(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
  def executeNonQuery(): js.Promise[Unit] = js.native
  def executeNonQuery(cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def executeNonQuery(params: js.Array[_]): js.Promise[Unit] = js.native
  def executeNonQuery(params: js.Array[_], cb: js.Function2[/* err */ Error, /* res */ js.Array[_], Unit]): Unit = js.native
  def executeSync(): ODBCResult = js.native
  def executeSync(params: js.Array[_]): ODBCResult = js.native
  def prepare(sql: String, cb: js.Function2[/* err */ Error, /* result */ js.Array[_], Unit]): Unit = js.native
}

