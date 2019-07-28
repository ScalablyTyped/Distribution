package typings.jsforce.recordMod

import typings.jsforce.connectionMod.Connection
import typings.jsforce.recordDashResultMod.RecordResult
import typings.jsforce.salesforceDashIdMod.SalesforceId
import typings.node.streamMod.Stream
import typings.std.Error
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/record", "RecordReference")
@js.native
class RecordReference[T] protected () extends js.Object {
  def this(conn: Connection, `type`: String, id: SalesforceId) = this()
  def blob(fieldName: String): Stream = js.native
  def del(): js.Promise[RecordResult] = js.native
  def del(options: js.Object): js.Promise[RecordResult] = js.native
  def del(options: js.Object, callback: js.Function2[/* err */ Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
  def delete(): js.Promise[RecordResult] = js.native
  def delete(options: js.Object): js.Promise[RecordResult] = js.native
  def delete(options: js.Object, callback: js.Function2[/* err */ Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
  def destroy(): js.Promise[RecordResult] = js.native
  def destroy(options: js.Object): js.Promise[RecordResult] = js.native
  def destroy(options: js.Object, callback: js.Function2[/* err */ Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
  def retrieve(): js.Promise[Record[T]] = js.native
  def retrieve(options: js.Object): js.Promise[Record[T]] = js.native
  def retrieve(options: js.Object, callback: js.Function2[/* err */ Error, /* record */ Record[T], Unit]): js.Promise[Record[T]] = js.native
  def update(record: Partial[T]): js.Promise[RecordResult] = js.native
  def update(record: Partial[T], options: js.Object): js.Promise[RecordResult] = js.native
  def update(
    record: Partial[T],
    options: js.Object,
    callback: js.Function2[/* err */ Error, /* result */ RecordResult, Unit]
  ): js.Promise[RecordResult] = js.native
}

