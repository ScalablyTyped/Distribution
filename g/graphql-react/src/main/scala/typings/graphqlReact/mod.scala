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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphql-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  @scala.inline
  def reportCacheErrors(event: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reportCacheErrors")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def ssr(grapphql: GraphQL, node: ReactNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(grapphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ssr(grapphql: GraphQL, node: ReactNode, render: js.Function1[/* element */ ReactNode, String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ssr")(grapphql.asInstanceOf[js.Any], node.asInstanceOf[js.Any], render.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def useGraphQL[T, V](options: LoadOnMount[V]): GraphQLOperationStatus[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraphQL")(options.asInstanceOf[js.Any]).asInstanceOf[GraphQLOperationStatus[T]]
  
  type GraphQLCache = StringDictionary[GraphQLCacheValue[js.Any]]
  
  type GraphQLCacheKey = String
  
  trait GraphQLCacheValue[T] extends StObject {
    
    var data: T
    
    var fetchError: Null | String
    
    var graphQLErrors: Null | js.Array[Locations]
    
    var httpError: Null | HttpError
    
    var parseError: Null | String
  }
  object GraphQLCacheValue {
    
    @scala.inline
    def apply[T](data: T): GraphQLCacheValue[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fetchError = null, graphQLErrors = null, httpError = null, parseError = null)
      __obj.asInstanceOf[GraphQLCacheValue[T]]
    }
    
    @scala.inline
    implicit class GraphQLCacheValueMutableBuilder[Self <: GraphQLCacheValue[?], T] (val x: Self & GraphQLCacheValue[T]) extends AnyVal {
      
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
  
  trait GraphQLFetchOptions extends StObject {
    
    var body: String | FormData
    
    var credentials: Null | String
    
    var headers: Headers
    
    var url: String
  }
  object GraphQLFetchOptions {
    
    @scala.inline
    def apply(body: String | FormData, headers: Headers, url: String): GraphQLFetchOptions = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], credentials = null)
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
  
  type GraphQLOperation[V] = Query & (Variables[V] | js.Object)
  
  trait GraphQLOperationLoading[T] extends StObject {
    
    var cacheKey: GraphQLCacheKey
    
    var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.undefined
    
    var cacheValuePromise: js.Promise[GraphQLCacheValue[T]]
  }
  object GraphQLOperationLoading {
    
    @scala.inline
    def apply[T](cacheKey: GraphQLCacheKey, cacheValuePromise: js.Promise[GraphQLCacheValue[T]]): GraphQLOperationLoading[T] = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], cacheValuePromise = cacheValuePromise.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLOperationLoading[T]]
    }
    
    @scala.inline
    implicit class GraphQLOperationLoadingMutableBuilder[Self <: GraphQLOperationLoading[?], T] (val x: Self & GraphQLOperationLoading[T]) extends AnyVal {
      
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
  
  trait GraphQLOperationStatus[T] extends StObject {
    
    var cacheKey: GraphQLCacheKey
    
    var cacheValue: js.UndefOr[GraphQLCacheValue[T]] = js.undefined
    
    def load(): Unit
    
    var loading: Boolean
  }
  object GraphQLOperationStatus {
    
    @scala.inline
    def apply[T](cacheKey: GraphQLCacheKey, load: () => Unit, loading: Boolean): GraphQLOperationStatus[T] = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLOperationStatus[T]]
    }
    
    @scala.inline
    implicit class GraphQLOperationStatusMutableBuilder[Self <: GraphQLOperationStatus[?], T] (val x: Self & GraphQLOperationStatus[T]) extends AnyVal {
      
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
  
  trait HttpError extends StObject {
    
    var status: Double
    
    var statusText: String
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
