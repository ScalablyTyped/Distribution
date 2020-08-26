package typings.graphqlToolsDelegate.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.graphqlToolsUtils.interfacesMod.Transform
import typings.std.AsyncIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubschemaConfig extends js.Object {
  var createProxyingResolver: js.UndefOr[CreateProxyingResolverFn] = js.native
  var executor: js.UndefOr[Executor] = js.native
  var merge: js.UndefOr[Record[String, MergedTypeConfig]] = js.native
  var rootValue: js.UndefOr[Record[String, _]] = js.native
  var schema: GraphQLSchema = js.native
  var subscriber: js.UndefOr[Subscriber] = js.native
  var transforms: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}

object SubschemaConfig {
  @scala.inline
  def apply(schema: GraphQLSchema): SubschemaConfig = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubschemaConfig]
  }
  @scala.inline
  implicit class SubschemaConfigOps[Self <: SubschemaConfig] (val x: Self) extends AnyVal {
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
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateProxyingResolver(
      value: /* options */ ICreateProxyingResolverOptions => GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]]
    ): Self = this.set("createProxyingResolver", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateProxyingResolver: Self = this.set("createProxyingResolver", js.undefined)
    @scala.inline
    def setExecutor(
      value: /* params */ ExecutionParams[Record[String, js.Any], Record[String, js.Any]] => (ExecutionResult[Record[String, js.Any]]) | (js.Promise[ExecutionResult[Record[String, js.Any]]])
    ): Self = this.set("executor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    @scala.inline
    def setMerge(value: Record[String, MergedTypeConfig]): Self = this.set("merge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    @scala.inline
    def setRootValue(value: Record[String, _]): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setSubscriber(
      value: /* params */ ExecutionParams[Record[String, js.Any], Record[String, js.Any]] => js.Promise[
          (AsyncIterator[ExecutionResult[Record[String, js.Any]], js.Any, js.UndefOr[scala.Nothing]]) | (ExecutionResult[Record[String, js.Any]])
        ]
    ): Self = this.set("subscriber", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubscriber: Self = this.set("subscriber", js.undefined)
    @scala.inline
    def setTransformsVarargs(value: (Transform[Record[String, js.Any]])*): Self = this.set("transforms", js.Array(value :_*))
    @scala.inline
    def setTransforms(value: js.Array[Transform[Record[String, _]]]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
  
}

