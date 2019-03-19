package typings
package graphqlDashConfigLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLConfigExtensions
  extends /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var endpoints: js.UndefOr[
    graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointsData
  ] = js.undefined
}

object GraphQLConfigExtensions {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    endpoints: graphqlDashConfigLib.libExtensionsEndpointsEndpointsExtensionMod.GraphQLConfigEnpointsData = null
  ): GraphQLConfigExtensions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    __obj.asInstanceOf[GraphQLConfigExtensions]
  }
}

