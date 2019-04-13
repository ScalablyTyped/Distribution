package typings
package markoLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application
  extends expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Application {
  @JSName("get")
  var get_Original_Application: (js.Function1[/* name */ java.lang.String, _]) with expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.IRouterMatcher[this.type] with MarkoRouterMatcher = js.native
  @JSName("get")
  def get_Application(
    path: expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams,
    handlers: RequestHandler*
  ): Application = js.native
}

