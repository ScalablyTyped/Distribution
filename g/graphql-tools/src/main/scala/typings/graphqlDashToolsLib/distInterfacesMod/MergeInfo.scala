package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeInfo extends js.Object {
  var fragments: js.Array[graphqlDashToolsLib.Anon_Field] = js.native
  def delegateToSchema[TContext](options: IDelegateToSchemaOptions[TContext]): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.mutation,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.mutation,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.query,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.query,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.subscription,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: graphqlDashToolsLib.graphqlDashToolsLibStrings.subscription,
    fieldName: java.lang.String,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: org.scalablytyped.runtime.StringDictionary[js.Any],
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
}

