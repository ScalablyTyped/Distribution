package typings.graphqlRelay.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldConfig
import typings.graphql.definitionMod.GraphQLResolveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-relay", "globalIdField")
@js.native
object globalIdField extends js.Object {
  def apply(): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def apply(
    typeName: js.UndefOr[scala.Nothing],
    idFetcher: js.Function3[/* object */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo, String]
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def apply(typeName: String): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
  def apply(
    typeName: String,
    idFetcher: js.Function3[/* object */ js.Any, /* context */ js.Any, /* info */ GraphQLResolveInfo, String]
  ): GraphQLFieldConfig[_, _, StringDictionary[_]] = js.native
}

