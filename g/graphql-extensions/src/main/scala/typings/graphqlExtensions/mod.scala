package typings.graphqlExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLError
import typings.graphqlExtensions.anon.Context
import typings.graphqlExtensions.anon.ExecutionArgs
import typings.graphqlExtensions.anon.Extensions
import typings.graphqlExtensions.anon.GraphQLSchemaextensionsEn
import typings.graphqlExtensions.anon.GraphQLSchemaextensionsEnAstNode
import typings.graphqlExtensions.anon.GraphqlResponse
import typings.graphqlExtensions.anon.QueryString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class GraphQLExtension[TContext] () extends js.Object {
    var didEncounterErrors: js.UndefOr[js.Function1[/* errors */ js.Array[GraphQLError], Unit]] = js.native
    var executionDidStart: js.UndefOr[js.Function1[/* o */ ExecutionArgs, EndHandler | Unit]] = js.native
    var format: js.UndefOr[js.Function0[js.UndefOr[js.Tuple2[String, _]]]] = js.native
    var parsingDidStart: js.UndefOr[js.Function1[/* o */ QueryString, EndHandler | Unit]] = js.native
    var requestDidStart: js.UndefOr[js.Function1[/* o */ Context[TContext], EndHandler | Unit]] = js.native
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
        js.Function1[/* o */ GraphqlResponse[TContext], Unit | GraphqlResponse[TContext]]
      ] = js.native
  }
  
  @js.native
  class GraphQLExtensionStack[TContext] protected () extends js.Object {
    def this(extensions: js.Array[GraphQLExtension[TContext]]) = this()
    var extensions: js.Any = js.native
    var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.native
    var handleDidStart: js.Any = js.native
    def didEncounterErrors(errors: js.Array[GraphQLError]): Unit = js.native
    def executionDidStart(o: ExecutionArgs): EndHandler = js.native
    def format(): js.Object = js.native
    def parsingDidStart(o: QueryString): EndHandler = js.native
    def requestDidStart(o: Extensions[TContext]): EndHandler = js.native
    def validationDidStart(): EndHandler = js.native
    def willResolveField(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[js.Any], Unit] = js.native
    def willSendResponse(o: GraphqlResponse[TContext]): GraphqlResponse[TContext] = js.native
  }
  
  def enableGraphQLExtensions(schema: GraphQLSchemaextensionsEn): GraphQLSchemaextensionsEnAstNode = js.native
  type EndHandler = js.Function1[/* repeated */ Error, Unit]
  type FieldIteratorFn = js.Function3[
    /* fieldDef */ GraphQLField[js.Any, js.Any, StringDictionary[js.Any]], 
    /* typeName */ String, 
    /* fieldName */ String, 
    Unit
  ]
}

