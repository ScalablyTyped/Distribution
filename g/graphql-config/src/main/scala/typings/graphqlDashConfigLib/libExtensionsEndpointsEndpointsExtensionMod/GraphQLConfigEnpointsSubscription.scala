package typings
package graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigEnpointsSubscription extends js.Object {
  var connectionParams: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]] = js.undefined
  var url: java.lang.String
}

object GraphQLConfigEnpointsSubscription {
  @scala.inline
  def apply(
    url: java.lang.String,
    connectionParams: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null
  ): GraphQLConfigEnpointsSubscription = {
    val __obj = js.Dynamic.literal(url = url)
    if (connectionParams != null) __obj.updateDynamic("connectionParams")(connectionParams)
    __obj.asInstanceOf[GraphQLConfigEnpointsSubscription]
  }
}

