package typings
package jsforceLib.jobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/job", "Job")
@js.native
class Job protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(bulk: jsforceLib.bulkMod.Bulk) = this()
  def this(bulk: jsforceLib.bulkMod.Bulk, `type`: java.lang.String) = this()
  def this(bulk: jsforceLib.bulkMod.Bulk, `type`: java.lang.String, operation: java.lang.String) = this()
  def this(bulk: jsforceLib.bulkMod.Bulk, `type`: java.lang.String, operation: java.lang.String, options: jsforceLib.bulkMod.BulkOptions) = this()
  def this(bulk: jsforceLib.bulkMod.Bulk, `type`: java.lang.String, operation: java.lang.String, options: jsforceLib.bulkMod.BulkOptions, jobId: java.lang.String) = this()
  def abort(): stdLib.Promise[_] = js.native
  def abort(callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ JobInfo, scala.Unit]): stdLib.Promise[_] = js.native
  def batch(batchId: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def check(): stdLib.Promise[JobInfo] = js.native
  def check(callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ JobInfo, scala.Unit]): stdLib.Promise[JobInfo] = js.native
  def close(): stdLib.Promise[JobInfo] = js.native
  def close(callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ JobInfo, scala.Unit]): stdLib.Promise[JobInfo] = js.native
  def createBatch(): jsforceLib.batchMod.Batch = js.native
  def info(): stdLib.Promise[JobInfo] = js.native
  def info(callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ JobInfo, scala.Unit]): stdLib.Promise[JobInfo] = js.native
  def list(): stdLib.Promise[js.Array[jsforceLib.batchMod.BatchInfo]] = js.native
  def list(
    callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ jsforceLib.batchMod.BatchInfo, scala.Unit]
  ): stdLib.Promise[js.Array[jsforceLib.batchMod.BatchInfo]] = js.native
  def open(): stdLib.Promise[JobInfo] = js.native
  def open(callback: js.Function2[/* err */ nodeLib.Error, /* jobInfo */ JobInfo, scala.Unit]): stdLib.Promise[JobInfo] = js.native
}

