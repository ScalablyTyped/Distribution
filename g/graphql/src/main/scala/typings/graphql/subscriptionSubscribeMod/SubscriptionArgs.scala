package typings.graphql.subscriptionSubscribeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeSchemaMod.GraphQLSchema
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
    fieldResolver: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null,
    operationName: Maybe[String] = null,
    rootValue: js.Any = null,
    subscribeFieldResolver: (_, StringDictionary[_], _, /* info */ GraphQLResolveInfo) => js.Any = null,
    variableValues: Maybe[Record[String, _]] = null
  ): SubscriptionArgs = {
    val __obj = js.Dynamic.literal(document = document, schema = schema)
    if (contextValue != null) __obj.updateDynamic("contextValue")(contextValue)
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(js.Any.fromFunction4(fieldResolver))
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (subscribeFieldResolver != null) __obj.updateDynamic("subscribeFieldResolver")(js.Any.fromFunction4(subscribeFieldResolver))
    if (variableValues != null) __obj.updateDynamic("variableValues")(variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionArgs]
  }
}

