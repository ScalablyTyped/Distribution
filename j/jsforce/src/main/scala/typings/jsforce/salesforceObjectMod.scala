package typings.jsforce

import org.scalablytyped.runtime.TopLevel
import typings.jsforce.anon.CallCallback
import typings.jsforce.anon.CallCallbackClear
import typings.jsforce.anon.CallClear
import typings.jsforce.anon.CallLayoutNameCallback
import typings.jsforce.anon.ExtIdField
import typings.jsforce.batchMod.Batch
import typings.jsforce.batchMod.BatchResultInfo
import typings.jsforce.connectionMod.Callback
import typings.jsforce.connectionMod.Connection
import typings.jsforce.connectionMod.RestApiOptions
import typings.jsforce.describeResultMod.DescribeSObjectResult
import typings.jsforce.queryMod.Query
import typings.jsforce.quickActionMod.QuickActionInfo
import typings.jsforce.recordMod.Record
import typings.jsforce.recordMod.RecordReference
import typings.jsforce.recordResultMod.RecordResult
import typings.jsforce.salesforceIdMod.SalesforceId
import typings.node.streamMod.Stream
import typings.std.Date
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object salesforceObjectMod {
  
  @JSImport("jsforce/salesforce-object", "ListView")
  @js.native
  class ListView protected () extends StObject {
    def this(connection: Connection, `type`: String, id: SalesforceId) = this()
  }
  
  @JSImport("jsforce/salesforce-object", "ListViewsInfo")
  @js.native
  class ListViewsInfo () extends StObject
  
  @JSImport("jsforce/salesforce-object", "QuickAction")
  @js.native
  class QuickAction ()
    extends typings.jsforce.quickActionMod.QuickAction
  
  @JSImport("jsforce/salesforce-object", "SObject")
  @js.native
  class SObject[T] () extends StObject {
    
    def approvalLayouts(): js.Promise[ApprovalLayoutInfo] = js.native
    def approvalLayouts(callback: Callback[ApprovalLayoutInfo]): js.Promise[ApprovalLayoutInfo] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
    @JSName("approvalLayouts$")
    def approvalLayouts$(): ApprovalLayoutInfo = js.native
    @JSName("approvalLayouts$")
    def approvalLayouts$(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
    @JSName("approvalLayouts$")
    var approvalLayouts$_Original: CallClear = js.native
    
    def bulkload(operation: String): Batch = js.native
    def bulkload(
      operation: String,
      options: js.UndefOr[scala.Nothing],
      input: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: String): Batch = js.native
    def bulkload(
      operation: String,
      options: js.UndefOr[scala.Nothing],
      input: String,
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: js.Array[Record[T]]): Batch = js.native
    def bulkload(
      operation: String,
      options: js.UndefOr[scala.Nothing],
      input: js.Array[Record[T]],
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: js.UndefOr[scala.Nothing], input: Stream): Batch = js.native
    def bulkload(
      operation: String,
      options: js.UndefOr[scala.Nothing],
      input: Stream,
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: ExtIdField): Batch = js.native
    def bulkload(
      operation: String,
      options: ExtIdField,
      input: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: ExtIdField, input: String): Batch = js.native
    def bulkload(operation: String, options: ExtIdField, input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def bulkload(operation: String, options: ExtIdField, input: js.Array[Record[T]]): Batch = js.native
    def bulkload(
      operation: String,
      options: ExtIdField,
      input: js.Array[Record[T]],
      callback: Callback[js.Array[RecordResult]]
    ): Batch = js.native
    def bulkload(operation: String, options: ExtIdField, input: Stream): Batch = js.native
    def bulkload(operation: String, options: ExtIdField, input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def compactLayouts(): js.Promise[CompactLayoutInfo] = js.native
    def compactLayouts(callback: Callback[CompactLayoutInfo]): js.Promise[CompactLayoutInfo] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
    @JSName("compactLayouts$")
    def compactLayouts$(): CompactLayoutInfo = js.native
    @JSName("compactLayouts$")
    def compactLayouts$(callback: Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
    @JSName("compactLayouts$")
    var compactLayouts$_Original: CallCallback = js.native
    
    def count(): Query[Double] = js.native
    def count(conditions: js.UndefOr[scala.Nothing], callback: Callback[Double]): Query[Double] = js.native
    def count(conditions: String): Query[Double] = js.native
    def count(conditions: String, callback: Callback[Double]): Query[Double] = js.native
    def count(conditions: js.Object): Query[Double] = js.native
    def count(conditions: js.Object, callback: Callback[Double]): Query[Double] = js.native
    
    def create(record: T): js.Promise[RecordResult] = js.native
    def create(record: T, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def create(record: T, options: js.UndefOr[scala.Nothing], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def create(record: T, options: RestApiOptions): js.Promise[RecordResult] = js.native
    def create(record: T, options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def create(record: js.Array[T]): js.Promise[js.Array[RecordResult]] = js.native
    def create(record: js.Array[T], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    def create(
      record: js.Array[T],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[RecordResult]]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def create(record: js.Array[T], options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
    def create(record: js.Array[T], options: RestApiOptions, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    
    def createBulk(): Batch = js.native
    def createBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def createBulk(input: String): Batch = js.native
    def createBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def createBulk(input: js.Array[Record[T]]): Batch = js.native
    def createBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def createBulk(input: Stream): Batch = js.native
    def createBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def del(id: String): js.Promise[RecordResult] = js.native
    def del(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def del(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
    def del(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    
    def delete(id: String): js.Promise[RecordResult] = js.native
    def delete(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def delete(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
    def delete(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    
    def deleteBulk(): Batch = js.native
    def deleteBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteBulk(input: String): Batch = js.native
    def deleteBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteBulk(input: js.Array[Record[T]]): Batch = js.native
    def deleteBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteBulk(input: Stream): Batch = js.native
    def deleteBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def deleteHardBulk(): Batch = js.native
    def deleteHardBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteHardBulk(input: String): Batch = js.native
    def deleteHardBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteHardBulk(input: js.Array[Record[T]]): Batch = js.native
    def deleteHardBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def deleteHardBulk(input: Stream): Batch = js.native
    def deleteHardBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def deleted(start: String, end: String): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: String, end: String, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: String, end: Date): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: String, end: Date, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: Date, end: String): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: Date, end: String, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: Date, end: Date): js.Promise[DeletedRecordsInfo] = js.native
    def deleted(start: Date, end: Date, callback: Callback[DeletedRecordsInfo]): js.Promise[DeletedRecordsInfo] = js.native
    
    def describe(): js.Promise[DescribeSObjectResult] = js.native
    def describe(callback: Callback[DescribeSObjectResult]): js.Promise[DescribeSObjectResult] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
    @JSName("describe$")
    def describe$(): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(callback: Callback[DescribeSObjectResult]): DescribeSObjectResult = js.native
    @JSName("describe$")
    var describe$_Original: CallCallbackClear = js.native
    
    def destroy(id: String): js.Promise[RecordResult] = js.native
    def destroy(id: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def destroy(ids: js.Array[String]): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(ids: js.Array[String], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    
    def destroyBulk(): Batch = js.native
    def destroyBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyBulk(input: String): Batch = js.native
    def destroyBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyBulk(input: js.Array[Record[T]]): Batch = js.native
    def destroyBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyBulk(input: Stream): Batch = js.native
    def destroyBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def destroyHardBulk(): Batch = js.native
    def destroyHardBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyHardBulk(input: String): Batch = js.native
    def destroyHardBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyHardBulk(input: js.Array[Record[T]]): Batch = js.native
    def destroyHardBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def destroyHardBulk(input: Stream): Batch = js.native
    def destroyHardBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def find[T](): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: String): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: String,
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Array[String],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Array[String],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.UndefOr[scala.Nothing], fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Object,
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: String): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: String, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Array[String], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: js.Array[String],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Object): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: String,
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](query: String, fields: js.Object, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: String): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: String, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: String, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: String, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Array[String]): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Array[String], callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Array[String], options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: js.Array[String],
      options: FindOptions,
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Object): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Object, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    def find[T](
      query: js.Object,
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Object, options: FindOptions): Query[js.Array[Record[T]]] = js.native
    def find[T](query: js.Object, fields: js.Object, options: FindOptions, callback: Callback[js.Array[Record[T]]]): Query[js.Array[Record[T]]] = js.native
    
    def findOne[T](): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: String): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: String, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: String,
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String]): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Array[String],
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.UndefOr[scala.Nothing], fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: js.UndefOr[scala.Nothing],
      fields: js.Object,
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: String): Query[Record[T]] = js.native
    def findOne[T](query: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: String,
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: String,
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: String): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: String, options: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: String, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: String, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Array[String]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: String,
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Array[String], options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Object): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: String,
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: String, fields: js.Object, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: js.Object): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.Object,
      fields: js.UndefOr[scala.Nothing],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.UndefOr[scala.Nothing], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](
      query: js.Object,
      fields: js.UndefOr[scala.Nothing],
      options: FindOptions,
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: String): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: String, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.Object,
      fields: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: String, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: String, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Array[String]): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Array[String], callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.Object,
      fields: js.Array[String],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Array[String], options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Array[String], options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Object): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Object, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    def findOne[T](
      query: js.Object,
      fields: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[Record[T]]
    ): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Object, options: FindOptions): Query[Record[T]] = js.native
    def findOne[T](query: js.Object, fields: js.Object, options: FindOptions, callback: Callback[Record[T]]): Query[Record[T]] = js.native
    
    def insert(records: js.Array[Record[T]]): js.Promise[js.Array[RecordResult]] = js.native
    def insert(records: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    def insert(record: Record[T]): js.Promise[RecordResult] = js.native
    def insert(record: Record[T], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    
    def insertBulk(): Batch = js.native
    def insertBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def insertBulk(input: String): Batch = js.native
    def insertBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def insertBulk(input: js.Array[Record[T]]): Batch = js.native
    def insertBulk(input: js.Array[Record[T]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def insertBulk(input: Stream): Batch = js.native
    def insertBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def layouts(): js.Promise[LayoutInfo] = js.native
    def layouts(layoutName: js.UndefOr[scala.Nothing], callback: Callback[LayoutInfo]): js.Promise[LayoutInfo] = js.native
    def layouts(layoutName: String): js.Promise[LayoutInfo] = js.native
    def layouts(layoutName: String, callback: Callback[LayoutInfo]): js.Promise[LayoutInfo] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
    @JSName("layouts$")
    def layouts$(): LayoutInfo = js.native
    @JSName("layouts$")
    def layouts$(layoutName: js.UndefOr[scala.Nothing], callback: Callback[LayoutInfo]): LayoutInfo = js.native
    @JSName("layouts$")
    def layouts$(layoutName: String): LayoutInfo = js.native
    @JSName("layouts$")
    def layouts$(layoutName: String, callback: Callback[LayoutInfo]): LayoutInfo = js.native
    /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
    @JSName("layouts$")
    var layouts$_Original: CallLayoutNameCallback = js.native
    
    def listview(id: String): ListView = js.native
    
    def listviews(): js.Promise[ListViewsInfo] = js.native
    def listviews(callback: Callback[ListViewsInfo]): js.Promise[ListViewsInfo] = js.native
    
    def quickAction(actionName: String): typings.jsforce.quickActionMod.QuickAction = js.native
    
    def quickActions(): js.Promise[js.Array[QuickActionInfo]] = js.native
    def quickActions(callback: Callback[js.Array[QuickActionInfo]]): js.Promise[js.Array[QuickActionInfo]] = js.native
    
    def recent(): js.Promise[js.Array[RecordResult]] = js.native
    def recent(callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    
    def record(id: SalesforceId): RecordReference[T] = js.native
    
    def retrieve(ids: js.Array[SalesforceId]): js.Promise[js.Array[Record[T]]] = js.native
    def retrieve(ids: js.Array[SalesforceId], callback: Callback[js.Array[Record[T]]]): js.Promise[js.Array[Record[T]]] = js.native
    def retrieve(
      ids: js.Array[SalesforceId],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[Record[T]]]
    ): js.Promise[js.Array[Record[T]]] = js.native
    def retrieve(ids: js.Array[SalesforceId], options: js.Object): js.Promise[js.Array[Record[T]]] = js.native
    def retrieve(ids: js.Array[SalesforceId], options: js.Object, callback: Callback[js.Array[Record[T]]]): js.Promise[js.Array[Record[T]]] = js.native
    def retrieve(id: SalesforceId): js.Promise[Record[T]] = js.native
    def retrieve(id: SalesforceId, callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
    def retrieve(id: SalesforceId, options: js.UndefOr[scala.Nothing], callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
    def retrieve(id: SalesforceId, options: js.Object): js.Promise[Record[T]] = js.native
    def retrieve(id: SalesforceId, options: js.Object, callback: Callback[Record[T]]): js.Promise[Record[T]] = js.native
    
    // TODO:use a typed pluck to turn `fields` into a subset of T's fields so that the output is slimmed down appropriately
    def select(): Query[js.Array[T]] = js.native
    def select(callback: Callback[js.Array[T]]): Query[js.Array[T]] = js.native
    def select(
      fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: boolean}
      */ typings.jsforce.jsforceStrings.SObject with TopLevel[js.Any]
    ): Query[js.Array[Partial[T]]] = js.native
    def select(
      fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: boolean}
      */ typings.jsforce.jsforceStrings.SObject with TopLevel[js.Any],
      callback: Callback[js.Array[Partial[T]]]
    ): Query[js.Array[Partial[T]]] = js.native
    def select(fields: js.UndefOr[scala.Nothing], callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
    def select(fields: /* keyof T */ String): Query[js.Array[Partial[T]]] = js.native
    def select(fields: /* keyof T */ String, callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
    def select(fields: js.Array[/* keyof T */ String]): Query[js.Array[Partial[T]]] = js.native
    def select(fields: js.Array[/* keyof T */ String], callback: Callback[js.Array[Partial[T]]]): Query[js.Array[Partial[T]]] = js.native
    
    def update(records: js.Array[Partial[T]]): js.Promise[js.Array[RecordResult]] = js.native
    def update(records: js.Array[Partial[T]], callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    def update(
      records: js.Array[Partial[T]],
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[RecordResult]]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def update(records: js.Array[Partial[T]], options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
    def update(records: js.Array[Partial[T]], options: RestApiOptions, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    // Should update require that the record Id field be provided?
    def update(record: Partial[T]): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], options: js.UndefOr[scala.Nothing], callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], options: RestApiOptions): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    
    // should input really be optional? the documentation says so, but how can you actually update without it?
    def updateBulk(): Batch = js.native
    def updateBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def updateBulk(input: String): Batch = js.native
    def updateBulk(input: String, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def updateBulk(input: js.Array[Record[_]]): Batch = js.native
    def updateBulk(input: js.Array[Record[_]], callback: Callback[js.Array[RecordResult]]): Batch = js.native
    def updateBulk(input: Stream): Batch = js.native
    def updateBulk(input: Stream, callback: Callback[js.Array[RecordResult]]): Batch = js.native
    
    def updated(start: String, end: String): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: String, end: String, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: String, end: Date): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: String, end: Date, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: Date, end: String): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: Date, end: String, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: Date, end: Date): js.Promise[UpdatedRecordsInfo] = js.native
    def updated(start: Date, end: Date, callback: Callback[UpdatedRecordsInfo]): js.Promise[UpdatedRecordsInfo] = js.native
    
    def upsert(records: js.Array[Record[T]], extIdField: String): js.Promise[js.Array[RecordResult]] = js.native
    def upsert(records: js.Array[Record[T]], extIdField: String, callback: Callback[js.Array[RecordResult]]): js.Promise[js.Array[RecordResult]] = js.native
    def upsert(
      records: js.Array[Record[T]],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[js.Array[RecordResult]]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def upsert(records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[js.Array[RecordResult]] = js.native
    def upsert(
      records: js.Array[Record[T]],
      extIdField: String,
      options: RestApiOptions,
      callback: Callback[js.Array[RecordResult]]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def upsert(records: Record[T], extIdField: String): js.Promise[RecordResult] = js.native
    def upsert(records: Record[T], extIdField: String, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    def upsert(
      records: Record[T],
      extIdField: String,
      options: js.UndefOr[scala.Nothing],
      callback: Callback[RecordResult]
    ): js.Promise[RecordResult] = js.native
    def upsert(records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult] = js.native
    def upsert(records: Record[T], extIdField: String, options: RestApiOptions, callback: Callback[RecordResult]): js.Promise[RecordResult] = js.native
    
    def upsertBulk(): Batch = js.native
    def upsertBulk(input: js.UndefOr[scala.Nothing], callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
    def upsertBulk(input: String): Batch = js.native
    def upsertBulk(input: String, callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
    def upsertBulk(input: js.Array[Record[T]]): Batch = js.native
    def upsertBulk(input: js.Array[Record[T]], callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
    def upsertBulk(input: Stream): Batch = js.native
    def upsertBulk(input: Stream, callback: Callback[js.Array[BatchResultInfo | RecordResult]]): Batch = js.native
  }
  
  @js.native
  trait ApprovalLayoutInfo extends StObject {
    
    var approvalLayouts: js.Array[js.Object] = js.native
  }
  object ApprovalLayoutInfo {
    
    @scala.inline
    def apply(approvalLayouts: js.Array[js.Object]): ApprovalLayoutInfo = {
      val __obj = js.Dynamic.literal(approvalLayouts = approvalLayouts.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApprovalLayoutInfo]
    }
    
    @scala.inline
    implicit class ApprovalLayoutInfoMutableBuilder[Self <: ApprovalLayoutInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApprovalLayouts(value: js.Array[js.Object]): Self = StObject.set(x, "approvalLayouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApprovalLayoutsVarargs(value: js.Object*): Self = StObject.set(x, "approvalLayouts", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CompactLayoutInfo extends StObject {
    
    var compactLayouts: js.Array[js.Object] = js.native
    
    var defaultCompactLayoutId: String = js.native
    
    var recordTypeCompactLayoutMappings: js.Array[js.Object] = js.native
  }
  object CompactLayoutInfo {
    
    @scala.inline
    def apply(
      compactLayouts: js.Array[js.Object],
      defaultCompactLayoutId: String,
      recordTypeCompactLayoutMappings: js.Array[js.Object]
    ): CompactLayoutInfo = {
      val __obj = js.Dynamic.literal(compactLayouts = compactLayouts.asInstanceOf[js.Any], defaultCompactLayoutId = defaultCompactLayoutId.asInstanceOf[js.Any], recordTypeCompactLayoutMappings = recordTypeCompactLayoutMappings.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactLayoutInfo]
    }
    
    @scala.inline
    implicit class CompactLayoutInfoMutableBuilder[Self <: CompactLayoutInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompactLayouts(value: js.Array[js.Object]): Self = StObject.set(x, "compactLayouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactLayoutsVarargs(value: js.Object*): Self = StObject.set(x, "compactLayouts", js.Array(value :_*))
      
      @scala.inline
      def setDefaultCompactLayoutId(value: String): Self = StObject.set(x, "defaultCompactLayoutId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordTypeCompactLayoutMappings(value: js.Array[js.Object]): Self = StObject.set(x, "recordTypeCompactLayoutMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordTypeCompactLayoutMappingsVarargs(value: js.Object*): Self = StObject.set(x, "recordTypeCompactLayoutMappings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DeletedRecord extends StObject {
    
    var deletedDate: String = js.native
    
    var id: String = js.native
  }
  object DeletedRecord {
    
    @scala.inline
    def apply(deletedDate: String, id: String): DeletedRecord = {
      val __obj = js.Dynamic.literal(deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeletedRecord]
    }
    
    @scala.inline
    implicit class DeletedRecordMutableBuilder[Self <: DeletedRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeletedDate(value: String): Self = StObject.set(x, "deletedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeletedRecordsInfo extends StObject {
    
    var deletedRecords: js.Array[DeletedRecord] = js.native
    
    var earliestDateAvailable: String = js.native
    
    var latestDateCovered: String = js.native
  }
  object DeletedRecordsInfo {
    
    @scala.inline
    def apply(deletedRecords: js.Array[DeletedRecord], earliestDateAvailable: String, latestDateCovered: String): DeletedRecordsInfo = {
      val __obj = js.Dynamic.literal(deletedRecords = deletedRecords.asInstanceOf[js.Any], earliestDateAvailable = earliestDateAvailable.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeletedRecordsInfo]
    }
    
    @scala.inline
    implicit class DeletedRecordsInfoMutableBuilder[Self <: DeletedRecordsInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeletedRecords(value: js.Array[DeletedRecord]): Self = StObject.set(x, "deletedRecords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeletedRecordsVarargs(value: DeletedRecord*): Self = StObject.set(x, "deletedRecords", js.Array(value :_*))
      
      @scala.inline
      def setEarliestDateAvailable(value: String): Self = StObject.set(x, "earliestDateAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatestDateCovered(value: String): Self = StObject.set(x, "latestDateCovered", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FindOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var skip: js.UndefOr[Double] = js.native
  }
  object FindOptions {
    
    @scala.inline
    def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    @scala.inline
    implicit class FindOptionsMutableBuilder[Self <: FindOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    }
  }
  
  @js.native
  trait LayoutInfo extends StObject {
    
    var layouts: js.Array[js.Object] = js.native
    
    var recordTypeMappings: js.Array[js.Object] = js.native
  }
  object LayoutInfo {
    
    @scala.inline
    def apply(layouts: js.Array[js.Object], recordTypeMappings: js.Array[js.Object]): LayoutInfo = {
      val __obj = js.Dynamic.literal(layouts = layouts.asInstanceOf[js.Any], recordTypeMappings = recordTypeMappings.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutInfo]
    }
    
    @scala.inline
    implicit class LayoutInfoMutableBuilder[Self <: LayoutInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayouts(value: js.Array[js.Object]): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutsVarargs(value: js.Object*): Self = StObject.set(x, "layouts", js.Array(value :_*))
      
      @scala.inline
      def setRecordTypeMappings(value: js.Array[js.Object]): Self = StObject.set(x, "recordTypeMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordTypeMappingsVarargs(value: js.Object*): Self = StObject.set(x, "recordTypeMappings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UpdatedRecordsInfo extends StObject {
    
    var ids: js.Array[String] = js.native
    
    var latestDateCovered: String = js.native
  }
  object UpdatedRecordsInfo {
    
    @scala.inline
    def apply(ids: js.Array[String], latestDateCovered: String): UpdatedRecordsInfo = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], latestDateCovered = latestDateCovered.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatedRecordsInfo]
    }
    
    @scala.inline
    implicit class UpdatedRecordsInfoMutableBuilder[Self <: UpdatedRecordsInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      @scala.inline
      def setLatestDateCovered(value: String): Self = StObject.set(x, "latestDateCovered", value.asInstanceOf[js.Any])
    }
  }
}
