package typings.graphql.subscribeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionArgs extends js.Object {
  var contextValue: js.UndefOr[js.Any] = js.undefined
  var document: DocumentNode
  var fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var operationName: js.UndefOr[Maybe[String]] = js.undefined
  var rootValue: js.UndefOr[js.Any] = js.undefined
  var schema: GraphQLSchema
  var subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]] = js.undefined
  var variableValues: js.UndefOr[Maybe[Record[String, _]]] = js.undefined
}

object SubscriptionArgs {
  @scala.inline
  def apply(
    document: DocumentNode,
    schema: GraphQLSchema,
    contextValue: js.Any = null,
    fieldResolver: js.UndefOr[Null | ((_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any)] = js.undefined,
    operationName: js.UndefOr[Null | Maybe[String]] = js.undefined,
    rootValue: js.Any = null,
    subscribeFieldResolver: js.UndefOr[Null | ((_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any)] = js.undefined,
    variableValues: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined
  ): SubscriptionArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldResolver)) __obj.updateDynamic("fieldResolver")(if (fieldResolver != null) js.Any.fromFunction4(fieldResolver.asInstanceOf[(_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any]) else null)
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(subscribeFieldResolver)) __obj.updateDynamic("subscribeFieldResolver")(if (subscribeFieldResolver != null) js.Any.fromFunction4(subscribeFieldResolver.asInstanceOf[(_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any]) else null)
    if (!js.isUndefined(variableValues)) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionArgs]
  }
}

