package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/connection", "BaseConnection")
@js.native
abstract class BaseConnection ()
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("describe$")
  var describe$_Original: jsforceLib.Anon_Callback = js.native
  @JSName("describeGlobal$")
  var describeGlobal$_Original: jsforceLib.Anon_CallbackClear = js.native
  def _baseUrl(): java.lang.String = js.native
  def create[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: java.lang.String): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](
    `type`: java.lang.String,
    ids: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](
    `type`: java.lang.String,
    ids: js.Array[java.lang.String],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: java.lang.String): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](
    `type`: java.lang.String,
    ids: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](
    `type`: java.lang.String,
    ids: js.Array[java.lang.String],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def describe(`type`: java.lang.String): js.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  def describe(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeSObjectResult, 
      scala.Unit
    ]
  ): js.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  @JSName("describe$")
  def describe$(`type`: java.lang.String): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  @JSName("describe$")
  def describe$(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeSObjectResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def describeGlobal[T](): js.Promise[jsforceLib.describeDashResultMod.DescribeGlobalResult] = js.native
  def describeGlobal[T](
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeGlobalResult, 
      scala.Unit
    ]
  ): js.Promise[jsforceLib.describeDashResultMod.DescribeGlobalResult] = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  @JSName("describeGlobal$")
  def describeGlobal$(): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  @JSName("describeGlobal$")
  def describeGlobal$(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeGlobalResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  def destroy[T](`type`: java.lang.String, ids: java.lang.String): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](
    `type`: java.lang.String,
    ids: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](
    `type`: java.lang.String,
    ids: js.Array[java.lang.String],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def query[T](soql: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def query[T](soql: java.lang.String, options: jsforceLib.queryMod.ExecuteOptions): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def query[T](
    soql: java.lang.String,
    options: jsforceLib.queryMod.ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ jsforceLib.queryMod.QueryResult[T], scala.Unit]
  ): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](locator: java.lang.String): js.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](locator: java.lang.String, options: jsforceLib.queryMod.ExecuteOptions): js.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](
    locator: java.lang.String,
    options: jsforceLib.queryMod.ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ jsforceLib.queryMod.QueryResult[T], scala.Unit]
  ): js.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def request(info: java.lang.String): js.Promise[js.Object] = js.native
  def request(info: java.lang.String, options: jsforceLib.httpDashApiMod.HttpApiOptions): js.Promise[js.Object] = js.native
  def request(
    info: java.lang.String,
    options: jsforceLib.httpDashApiMod.HttpApiOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* Object */ js.Object, scala.Unit]
  ): js.Promise[js.Object] = js.native
  def request(info: RequestInfo): js.Promise[js.Object] = js.native
  def request(info: RequestInfo, options: jsforceLib.httpDashApiMod.HttpApiOptions): js.Promise[js.Object] = js.native
  def request(
    info: RequestInfo,
    options: jsforceLib.httpDashApiMod.HttpApiOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* Object */ js.Object, scala.Unit]
  ): js.Promise[js.Object] = js.native
  def retrieve[T](`type`: java.lang.String, ids: java.lang.String): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](
    `type`: java.lang.String,
    ids: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](
    `type`: java.lang.String,
    ids: js.Array[java.lang.String],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): js.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  // we want any object to be accepted if the user doesn't decide to give an explicit type
  def sobject[T](resource: java.lang.String): jsforceLib.salesforceDashObjectMod.SObject[T] = js.native
  def update[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    options: RestApiOptions
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], extIdField: java.lang.String): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    options: RestApiOptions
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): js.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
}

