package typings.graphqlDashTools

import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.executionExecuteMod.ExecutionResultDataDefault
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMakeRemoteExecutableSchemaMod {
  type Fetcher = js.Function1[
    /* operation */ FetcherOperation, 
    js.Promise[ExecutionResult[ExecutionResultDataDefault]]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[GraphQLResolveInfo], 
    AsyncIterator[js.Any]
  ]
}
