package typings.loggly

import typings.loggly.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loggly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(options: LogglyOptions): LogglyInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[LogglyInstance]
  
  @JSImport("loggly", "version")
  @js.native
  val version: Double = js.native
  
  @js.native
  trait LogglyInstance extends StObject {
    
    def log(message: Any): this.type = js.native
    def log(message: Any, callback: js.Function2[/* err */ Any, /* results */ Any, Unit]): this.type = js.native
    def log(message: Any, tags: js.Array[String]): this.type = js.native
    def log(
      message: Any,
      tags: js.Array[String],
      callback: js.Function2[/* err */ Any, /* results */ Any, Unit]
    ): this.type = js.native
    def log(message: Any, tags: Unit, callback: js.Function2[/* err */ Any, /* results */ Any, Unit]): this.type = js.native
    
    def search(options: SearchOptions): Search = js.native
    def search(options: SearchOptions, callback: js.Function2[/* err */ Any, /* results */ SearchResults, Unit]): Search = js.native
    def search(query: String): Search = js.native
    def search(query: String, callback: js.Function2[/* err */ Any, /* results */ SearchResults, Unit]): Search = js.native
  }
  
  trait LogglyOptions extends StObject {
    
    var auth: js.UndefOr[Password] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Boolean] = js.undefined
    
    var subdomain: String
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    var token: String
  }
  object LogglyOptions {
    
    inline def apply(subdomain: String, token: String): LogglyOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogglyOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait Search extends StObject {
    
    def run(callback: js.Function2[/* err */ Any, /* results */ SearchResults, Unit]): this.type
  }
  object Search {
    
    inline def apply(run: js.Function2[/* err */ Any, /* results */ SearchResults, Unit] => Search): Search = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[Search]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
      
      inline def setRun(value: js.Function2[/* err */ Any, /* results */ SearchResults, Unit] => Search): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.loggly.mod.SearchOptionsWithQ
    - typings.loggly.mod.SearchOptionsWithQuery
  */
  trait SearchOptions extends StObject
  object SearchOptions {
    
    inline def SearchOptionsWithQ(q: String): typings.loggly.mod.SearchOptionsWithQ = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loggly.mod.SearchOptionsWithQ]
    }
    
    inline def SearchOptionsWithQuery(query: String): typings.loggly.mod.SearchOptionsWithQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loggly.mod.SearchOptionsWithQuery]
    }
  }
  
  trait SearchOptionsWithQ
    extends StObject
       with SharedSearchOptions
       with SearchOptions {
    
    var q: String
  }
  object SearchOptionsWithQ {
    
    inline def apply(q: String): SearchOptionsWithQ = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptionsWithQ]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptionsWithQ] (val x: Self) extends AnyVal {
      
      inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchOptionsWithQuery
    extends StObject
       with SharedSearchOptions
       with SearchOptions {
    
    var query: String
  }
  object SearchOptionsWithQuery {
    
    inline def apply(query: String): SearchOptionsWithQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptionsWithQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchOptionsWithQuery] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResults extends StObject {
    
    var events: js.Array[SearchResultsEvent]
    
    var page: Double
    
    var total_events: Double
  }
  object SearchResults {
    
    inline def apply(events: js.Array[SearchResultsEvent], page: Double, total_events: Double): SearchResults = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], total_events = total_events.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: js.Array[SearchResultsEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: SearchResultsEvent*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setTotal_events(value: Double): Self = StObject.set(x, "total_events", value.asInstanceOf[js.Any])
    }
  }
  
  trait SearchResultsEvent extends StObject {
    
    var event: Any
    
    var id: String
    
    var logmsg: String
    
    var logtypes: js.Array[String]
    
    var raw: String
    
    var tags: js.Array[String]
    
    var timestamp: Double
  }
  object SearchResultsEvent {
    
    inline def apply(
      event: Any,
      id: String,
      logmsg: String,
      logtypes: js.Array[String],
      raw: String,
      tags: js.Array[String],
      timestamp: Double
    ): SearchResultsEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logmsg = logmsg.asInstanceOf[js.Any], logtypes = logtypes.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResultsEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchResultsEvent] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLogmsg(value: String): Self = StObject.set(x, "logmsg", value.asInstanceOf[js.Any])
      
      inline def setLogtypes(value: js.Array[String]): Self = StObject.set(x, "logtypes", value.asInstanceOf[js.Any])
      
      inline def setLogtypesVarargs(value: String*): Self = StObject.set(x, "logtypes", js.Array(value*))
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait SharedSearchOptions extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var until: js.UndefOr[String] = js.undefined
  }
  object SharedSearchOptions {
    
    inline def apply(): SharedSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedSearchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedSearchOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
}
