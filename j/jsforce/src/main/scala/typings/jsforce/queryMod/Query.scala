package typings.jsforce.queryMod

import typings.jsforce.jsforceStrings.ASC
import typings.jsforce.jsforceStrings.DESC
import typings.jsforce.recordResultMod.RecordResult
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/query", "Query")
@js.native
class Query[T] ()
  extends Readable
     with Promise[T] {
  @JSName(js.Symbol.toStringTag)
  var toStringTag_Query: typings.jsforce.jsforceStrings.Promise = js.native
  def del(): js.Any = js.native
  def del(callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Any = js.native
  def del(`type`: String): js.Any = js.native
  def del(`type`: String, callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Any = js.native
  def delete(): js.Any = js.native
  def delete(callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Any = js.native
  def delete(`type`: String): js.Any = js.native
  def delete(`type`: String, callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Any = js.native
  def destroy(callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
  def destroy(`type`: String): js.Promise[js.Array[RecordResult]] = js.native
  def destroy(`type`: String, callback: js.Function2[/* err */ Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
  @JSName("destroy")
  def destroy_Promise(): js.Promise[js.Array[RecordResult]] = js.native
  def end(): Query[T] = js.native
  def exec(): Query[T] = js.native
  def exec(options: ExecuteOptions): Query[T] = js.native
  def exec(options: ExecuteOptions, callback: js.Function2[/* err */ Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
  def execute(): Query[T] = js.native
  def execute(options: ExecuteOptions): Query[T] = js.native
  def execute(options: ExecuteOptions, callback: js.Function2[/* err */ Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
  def explain(): js.Promise[ExplainInfo] = js.native
  def explain(callback: js.Function2[/* err */ Error, /* info */ ExplainInfo, Unit]): js.Promise[ExplainInfo] = js.native
  def filter(filter: js.Object): Query[T] = js.native
  def hint(hint: js.Object): Query[T] = js.native
  def include(include: String): Query[T] = js.native
  def limit(value: Double): Query[T] = js.native
  def map(callback: js.Function1[/* currentValue */ js.Object, Unit]): js.Promise[_] = js.native
  def maxFetch(value: Double): Query[T] = js.native
  def offset(value: Double): Query[T] = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def run(): Query[T] = js.native
  def run(options: ExecuteOptions): Query[T] = js.native
  def run(options: ExecuteOptions, callback: js.Function2[/* err */ Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
  def scanAll(value: Boolean): Query[T] = js.native
  def select(fields: String): Query[T] = js.native
  def select(fields: js.Array[String]): Query[T] = js.native
  def select(fields: js.Object): Query[T] = js.native
  def skip(value: Double): Query[T] = js.native
  def sort(keyOrList: String): Query[T] = js.native
  def sort(keyOrList: String, direction: Double): Query[T] = js.native
  def sort(keyOrList: js.Array[js.Object]): Query[T] = js.native
  def sort(keyOrList: js.Array[js.Object], direction: Double): Query[T] = js.native
  def sort(keyOrList: js.Object): Query[T] = js.native
  def sort(keyOrList: js.Object, direction: Double): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: String, direction: ASC): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: js.Array[js.Object], direction: ASC): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: js.Object, direction: ASC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: String, direction: DESC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: js.Array[js.Object], direction: DESC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: js.Object, direction: DESC): Query[T] = js.native
  def thenCall(): Query[T] = js.native
  def thenCall(callback: js.Function2[/* err */ Error, /* records */ T, Unit]): Query[T] = js.native
  def toSOQL(callback: js.Function2[/* err */ Error, /* soql */ String, Unit]): js.Promise[String] = js.native
  def update(
    mapping: js.Any,
    callback: js.Function2[/* err */ Error, /* records */ js.Array[RecordResult], Unit]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def update(
    mapping: js.Any,
    `type`: String,
    callback: js.Function2[/* err */ Error, /* records */ js.Array[RecordResult], Unit]
  ): js.Promise[js.Array[RecordResult]] = js.native
  def where(conditions: String): Query[T] = js.native
  def where(conditions: js.Object): Query[T] = js.native
}

