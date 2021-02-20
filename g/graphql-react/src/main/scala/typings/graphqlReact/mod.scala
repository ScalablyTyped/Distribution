package typings.graphqlReact

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlReact.anon.Cache
import typings.graphqlReact.anon.CacheKey
import typings.graphqlReact.anon.CacheValuePromise
import typings.graphqlReact.anon.ExceptCacheKey
import typings.graphqlReact.anon.FetchOptionsOverride
import typings.graphqlReact.anon.LoadOnMount
import typings.graphqlReact.anon.Locations
import typings.graphqlReact.anon.Query
import typings.graphqlReact.anon.Variables
import typings.graphqlReact.graphqlReactStrings.cache
import typings.graphqlReact.graphqlReactStrings.fetch
import typings.graphqlReact.graphqlReactStrings.reset
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.FormData
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphql-react", "GraphQL")
  @js.native
  class GraphQL () extends StObject {
    def this(options: Cache) = this()
    
    var cache: GraphQLCache = js.native
    
    @JSName("off")
    def off_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
    @JSName("off")
    def off_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
    @JSName("off")
    def off_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
    
    @JSName("on")
    def on_cache(`type`: cache, handler: js.Function1[/* event */ CacheKey, Unit]): Unit = js.native
    @JSName("on")
    def on_fetch(`type`: fetch, handler: js.Function1[/* event */ CacheValuePromise, Unit]): Unit = js.native
    @JSName("on")
    def on_reset(`type`: reset, handler: js.Function1[/* event */ ExceptCacheKey, Unit]): Unit = js.native
    
    def operate[T, V](options: FetchOptionsOverride[V]): GraphQLOperationLoading[T] = js.native
    
    def reset(): Unit = js.native
    def reset(exceptCacheKey: String): Unit = js.native
  }
  
  @JSImport("graphql-react", "GraphQLContext")
  @js.native
  val GraphQLContext: Context[GraphQL] = js.native
  
  @JSImport("graphql-react", "reportCacheErrors")
  @js.native
  def reportCacheErrors(event: js.Any): Unit = js.native
  
  @JSImport("graphql-react", "ssr")
  @js.native
  def ssr(grapphql: GraphQL, node: ReactNode): Unit = js.native
  @JSImport("graphql-react", "ssr")
  @js.native
  def ssr(grapphql: GraphQL, node: ReactNode, render: js.Function1[/* element */ ReactNode, String]): Unit = js.native
  
  @JSImport("graphql-react", "useGraphQL")
  @js.native
  def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = js.native
  
  type GraphQLCache = StringDictionary[GraphQLCacheValue[js.Any]]
  
  type GraphQLCacheKey = String
  
  @js.native
  trait GraphQLCacheValue[T] extends StObject {
    
    var data: T = js.native
    
    var fetchError: Null | String = js.native
    
    var graphQLErrors: Null | js.Array[Locations] = js.native
    
    var httpError: Null | HttpError = js.native
    
    var parseError: Null | String = js.native
  }
  object GraphQLCacheValue {
    
    @scala.inline
    def apply[T](data: T): GraphQLCacheValue[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLCacheValue[T]]
    }
    
    @scala.inline
    implicit class GraphQLCacheValueMutableBuilder[Self <: GraphQLCacheValue[_], T] (val x: Self with GraphQLCacheValue[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchError(value: String): Self = StObject.set(x, "fetchError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchErrorNull: Self = StObject.set(x, "fetchError", null)
      
      @scala.inline
      def setGraphQLErrors(value: js.Array[Locations]): Self = StObject.set(x, "graphQLErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphQLErrorsNull: Self = StObject.set(x, "graphQLErrors", null)
      
      @scala.inline
      def setGraphQLErrorsVarargs(value: Locations*): Self = StObject.set(x, "graphQLErrors", js.Array(value :_*))
      
      @scala.inline
      def setHttpError(value: HttpError): Self = StObject.set(x, "httpError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpErrorNull: Self = StObject.set(x, "httpError", null)
      
      @scala.inline
      def setParseError(value: String): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseErrorNull: Self = StObject.set(x, "parseError", null)
    }
  }
  
  @js.native
  trait GraphQLFetchOptions extends StObject {
    
    var body: String | FormData = js.native
    
    var credentials: Null | String = js.native
    
    var headers: Headers = js.native
    
    var url: String = js.native
  }
  object GraphQLFetchOptions {
    
    @scala.inline
    def apply(body: String | FormData, headers: Headers, url: String): GraphQLFetchOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLFetchOptions]
    }
    
    @scala.inline
    implicit class GraphQLFetchOptionsMutableBuilder[Self <: GraphQLFetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentials(value: String): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsNull: Self = StObject.set(x, "credentials", null)
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type GraphQLFetchOptionsOverride = js.Function1[/* options */ GraphQLFetchOptions, Unit]
  
  type GraphQLOperation[V] = Query with (Variables[V] | js.Object)
  
  @js.native
  trait GraphQLOperationLoading[T] extends StObject {
    
    var cacheKey: GraphQLCacheKey = js.native
    
    var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.native
    
    var cacheValuePromise: js.Promise[GraphQLCacheValue[T]] = js.native
  }
  object GraphQLOperationLoading {
    
    @scala.inline
    def apply[T](cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[T]]): GraphQLOperationLoading[T] = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLOperationLoading[T]]
    }
    
    @scala.inline
    implicit class GraphQLOperationLoadingMutableBuilder[Self <: GraphQLOperationLoading[_], T] (val x: Self with GraphQLOperationLoading[T]) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValue(value: GraphQLCacheValue[T]): Self = StObject.set(x, "cacheValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValuePromise(value: js.Promise[GraphQLCacheValue[T]]): Self = StObject.set(x, "cacheValuePromise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValueUndefined: Self = StObject.set(x, "cacheValue", js.undefined)
    }
  }
  
  @js.native
  trait GraphQLOperationStatus[T] extends StObject {
    
    var cacheKey: GraphQLCacheKey = js.native
    
    var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.native
    
    def load(): Unit = js.native
    
    var loading: Boolean = js.native
  }
  object GraphQLOperationStatus {
    
    @scala.inline
    def apply[T](cacheKey: GraphQLCacheKey, load: () => Unit, loading: Boolean): GraphQLOperationStatus[T] = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLOperationStatus[T]]
    }
    
    @scala.inline
    implicit class GraphQLOperationStatusMutableBuilder[Self <: GraphQLOperationStatus[_], T] (val x: Self with GraphQLOperationStatus[T]) extends AnyVal {
      
      @scala.inline
      def setCacheKey(value: GraphQLCacheKey): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValue(value: GraphQLCacheValue[T]): Self = StObject.set(x, "cacheValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheValueUndefined: Self = StObject.set(x, "cacheValue", js.undefined)
      
      @scala.inline
      def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpError extends StObject {
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  object HttpError {
    
    @scala.inline
    def apply(status: Double, statusText: String): HttpError = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpError]
    }
    
    @scala.inline
    implicit class HttpErrorMutableBuilder[Self <: HttpError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
