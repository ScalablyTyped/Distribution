package typings.marko.expressMod

import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.IRouterMatcher
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application
  extends typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Application {
  @JSName("get")
  var get_Original_Application: (js.Function1[/* name */ String, _]) with IRouterMatcher[this.type] with MarkoRouterMatcher = js.native
  @JSName("get")
  def get_Application(path: PathParams, handlers: RequestHandler*): Application = js.native
}

