package typings
package markoLib.expressMod.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application
  extends expressLib.expressMod.eNs.Application {
  @JSName("get")
  var get_Original_Application: (js.Function1[/* name */ java.lang.String, _]) with expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.IRouterMatcher[this.type] with MarkoRouterMatcher = js.native
  @JSName("get")
  def `get_<this>`(
    path: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    handlers: (expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandler | expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.RequestHandlerParams)*
  ): this.type = js.native
}

