package typings.graphqlExtensions.anon

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context[TContext] extends js.Object {
  var context: TContext = js.native
  var operationName: js.UndefOr[String] = js.native
  var parsedQuery: js.UndefOr[DocumentNode] = js.native
  var persistedQueryHit: js.UndefOr[Boolean] = js.native
  var persistedQueryRegister: js.UndefOr[Boolean] = js.native
  var queryString: js.UndefOr[String] = js.native
  var request: PickRequesturlmethodheade = js.native
  var requestContext: GraphQLRequestContext[TContext] = js.native
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: PickRequesturlmethodheade,
    requestContext: GraphQLRequestContext[TContext]
  ): Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[TContext]]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context[_], TContext] (val x: Self with Context[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: PickRequesturlmethodheade): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestContext(value: GraphQLRequestContext[TContext]): Self = this.set("requestContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setParsedQuery(value: DocumentNode): Self = this.set("parsedQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsedQuery: Self = this.set("parsedQuery", js.undefined)
    @scala.inline
    def setPersistedQueryHit(value: Boolean): Self = this.set("persistedQueryHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryHit: Self = this.set("persistedQueryHit", js.undefined)
    @scala.inline
    def setPersistedQueryRegister(value: Boolean): Self = this.set("persistedQueryRegister", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryRegister: Self = this.set("persistedQueryRegister", js.undefined)
    @scala.inline
    def setQueryString(value: String): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

