package typings.jsforce.jobMod

import typings.jsforce.batchMod.Batch
import typings.jsforce.batchMod.BatchInfo
import typings.jsforce.bulkMod.Bulk
import typings.jsforce.bulkMod.BulkOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/job", "Job")
@js.native
class Job protected () extends EventEmitter {
  def this(bulk: Bulk) = this()
  def this(bulk: Bulk, `type`: String) = this()
  def this(bulk: Bulk, `type`: js.UndefOr[scala.Nothing], operation: String) = this()
  def this(bulk: Bulk, `type`: String, operation: String) = this()
  def this(
    bulk: Bulk,
    `type`: js.UndefOr[scala.Nothing],
    operation: js.UndefOr[scala.Nothing],
    options: BulkOptions
  ) = this()
  def this(bulk: Bulk, `type`: js.UndefOr[scala.Nothing], operation: String, options: BulkOptions) = this()
  def this(bulk: Bulk, `type`: String, operation: js.UndefOr[scala.Nothing], options: BulkOptions) = this()
  def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions) = this()
  def this(
    bulk: Bulk,
    `type`: js.UndefOr[scala.Nothing],
    operation: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    jobId: String
  ) = this()
  def this(
    bulk: Bulk,
    `type`: js.UndefOr[scala.Nothing],
    operation: js.UndefOr[scala.Nothing],
    options: BulkOptions,
    jobId: String
  ) = this()
  def this(
    bulk: Bulk,
    `type`: js.UndefOr[scala.Nothing],
    operation: String,
    options: js.UndefOr[scala.Nothing],
    jobId: String
  ) = this()
  def this(
    bulk: Bulk,
    `type`: js.UndefOr[scala.Nothing],
    operation: String,
    options: BulkOptions,
    jobId: String
  ) = this()
  def this(
    bulk: Bulk,
    `type`: String,
    operation: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    jobId: String
  ) = this()
  def this(
    bulk: Bulk,
    `type`: String,
    operation: js.UndefOr[scala.Nothing],
    options: BulkOptions,
    jobId: String
  ) = this()
  def this(bulk: Bulk, `type`: String, operation: String, options: js.UndefOr[scala.Nothing], jobId: String) = this()
  def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions, jobId: String) = this()
  
  def abort(): js.Promise[_] = js.native
  def abort(callback: js.Function2[/* err */ Error, /* jobInfo */ JobInfo, Unit]): js.Promise[_] = js.native
  
  def batch(batchId: String): Batch = js.native
  
  def check(): js.Promise[JobInfo] = js.native
  def check(callback: js.Function2[/* err */ Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  
  def close(): js.Promise[JobInfo] = js.native
  def close(callback: js.Function2[/* err */ Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  
  def createBatch(): Batch = js.native
  
  def info(): js.Promise[JobInfo] = js.native
  def info(callback: js.Function2[/* err */ Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  
  def list(): js.Promise[js.Array[BatchInfo]] = js.native
  def list(callback: js.Function2[/* err */ Error, /* jobInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchInfo]] = js.native
  
  def open(): js.Promise[JobInfo] = js.native
  def open(callback: js.Function2[/* err */ Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
}
