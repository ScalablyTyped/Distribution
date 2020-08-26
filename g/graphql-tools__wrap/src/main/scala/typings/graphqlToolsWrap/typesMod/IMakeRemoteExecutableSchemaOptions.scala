package typings.graphqlToolsWrap.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.ExecutionParams
import typings.graphqlToolsDelegate.typesMod.Executor
import typings.graphqlToolsDelegate.typesMod.Subscriber
import typings.graphqlToolsUtils.interfacesMod.ExecutionResult
import typings.std.AsyncIterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMakeRemoteExecutableSchemaOptions extends js.Object {
  var buildSchemaOptions: js.UndefOr[BuildSchemaOptions] = js.native
  var createResolver: js.UndefOr[
    js.Function2[
      /* executor */ Executor, 
      /* subscriber */ Subscriber, 
      GraphQLFieldResolver[_, _, StringDictionary[_]]
    ]
  ] = js.native
  var executor: js.UndefOr[Executor] = js.native
  var schema: GraphQLSchema | String = js.native
  var subscriber: js.UndefOr[Subscriber] = js.native
}

object IMakeRemoteExecutableSchemaOptions {
  @scala.inline
  def apply(schema: GraphQLSchema | String): IMakeRemoteExecutableSchemaOptions = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMakeRemoteExecutableSchemaOptions]
  }
  @scala.inline
  implicit class IMakeRemoteExecutableSchemaOptionsOps[Self <: IMakeRemoteExecutableSchemaOptions] (val x: Self) extends AnyVal {
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
    def setSchema(value: GraphQLSchema | String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildSchemaOptions(value: BuildSchemaOptions): Self = this.set("buildSchemaOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildSchemaOptions: Self = this.set("buildSchemaOptions", js.undefined)
    @scala.inline
    def setCreateResolver(
      value: (/* executor */ Executor, /* subscriber */ Subscriber) => GraphQLFieldResolver[_, _, StringDictionary[_]]
    ): Self = this.set("createResolver", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreateResolver: Self = this.set("createResolver", js.undefined)
    @scala.inline
    def setExecutor(
      value: /* params */ ExecutionParams[Record[String, js.Any], Record[String, js.Any]] => (ExecutionResult[Record[String, js.Any]]) | (js.Promise[ExecutionResult[Record[String, js.Any]]])
    ): Self = this.set("executor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExecutor: Self = this.set("executor", js.undefined)
    @scala.inline
    def setSubscriber(
      value: /* params */ ExecutionParams[Record[String, js.Any], Record[String, js.Any]] => js.Promise[
          (AsyncIterator[ExecutionResult[Record[String, js.Any]], js.Any, js.UndefOr[scala.Nothing]]) | (ExecutionResult[Record[String, js.Any]])
        ]
    ): Self = this.set("subscriber", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSubscriber: Self = this.set("subscriber", js.undefined)
  }
  
}

