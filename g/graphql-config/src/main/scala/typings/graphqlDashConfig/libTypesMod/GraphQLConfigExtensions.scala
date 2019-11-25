package typings.graphqlDashConfig.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphqlDashConfig.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigExtensions
  extends /* name */ StringDictionary[js.Any] {
  var endpoints: js.UndefOr[GraphQLConfigEnpointsData] = js.undefined
}

object GraphQLConfigExtensions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    endpoints: GraphQLConfigEnpointsData = null
  ): GraphQLConfigExtensions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLConfigExtensions]
  }
}

