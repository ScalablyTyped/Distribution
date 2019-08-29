package typings.graphqlDashTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMakeRemoteExecutableSchemaMod {
  import typings.graphql.executionExecuteMod.ExecutionResult
  import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.std.AsyncIterator

  type Fetcher = js.Function1[
    /* operation */ FetcherOperation, 
    js.Promise[ExecutionResult[ExecutionResultDataDefault]]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[GraphQLResolveInfo], 
    AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}
