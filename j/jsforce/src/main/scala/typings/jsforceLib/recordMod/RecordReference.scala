package typings
package jsforceLib.recordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/record", "RecordReference")
@js.native
class RecordReference[T] protected () extends js.Object {
  def this(conn: jsforceLib.connectionMod.Connection, `type`: java.lang.String, id: jsforceLib.salesforceDashIdMod.SalesforceId) = this()
  def blob(fieldName: java.lang.String): nodeLib.streamMod.Stream = js.native
  def del(): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def del(options: js.Object): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def del(
    options: js.Object,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def delete(): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def delete(options: js.Object): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def delete(
    options: js.Object,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def destroy(): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def destroy(options: js.Object): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def destroy(
    options: js.Object,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def retrieve(): stdLib.Promise[Record[T]] = js.native
  def retrieve(options: js.Object): stdLib.Promise[Record[T]] = js.native
  def retrieve(
    options: js.Object,
    callback: js.Function2[/* err */ nodeLib.Error, /* record */ Record[T], scala.Unit]
  ): stdLib.Promise[Record[T]] = js.native
  def update(record: stdLib.Partial[T]): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def update(record: stdLib.Partial[T], options: js.Object): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def update(
    record: stdLib.Partial[T],
    options: js.Object,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
}

