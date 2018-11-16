package typings
package jsforceLib.bulkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/bulk", "Bulk")
@js.native
class Bulk protected () extends js.Object {
  def this(connection: jsforceLib.connectionMod.Connection) = this()
  var pollInterval: scala.Double = js.native
  var pollTimeout: scala.Double = js.native
  def createJob(`type`: java.lang.String, operation: java.lang.String): jsforceLib.jobMod.Job = js.native
  def createJob(`type`: java.lang.String, operation: java.lang.String, options: BulkOptions): jsforceLib.jobMod.Job = js.native
  def job(id: java.lang.String): jsforceLib.jobMod.Job = js.native
  def load(`type`: java.lang.String, operation: BulkLoadOperation): jsforceLib.batchMod.Batch = js.native
  def load(`type`: java.lang.String, operation: BulkLoadOperation, options: BulkOptions): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: java.lang.String
  ): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo], 
      scala.Unit
    ]
  ): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: js.Array[jsforceLib.recordMod.Record[_]]
  ): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: js.Array[jsforceLib.recordMod.Record[_]],
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo], 
      scala.Unit
    ]
  ): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: nodeLib.streamMod.Stream
  ): jsforceLib.batchMod.Batch = js.native
  def load(
    `type`: java.lang.String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: nodeLib.streamMod.Stream,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo], 
      scala.Unit
    ]
  ): jsforceLib.batchMod.Batch = js.native
  def query(soql: java.lang.String): js.Any = js.native
}

