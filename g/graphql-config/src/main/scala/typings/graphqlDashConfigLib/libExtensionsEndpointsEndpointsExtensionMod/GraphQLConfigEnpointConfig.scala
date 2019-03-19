package typings
package graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigEnpointConfig extends js.Object {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var subscription: js.UndefOr[GraphQLConfigEnpointsSubscription] = js.undefined
  var url: java.lang.String
}

object GraphQLConfigEnpointConfig {
  @scala.inline
  def apply(
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    subscription: GraphQLConfigEnpointsSubscription = null
  ): GraphQLConfigEnpointConfig = {
    val __obj = js.Dynamic.literal(url = url)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[GraphQLConfigEnpointConfig]
  }
}

