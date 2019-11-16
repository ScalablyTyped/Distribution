package typings.atKeystonejsAppDashGraphql.atKeystonejsAppDashGraphqlMod

import typings.atKeystonejsAppDashGraphql.Anon_ValidationRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLAppOptions extends js.Object {
  var apiPath: js.UndefOr[String] = js.undefined
  var apollo: js.UndefOr[Anon_ValidationRules] = js.undefined
  var graphiqlPath: js.UndefOr[String] = js.undefined
  var schemaName: js.UndefOr[String] = js.undefined
}

object GraphQLAppOptions {
  @scala.inline
  def apply(
    apiPath: String = null,
    apollo: Anon_ValidationRules = null,
    graphiqlPath: String = null,
    schemaName: String = null
  ): GraphQLAppOptions = {
    val __obj = js.Dynamic.literal()
    if (apiPath != null) __obj.updateDynamic("apiPath")(apiPath)
    if (apollo != null) __obj.updateDynamic("apollo")(apollo)
    if (graphiqlPath != null) __obj.updateDynamic("graphiqlPath")(graphiqlPath)
    if (schemaName != null) __obj.updateDynamic("schemaName")(schemaName)
    __obj.asInstanceOf[GraphQLAppOptions]
  }
}

