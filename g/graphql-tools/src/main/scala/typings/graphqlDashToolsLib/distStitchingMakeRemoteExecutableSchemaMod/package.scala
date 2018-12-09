package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distStitchingMakeRemoteExecutableSchemaMod {
  type Fetcher = js.Function1[
    /* operation */ FetcherOperation, 
    js.Promise[
      graphqlLib.executionExecuteMod.ExecutionResult[graphqlLib.executionExecuteMod.ExecutionResultDataDefault]
    ]
  ]
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLResolveInfo], 
    stdLib.AsyncIterator[js.Any]
  ]
}
