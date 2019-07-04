package typings
package koaDashGraphqlLib.koaDashGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsData extends js.Object {
  /**
    * A value to pass as the context to this middleware.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * An optional function for adding additional metadata to the GraphQL response
    * as a key-value object. The result will be added to "extensions" field in
    * the resulting JSON. This is often a useful place to add development time
    * info such as the runtime of a query or the amount of resources consumed.
    *
    * Information about the request is provided to be used.
    *
    * This function may be async.
    */
  var extensions: js.UndefOr[
    js.Function1[
      /* info */ expressDashGraphqlLib.expressDashGraphqlMod.RequestInfo, 
      org.scalablytyped.runtime.StringDictionary[_]
    ]
  ] = js.undefined
  /**
    * A resolver function to use when one is not provided by the schema.
    * If not provided, the default field resolver is used (which looks for a
    * value or method on the source value with the field's name).
    */
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * An optional function which will be used to format any errors produced by
    * fulfilling a GraphQL operation. If no function is provided, GraphQL's
    * default spec-compliant `formatError` function will be used.
    */
  var formatError: js.UndefOr[
    js.Function2[/* error */ graphqlLib.graphqlMod.GraphQLError, /* context */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /**
    * A boolean to optionally enable GraphiQL mode.
    */
  var graphiql: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean to configure whether the output should be pretty-printed.
    */
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object to pass as the rootvalue to the graphql() function.
    */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /**
    * A GraphQL schema from graphql-js.
    */
  var schema: graphqlLib.graphqlMod.GraphQLSchema
  /**
    * An optional array of validation rules that will be applied on the document
    * in addition to those defined by the GraphQL spec.
    */
  var validationRules: js.UndefOr[
    js.Array[
      js.Function1[
        /* arg0 */ graphqlLib.graphqlMod.ValidationContext, 
        graphqlLib.languageVisitorMod.ASTVisitor
      ]
    ]
  ] = js.undefined
}

object OptionsData {
  @scala.inline
  def apply(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    context: js.Any = null,
    extensions: /* info */ expressDashGraphqlLib.expressDashGraphqlMod.RequestInfo => org.scalablytyped.runtime.StringDictionary[_] = null,
    fieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]] = null,
    formatError: (/* error */ graphqlLib.graphqlMod.GraphQLError, /* context */ js.UndefOr[js.Any]) => _ = null,
    graphiql: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rootValue: js.Any = null,
    validationRules: js.Array[
      js.Function1[
        /* arg0 */ graphqlLib.graphqlMod.ValidationContext, 
        graphqlLib.languageVisitorMod.ASTVisitor
      ]
    ] = null
  ): OptionsData = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extensions != null) __obj.updateDynamic("extensions")(js.Any.fromFunction1(extensions))
    if (fieldResolver != null) __obj.updateDynamic("fieldResolver")(fieldResolver)
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction2(formatError))
    if (!js.isUndefined(graphiql)) __obj.updateDynamic("graphiql")(graphiql)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue)
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[OptionsData]
  }
}

