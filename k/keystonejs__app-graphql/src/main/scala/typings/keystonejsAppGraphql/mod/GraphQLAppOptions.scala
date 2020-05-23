package typings.keystonejsAppGraphql.mod

import typings.keystonejsAppGraphql.anon.Introspection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLAppOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.undefined
  var apollo: js.UndefOr[Introspection] = js.undefined
  var graphiqlPath: js.UndefOr[String] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object GraphQLAppOptions {
  @scala.inline
  def apply(
    apiPath: String = null,
    apollo: Introspection = null,
    graphiqlPath: String = null,
    schemaName: String = null
  ): GraphQLAppOptions = {
    val __obj = js.Dynamic.literal()
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath.asInstanceOf[js.Any])
    if (apollo != null) __obj.updateDynamic("apollo")(apollo.asInstanceOf[js.Any])
    if (graphiqlPath != null) __obj.updateDynamic("graphiqlPath")(graphiqlPath.asInstanceOf[js.Any])
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLAppOptions]
  }
}

