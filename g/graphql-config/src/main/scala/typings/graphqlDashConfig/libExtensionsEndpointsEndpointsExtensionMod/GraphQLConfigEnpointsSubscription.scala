package typings.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigEnpointsSubscription extends js.Object {
  var connectionParams: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var url: String
}

object GraphQLConfigEnpointsSubscription {
  @scala.inline
  def apply(url: String, connectionParams: StringDictionary[js.UndefOr[String]] = null): GraphQLConfigEnpointsSubscription = {
    val __obj = js.Dynamic.literal(url = url)
    if (connectionParams != null) __obj.updateDynamic("connectionParams")(connectionParams)
    __obj.asInstanceOf[GraphQLConfigEnpointsSubscription]
  }
}

