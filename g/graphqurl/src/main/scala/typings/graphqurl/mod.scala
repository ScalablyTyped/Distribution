package typings.graphqurl

import typings.graphqurl.anon.Endpoint
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graphqurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClient(options: Options): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[Client]
  
  @js.native
  trait Client extends StObject {
    
    def query(queryOptions: QueryOptions): js.Promise[Response] = js.native
    def query(queryOptions: QueryOptions, successCallback: js.Function1[/* response */ Response, Unit]): js.Promise[Response] = js.native
    def query(
      queryOptions: QueryOptions,
      successCallback: js.Function1[/* response */ Response, Unit],
      errorCallback: js.Function1[/* error */ Any, Unit]
    ): js.Promise[Response] = js.native
    def query(
      queryOptions: QueryOptions,
      successCallback: Unit,
      errorCallback: js.Function1[/* error */ Any, Unit]
    ): js.Promise[Response] = js.native
    
    def subscribe(subscriptionOptions: SubscriptionOptions): Disposer = js.native
    def subscribe(
      subscriptionOptions: SubscriptionOptions,
      eventCallback: js.Function1[/* response */ Response, Unit]
    ): Disposer = js.native
    def subscribe(
      subscriptionOptions: SubscriptionOptions,
      eventCallback: js.Function1[/* response */ Response, Unit],
      errorCallback: js.Function1[/* error */ Any, Unit]
    ): Disposer = js.native
    def subscribe(
      subscriptionOptions: SubscriptionOptions,
      eventCallback: Unit,
      errorCallback: js.Function1[/* error */ Any, Unit]
    ): Disposer = js.native
  }
  
  type Disposer = js.Function0[Unit]
  
  trait Options extends StObject {
    
    /**
      * GraphQL endpoint
      */
    var endpoint: String
    
    /**
      * Request header, defaults to {}. These headers will be added along with
      * all the GraphQL queries, mutations and subscriptions made through the
      * client.
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Options for configuring subscriptions over websocket. Subscriptions are
      * not supported if this field is empty.
      */
    var websocket: js.UndefOr[Endpoint] = js.undefined
  }
  object Options {
    
    inline def apply(endpoint: String): Options = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setWebsocket(value: Endpoint): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
  
  trait QueryOptions extends StObject {
    
    /**
      * Header overrides. If you wish to make a GraphQL query while adding to or
      * overriding the headers provided during initalisations, you can pass the
      * headers here.
      */
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * The GraphQL query or mutation to be executed over HTTP
      */
    var query: String
    
    /**
      * GraphQL query variables. Defaults to {}
      */
    var variables: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object QueryOptions {
    
    inline def apply(query: String): QueryOptions = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Record[String, Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait Response extends StObject {
    
    var data: Any
    
    var loading: Boolean
    
    var networkStatus: Double
    
    var stale: Boolean
  }
  object Response {
    
    inline def apply(data: Any, loading: Boolean, networkStatus: Double, stale: Boolean): Response = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], networkStatus = networkStatus.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setNetworkStatus(value: Double): Self = StObject.set(x, "networkStatus", value.asInstanceOf[js.Any])
      
      inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionOptions extends StObject {
    
    /**
      * Callback function called when the GraphQL subscription is declared as
      * complete by the server and no more events will be received
      */
    var onGraphQLComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * You can optionally pass this function as an event callback
      */
    var onGraphQLData: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.undefined
    
    /**
      * You can optionally pass this function as an error callback
      */
    var onGraphQLError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    /**
      * The GraphQL subscription to be started over WebSocket
      */
    var subscription: String
    
    /**
      * GraphQL query variables. Defaults to {}
      */
    var variables: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object SubscriptionOptions {
    
    inline def apply(subscription: String): SubscriptionOptions = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      inline def setOnGraphQLComplete(value: () => Unit): Self = StObject.set(x, "onGraphQLComplete", js.Any.fromFunction0(value))
      
      inline def setOnGraphQLCompleteUndefined: Self = StObject.set(x, "onGraphQLComplete", js.undefined)
      
      inline def setOnGraphQLData(value: /* response */ Response => Unit): Self = StObject.set(x, "onGraphQLData", js.Any.fromFunction1(value))
      
      inline def setOnGraphQLDataUndefined: Self = StObject.set(x, "onGraphQLData", js.undefined)
      
      inline def setOnGraphQLError(value: /* error */ Any => Unit): Self = StObject.set(x, "onGraphQLError", js.Any.fromFunction1(value))
      
      inline def setOnGraphQLErrorUndefined: Self = StObject.set(x, "onGraphQLError", js.undefined)
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: Record[String, Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
}
