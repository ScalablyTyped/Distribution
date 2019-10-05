package typings.graphqlDashExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.EndHandler
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", JSImport.Namespace)
@js.native
object graphqlDashExtensionsMod extends js.Object {
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
  
  @js.native
  class GraphQLExtensionStack[TContext] protected () extends js.Object {
    def this(extensions: js.Array[GraphQLExtension[TContext]]) = this()
    var extensions: js.Any = js.native
    var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.native
    var handleDidStart: js.Any = js.native
    def didEncounterErrors(errors: js.Array[GraphQLError]): Unit = js.native
    def executionDidStart(o: Anon_ExecutionArgs): EndHandler = js.native
    def format(): js.Object = js.native
    def parsingDidStart(o: Anon_QueryString): EndHandler = js.native
    def requestDidStart(o: Anon_ContextExtensions[TContext]): EndHandler = js.native
    def validationDidStart(): EndHandler = js.native
    def willResolveField(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[js.Any], Unit] = js.native
    def willSendResponse(o: Anon_ContextGraphqlResponse[TContext]): Anon_ContextGraphqlResponse[TContext] = js.native
  }
  
  def enableGraphQLExtensions(schema: GraphQLSchema with Anon_ExtensionsEnabled): GraphQLSchema with Anon_ExtensionsEnabledBoolean = js.native
  type EndHandler = js.Function1[/* repeated */ Error, Unit]
  type FieldIteratorFn = js.Function3[
    /* fieldDef */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    /* typeName */ String, 
    /* fieldName */ String, 
    Unit
  ]
}

