package typings.jsforce.mod

import typings.jsforce.bulkMod.BulkOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce", "Job")
@js.native
class Job protected ()
  extends typings.jsforce.jobMod.Job {
  def this(bulk: typings.jsforce.bulkMod.Bulk) = this()
  def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String) = this()
  def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String, operation: String) = this()
  def this(bulk: typings.jsforce.bulkMod.Bulk, `type`: String, operation: String, options: BulkOptions) = this()
  def this(
    bulk: typings.jsforce.bulkMod.Bulk,
    `type`: String,
    operation: String,
    options: BulkOptions,
    jobId: String
  ) = this()
}

