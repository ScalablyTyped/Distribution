package typings.jsforce

import typings.jsforce.batchMod.Batch
import typings.jsforce.batchMod.BatchResultInfo
import typings.jsforce.connectionMod.Connection
import typings.jsforce.jobMod.Job
import typings.jsforce.jsforceStrings.Parallel
import typings.jsforce.jsforceStrings.Serial
import typings.jsforce.recordMod.Record
import typings.jsforce.recordResultMod.RecordResult
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkMod {
  
  @JSImport("jsforce/bulk", "Bulk")
  @js.native
  open class Bulk protected () extends StObject {
    def this(connection: Connection) = this()
    
    def createJob(`type`: String, operation: String): Job = js.native
    def createJob(`type`: String, operation: String, options: BulkOptions): Job = js.native
    
    def job(id: String): Job = js.native
    
    def load(`type`: String, operation: BulkLoadOperation): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: js.Array[Record[Any]]): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: js.Array[Record[Any]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: js.Array[Record[Any]]): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: js.Array[Record[Any]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    
    var pollInterval: Double = js.native
    
    var pollTimeout: Double = js.native
    
    def query(soql: String): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsforce.jsforceStrings.insert
    - typings.jsforce.jsforceStrings.update
    - typings.jsforce.jsforceStrings.upsert
    - typings.jsforce.jsforceStrings.delete
    - typings.jsforce.jsforceStrings.hardDelete
  */
  trait BulkLoadOperation extends StObject
  object BulkLoadOperation {
    
    inline def delete: typings.jsforce.jsforceStrings.delete = "delete".asInstanceOf[typings.jsforce.jsforceStrings.delete]
    
    inline def hardDelete: typings.jsforce.jsforceStrings.hardDelete = "hardDelete".asInstanceOf[typings.jsforce.jsforceStrings.hardDelete]
    
    inline def insert: typings.jsforce.jsforceStrings.insert = "insert".asInstanceOf[typings.jsforce.jsforceStrings.insert]
    
    inline def update: typings.jsforce.jsforceStrings.update = "update".asInstanceOf[typings.jsforce.jsforceStrings.update]
    
    inline def upsert: typings.jsforce.jsforceStrings.upsert = "upsert".asInstanceOf[typings.jsforce.jsforceStrings.upsert]
  }
  
  trait BulkOptions extends StObject {
    
    var concurrencyMode: js.UndefOr[Serial | Parallel] = js.undefined
    
    var extIdField: String
  }
  object BulkOptions {
    
    inline def apply(extIdField: String): BulkOptions = {
      val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BulkOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrencyMode(value: Serial | Parallel): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
      
      inline def setExtIdField(value: String): Self = StObject.set(x, "extIdField", value.asInstanceOf[js.Any])
    }
  }
}
