package typings
package graphqlDashExtensionsLib.graphqlDashExtensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", "GraphQLExtension")
@js.native
class GraphQLExtension[TContext] () extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[/* errors */ js.Array[graphqlLib.graphqlMod.GraphQLError], scala.Unit]
  ] = js.native
  var didResolveOperation: js.UndefOr[
    js.Function1[/* o */ graphqlDashExtensionsLib.Anon_RequestContext[TContext], scala.Unit]
  ] = js.native
  var executionDidStart: js.UndefOr[
    js.Function1[/* o */ graphqlDashExtensionsLib.Anon_ExecutionArgs, EndHandler | scala.Unit]
  ] = js.native
  var format: js.UndefOr[js.Function0[js.UndefOr[js.Tuple2[java.lang.String, _]]]] = js.native
  var parsingDidStart: js.UndefOr[
    js.Function1[/* o */ graphqlDashExtensionsLib.Anon_QueryString, EndHandler | scala.Unit]
  ] = js.native
  var requestDidStart: js.UndefOr[
    js.Function1[/* o */ graphqlDashExtensionsLib.Anon_Context[TContext], EndHandler | scala.Unit]
  ] = js.native
  var validationDidStart: js.UndefOr[js.Function0[EndHandler | scala.Unit]] = js.native
  var willResolveField: js.UndefOr[
    js.Function4[
      /* source */ js.Any, 
      /* args */ org.scalablytyped.runtime.StringDictionary[js.Any], 
      /* context */ TContext, 
      /* info */ graphqlLib.typeDefinitionMod.GraphQLResolveInfo, 
      (js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ js.UndefOr[_], scala.Unit]) | scala.Unit
    ]
  ] = js.native
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* o */ graphqlDashExtensionsLib.Anon_ContextGraphqlResponse[TContext], 
      scala.Unit | graphqlDashExtensionsLib.Anon_ContextGraphqlResponse[TContext]
    ]
  ] = js.native
}

