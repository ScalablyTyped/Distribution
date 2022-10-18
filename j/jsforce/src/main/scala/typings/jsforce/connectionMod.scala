package typings.jsforce

import org.scalablytyped.runtime.StringDictionary
import typings.jsforce.anon.Body
import typings.jsforce.anon.Call
import typings.jsforce.anon.Clear
import typings.jsforce.anon.Customdomain
import typings.jsforce.anon.PartialPartialOAuth2Optio
import typings.jsforce.anon.Picture
import typings.jsforce.apiAnalyticsMod.Analytics
import typings.jsforce.apiApexMod.Apex
import typings.jsforce.apiChatterMod.Chatter
import typings.jsforce.apiMetadataMod.Metadata
import typings.jsforce.apiSoapMod.SoapApi
import typings.jsforce.bulkMod.Bulk
import typings.jsforce.cacheMod.Cache
import typings.jsforce.describeResultMod.BatchDescribeSObjectOptions
import typings.jsforce.describeResultMod.DescribeGlobalResult
import typings.jsforce.describeResultMod.DescribeSObjectOptions
import typings.jsforce.describeResultMod.DescribeSObjectResult
import typings.jsforce.httpApiMod.HttpApiOptions
import typings.jsforce.jsforceStrings.refresh
import typings.jsforce.limitsInfoMod.LimitInfo
import typings.jsforce.limitsInfoMod.LimitsInfo
import typings.jsforce.mod.OAuth2
import typings.jsforce.mod.Streaming
import typings.jsforce.queryMod.ExecuteOptions
import typings.jsforce.queryMod.Query
import typings.jsforce.queryMod.QueryResult
import typings.jsforce.recordMod.Record
import typings.jsforce.recordResultMod.RecordResult
import typings.jsforce.salesforceObjectMod.SObject
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  /* note: abstract class */ @JSImport("jsforce/connection", "BaseConnection")
  @js.native
  open class BaseConnection () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def _baseUrl(): String = js.native
    
    def batchDescribe(options: BatchDescribeSObjectOptions): js.Promise[js.Array[DescribeSObjectResult]] = js.native
    def batchDescribe(
      options: BatchDescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[DescribeSObjectResult], Unit]
    ): js.Promise[js.Array[DescribeSObjectResult]] = js.native
    
    def create[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: js.Array[Record[T]],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: Record[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: Record[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def create[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def del[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: js.Array[String],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def del[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def delete[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: js.Array[String],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def delete[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def describe(`type`: String): js.Promise[DescribeSObjectResult] = js.native
    def describe(
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): js.Promise[DescribeSObjectResult] = js.native
    def describe(`type`: DescribeSObjectOptions): js.Promise[DescribeSObjectResult] = js.native
    def describe(
      `type`: DescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): js.Promise[DescribeSObjectResult] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
    @JSName("describe$")
    def describe$(`type`: String): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(`type`: DescribeSObjectOptions): DescribeSObjectResult = js.native
    @JSName("describe$")
    def describe$(
      `type`: DescribeSObjectOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ DescribeSObjectResult, Unit]
    ): DescribeSObjectResult = js.native
    @JSName("describe$")
    var describe$_Original: Call = js.native
    
    def describeGlobal[T](): js.Promise[DescribeGlobalResult] = js.native
    def describeGlobal[T](callback: js.Function2[/* err */ js.Error, /* result */ DescribeGlobalResult, Unit]): js.Promise[DescribeGlobalResult] = js.native
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
    @JSName("describeGlobal$")
    def describeGlobal$(): DescribeGlobalResult = js.native
    @JSName("describeGlobal$")
    def describeGlobal$(callback: js.Function2[/* err */ js.Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
    @JSName("describeGlobal$")
    var describeGlobal$_Original: Clear = js.native
    
    def destroy[T](`type`: String, ids: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: js.Array[String]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: js.Array[String],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def destroy[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def insert[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: Record[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def insert[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def query[T](soql: String): Query[QueryResult[T]] = js.native
    def query[T](
      soql: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    def query[T](soql: String, options: ExecuteOptions): Query[QueryResult[T]] = js.native
    def query[T](
      soql: String,
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    
    def queryMore[T](locator: String): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](
      locator: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](locator: String, options: ExecuteOptions): js.Promise[QueryResult[T]] = js.native
    def queryMore[T](
      locator: String,
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): js.Promise[QueryResult[T]] = js.native
    
    def recent(): js.Promise[js.Array[RecordResult]] = js.native
    def recent(callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]): js.Promise[js.Array[RecordResult]] = js.native
    def recent(param: String): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      param: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def recent(param: Double): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      param: Double,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def recent(`type`: String, limit: Double): js.Promise[js.Array[RecordResult]] = js.native
    def recent(
      `type`: String,
      limit: Double,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    
    def request[T](info: String): js.Promise[T] = js.native
    def request[T](info: String, options: Unit, callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]): js.Promise[T] = js.native
    def request[T](info: String, options: HttpApiOptions): js.Promise[T] = js.native
    def request[T](
      info: String,
      options: HttpApiOptions,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def request[T](info: RequestInfo): js.Promise[T] = js.native
    def request[T](info: RequestInfo, options: Unit, callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]): js.Promise[T] = js.native
    def request[T](info: RequestInfo, options: HttpApiOptions): js.Promise[T] = js.native
    def request[T](
      info: RequestInfo,
      options: HttpApiOptions,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    
    def retrieve[T](`type`: String, ids: String): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: String, options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: js.Array[String]): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: js.Array[String],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](`type`: String, ids: js.Array[String], options: RestApiOptions): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    def retrieve[T](
      `type`: String,
      ids: js.Array[String],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ Record[T] | js.Array[Record[T]], Unit]
    ): js.Promise[Record[T] | js.Array[Record[T]]] = js.native
    
    def search[T](sosl: String): js.Promise[SearchResult[T]] = js.native
    def search[T](sosl: String, callback: js.Function2[/* err */ js.Error, /* result */ SearchResult[T], Unit]): js.Promise[SearchResult[T]] = js.native
    
    // we want any object to be accepted if the user doesn't decide to give an explicit type
    def sobject[T](resource: String): SObject[T] = js.native
    
    def update[T](records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: js.Array[Record[T]],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: Record[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: js.Array[Record[T]]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: js.Array[Record[T]], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: js.Array[Record[T]],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: Record[T]): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: Record[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](`type`: String, records: Record[T], options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def update[T](
      `type`: String,
      records: Record[T],
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[Record[T]], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    
    def upsert[T](records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: js.Array[Record[T]],
      extIdField: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: js.Array[Record[T]],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: Record[T],
      extIdField: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      records: Record[T],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: js.Array[Record[T]],
      extIdField: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: js.Array[Record[T]], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: js.Array[Record[T]],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: Record[T], extIdField: String): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: Record[T],
      extIdField: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](`type`: String, records: Record[T], extIdField: String, options: RestApiOptions): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
    def upsert[T](
      `type`: String,
      records: Record[T],
      extIdField: String,
      options: RestApiOptions,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult | js.Array[RecordResult], Unit]
    ): js.Promise[RecordResult | js.Array[RecordResult]] = js.native
  }
  
  @JSImport("jsforce/connection", "Connection")
  @js.native
  open class Connection protected () extends BaseConnection {
    def this(params: ConnectionOptions) = this()
    
    var accessToken: String = js.native
    
    var analytics: Analytics = js.native
    
    var apex: Apex = js.native
    
    def authorize(code: String): js.Promise[UserInfo] = js.native
    def authorize(code: String, callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]): js.Promise[UserInfo] = js.native
    
    var bulk: Bulk = js.native
    
    var cache: Cache = js.native
    
    var chatter: Chatter = js.native
    
    def identity(): js.Promise[IdentityInfo] = js.native
    def identity(callback: js.Function2[/* err */ js.Error, /* res */ IdentityInfo, Unit]): js.Promise[IdentityInfo] = js.native
    
    def initialize(): Unit = js.native
    def initialize(options: ConnectionOptions): Unit = js.native
    
    // Specific to Connection
    var instanceUrl: String = js.native
    
    var limitInfo: js.UndefOr[LimitInfo] = js.native
    
    def limits(): js.Promise[LimitsInfo] = js.native
    def limits(callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[LimitsInfo] = js.native
    
    def login(user: String, password: String): js.Promise[UserInfo] = js.native
    def login(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def loginByOAuth2(user: String, password: String): js.Promise[UserInfo] = js.native
    def loginByOAuth2(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def loginBySoap(user: String, password: String): js.Promise[UserInfo] = js.native
    def loginBySoap(
      user: String,
      password: String,
      callback: js.Function2[/* err */ js.Error, /* res */ UserInfo, Unit]
    ): js.Promise[UserInfo] = js.native
    
    def logout(): js.Promise[Unit] = js.native
    def logout(callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    def logout(revoke: Boolean): js.Promise[Unit] = js.native
    def logout(revoke: Boolean, callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    
    def logoutByOAuth2(): js.Promise[Unit] = js.native
    def logoutByOAuth2(callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    def logoutByOAuth2(revoke: Boolean): js.Promise[Unit] = js.native
    def logoutByOAuth2(revoke: Boolean, callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    
    def logoutBySoap(): js.Promise[Unit] = js.native
    def logoutBySoap(callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    def logoutBySoap(revoke: Boolean): js.Promise[Unit] = js.native
    def logoutBySoap(revoke: Boolean, callback: js.Function2[/* err */ js.Error, /* res */ Unit, Unit]): js.Promise[Unit] = js.native
    
    var metadata: Metadata = js.native
    
    var oauth2: OAuth2 = js.native
    
    def queryAll[T](soql: String): Query[QueryResult[T]] = js.native
    def queryAll[T](soql: String, options: js.Object): Query[QueryResult[T]] = js.native
    def queryAll[T](
      soql: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    def queryAll[T](
      soql: String,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[T], Unit]
    ): Query[QueryResult[T]] = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
    
    def requestPost[T](url: String, body: js.Object): js.Promise[T] = js.native
    def requestPost[T](
      url: String,
      body: js.Object,
      options_callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def requestPost[T](url: String, body: js.Object, options_callback: HttpApiOptions): js.Promise[T] = js.native
    def requestPost[T](
      url: String,
      body: js.Object,
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    def requestPost[T](
      url: String,
      body: js.Object,
      options: HttpApiOptions,
      callback: js.Function2[/* err */ js.Error, /* Object */ T, Unit]
    ): js.Promise[T] = js.native
    
    var soap: SoapApi = js.native
    
    var streaming: Streaming = js.native
    
    var tooling: Tooling = js.native
    
    var userInfo: js.UndefOr[UserInfo] = js.native
    
    var version: String = js.native
  }
  
  /* note: abstract class */ @JSImport("jsforce/connection", "RestApi")
  @js.native
  open class RestApi () extends StObject {
    
    def del(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def get(path: String, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def patch(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def post(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
    
    def put(path: String, body: js.Object, options: js.Object, callback: js.Function0[js.Object]): js.Promise[js.Object] = js.native
  }
  
  @JSImport("jsforce/connection", "Tooling")
  @js.native
  open class Tooling () extends BaseConnection {
    def this(options: EventEmitterOptions) = this()
    
    var _logger: Any = js.native
    
    // Specific to tooling
    def executeAnonymous(body: String): js.Promise[ExecuteAnonymousResult] = js.native
    def executeAnonymous(body: String, callback: js.Function2[/* err */ js.Error, /* res */ Any, Unit]): js.Promise[ExecuteAnonymousResult] = js.native
  }
  
  type Callback[T] = js.Function2[/* err */ js.Error | Null, /* result */ T, Unit]
  
  type ConnectionEvent = refresh
  
  trait ConnectionOptions
    extends StObject
       with PartialOAuth2Options {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var callOptions: js.UndefOr[js.Object] = js.undefined
    
    var httpProxy: js.UndefOr[String] = js.undefined
    
    var instanceUrl: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[String] = js.undefined
    
    var maxRequest: js.UndefOr[Double] = js.undefined
    
    var oauth2: js.UndefOr[PartialPartialOAuth2Optio] = js.undefined
    
    var proxyUrl: js.UndefOr[String] = js.undefined
    
    var refreshFn: js.UndefOr[
        js.Function2[
          /* conn */ Connection, 
          /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* res */ js.UndefOr[Any], Unit], 
          Any
        ]
      ] = js.undefined
    
    var refreshToken: js.UndefOr[String] = js.undefined
    
    var serverUrl: js.UndefOr[String] = js.undefined
    
    var sessionId: js.UndefOr[String] = js.undefined
    
    var signedRequest: js.UndefOr[String | js.Object] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    extension [Self <: ConnectionOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setCallOptions(value: js.Object): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
      
      inline def setCallOptionsUndefined: Self = StObject.set(x, "callOptions", js.undefined)
      
      inline def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
      
      inline def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
      
      inline def setInstanceUrl(value: String): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
      
      inline def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxRequest(value: Double): Self = StObject.set(x, "maxRequest", value.asInstanceOf[js.Any])
      
      inline def setMaxRequestUndefined: Self = StObject.set(x, "maxRequest", js.undefined)
      
      inline def setOauth2(value: PartialPartialOAuth2Optio): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
      
      inline def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
      
      inline def setRefreshFn(
        value: (/* conn */ Connection, /* callback */ js.Function3[/* err */ js.Error | Null, /* accessToken */ String, /* res */ js.UndefOr[Any], Unit]) => Any
      ): Self = StObject.set(x, "refreshFn", js.Any.fromFunction2(value))
      
      inline def setRefreshFnUndefined: Self = StObject.set(x, "refreshFn", js.undefined)
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
      
      inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
      
      inline def setServerUrlUndefined: Self = StObject.set(x, "serverUrl", js.undefined)
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setSignedRequest(value: String | js.Object): Self = StObject.set(x, "signedRequest", value.asInstanceOf[js.Any])
      
      inline def setSignedRequestUndefined: Self = StObject.set(x, "signedRequest", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ExecuteAnonymousResult extends StObject {
    
    var column: Double
    
    var compileProblem: String
    
    var compiled: Boolean
    
    var exceptionMessage: String
    
    var exceptionStackTrace: String
    
    var line: Double
    
    var success: Boolean
  }
  object ExecuteAnonymousResult {
    
    inline def apply(
      column: Double,
      compileProblem: String,
      compiled: Boolean,
      exceptionMessage: String,
      exceptionStackTrace: String,
      line: Double,
      success: Boolean
    ): ExecuteAnonymousResult = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compileProblem = compileProblem.asInstanceOf[js.Any], compiled = compiled.asInstanceOf[js.Any], exceptionMessage = exceptionMessage.asInstanceOf[js.Any], exceptionStackTrace = exceptionStackTrace.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteAnonymousResult]
    }
    
    extension [Self <: ExecuteAnonymousResult](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setCompileProblem(value: String): Self = StObject.set(x, "compileProblem", value.asInstanceOf[js.Any])
      
      inline def setCompiled(value: Boolean): Self = StObject.set(x, "compiled", value.asInstanceOf[js.Any])
      
      inline def setExceptionMessage(value: String): Self = StObject.set(x, "exceptionMessage", value.asInstanceOf[js.Any])
      
      inline def setExceptionStackTrace(value: String): Self = StObject.set(x, "exceptionStackTrace", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityInfo
    extends StObject
       with // And possible other attributes.
  /* key */ StringDictionary[Any] {
    
    var active: Boolean
    
    var addr_city: String | Null
    
    var addr_country: String | Null
    
    var addr_state: String | Null
    
    var addr_street: String | Null
    
    var addr_zip: String | Null
    
    var asserted_user: Boolean
    
    var display_name: String
    
    var email: String
    
    var email_verified: Boolean
    
    var first_name: String | Null
    
    var id: String
    
    var is_app_installed: Boolean
    
    var is_lightning_login_user: Boolean
    
    var language: String
    
    var last_modified_date: js.Date
    
    var last_name: String
    
    var locale: String
    
    var mobile_phone: String | Null
    
    var mobile_phone_verified: Boolean
    
    var nick_name: String
    
    var organization_id: String
    
    var photos: Picture
    
    var status: Body
    
    var timezone: String
    
    var urls: Customdomain
    
    var user_id: String
    
    var user_type: String
    
    var username: String
    
    var utcOffset: Double
  }
  object IdentityInfo {
    
    inline def apply(
      active: Boolean,
      asserted_user: Boolean,
      display_name: String,
      email: String,
      email_verified: Boolean,
      id: String,
      is_app_installed: Boolean,
      is_lightning_login_user: Boolean,
      language: String,
      last_modified_date: js.Date,
      last_name: String,
      locale: String,
      mobile_phone_verified: Boolean,
      nick_name: String,
      organization_id: String,
      photos: Picture,
      status: Body,
      timezone: String,
      urls: Customdomain,
      user_id: String,
      user_type: String,
      username: String,
      utcOffset: Double
    ): IdentityInfo = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], asserted_user = asserted_user.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], email_verified = email_verified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_app_installed = is_app_installed.asInstanceOf[js.Any], is_lightning_login_user = is_lightning_login_user.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], last_modified_date = last_modified_date.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mobile_phone_verified = mobile_phone_verified.asInstanceOf[js.Any], nick_name = nick_name.asInstanceOf[js.Any], organization_id = organization_id.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_type = user_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], utcOffset = utcOffset.asInstanceOf[js.Any], addr_city = null, addr_country = null, addr_state = null, addr_street = null, addr_zip = null, first_name = null, mobile_phone = null)
      __obj.asInstanceOf[IdentityInfo]
    }
    
    extension [Self <: IdentityInfo](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAddr_city(value: String): Self = StObject.set(x, "addr_city", value.asInstanceOf[js.Any])
      
      inline def setAddr_cityNull: Self = StObject.set(x, "addr_city", null)
      
      inline def setAddr_country(value: String): Self = StObject.set(x, "addr_country", value.asInstanceOf[js.Any])
      
      inline def setAddr_countryNull: Self = StObject.set(x, "addr_country", null)
      
      inline def setAddr_state(value: String): Self = StObject.set(x, "addr_state", value.asInstanceOf[js.Any])
      
      inline def setAddr_stateNull: Self = StObject.set(x, "addr_state", null)
      
      inline def setAddr_street(value: String): Self = StObject.set(x, "addr_street", value.asInstanceOf[js.Any])
      
      inline def setAddr_streetNull: Self = StObject.set(x, "addr_street", null)
      
      inline def setAddr_zip(value: String): Self = StObject.set(x, "addr_zip", value.asInstanceOf[js.Any])
      
      inline def setAddr_zipNull: Self = StObject.set(x, "addr_zip", null)
      
      inline def setAsserted_user(value: Boolean): Self = StObject.set(x, "asserted_user", value.asInstanceOf[js.Any])
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmail_verified(value: Boolean): Self = StObject.set(x, "email_verified", value.asInstanceOf[js.Any])
      
      inline def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      inline def setFirst_nameNull: Self = StObject.set(x, "first_name", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs_app_installed(value: Boolean): Self = StObject.set(x, "is_app_installed", value.asInstanceOf[js.Any])
      
      inline def setIs_lightning_login_user(value: Boolean): Self = StObject.set(x, "is_lightning_login_user", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLast_modified_date(value: js.Date): Self = StObject.set(x, "last_modified_date", value.asInstanceOf[js.Any])
      
      inline def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMobile_phone(value: String): Self = StObject.set(x, "mobile_phone", value.asInstanceOf[js.Any])
      
      inline def setMobile_phoneNull: Self = StObject.set(x, "mobile_phone", null)
      
      inline def setMobile_phone_verified(value: Boolean): Self = StObject.set(x, "mobile_phone_verified", value.asInstanceOf[js.Any])
      
      inline def setNick_name(value: String): Self = StObject.set(x, "nick_name", value.asInstanceOf[js.Any])
      
      inline def setOrganization_id(value: String): Self = StObject.set(x, "organization_id", value.asInstanceOf[js.Any])
      
      inline def setPhotos(value: Picture): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Body): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: Customdomain): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_type(value: String): Self = StObject.set(x, "user_type", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUtcOffset(value: Double): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait PartialOAuth2Options extends StObject {
    
    var authzServiceUrl: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var tokenServiceUrl: js.UndefOr[String] = js.undefined
  }
  object PartialOAuth2Options {
    
    inline def apply(): PartialOAuth2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOAuth2Options]
    }
    
    extension [Self <: PartialOAuth2Options](x: Self) {
      
      inline def setAuthzServiceUrl(value: String): Self = StObject.set(x, "authzServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthzServiceUrlUndefined: Self = StObject.set(x, "authzServiceUrl", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
      
      inline def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
    }
  }
  
  trait RequestInfo extends StObject {
    
    var body: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestInfo {
    
    inline def apply(): RequestInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInfo]
    }
    
    extension [Self <: RequestInfo](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait RestApiOptions extends StObject {
    
    var allOrNone: js.UndefOr[Boolean] = js.undefined
    
    var allowRecursive: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object RestApiOptions {
    
    inline def apply(): RestApiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RestApiOptions]
    }
    
    extension [Self <: RestApiOptions](x: Self) {
      
      inline def setAllOrNone(value: Boolean): Self = StObject.set(x, "allOrNone", value.asInstanceOf[js.Any])
      
      inline def setAllOrNoneUndefined: Self = StObject.set(x, "allOrNone", js.undefined)
      
      inline def setAllowRecursive(value: Boolean): Self = StObject.set(x, "allowRecursive", value.asInstanceOf[js.Any])
      
      inline def setAllowRecursiveUndefined: Self = StObject.set(x, "allowRecursive", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  trait SearchResult[T] extends StObject {
    
    var searchRecords: js.Array[Record[T]]
  }
  object SearchResult {
    
    inline def apply[T](searchRecords: js.Array[Record[T]]): SearchResult[T] = {
      val __obj = js.Dynamic.literal(searchRecords = searchRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResult[T]]
    }
    
    extension [Self <: SearchResult[?], T](x: Self & SearchResult[T]) {
      
      inline def setSearchRecords(value: js.Array[Record[T]]): Self = StObject.set(x, "searchRecords", value.asInstanceOf[js.Any])
      
      inline def setSearchRecordsVarargs(value: Record[T]*): Self = StObject.set(x, "searchRecords", js.Array(value*))
    }
  }
  
  trait UserInfo extends StObject {
    
    var id: String
    
    var organizationId: String
    
    var url: String
  }
  object UserInfo {
    
    inline def apply(id: String, organizationId: String, url: String): UserInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfo]
    }
    
    extension [Self <: UserInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
