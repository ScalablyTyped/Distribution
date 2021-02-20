package typings.jsforce

import typings.jsforce.batchMod.Batch
import typings.jsforce.batchMod.BatchInfo
import typings.jsforce.bulkMod.Bulk
import typings.jsforce.bulkMod.BulkOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
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
  
  @js.native
  trait JobInfo extends StObject {
    
    var id: String = js.native
    
    var `object`: String = js.native
    
    var operation: String = js.native
    
    var state: String = js.native
  }
  object JobInfo {
    
    @scala.inline
    def apply(id: String, `object`: String, operation: String, state: String): JobInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobInfo]
    }
    
    @scala.inline
    implicit class JobInfoMutableBuilder[Self <: JobInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
