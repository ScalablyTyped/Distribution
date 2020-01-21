package typings.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  type MutationMap = typings.graphqlBinding.distTypesMod.QueryMap
  type QueryMap = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      /* info */ js.UndefOr[typings.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      /* context */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      js.Promise[js.Any]
    ]
  ]
  type SubscriptionMap = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[typings.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      /* context */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      (typings.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[typings.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
