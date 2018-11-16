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
  var describe$_Original: jsforceLib.Anon_TypeCallback = js.native
  @JSName("describeGlobal$")
  var describeGlobal$_Original: jsforceLib.Anon_CallbackErr = js.native
  def _baseUrl(): java.lang.String = js.native
  def create[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def create[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: java.lang.String): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def del[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: java.lang.String): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def delete[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def describe(`type`: java.lang.String): stdLib.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  def describe(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeSObjectResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.describeDashResultMod.DescribeSObjectResult] = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  @JSName("describe$")
  def describe$(`type`: java.lang.String): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
  @JSName("describe$")
  def describe$(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeSObjectResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeSObjectResult = js.native
  def describeGlobal[T](): stdLib.Promise[jsforceLib.describeDashResultMod.DescribeGlobalResult] = js.native
  def describeGlobal[T](
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeGlobalResult, 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.describeDashResultMod.DescribeGlobalResult] = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  @JSName("describeGlobal$")
  def describeGlobal$(): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
  @JSName("describeGlobal$")
  def describeGlobal$(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.describeDashResultMod.DescribeGlobalResult, 
      scala.Unit
    ]
  ): jsforceLib.describeDashResultMod.DescribeGlobalResult = js.native
  def destroy[T](`type`: java.lang.String, ids: java.lang.String): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def destroy[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def insert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def query[T](soql: java.lang.String): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def query[T](soql: java.lang.String, options: jsforceLib.queryMod.ExecuteOptions): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def query[T](
    soql: java.lang.String,
    options: jsforceLib.queryMod.ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ jsforceLib.queryMod.QueryResult[T], scala.Unit]
  ): jsforceLib.queryMod.Query[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](locator: java.lang.String): stdLib.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](locator: java.lang.String, options: jsforceLib.queryMod.ExecuteOptions): stdLib.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def queryMore[T](
    locator: java.lang.String,
    options: jsforceLib.queryMod.ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ jsforceLib.queryMod.QueryResult[T], scala.Unit]
  ): stdLib.Promise[jsforceLib.queryMod.QueryResult[T]] = js.native
  def request(info: java.lang.String): stdLib.Promise[js.Object] = js.native
  def request(info: java.lang.String, options: jsforceLib.httpDashApiMod.HttpApiOptions): stdLib.Promise[js.Object] = js.native
  def request(
    info: java.lang.String,
    options: jsforceLib.httpDashApiMod.HttpApiOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* Object */ js.Object, scala.Unit]
  ): stdLib.Promise[js.Object] = js.native
  def request(info: RequestInfo): stdLib.Promise[js.Object] = js.native
  def request(info: RequestInfo, options: jsforceLib.httpDashApiMod.HttpApiOptions): stdLib.Promise[js.Object] = js.native
  def request(
    info: RequestInfo,
    options: jsforceLib.httpDashApiMod.HttpApiOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* Object */ js.Object, scala.Unit]
  ): stdLib.Promise[js.Object] = js.native
  def retrieve[T](`type`: java.lang.String, ids: java.lang.String): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: java.lang.String, options: RestApiOptions): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](
    `type`: java.lang.String,
    ids: java.lang.String,
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: js.Array[java.lang.String]): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](`type`: java.lang.String, ids: js.Array[java.lang.String], options: RestApiOptions): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  def retrieve[T](
    `type`: java.lang.String,
    ids: js.Array[java.lang.String],
    options: RestApiOptions,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* result */ jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]], 
      scala.Unit
    ]
  ): stdLib.Promise[jsforceLib.recordMod.Record[T] | js.Array[jsforceLib.recordMod.Record[T]]] = js.native
  // we want any object to be accepted if the user doesn't decide to give an explicit type
  def sobject[T](resource: java.lang.String): jsforceLib.salesforceDashObjectMod.SObject[T] = js.native
  def update[T](`type`: java.lang.String, records: js.Array[jsforceLib.recordMod.Record[T]]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    options: RestApiOptions
  ): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T]): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def update[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], options: RestApiOptions): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: js.Array[jsforceLib.recordMod.Record[T]],
    extIdField: java.lang.String,
    options: RestApiOptions
  ): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](`type`: java.lang.String, records: jsforceLib.recordMod.Record[T], extIdField: java.lang.String): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
  def upsert[T](
    `type`: java.lang.String,
    records: jsforceLib.recordMod.Record[T],
    extIdField: java.lang.String,
    options: RestApiOptions
  ): stdLib.Promise[
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
  ): stdLib.Promise[
    jsforceLib.recordDashResultMod.RecordResult | js.Array[jsforceLib.recordDashResultMod.RecordResult]
  ] = js.native
}

