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

trait ExecutionArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var document: DocumentNode
  var fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var operationName: js.UndefOr[Maybe[String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: GraphQLSchema
  var typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]] = js.undefined
  var variableValues: js.UndefOr[Maybe[StringDictionary[_]]] = js.undefined
}

object ExecutionArgs {
  @scala.inline
  def apply(
    document: DocumentNode,
    schema: GraphQLSchema,
    contextValue: js.Any = null,
    fieldResolver: js.UndefOr[Null | ((_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any)] = js.undefined,
    operationName: js.UndefOr[Null | Maybe[String]] = js.undefined,
    rootValue: js.Any = null,
    typeResolver: js.UndefOr[
      Null | ((_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]])
    ] = js.undefined,
    variableValues: js.UndefOr[Null | Maybe[StringDictionary[_]]] = js.undefined
  ): ExecutionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldResolver)) __obj.updateDynamic("fieldResolver")(if (fieldResolver != null) js.Any.fromFunction4(fieldResolver.asInstanceOf[(_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any]) else null)
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(typeResolver)) __obj.updateDynamic("typeResolver")(if (typeResolver != null) js.Any.fromFunction4(typeResolver.asInstanceOf[(_, _, /* info */ GraphQLResolveInfo, /* abstractType */ GraphQLAbstractType) => PromiseOrValue[Maybe[(GraphQLObjectType[_, _, StringDictionary[_]]) | String]]]) else null)
    if (!js.isUndefined(variableValues)) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionArgs]
  }
}

