package typings.jsforce

import typings.jsforce.jsforceStrings.ASC
import typings.jsforce.jsforceStrings.DESC
import typings.jsforce.recordResultMod.RecordResult
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryMod {
  
  @JSImport("jsforce/query", "ExplainInfo")
  @js.native
  open class ExplainInfo () extends StObject
  
  @JSImport("jsforce/query", "Query")
  @js.native
  open class Query[T] ()
    extends Readable
       with Promise[T] {
    def this(opts: ReadableOptions) = this()
    
    def del(): Any = js.native
    def del(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    def del(`type`: String): Any = js.native
    def del(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    def del(`type`: Unit, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    
    def delete(): Any = js.native
    def delete(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    def delete(`type`: String): Any = js.native
    def delete(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    def delete(`type`: Unit, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): Any = js.native
    
    def destroy(callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(`type`: String): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(`type`: String, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
    def destroy(`type`: Unit, callback: js.Function2[/* err */ js.Error, /* ret */ RecordResult, Unit]): js.Promise[js.Array[RecordResult]] = js.native
    @JSName("destroy")
    def destroy_Promise(): js.Promise[js.Array[RecordResult]] = js.native
    
    def end(): Query[T] = js.native
    
    def exec(): Query[T] = js.native
    def exec(options: Unit, callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
    def exec(options: ExecuteOptions): Query[T] = js.native
    def exec(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def execute(): Query[T] = js.native
    def execute(options: Unit, callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
    def execute(options: ExecuteOptions): Query[T] = js.native
    def execute(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def explain(): js.Promise[ExplainInfo] = js.native
    def explain(callback: js.Function2[/* err */ js.Error, /* info */ ExplainInfo, Unit]): js.Promise[ExplainInfo] = js.native
    
    def filter(filter: js.Object): Query[T] = js.native
    
    def hint(hint: js.Object): Query[T] = js.native
    
    def include(include: String): Query[T] = js.native
    
    def limit(value: Double): Query[T] = js.native
    
    def map(callback: js.Function1[/* currentValue */ js.Object, Unit]): js.Promise[Any] = js.native
    
    def maxFetch(value: Double): Query[T] = js.native
    
    def offset(value: Double): Query[T] = js.native
    
    def run(): Query[T] = js.native
    def run(options: Unit, callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]): Query[T] = js.native
    def run(options: ExecuteOptions): Query[T] = js.native
    def run(
      options: ExecuteOptions,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[T], Unit]
    ): Query[T] = js.native
    
    def scanAll(value: Boolean): Query[T] = js.native
    
    def select(fields: String): Query[T] = js.native
    def select(fields: js.Array[String]): Query[T] = js.native
    def select(fields: js.Object): Query[T] = js.native
    
    def skip(value: Double): Query[T] = js.native
    
    def sort(keyOrList: String): Query[T] = js.native
    def sort(keyOrList: String, direction: ASC | DESC): Query[T] = js.native
    def sort(keyOrList: String, direction: Double): Query[T] = js.native
    def sort(keyOrList: js.Array[js.Object]): Query[T] = js.native
    def sort(keyOrList: js.Array[js.Object], direction: ASC | DESC): Query[T] = js.native
    def sort(keyOrList: js.Array[js.Object], direction: Double): Query[T] = js.native
    def sort(keyOrList: js.Object): Query[T] = js.native
    def sort(keyOrList: js.Object, direction: ASC | DESC): Query[T] = js.native
    def sort(keyOrList: js.Object, direction: Double): Query[T] = js.native
    
    def thenCall(): Query[T] = js.native
    def thenCall(callback: js.Function2[/* err */ js.Error, /* records */ T, Unit]): Query[T] = js.native
    
    def toSOQL(callback: js.Function2[/* err */ js.Error, /* soql */ String, Unit]): js.Promise[String] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_Query: typings.jsforce.jsforceStrings.Promise = js.native
    
    def update(mapping: Any): js.Promise[js.Array[RecordResult]] = js.native
    def update(
      mapping: Any,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    def update(mapping: Any, `type`: String): js.Promise[js.Array[RecordResult]] = js.native
    def update(
      mapping: Any,
      `type`: String,
      callback: js.Function2[/* err */ js.Error, /* records */ js.Array[RecordResult], Unit]
    ): js.Promise[js.Array[RecordResult]] = js.native
    
    def where(conditions: String): Query[T] = js.native
    def where(conditions: js.Object): Query[T] = js.native
  }
  
  trait ExecuteOptions extends StObject {
    
    var autoFetch: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var maxFetch: js.UndefOr[Double] = js.undefined
    
    var scanAll: js.UndefOr[Boolean] = js.undefined
  }
  object ExecuteOptions {
    
    inline def apply(): ExecuteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecuteOptions]
    }
    
    extension [Self <: ExecuteOptions](x: Self) {
      
      inline def setAutoFetch(value: Boolean): Self = StObject.set(x, "autoFetch", value.asInstanceOf[js.Any])
      
      inline def setAutoFetchUndefined: Self = StObject.set(x, "autoFetch", js.undefined)
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMaxFetch(value: Double): Self = StObject.set(x, "maxFetch", value.asInstanceOf[js.Any])
      
      inline def setMaxFetchUndefined: Self = StObject.set(x, "maxFetch", js.undefined)
      
      inline def setScanAll(value: Boolean): Self = StObject.set(x, "scanAll", value.asInstanceOf[js.Any])
      
      inline def setScanAllUndefined: Self = StObject.set(x, "scanAll", js.undefined)
    }
  }
  
  trait QueryResult[T] extends StObject {
    
    var done: Boolean
    
    var nextRecordsUrl: js.UndefOr[String] = js.undefined
    
    var records: js.Array[T]
    
    var totalSize: Double
  }
  object QueryResult {
    
    inline def apply[T](done: Boolean, records: js.Array[T], totalSize: Double): QueryResult[T] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], totalSize = totalSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryResult[T]]
    }
    
    extension [Self <: QueryResult[?], T](x: Self & QueryResult[T]) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setNextRecordsUrl(value: String): Self = StObject.set(x, "nextRecordsUrl", value.asInstanceOf[js.Any])
      
      inline def setNextRecordsUrlUndefined: Self = StObject.set(x, "nextRecordsUrl", js.undefined)
      
      inline def setRecords(value: js.Array[T]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: T*): Self = StObject.set(x, "records", js.Array(value*))
      
      inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    }
  }
}
