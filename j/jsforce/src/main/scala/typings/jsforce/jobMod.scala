package typings.jsforce

import typings.jsforce.batchMod.Batch
import typings.jsforce.batchMod.BatchInfo
import typings.jsforce.bulkMod.Bulk
import typings.jsforce.bulkMod.BulkOptions
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
  @JSImport("jsforce/job", "Job")
  @js.native
  open class Job protected () extends EventEmitter {
    def this(bulk: Bulk) = this()
    def this(bulk: Bulk, `type`: String) = this()
    def this(bulk: Bulk, `type`: String, operation: String) = this()
    def this(bulk: Bulk, `type`: Unit, operation: String) = this()
    def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions) = this()
    def this(bulk: Bulk, `type`: String, operation: Unit, options: BulkOptions) = this()
    def this(bulk: Bulk, `type`: Unit, operation: String, options: BulkOptions) = this()
    def this(bulk: Bulk, `type`: Unit, operation: Unit, options: BulkOptions) = this()
    def this(bulk: Bulk, `type`: String, operation: String, options: Unit, jobId: String) = this()
    def this(bulk: Bulk, `type`: String, operation: String, options: BulkOptions, jobId: String) = this()
    def this(bulk: Bulk, `type`: String, operation: Unit, options: Unit, jobId: String) = this()
    def this(bulk: Bulk, `type`: String, operation: Unit, options: BulkOptions, jobId: String) = this()
    def this(bulk: Bulk, `type`: Unit, operation: String, options: Unit, jobId: String) = this()
    def this(bulk: Bulk, `type`: Unit, operation: String, options: BulkOptions, jobId: String) = this()
    def this(bulk: Bulk, `type`: Unit, operation: Unit, options: Unit, jobId: String) = this()
    def this(bulk: Bulk, `type`: Unit, operation: Unit, options: BulkOptions, jobId: String) = this()
    
    def abort(): js.Promise[Any] = js.native
    def abort(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[Any] = js.native
    
    def batch(batchId: String): Batch = js.native
    
    def check(): js.Promise[JobInfo] = js.native
    def check(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
    
    def close(): js.Promise[JobInfo] = js.native
    def close(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
    
    def createBatch(): Batch = js.native
    
    def info(): js.Promise[JobInfo] = js.native
    def info(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
    
    def list(): js.Promise[js.Array[BatchInfo]] = js.native
    def list(callback: js.Function2[/* err */ js.Error, /* jobInfo */ BatchInfo, Unit]): js.Promise[js.Array[BatchInfo]] = js.native
    
    def open(): js.Promise[JobInfo] = js.native
    def open(callback: js.Function2[/* err */ js.Error, /* jobInfo */ JobInfo, Unit]): js.Promise[JobInfo] = js.native
  }
  
  trait JobInfo extends StObject {
    
    var id: String
    
    var `object`: String
    
    var operation: String
    
    var state: String
  }
  object JobInfo {
    
    inline def apply(id: String, `object`: String, operation: String, state: String): JobInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JobInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
