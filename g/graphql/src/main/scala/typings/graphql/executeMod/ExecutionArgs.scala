package typings.graphql.executeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.native
  var document: DocumentNode = js.native
  var fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.native
  var operationName: js.UndefOr[Maybe[String]] = js.native
  var rootValue: js.UndefOr[js.Any] = js.native
  var schema: GraphQLSchema = js.native
  var typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]] = js.native
  var variableValues: js.UndefOr[Maybe[StringDictionary[_]]] = js.native
}

object ExecutionArgs {
  @scala.inline
  def apply(document: DocumentNode, schema: GraphQLSchema): ExecutionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
  @scala.inline
  implicit class ExecutionArgsOps[Self <: ExecutionArgs] (val x: Self) extends AnyVal {
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
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextValue(value: js.Any): Self = this.set("contextValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextValue: Self = this.set("contextValue", js.undefined)
    @scala.inline
    def setFieldResolver(value: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any): Self = this.set("fieldResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteFieldResolver: Self = this.set("fieldResolver", js.undefined)
    @scala.inline
    def setFieldResolverNull: Self = this.set("fieldResolver", null)
    @scala.inline
    def setOperationName(value: Maybe[String]): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootValue: Self = this.set("rootValue", js.undefined)
    @scala.inline
    def setTypeResolver(
      value: (_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _]) | String]]
    ): Self = this.set("typeResolver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTypeResolver: Self = this.set("typeResolver", js.undefined)
    @scala.inline
    def setTypeResolverNull: Self = this.set("typeResolver", null)
    @scala.inline
    def setVariableValues(value: Maybe[StringDictionary[_]]): Self = this.set("variableValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableValues: Self = this.set("variableValues", js.undefined)
    @scala.inline
    def setVariableValuesNull: Self = this.set("variableValues", null)
  }
  
}

