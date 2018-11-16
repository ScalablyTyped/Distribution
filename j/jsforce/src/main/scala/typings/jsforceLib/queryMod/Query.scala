package typings
package jsforceLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/query", "Query")
@js.native
class Query[T] ()
  extends nodeLib.streamMod.Readable
     with stdLib.Promise[T] {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  var toStringTag_Query: jsforceLib.jsforceLibStrings.Promise = js.native
  def del(): js.Any = js.native
  def del(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): js.Any = js.native
  def del(`type`: java.lang.String): js.Any = js.native
  def del(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): js.Any = js.native
  def delete(): js.Any = js.native
  def delete(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): js.Any = js.native
  def delete(`type`: java.lang.String): js.Any = js.native
  def delete(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): js.Any = js.native
  def destroy(
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def destroy(`type`: java.lang.String): stdLib.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def destroy(
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* ret */ jsforceLib.recordDashResultMod.RecordResult, 
      scala.Unit
    ]
  ): stdLib.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  @JSName("destroy")
  def destroy_Promise(): stdLib.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def end(): Query[T] = js.native
  def exec(): Query[T] = js.native
  def exec(options: ExecuteOptions): Query[T] = js.native
  def exec(
    options: ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* records */ js.Array[T], scala.Unit]
  ): Query[T] = js.native
  def execute(): Query[T] = js.native
  def execute(options: ExecuteOptions): Query[T] = js.native
  def execute(
    options: ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* records */ js.Array[T], scala.Unit]
  ): Query[T] = js.native
  def explain(): stdLib.Promise[ExplainInfo] = js.native
  def explain(callback: js.Function2[/* err */ nodeLib.Error, /* info */ ExplainInfo, scala.Unit]): stdLib.Promise[ExplainInfo] = js.native
  def filter(filter: js.Object): Query[T] = js.native
  def hint(hint: js.Object): Query[T] = js.native
  def include(include: java.lang.String): Query[T] = js.native
  def limit(value: scala.Double): Query[T] = js.native
  def map(callback: js.Function1[/* currentValue */ js.Object, scala.Unit]): stdLib.Promise[_] = js.native
  def maxFetch(value: scala.Double): Query[T] = js.native
  def offset(value: scala.Double): Query[T] = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: nodeLib.Anon_End): T = js.native
  def run(): Query[T] = js.native
  def run(options: ExecuteOptions): Query[T] = js.native
  def run(
    options: ExecuteOptions,
    callback: js.Function2[/* err */ nodeLib.Error, /* records */ js.Array[T], scala.Unit]
  ): Query[T] = js.native
  def scanAll(value: scala.Boolean): Query[T] = js.native
  def select(fields: java.lang.String): Query[T] = js.native
  def select(fields: js.Array[java.lang.String]): Query[T] = js.native
  def select(fields: js.Object): Query[T] = js.native
  def skip(value: scala.Double): Query[T] = js.native
  def sort(keyOrList: java.lang.String): Query[T] = js.native
  def sort(keyOrList: java.lang.String, direction: scala.Double): Query[T] = js.native
  def sort(keyOrList: js.Array[js.Object]): Query[T] = js.native
  def sort(keyOrList: js.Array[js.Object], direction: scala.Double): Query[T] = js.native
  def sort(keyOrList: js.Object): Query[T] = js.native
  def sort(keyOrList: js.Object, direction: scala.Double): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: java.lang.String, direction: jsforceLib.jsforceLibStrings.ASC): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: js.Array[js.Object], direction: jsforceLib.jsforceLibStrings.ASC): Query[T] = js.native
  @JSName("sort")
  def sort_ASC(keyOrList: js.Object, direction: jsforceLib.jsforceLibStrings.ASC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: java.lang.String, direction: jsforceLib.jsforceLibStrings.DESC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: js.Array[js.Object], direction: jsforceLib.jsforceLibStrings.DESC): Query[T] = js.native
  @JSName("sort")
  def sort_DESC(keyOrList: js.Object, direction: jsforceLib.jsforceLibStrings.DESC): Query[T] = js.native
  def thenCall(): Query[T] = js.native
  def thenCall(callback: js.Function2[/* err */ nodeLib.Error, /* records */ T, scala.Unit]): Query[T] = js.native
  def toSOQL(callback: js.Function2[/* err */ nodeLib.Error, /* soql */ java.lang.String, scala.Unit]): stdLib.Promise[java.lang.String] = js.native
  def update(
    mapping: js.Any,
    `type`: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* records */ js.Array[jsforceLib.recordDashResultMod.RecordResult], 
      scala.Unit
    ]
  ): stdLib.Promise[js.Array[jsforceLib.recordDashResultMod.RecordResult]] = js.native
  def where(conditions: java.lang.String): Query[T] = js.native
  def where(conditions: js.Object): Query[T] = js.native
}

