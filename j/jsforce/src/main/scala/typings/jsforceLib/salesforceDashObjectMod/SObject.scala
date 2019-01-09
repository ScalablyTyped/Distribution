package typings
package jsforceLib.salesforceDashObjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/salesforce-object", "SObject")
@js.native
class SObject[T] () extends js.Object {
  @JSName("approvalLayouts$")
  var approvalLayouts$_Original: jsforceLib.Anon_CallbackClearApprovalLayoutInfo = js.native
  @JSName("compactLayouts$")
  var compactLayouts$_Original: jsforceLib.Anon_CallbackClearCompactLayoutInfo = js.native
  @JSName("describe$")
  var describe$_Original: jsforceLib.Anon_CallbackClearDescribeSObjectResult = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
  @JSName("layouts$")
  var layouts$_Original: jsforceLib.Anon_CallbackClearLayoutName = js.native
  def approvalLayouts(): js.Promise[ApprovalLayoutInfo] = js.native
  def approvalLayouts(callback: jsforceLib.connectionMod.Callback[ApprovalLayoutInfo]): js.Promise[ApprovalLayoutInfo] = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
  @JSName("approvalLayouts$")
  def approvalLayouts$(): ApprovalLayoutInfo = js.native
  @JSName("approvalLayouts$")
  def approvalLayouts$(callback: jsforceLib.connectionMod.Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
  def bulkload(operation: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def bulkload(operation: java.lang.String, options: jsforceLib.Anon_ExtIdField): jsforceLib.batchMod.Batch = js.native
  def bulkload(operation: java.lang.String, options: jsforceLib.Anon_ExtIdField, input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def bulkload(
    operation: java.lang.String,
    options: jsforceLib.Anon_ExtIdField,
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def bulkload(
    operation: java.lang.String,
    options: jsforceLib.Anon_ExtIdField,
    input: js.Array[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.batchMod.Batch = js.native
  def bulkload(
    operation: java.lang.String,
    options: jsforceLib.Anon_ExtIdField,
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def bulkload(operation: java.lang.String, options: jsforceLib.Anon_ExtIdField, input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def bulkload(
    operation: java.lang.String,
    options: jsforceLib.Anon_ExtIdField,
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def compactLayouts(): js.Promise[CompactLayoutInfo] = js.native
  def compactLayouts(callback: jsforceLib.connectionMod.Callback[CompactLayoutInfo]): js.Promise[CompactLayoutInfo] = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
  @JSName("compactLayouts$")
  def compactLayouts$(): CompactLayoutInfo = js.native
  @JSName("compactLayouts$")
  def compactLayouts$(callback: jsforceLib.connectionMod.Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
  def count(): jsforceLib.queryMod.Query[scala.Double] = js.native
  def count(conditions: java.lang.String): jsforceLib.queryMod.Query[scala.Double] = js.native
  def count(conditions: java.lang.String, callback: jsforceLib.connectionMod.Callback[scala.Double]): jsforceLib.queryMod.Query[scala.Double] = js.native
  def count(conditions: js.Object): jsforceLib.queryMod.Query[scala.Double] = js.native
  def count(conditions: js.Object, callback: jsforceLib.connectionMod.Callback[scala.Double]): jsforceLib.queryMod.Query[scala.Double] = js.native
  def create(record: T): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def create(
    record: T,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def create(record: T, options: jsforceLib.connectionMod.RestApiOptions): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def create(
    record: T,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def create(record: js.Array[T]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def create(
    record: js.Array[T],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def create(record: js.Array[T], options: jsforceLib.connectionMod.RestApiOptions): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def create(
    record: js.Array[T],
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def createBulk(): jsforceLib.batchMod.Batch = js.native
  def createBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def createBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def createBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def createBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def createBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def createBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def del(id: java.lang.String): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def del(
    id: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def del(ids: js.Array[java.lang.String]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def del(
    ids: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def delete(id: java.lang.String): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def delete(
    id: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def delete(ids: js.Array[java.lang.String]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def delete(
    ids: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def deleteBulk(): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def deleteBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def deleteHardBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def deleted(start: java.lang.String, end: java.lang.String): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(
    start: java.lang.String,
    end: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[DeletedRecordsInfo]
  ): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: java.lang.String, end: stdLib.Date): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(
    start: java.lang.String,
    end: stdLib.Date,
    callback: jsforceLib.connectionMod.Callback[DeletedRecordsInfo]
  ): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: stdLib.Date, end: java.lang.String): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(
    start: stdLib.Date,
    end: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[DeletedRecordsInfo]
  ): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(start: stdLib.Date, end: stdLib.Date): js.Promise[DeletedRecordsInfo] = js.native
  def deleted(
    start: stdLib.Date,
    end: stdLib.Date,
    callback: jsforceLib.connectionMod.Callback[DeletedRecordsInfo]
  ): js.Promise[DeletedRecordsInfo] = js.native
  def describe(): js.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  def describe(
    callback: jsforceLib.connectionMod.Callback[jsforceLib.describeDashResultMod.DescribeSObjectResult]
  ): js.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
  @JSName("describe$")
  def describe$(): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(
    callback: jsforceLib.connectionMod.Callback[jsforceLib.describeDashResultMod.DescribeSObjectResult]
  ): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def destroy(id: java.lang.String): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def destroy(
    id: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def destroy(ids: js.Array[java.lang.String]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def destroy(
    ids: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def destroyBulk(): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def destroyBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def destroyHardBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def find[T](): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: java.lang.String): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: java.lang.String, options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: java.lang.String,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: js.Array[java.lang.String]): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: js.Array[java.lang.String], options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: js.Array[java.lang.String],
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: js.Object): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: js.Object,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: java.lang.String, fields: js.Object, options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: java.lang.String,
    fields: js.Object,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: java.lang.String): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: java.lang.String, options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: java.lang.String,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Array[java.lang.String]): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Array[java.lang.String], options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Array[java.lang.String],
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Object,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](query: js.Object, fields: js.Object, options: FindOptions): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def find[T](
    query: js.Object,
    fields: js.Object,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): jsforceLib.queryMod.Query[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def findOne[T](): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: java.lang.String, options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: java.lang.String,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: js.Array[java.lang.String]): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: js.Array[java.lang.String], options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: js.Array[java.lang.String],
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: js.Object): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: js.Object,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: java.lang.String, fields: js.Object, options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: java.lang.String,
    fields: js.Object,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: java.lang.String, options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: java.lang.String,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[java.lang.String]): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Array[java.lang.String], options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Array[java.lang.String],
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Object,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](query: js.Object, fields: js.Object, options: FindOptions): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def findOne[T](
    query: js.Object,
    fields: js.Object,
    options: FindOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): jsforceLib.queryMod.Query[jsforceLib.recordMod.Record[T]] = js.native
  def insert(record: jsforceLib.recordMod.Record[T]): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def insert(
    record: jsforceLib.recordMod.Record[T],
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def insert(records: js.Array[jsforceLib.recordMod.Record[T]]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def insert(
    records: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def insertBulk(): jsforceLib.batchMod.Batch = js.native
  def insertBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def insertBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def insertBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def insertBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def insertBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def insertBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def layouts(): js.Promise[LayoutInfo] = js.native
  def layouts(layoutName: java.lang.String): js.Promise[LayoutInfo] = js.native
  def layouts(layoutName: java.lang.String, callback: jsforceLib.connectionMod.Callback[LayoutInfo]): js.Promise[LayoutInfo] = js.native
  /** Returns a value from the cache if it exists, otherwise calls SObject.layouts */
  @JSName("layouts$")
  def layouts$(): LayoutInfo = js.native
  @JSName("layouts$")
  def layouts$(layoutName: java.lang.String): LayoutInfo = js.native
  @JSName("layouts$")
  def layouts$(layoutName: java.lang.String, callback: jsforceLib.connectionMod.Callback[LayoutInfo]): LayoutInfo = js.native
  def listview(id: java.lang.String): ListView = js.native
  def listviews(): js.Promise[ListViewsInfo] = js.native
  def listviews(callback: jsforceLib.connectionMod.Callback[ListViewsInfo]): js.Promise[ListViewsInfo] = js.native
  def quickAction(actionName: java.lang.String): jsforceLib.quickDashActionMod.QuickAction = js.native
  def quickActions(): js.Promise[js.Array[jsforceLib.quickDashActionMod.QuickActionInfo]] = js.native
  def quickActions(
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.quickDashActionMod.QuickActionInfo]]
  ): js.Promise[js.Array[jsforceLib.quickDashActionMod.QuickActionInfo]] = js.native
  def recent(): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def recent(callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def record(id: jsforceLib.salesforceDashIdMod.SalesforceId): jsforceLib.recordMod.RecordReference[T] = js.native
  def retrieve(id: jsforceLib.salesforceDashIdMod.SalesforceId): js.Promise[jsforceLib.recordMod.Record[T]] = js.native
  def retrieve(
    id: jsforceLib.salesforceDashIdMod.SalesforceId,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): js.Promise[jsforceLib.recordMod.Record[T]] = js.native
  def retrieve(id: jsforceLib.salesforceDashIdMod.SalesforceId, options: js.Object): js.Promise[jsforceLib.recordMod.Record[T]] = js.native
  def retrieve(
    id: jsforceLib.salesforceDashIdMod.SalesforceId,
    options: js.Object,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordMod.Record[T]]
  ): js.Promise[jsforceLib.recordMod.Record[T]] = js.native
  def retrieve(ids: js.Array[jsforceLib.salesforceDashIdMod.SalesforceId]): js.Promise[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve(
    ids: js.Array[jsforceLib.salesforceDashIdMod.SalesforceId],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): js.Promise[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve(ids: js.Array[jsforceLib.salesforceDashIdMod.SalesforceId], options: js.Object): js.Promise[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve(
    ids: js.Array[jsforceLib.salesforceDashIdMod.SalesforceId],
    options: js.Object,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordMod.Record[T]]]
  ): js.Promise[js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  // TODO:use a typed pluck to turn `fields` into a subset of T's fields so that the output is slimmed down appropriately
  def select(): jsforceLib.queryMod.Query[js.Array[T]] = js.native
  def select(callback: jsforceLib.connectionMod.Callback[js.Array[T]]): jsforceLib.queryMod.Query[js.Array[T]] = js.native
  def select(fields: jsforceLib.jsforceLibStrings.SObject with js.Any): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def select(
    fields: jsforceLib.jsforceLibStrings.SObject with js.Any,
    callback: jsforceLib.connectionMod.Callback[js.Array[stdLib.Partial[T]]]
  ): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def select(fields: java.lang.String): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def select(fields: java.lang.String, callback: jsforceLib.connectionMod.Callback[js.Array[stdLib.Partial[T]]]): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def select(fields: js.Array[java.lang.String]): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def select(
    fields: js.Array[java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Array[stdLib.Partial[T]]]
  ): jsforceLib.queryMod.Query[js.Array[stdLib.Partial[T]]] = js.native
  def update(records: js.Array[stdLib.Partial[T]]): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def update(
    records: js.Array[stdLib.Partial[T]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def update(records: js.Array[stdLib.Partial[T]], options: jsforceLib.connectionMod.RestApiOptions): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def update(
    records: js.Array[stdLib.Partial[T]],
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  // Should update require that the record Id field be provided?
  def update(record: stdLib.Partial[T]): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def update(
    record: stdLib.Partial[T],
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def update(record: stdLib.Partial[T], options: jsforceLib.connectionMod.RestApiOptions): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def update(
    record: stdLib.Partial[T],
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  // should input really be optional? the documentation says so, but how can you actually update without it?
  def updateBulk(): jsforceLib.batchMod.Batch = js.native
  def updateBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def updateBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def updateBulk(input: js.Array[jsforceLib.recordMod.Record[_]]): jsforceLib.batchMod.Batch = js.native
  def updateBulk(
    input: js.Array[jsforceLib.recordMod.Record[_]],
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def updateBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def updateBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): jsforceLib.batchMod.Batch = js.native
  def updated(start: java.lang.String, end: java.lang.String): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(
    start: java.lang.String,
    end: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[UpdatedRecordsInfo]
  ): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: java.lang.String, end: stdLib.Date): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(
    start: java.lang.String,
    end: stdLib.Date,
    callback: jsforceLib.connectionMod.Callback[UpdatedRecordsInfo]
  ): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: stdLib.Date, end: java.lang.String): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(
    start: stdLib.Date,
    end: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[UpdatedRecordsInfo]
  ): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(start: stdLib.Date, end: stdLib.Date): js.Promise[UpdatedRecordsInfo] = js.native
  def updated(
    start: stdLib.Date,
    end: stdLib.Date,
    callback: jsforceLib.connectionMod.Callback[UpdatedRecordsInfo]
  ): js.Promise[UpdatedRecordsInfo] = js.native
  def upsert(records: js.Array[jsforceLib.recordMod.Record[T]], extIdField: java.lang.String): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def upsert(
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def upsert(
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def upsert(
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[js.Array[jsforceLib.recordDashResultMod.RecordResult]]
  ): js.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def upsert(records: jsforceLib.recordMod.Record[T], extIdField: java.lang.String): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def upsert(
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def upsert(
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def upsert(
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[jsforceLib.recordDashResultMod.RecordResult]
  ): js.Promise[jsforceLib.recordDashResultMod.RecordResult] = js.native
  def upsertBulk(): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(input: java.lang.String): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(
    input: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[
      js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo]
    ]
  ): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(input: js.Array[jsforceLib.recordMod.Record[T]]): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(
    input: js.Array[jsforceLib.recordMod.Record[T]],
    callback: jsforceLib.connectionMod.Callback[
      js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo]
    ]
  ): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(input: nodeLib.streamMod.Stream): jsforceLib.batchMod.Batch = js.native
  def upsertBulk(
    input: nodeLib.streamMod.Stream,
    callback: jsforceLib.connectionMod.Callback[
      js.Array[jsforceLib.recordDashResultMod.RecordResult] | js.Array[jsforceLib.batchMod.BatchResultInfo]
    ]
  ): jsforceLib.batchMod.Batch = js.native
}

