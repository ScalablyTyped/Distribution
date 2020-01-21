package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object makeRemoteExecutableSchemaMod {
  type Fetcher = js.Function1[
    /* operation */ typings.graphqlTools.makeRemoteExecutableSchemaMod.FetcherOperation, 
    js.Promise[
      typings.graphql.executeMod.ExecutionResult[typings.graphql.executeMod.ExecutionResultDataDefault]
    ]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[typings.graphql.definitionMod.GraphQLResolveInfo], 
    typings.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}
