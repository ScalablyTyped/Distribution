package typings.graphqlDashTools.distInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashTools.Anon_Field
import typings.graphqlDashTools.graphqlDashToolsStrings.mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.query
import typings.graphqlDashTools.graphqlDashToolsStrings.subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeInfo extends js.Object {
  var fragments: js.Array[Anon_Field] = js.native
  def delegateToSchema[TContext](options: IDelegateToSchemaOptions[TContext]): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: mutation,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_mutation(
    `type`: mutation,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: query,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_query(
    `type`: query,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: subscription,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo
  ): js.Any = js.native
  @JSName("delegate")
  def delegate_subscription(
    `type`: subscription,
    fieldName: String,
    args: StringDictionary[js.Any],
    context: StringDictionary[js.Any],
    info: GraphQLResolveInfo,
    transforms: js.Array[Transform]
  ): js.Any = js.native
}

