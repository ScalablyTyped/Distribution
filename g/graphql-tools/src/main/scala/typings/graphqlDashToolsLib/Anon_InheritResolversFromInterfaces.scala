package typings
package graphqlDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InheritResolversFromInterfaces extends js.Object {
  var inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined
  var onTypeConflict: js.UndefOr[graphqlDashToolsLib.distStitchingMergeSchemasMod.OnTypeConflict] = js.undefined
  var resolvers: js.UndefOr[graphqlDashToolsLib.distInterfacesMod.IResolversParameter] = js.undefined
  var schemaDirectives: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Anon_Config]] = js.undefined
  var schemas: js.Array[
    java.lang.String | graphqlLib.graphqlMod.GraphQLSchema | graphqlLib.languageAstMod.DocumentNode | js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]
  ]
}

object Anon_InheritResolversFromInterfaces {
  @scala.inline
  def apply(
    schemas: js.Array[
      java.lang.String | graphqlLib.graphqlMod.GraphQLSchema | graphqlLib.languageAstMod.DocumentNode | js.Array[graphqlLib.typeDefinitionMod.GraphQLNamedType]
    ],
    inheritResolversFromInterfaces: js.UndefOr[scala.Boolean] = js.undefined,
    onTypeConflict: graphqlDashToolsLib.distStitchingMergeSchemasMod.OnTypeConflict = null,
    resolvers: graphqlDashToolsLib.distInterfacesMod.IResolversParameter = null,
    schemaDirectives: org.scalablytyped.runtime.StringDictionary[Anon_Config] = null
  ): Anon_InheritResolversFromInterfaces = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("schemas")(schemas)
    if (!js.isUndefined(inheritResolversFromInterfaces)) __obj.updateDynamic("inheritResolversFromInterfaces")(inheritResolversFromInterfaces)
    if (onTypeConflict != null) __obj.updateDynamic("onTypeConflict")(onTypeConflict)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (schemaDirectives != null) __obj.updateDynamic("schemaDirectives")(schemaDirectives)
    __obj.asInstanceOf[Anon_InheritResolversFromInterfaces]
  }
}

