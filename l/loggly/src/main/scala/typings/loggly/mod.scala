package typings.loggly

import typings.loggly.anon.Password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loggly", "createClient")
  @js.native
  def createClient(options: LogglyOptions): LogglyInstance = js.native
  
  @JSImport("loggly", "version")
  @js.native
  val version: Double = js.native
  
  @js.native
  trait LogglyInstance extends StObject {
    
    def log(message: js.Any): this.type = js.native
    def log(message: js.Any, callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]): this.type = js.native
    def log(
      message: js.Any,
      tags: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]
    ): this.type = js.native
    def log(message: js.Any, tags: js.Array[String]): this.type = js.native
    def log(
      message: js.Any,
      tags: js.Array[String],
      callback: js.Function2[/* err */ js.Any, /* results */ js.Any, Unit]
    ): this.type = js.native
    
    def search(options: SearchOptions): Search = js.native
    def search(
      options: SearchOptions,
      callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]
    ): Search = js.native
    def search(query: String): Search = js.native
    def search(query: String, callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): Search = js.native
  }
  
  @js.native
  trait LogglyOptions extends StObject {
    
    var auth: js.UndefOr[Password] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var json: js.UndefOr[Boolean] = js.native
    
    var subdomain: String = js.native
    
    var tags: js.UndefOr[js.Array[String]] = js.native
    
    var token: String = js.native
  }
  object LogglyOptions {
    
    @scala.inline
    def apply(subdomain: String, token: String): LogglyOptions = {
      val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogglyOptions]
    }
    
    @scala.inline
    implicit class LogglyOptionsMutableBuilder[Self <: LogglyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Search extends StObject {
    
    def run(callback: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit]): this.type = js.native
  }
  object Search {
    
    @scala.inline
    def apply(run: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => Search): Search = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
      __obj.asInstanceOf[Search]
    }
    
    @scala.inline
    implicit class SearchMutableBuilder[Self <: Search] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRun(value: js.Function2[/* err */ js.Any, /* results */ SearchResults, Unit] => Search): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.loggly.mod.SearchOptionsWithQ
    - typings.loggly.mod.SearchOptionsWithQuery
  */
  trait SearchOptions extends StObject
  object SearchOptions {
    
    @scala.inline
    def SearchOptionsWithQ(q: String): typings.loggly.mod.SearchOptionsWithQ = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loggly.mod.SearchOptionsWithQ]
    }
    
    @scala.inline
    def SearchOptionsWithQuery(query: String): typings.loggly.mod.SearchOptionsWithQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.loggly.mod.SearchOptionsWithQuery]
    }
  }
  
  @js.native
  trait SearchOptionsWithQ
    extends SharedSearchOptions
       with SearchOptions {
    
    var q: String = js.native
  }
  object SearchOptionsWithQ {
    
    @scala.inline
    def apply(q: String): SearchOptionsWithQ = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptionsWithQ]
    }
    
    @scala.inline
    implicit class SearchOptionsWithQMutableBuilder[Self <: SearchOptionsWithQ] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchOptionsWithQuery
    extends SharedSearchOptions
       with SearchOptions {
    
    var query: String = js.native
  }
  object SearchOptionsWithQuery {
    
    @scala.inline
    def apply(query: String): SearchOptionsWithQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchOptionsWithQuery]
    }
    
    @scala.inline
    implicit class SearchOptionsWithQueryMutableBuilder[Self <: SearchOptionsWithQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResults extends StObject {
    
    var events: js.Array[SearchResultsEvent] = js.native
    
    var page: Double = js.native
    
    var total_events: Double = js.native
  }
  object SearchResults {
    
    @scala.inline
    def apply(events: js.Array[SearchResultsEvent], page: Double, total_events: Double): SearchResults = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], total_events = total_events.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchResults]
    }
    
    @scala.inline
    implicit class SearchResultsMutableBuilder[Self <: SearchResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvents(value: js.Array[SearchResultsEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: SearchResultsEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal_events(value: Double): Self = StObject.set(x, "total_events", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SearchResultsEvent extends StObject {
    
    var event: js.Any = js.native
    
    var id: String = js.native
    
    var logmsg: String = js.native
    
    var logtypes: js.Array[String] = js.native
    
    var raw: String = js.native
    
    var tags: js.Array[String] = js.native
    
    var timestamp: Double = js.native
  }
  object SearchResultsEvent {
    
    @scala.inline
    def apply(
      event: js.Any,
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
    implicit class SearchResultsEventMutableBuilder[Self <: SearchResultsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogmsg(value: String): Self = StObject.set(x, "logmsg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogtypes(value: js.Array[String]): Self = StObject.set(x, "logtypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogtypesVarargs(value: String*): Self = StObject.set(x, "logtypes", js.Array(value :_*))
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SharedSearchOptions extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var until: js.UndefOr[String] = js.native
  }
  object SharedSearchOptions {
    
    @scala.inline
    def apply(): SharedSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedSearchOptions]
    }
    
    @scala.inline
    implicit class SharedSearchOptionsMutableBuilder[Self <: SharedSearchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUntil(value: String): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
    }
  }
}
