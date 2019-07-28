package typings.graphqlDashExtensions.graphqlDashExtensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashExtensions.Anon_Context
import typings.graphqlDashExtensions.Anon_ContextGraphqlResponse
import typings.graphqlDashExtensions.Anon_ExecutionArgs
import typings.graphqlDashExtensions.Anon_QueryString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", "GraphQLExtension")
@js.native
class GraphQLExtension[TContext] () extends js.Object {
  var didEncounterErrors: js.UndefOr[js.Function1[/* errors */ js.Array[GraphQLError], Unit]] = js.native
  var executionDidStart: js.UndefOr[js.Function1[/* o */ Anon_ExecutionArgs, EndHandler | Unit]] = js.native
  var format: js.UndefOr[js.Function0[js.UndefOr[js.Tuple2[String, _]]]] = js.native
  var parsingDidStart: js.UndefOr[js.Function1[/* o */ Anon_QueryString, EndHandler | Unit]] = js.native
  var requestDidStart: js.UndefOr[js.Function1[/* o */ Anon_Context[TContext], EndHandler | Unit]] = js.native
  var validationDidStart: js.UndefOr[js.Function0[EndHandler | Unit]] = js.native
  var willResolveField: js.UndefOr[
    js.Function4[
      /* source */ js.Any, 
      /* args */ StringDictionary[js.Any], 
      /* context */ TContext, 
      /* info */ GraphQLResolveInfo, 
      (js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[_], Unit]) | Unit
    ]
  ] = js.native
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* o */ Anon_ContextGraphqlResponse[TContext], 
      Unit | Anon_ContextGraphqlResponse[TContext]
    ]
  ] = js.native
}

