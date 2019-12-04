package typings.graphqlDashBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
  import typings.std.AsyncIterator

  type Args = StringDictionary[js.Any]
  type Context = StringDictionary[js.Any]
  type MutationMap = QueryMap
  type QueryMap = StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[StringDictionary[js.Any]], 
      /* info */ js.UndefOr[GraphQLResolveInfo | String], 
      /* context */ js.UndefOr[StringDictionary[js.Any]], 
      js.Promise[js.Any]
    ]
  ]
  type SubscriptionMap = StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[GraphQLResolveInfo | String], 
      /* context */ js.UndefOr[StringDictionary[js.Any]], 
      (AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
