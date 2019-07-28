package typings.marko

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.PathParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type MarkoRouterMatcher = js.Function2[/* path */ PathParams, /* repeated */ RequestHandler, Application]
  type RequestHandler = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.UndefOr[NextFunction], js.Any]
}
