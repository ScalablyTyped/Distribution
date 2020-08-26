package typings.graphqlToolsUrlLoader

import org.scalablytyped.runtime.Instantiable1
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.AsyncExecutor
import typings.graphqlToolsDelegate.typesMod.ExecutionParams
import typings.graphqlToolsDelegate.typesMod.Subscriber
import typings.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.GET
import typings.graphqlToolsUrlLoader.graphqlToolsUrlLoaderStrings.POST
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.std.AsyncIterator
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.websocket.mod.w3cwebsocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait DefaultMethod extends js.Object {
    var defaultMethod: GET | POST = js.native
    var extraHeaders: js.Any = js.native
    @JSName("fetch")
    var fetch_Original: FnCall = js.native
    var pointer: String = js.native
    var useGETForQueries: Boolean = js.native
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait Executor extends js.Object {
    @JSName("executor")
    var executor_Original: AsyncExecutor = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber = js.native
    def executor[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[ExecutionResult[TReturn]] = js.native
    def subscriber[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[
        (AsyncIterator[ExecutionResult[TReturn], _, js.UndefOr[scala.Nothing]]) | ExecutionResult[TReturn]
      ] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait Schema extends js.Object {
    @JSName("executor")
    var executor_Original: AsyncExecutor = js.native
    var schema: GraphQLSchema = js.native
    @JSName("subscriber")
    var subscriber_Original: Subscriber = js.native
    def executor[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[ExecutionResult[TReturn]] = js.native
    def subscriber[TReturn, TArgs, TContext](params: ExecutionParams[TArgs, TContext]): js.Promise[
        (AsyncIterator[ExecutionResult[TReturn], _, js.UndefOr[scala.Nothing]]) | ExecutionResult[TReturn]
      ] = js.native
  }
  
  @js.native
  trait Typeofw3cwebsocket extends Instantiable1[/* url */ String, w3cwebsocket] {
    var CLOSED: Double = js.native
    var CLOSING: Double = js.native
    var CONNECTING: Double = js.native
    var OPEN: Double = js.native
  }
  
}

