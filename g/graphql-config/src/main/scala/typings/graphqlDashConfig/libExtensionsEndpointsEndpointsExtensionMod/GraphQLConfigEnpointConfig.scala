package typings.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigEnpointConfig extends js.Object {
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var subscription: js.UndefOr[GraphQLConfigEnpointsSubscription] = js.undefined
  var url: String
}

object GraphQLConfigEnpointConfig {
  @scala.inline
  def apply(
    url: String,
    headers: StringDictionary[String] = null,
    subscription: GraphQLConfigEnpointsSubscription = null
  ): GraphQLConfigEnpointConfig = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[GraphQLConfigEnpointConfig]
  }
}

